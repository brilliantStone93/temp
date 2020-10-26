package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProtocolClient {
	
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	private BufferedReader keyboard;// Ű����� ���� ������ �ޱ�!
	
	public ProtocolClient() {
		try {
			//socket�� �ڵ����̶� �����ϸ� ���ϴ�
			socket = new Socket("192.168.0.72", 9500);
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			
		} catch (UnknownHostException e) {
			System.out.println("������ ã�� �� �����ϴ�");
	
			e.printStackTrace();
			
			System.exit(0);
			
			
		} catch (IOException e) {
			System.out.println("������ ������ �ȵǾ����ϴ�");
			e.printStackTrace();
			System.exit(0);
		}
		
		//--------------------
		String msg, line;
		while(true) {
			//������ ������ ��
			
			try {
				msg = keyboard.readLine();
				bw.write(msg+"\n"); //������ ������                           "100:angel"�̶�� ������ ������         / "200:angel"�̶�� ������ / "300:angel:�ȳ�"
				bw.flush(); // ���� ����, �̰� ����� ���� �����Ͱ� ����
				
				//printWriter�� ����ϸ� \n�� �ڵ����� �־��ֱ� ������ �Ƚᵵ �ȴ� ���Ϻ��� ��� ��!
				
				
				//�����κ��� �޴� ��
				line = br.readLine();                     //"angel�� ����"�̶�� ������ �´�   / "angel�� ����"           / "[angel] �ȳ�"
				System.out.println(line);
				
				
				//���� �����̶�� ���̿��� ������ ���� ���ִ� �۾��� ������Ѵ� ����� �Ʒ��� ����
				String[] ar = msg.split(":"); //split 06 Ŭ�������� package class_constructor�� public class Token���� ����߾���
				if(ar[0].equals(Protocol.EXIT)) {
					br.close();
					bw.close();
					socket.close();
					
					keyboard.close();
					
					
					System.exit(0);
					
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
			
			
			
			
			
		}//while
		
		
	}//������
	
	public static void main(String[] args) {
			new ProtocolClient();
	}//main
}
