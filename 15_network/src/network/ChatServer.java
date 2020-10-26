package network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	private ServerSocket ss;
	private List<ChatHandler> list; // ������ �� ��ŭ ������ ChatHandler�� ����� �׸�
	
	public ChatServer() {
		try {
			ss= new ServerSocket(9500);
			System.out.println("���� �غ�Ϸ�!");
			list = new ArrayList<ChatHandler>(); 
			
			
			while(true) {
				//Ŭ���̾�Ʈ�� ������� ���� �ֱ� ������ ���������� ������� ������� ������ �׷��� ���� ��� ������ ���������� ���� �� �ִ�
				//���� IO��  ������� ����� �ָ� �ȴ� �̷��� ��������� ChatHandler�̴�
				
				Socket socket  = ss.accept(); // ����æ��
				ChatHandler handler = new ChatHandler(socket, list); //Ŭ���̾�Ʈ�� ������ ������ ������ �����ϰ� ���ϰ� ����Ʈ�� handler�� �����־�
																	//ó���Ѵ�, �׸��� ���Ⱑ ����������߱� ������ ���⼭ start()�޼ҵ带 �־�����Ѵ�

				handler.start();
				list.add(handler);
				
				
			}
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	
	}
	
	
	public static void main(String[] args) {
		new ChatServer();
	}
}