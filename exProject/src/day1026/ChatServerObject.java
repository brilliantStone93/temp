package day1026;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;





public class ChatServerObject {
	private ServerSocket ss;
	private List<ChatHandlerObject> list; // 접속자 수 만큼 생성된 ChatHandler를 담아줄 그릇
	
	public ChatServerObject() {
		try {
			ss= new ServerSocket(9500);
			System.out.println("서버 준비완료!");
			list = new ArrayList<ChatHandlerObject>(); 
			
			
			while(true) {
				//클라이언트가 스레드로 돌고 있기 때문에 서버에서도 쓰레드로 돌려줘야 맞으나 그렇게 했을 경우 서버가 여러가지가 생길 수 있다
				//따라서 IO만  스레드로 만들어 주면 된다 이래서 만들어진게 ChatHandler이다
				
				Socket socket  = ss.accept(); // 낚아챈다
				ChatHandlerObject handler = new ChatHandlerObject(socket, list); //클라이언트가 들어오면 서버는 소켓을 생성하고 소켓과 리스트를 handler에 보내주어
																	//처리한다, 그리고 여기가 스레드생성했기 때문에 여기서 start()메소드를 넣어줘야한다

				handler.start();
				list.add(handler);
				System.out.println(list.size());
				
			}
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	
	}
	
	
	public static void main(String[] args) {
		new ChatServerObject();
	}
}
