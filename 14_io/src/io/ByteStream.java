package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
	
	
	
	
	public static void main(String[] args) throws IOException {
		
//			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
//			���� �� �ٰ� �ؿ� �� ���� ���� �ǹ�
		FileInputStream fis = new FileInputStream("data.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);		
		int data;
		
		
		while((data = bis.read()) != -1	) {
			//System.out.print(data);
			System.out.print((char)data);
		}
		//�̷��� �ϸ� 656667681310495051521310434542471310 �̷��� ���� �����µ� �߰��߰� ���ִ� 1310�� �ִ� �̰� ���Ͱ�(\r(13)+\n(10))�̴�
		bis.close();
			
	
		
		
	}//main
}//