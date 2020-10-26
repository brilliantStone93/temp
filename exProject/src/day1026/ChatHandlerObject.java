package day1026;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

public class ChatHandlerObject extends Thread{
	private Socket socket;
	private List<ChatHandlerObject> list;
	
	private ObjectOutputStream oo ;
	private ObjectInputStream oi;
	
	
	
	
	
	public ChatHandlerObject (Socket socket, List<ChatHandlerObject> list) {
		this.socket = socket;
		this.list = list;
		
		
		
			
			try {
				
				oo = new ObjectOutputStream(socket.getOutputStream());
				oi = new ObjectInputStream(socket.getInputStream());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		
		
	}
	
	
	@Override
	public void run() {
		 
		
		InfoDTO dto = null;	
		
			//�г��� �޴���
		try {
			
			while(true) {	
				dto = (InfoDTO)oi.readObject();
				InfoDTO dto2 = new InfoDTO();
				if(dto.getCommand() == Info.JOIN) {
					dto2.setNickName(dto.getNickName());
					dto2.setMessage("�� �����Ͽ����ϴ�");
					broadcast(dto2);
				}
				else if(dto.getCommand() == Info.EXIT) {
					dto2.setNickName(dto.getNickName());
					dto2.setMessage("�� �����Ͽ����ϴ�");
					broadcast(dto2);
					break; 
				}
				else if(dto.getCommand() == Info.SEND) {
					dto2.setNickName(dto.getNickName());
					dto2.setMessage(dto.getMessage());
					broadcast(dto2);
					
				}
			}//while
			
			list.remove(this);
			
			oi.close();
			oo.close();
			socket.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	
	
		
	}//run
	
	public void broadcast(InfoDTO dto) throws IOException {//�ٸ�����鿡�� �޼��� �ѷ��ִ� �޼ҵ�
		for(ChatHandlerObject ch : list) {
			ch.oo.writeObject(dto);
			ch.oo.flush();
		}
		
		
		
	}//boradcast
}