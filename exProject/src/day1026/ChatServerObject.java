package day1026;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;





public class ChatServerObject {
	private ServerSocket ss;
	private List<ChatHandlerObject> list; // ������ �� ��ŭ ������ ChatHandler�� ����� �׸�
	
	public ChatServerObject() {
		try {
			ss= new ServerSocket(9500);
			System.out.println("���� �غ�Ϸ�!");
			list = new ArrayList<ChatHandlerObject>(); 
			
			
			while(true) {
				//Ŭ���̾�Ʈ�� ������� ���� �ֱ� ������ ���������� ������� ������� ������ �׷��� ���� ��� ������ ���������� ���� �� �ִ�
				//���� IO��  ������� ����� �ָ� �ȴ� �̷��� ��������� ChatHandler�̴�
				
				Socket socket  = ss.accept(); // ����æ��
				ChatHandlerObject handler = new ChatHandlerObject(socket, list); //Ŭ���̾�Ʈ�� ������ ������ ������ �����ϰ� ���ϰ� ����Ʈ�� handler�� �����־�
																	//ó���Ѵ�, �׸��� ���Ⱑ ����������߱� ������ ���⼭ start()�޼ҵ带 �־�����Ѵ�

				handler.start();
				list.add(handler);
				System.out.println(list.size());
				
			}
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	
	}
	
	
	public static void main(String[] args) {
		new ChatServerObject();
	}
}