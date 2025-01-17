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
			System.out.println("서버 준비 완료");
			
			socket = ss.accept(); // 클라이언트가 들어오면 낚아챈다!
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
		} catch (IOException e) {
			System.out.println("클라이언트와 연결이 안되었습니다");
			
			
			e.printStackTrace();
			
			System.exit(0); // 클라이언트 연결안되면 끝내기
		}
		String line;
		while(true) {
			
			try {
				//클라이언트로부터 오는 메세지 읽기
				line = br.readLine();//이것을 읽어온다 => "100:angel"이라고 서버에 보내면         / "200:angel"이라고 보내면 / "300:angel:안녕"
				
				//클라이언트로 보내기
				String[] ar = line.split(":");
				if(ar[0].equals(Protocol.ENTER)) { // 
					bw.write(ar[1]+"님 입장\n"); // "angle님 입장"
					bw.flush();
					
				}else if(ar[0].equals(Protocol.EXIT)) {
					bw.write(ar[1]+"님 퇴장\n"); // "angel님 퇴장"
					bw.close();
					br.close();
					socket.close();
					
					System.exit(0);
				}else if(ar[0].equals(Protocol.SEND_MESSAGE)) {
					bw.write("["+ar[1]+"]"+ar[2]+"\n");
					bw.flush(); // 버퍼 비우기
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
