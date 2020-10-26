package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest {
	
	public static void main(String[] args) throws IOException {
		
		//URL을 알면 밑에 있는 것들을 알 수 있다
		URL url = new URL ("http://www.google.com/index.html");
		System.out.println("프로토콜 = " + url.getProtocol());
		System.out.println("호스트 = "+ url.getHost());
		System.out.println("포트 = "+ url.getPort()); // 
		System.out.println("기본 포트 = "+ url.getDefaultPort());
		System.out.println("파일  ="+ url.getFile());
		System.out.println();
		
		//프로토콜 = http
		//호스트 = www.google.com
		//포트 = -1
		//기본 포트 = 80
		//파일  =/index.html
		// 결과가 이렇게 나온다  포트번호는 위에 안 적어서 기본 -1 이 나옴
		
		//IOStream - 입력스트림
		//홈페이지의 코드를 긁어오기 위해서는 위에 것이 필요하다
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line = null;
		
		while((line = br.readLine()) != null) {
			System.out.println(line+"\n");
		}//while
		
		br.close();
		
		
		
		

	}
}
