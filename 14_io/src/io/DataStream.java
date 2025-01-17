package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	//DataStream.java에서 buffer로 보낼때 BufferOutPutStream말고 DataOutputStream사용해서 내보내줌
	//buffer에서 result.txt(파일)로 갈 때에는 FileOutputStream을 사용
	
	
	
	
	public static void main(String[] args) {
		try {
			//데이터 넣기
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
			dos.writeUTF("홍길동");// 객체는 io를 지나갈 수 없지만 내부적으로 Serializable되어있다/String의 내부적으로
			
			dos.writeInt(25);
//			dos.writeDouble(185.3);
			dos.writeFloat(185.3f);//보낸 값은 차례대로 들어가 있음
			dos.close();
			
			
			//데이터 꺼내오기
			DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
			System.out.println("이름 ="+dis.readUTF());
			System.out.println("나이 = "+dis.readInt());
			System.out.println("키 = "+dis.readFloat());
			dis.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main
}//
