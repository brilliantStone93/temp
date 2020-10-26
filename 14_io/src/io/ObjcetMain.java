package io;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjcetMain {
	
	
	
	
	//main=========================================
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		PersonDTO dto = new PersonDTO("ȫ�浿", 25, 185.3);
		
		//���� ����� ���� �־��ֱ�
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		//����־��ֱ�
		oos.writeObject(dto); // �̴�� �����ϸ�  java.io.NotSerializableException: java.io.ObjectOutputStream
								//������ �߻��ϴµ� ����ȭ�� �Ƚ�����ٴ� �����̴�
		
		oos.close();
		
		//���Ϸκ��� ������ �о����
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		PersonDTO p = (PersonDTO) ois.readObject(); //�ڽ� = (�ڽ�) �θ�
		System.out.println("�̸� = " +p.getName());
		System.out.println("���� = " +p.getAge());
		System.out.println("Ű = " +p.getHeight());
		ois.close();	
	}//main
}//
