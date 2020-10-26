package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer {
	private BufferedReader br;
	private BufferedWriter bw;
	private Socket socket;
	private ServerSocket ss;
		
	public ProtocolServer() {
		
		try {
			ss = new ServerSocket(9500);
			System.out.println("���� �غ� �Ϸ�");
			
			socket = ss.accept(); // Ŭ���̾�Ʈ�� ������ ����æ��!
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
		} catch (IOException e) {
			System.out.println("Ŭ���̾�Ʈ�� ������ �ȵǾ����ϴ�");
			
			
			e.printStackTrace();
			
			System.exit(0); // Ŭ���̾�Ʈ ����ȵǸ� ������
		}
		String line;
		while(true) {
			
			try {
				//Ŭ���̾�Ʈ�κ��� ���� �޼��� �б�
				line = br.readLine();//�̰��� �о�´� => "100:angel"�̶�� ������ ������         / "200:angel"�̶�� ������ / "300:angel:�ȳ�"
				
				//Ŭ���̾�Ʈ�� ������
				String[] ar = line.split(":");
				if(ar[0].equals(Protocol.ENTER)) { // 
					bw.write(ar[1]+"�� ����\n"); // "angle�� ����"
					bw.flush();
					
				}else if(ar[0].equals(Protocol.EXIT)) {
					bw.write(ar[1]+"�� ����\n"); // "angel�� ����"
					bw.close();
					br.close();
					socket.close();
					
					System.exit(0);
				}else if(ar[0].equals(Protocol.SEND_MESSAGE)) {
					bw.write("["+ar[1]+"]"+ar[2]+"\n");
					bw.flush(); // ���� ����
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
			
			
			
		}//while
	}
	
	
	public static void main(String[] args) {
		new ProtocolServer();
	}//main
	
}//