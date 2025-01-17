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
		
			//닉네임 받는쪽
		try {
			
			while(true) {	
				dto = (InfoDTO)oi.readObject();
				InfoDTO dto2 = new InfoDTO();
				if(dto.getCommand() == Info.JOIN) {
					dto2.setNickName(dto.getNickName());
					dto2.setMessage("님 입장하였습니다");
					broadcast(dto2);
				}
				else if(dto.getCommand() == Info.EXIT) {
					dto2.setNickName(dto.getNickName());
					dto2.setMessage("님 퇴장하였습니다");
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
	
	public void broadcast(InfoDTO dto) throws IOException {//다른사람들에게 메세지 뿌려주는 메소드
		for(ChatHandlerObject ch : list) {
			ch.oo.writeObject(dto);
			ch.oo.flush();
		}
		
		
		
	}//boradcast
}
