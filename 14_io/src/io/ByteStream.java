package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
	
	
	
	
	public static void main(String[] args) throws IOException {
		
//			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
//			위에 한 줄과 밑에 두 줄은 같은 의미
		FileInputStream fis = new FileInputStream("data.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);		
		int data;
		
		
		while((data = bis.read()) != -1	) {
			//System.out.print(data);
			System.out.print((char)data);
		}
		//이렇게 하면 656667681310495051521310434542471310 이렇게 값이 나오는데 중간중간 껴있는 1310이 있다 이건 엔터값(\r(13)+\n(10))이다
		bis.close();
			
	
		
		
	}//main
}//
