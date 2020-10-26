package io;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjcetMain {
	
	
	
	
	//main=========================================
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		PersonDTO dto = new PersonDTO("홍길동", 25, 185.3);
		
		//파일 만들고 내용 넣어주기
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		//내용넣어주기
		oos.writeObject(dto); // 이대로 실행하면  java.io.NotSerializableException: java.io.ObjectOutputStream
								//오류가 발생하는데 직렬화를 안시켜줬다는 오류이다
		
		oos.close();
		
		//파일로부터 내용을 읽어오기
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		PersonDTO p = (PersonDTO) ois.readObject(); //자식 = (자식) 부모
		System.out.println("이름 = " +p.getName());
		System.out.println("나이 = " +p.getAge());
		System.out.println("키 = " +p.getHeight());
		ois.close();	
	}//main
}//
