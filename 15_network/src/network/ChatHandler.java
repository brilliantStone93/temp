package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ChatHandler extends Thread{
	private Socket socket;
	private List<ChatHandler> list;
	private BufferedReader br;
	private PrintWriter pw;
	
	
	public ChatHandler (Socket socket, List<ChatHandler> list) throws IOException {
		this.socket = socket;
		this.list = list;
		
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		
	}
	
	
	@Override
	public void run() {
		String line = null;
		//�г��� �޴���
		try {
			String nickName = br.readLine();
			//��� Ŭ���̾�Ʈ���� ������
			
			broadcast(nickName + "�� �����Ͽ����ϴ�");
			
			while(true) {
				line = br.readLine();
				
				if(line == null || line.toLowerCase().equals("quit")) {
					break; // System.exit()�� �ϰԵǸ� ���Ӹ��ƴ϶� �ٸ��������� �����Եȴ� �ϴ� while���� ���Ͷ� �Ǿ���
						
				}
				
				//�޼����� ��� Ŭ���̾�Ʈ���� ������
				broadcast("["+nickName+"]"+line);
				
				
			}//while
			
			//quit�� ���� Ŭ���̾�Ʈ���� quit�� ������
			pw.println("quit");
			pw.flush();
			
			
			//���� Ŭ���̾�Ʈ���� ����޼��� ������
			list.remove(this);
			broadcast(nickName + "�� �����Ͽ����ϴ�");
			
			br.close();
			pw.close();
			socket.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}//run
	
	public void broadcast(String msg) {//�ٸ�����鿡�� �޼��� �ѷ��ִ� �޼ҵ�
		for(ChatHandler ch : list) {
			ch.pw.println(msg);
			ch.pw.flush();
		}
		
		
		
	}//boradcast
	
}//