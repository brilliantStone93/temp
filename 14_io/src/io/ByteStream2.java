package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	
	
	public static void main(String[] args) throws IOException{
		//파일 객체 생성
		File file = new File("data.txt");
		
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		
		
		//한번에 찍어주기 위해서는
		//파일을 크기가 몇인지 먼저 알아야한다
		//그러기 위해 객체 생성(메인 상단)해주고 아래 처리한다.
		int size = (int)file.length(); // file long이어서 int로 형변환해줌
		byte[] b = new byte[size];
		
		bis.read(b, 0, size);
		
		//byte[]를 String으로 생성
		
		String str = new String(b);//byte[] -> String 로 생성
		
		System.out.println(str);
		
		bis.close();
		
	}//main
}
