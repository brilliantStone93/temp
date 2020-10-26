package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProtocolClient {
	
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	private BufferedReader keyboard;// 키보드로 부터 데이터 받기!
	
	public ProtocolClient() {
		try {
			//socket은 핸드폰이라 생각하면 편하다
			socket = new Socket("192.168.0.72", 9500);
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다");
	
			e.printStackTrace();
			
			System.exit(0);
			
			
		} catch (IOException e) {
			System.out.println("서버를 연결이 안되었습니다");
			e.printStackTrace();
			System.exit(0);
		}
		
		//--------------------
		String msg, line;
		while(true) {
			//서버로 보내느 쪽
			
			try {
				msg = keyboard.readLine();
				bw.write(msg+"\n"); //서버로 보내기                           "100:angel"이라고 서버에 보내면         / "200:angel"이라고 보내면 / "300:angel:안녕"
				bw.flush(); // 버퍼 비우기, 이걸 해줘야 다음 데이터가 들어간다
				
				//printWriter을 사용하면 \n을 자동으로 넣어주기 때문에 안써도 된다 내일부터 배울 것!
				
				
				//서버로부터 받는 쪽
				line = br.readLine();                     //"angel님 입장"이라고 답장이 온다   / "angel님 퇴장"           / "[angel] 안녕"
				System.out.println(line);
				
				
				//만약 퇴장이라고 답이오면 소켓을 제거 해주는 작업을 해줘야한다 방법은 아래와 같다
				String[] ar = msg.split(":"); //split 06 클래스에서 package class_constructor에 public class Token에서 사용했었음
				if(ar[0].equals(Protocol.EXIT)) {
					br.close();
					bw.close();
					socket.close();
					
					keyboard.close();
					
					
					System.exit(0);
					
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
			
			
			
			
			
		}//while
		
		
	}//생성자
	
	public static void main(String[] args) {
			new ProtocolClient();
	}//main
}
