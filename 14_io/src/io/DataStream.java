package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	//DataStream.java���� buffer�� ������ BufferOutPutStream���� DataOutputStream����ؼ� ��������
	//buffer���� result.txt(����)�� �� ������ FileOutputStream�� ���
	
	
	
	
	public static void main(String[] args) {
		try {
			//������ �ֱ�
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
			dos.writeUTF("ȫ�浿");// ��ü�� io�� ������ �� ������ ���������� Serializable�Ǿ��ִ�/String�� ����������
			
			dos.writeInt(25);
//			dos.writeDouble(185.3);
			dos.writeFloat(185.3f);//���� ���� ���ʴ�� �� ����
			dos.close();
			
			
			//������ ��������
			DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
			System.out.println("�̸� ="+dis.readUTF());
			System.out.println("���� = "+dis.readInt());
			System.out.println("Ű = "+dis.readFloat());
			dis.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main
}//