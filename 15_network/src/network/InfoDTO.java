package network;

import java.io.Serializable;

enum Info{
	JOIN, EXIT, SEND
}

public class InfoDTO implements Serializable{
	private static final long serialVersionUID = 1L; // 버전을 마음대로 잡아줘서 송수신이 안된다 따라서 이걸해줘야함
	
	//BufferedReader , printWriter 사용하지 않는다
	//객채(InfoDTO)로 데이터를 넘기고 받고 
	//ObjectInputStream, ObjectOutPutStream을 써야함
	private String nickName;
	private String message;
	private Info command;
	
	
	
	//getter setter
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Info getCommand() {
		return command;
	}
	public void setCommand(Info command) {
		this.command = command;
	}
	
	
	
}
