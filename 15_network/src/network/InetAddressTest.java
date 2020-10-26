package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		
		//naver ip알아보기
//		InetAddress naver = new InetAddress(); // InetAddress에는 기본생성자()가없어서 생성이 안된다
		InetAddress naver = InetAddress.getByName("www.naver.com"); // 추상 클래스가 아님
		System.out.println("NAVER IP =" + naver.getHostAddress()); //  210.89.164.90 네이버 아이피 가져옴
		System.out.println();
		
		
		//내 ip알아뵉
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("loclhost IP = "+ local.getHostAddress());
		System.out.println();
		
		//다음 ip 가져오기 배열
		
		InetAddress[] daum = InetAddress.getAllByName("www.daum.net"); //211.231.99.17 /  203.133.167.81 공개된 ip를 얻어올수있다 
		for(InetAddress data : daum) {
			System.out.println("Daum IP = "+ data.getHostAddress());
		}
	
	}//main 
	
}//
