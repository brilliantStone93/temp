package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		
		//naver ip�˾ƺ���
//		InetAddress naver = new InetAddress(); // InetAddress���� �⺻������()����� ������ �ȵȴ�
		InetAddress naver = InetAddress.getByName("www.naver.com"); // �߻� Ŭ������ �ƴ�
		System.out.println("NAVER IP =" + naver.getHostAddress()); //  210.89.164.90 ���̹� ������ ������
		System.out.println();
		
		
		//�� ip�˾ƺ�
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("loclhost IP = "+ local.getHostAddress());
		System.out.println();
		
		//���� ip �������� �迭
		
		InetAddress[] daum = InetAddress.getAllByName("www.daum.net"); //211.231.99.17 /  203.133.167.81 ������ ip�� ���ü��ִ� 
		for(InetAddress data : daum) {
			System.out.println("Daum IP = "+ data.getHostAddress());
		}
	
	}//main 
	
}//
