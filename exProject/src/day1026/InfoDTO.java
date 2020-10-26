package day1026;

import java.io.Serializable;

enum Info{
	JOIN, EXIT, SEND
}

public class InfoDTO implements Serializable{
	private static final long serialVersionUID = 1L; // ������ ������� ����༭ �ۼ����� �ȵȴ� ���� �̰��������
	
	//BufferedReader , printWriter ������� �ʴ´�
	//��ä(InfoDTO)�� �����͸� �ѱ�� �ް� 
	//ObjectInputStream, ObjectOutPutStream�� �����
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