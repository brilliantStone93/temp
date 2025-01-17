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
		//닉네임 받는쪽
		try {
			String nickName = br.readLine();
			//모든 클라이언트에게 보내기
			
			broadcast(nickName + "님 입장하였습니다");
			
			while(true) {
				line = br.readLine();
				
				if(line == null || line.toLowerCase().equals("quit")) {
					break; // System.exit()를 하게되면 나뿐만아니라 다른사람들까지 나오게된다 일단 while문을 나와라가 되야함
						
				}
				
				//메세지를 모든 클라이언트에게 보내기
				broadcast("["+nickName+"]"+line);
				
				
			}//while
			
			//quit를 보낸 클라이언트에게 quit를 보내기
			pw.println("quit");
			pw.flush();
			
			
			//남은 클라이언트에게 퇴장메세지 보내기
			list.remove(this);
			broadcast(nickName + "님 퇴장하였습니다");
			
			br.close();
			pw.close();
			socket.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}//run
	
	public void broadcast(String msg) {//다른사람들에게 메세지 뿌려주는 메소드
		for(ChatHandler ch : list) {
			ch.pw.println(msg);
			ch.pw.flush();
		}
		
		
		
	}//boradcast
	
}//
