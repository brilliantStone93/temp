package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	
	
	public static void main(String[] args) throws IOException{
		//���� ��ü ����
		File file = new File("data.txt");
		
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		
		
		//�ѹ��� ����ֱ� ���ؼ���
		//������ ũ�Ⱑ ������ ���� �˾ƾ��Ѵ�
		//�׷��� ���� ��ü ����(���� ���)���ְ� �Ʒ� ó���Ѵ�.
		int size = (int)file.length(); // file long�̾ int�� ����ȯ����
		byte[] b = new byte[size];
		
		bis.read(b, 0, size);
		
		//byte[]�� String���� ����
		
		String str = new String(b);//byte[] -> String �� ����
		
		System.out.println(str);
		
		bis.close();
		
	}//main
}
