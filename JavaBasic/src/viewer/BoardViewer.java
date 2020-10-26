package viewer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import controller.BoardController;
import model.BoardDTO;
import model.UserDTO;
import util.InputUtil;

public class BoardViewer {
	private UserDTO logInUser;
	private BufferedReader br;
	private BoardController boardController;
	private int boardId;
	
	public BoardViewer() {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		boardController = new BoardController();
		boardId = 1;
	}//BoardViewer
	
	public void setLogInUser(UserDTO logInUser) {
		this.logInUser = logInUser;
		
	}//setLogInUser
	
	public void writeBoard() throws IOException {
		BoardDTO b = new BoardDTO();
		b.setId(boardId);
		boardId++;
		b.setWriterName(logInUser.getNickname());
		b.setWriterId(logInUser.getId());
		Calendar cal  = Calendar.getInstance();
		b.setWritterenDate(cal);
		b.setUpdatedDate(cal);
		
		System.out.println("����");
		b.setTitle(br.readLine());
		System.out.println("����: ");
		b.setContent(br.readLine());
		
		boardController.add(b);
		
	}
	
	public void selectAll() throws IOException{
		ArrayList<BoardDTO> list = boardController.selectAll();
		for(int i = 0 ; i < list.size(); i ++) {
			System.out.printf("%d. %s | %s\n", i+1 , list.get(i).getTitle(), list.get(i).getWriterName());
			
		}
		System.out.println("�󼼺����� ��ȣ�� �Է��ϼ���(0�� �ڷ�)");
		int userChoice = InputUtil.validateInt(0, list.size())-1;
		if(userChoice == -1) {
			System.out.println("�޴��� ���ư��ϴ�");
			
		}else  {
			selectOne(userChoice);
			
		}
	}
	
	public void selectOne(int index) throws IOException {
		BoardDTO b = boardController.selectOne(index);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� M�� d�� H�� m�� s��");
		System.out.println("���� : "+ b.getTitle());
		System.out.println("�ۼ��� : "+b.getWriterName());
		System.out.println("�ۼ��� : "+sdf.format(b.getWritterenDate().getTime()));
		System.out.println("������ �� "+sdf.format(b.getUpdatedDate().getTime()));
		System.out.println("-------------------------------------------------");
		System.out.println("����");
		System.out.println("-------------------------------------------------");
		System.out.println(b.getContent());
		if(logInUser.getId() == b.getWriterId()) {
			System.out.println("1. ���� 2. ���� 3. �������");
			int userChoice = InputUtil.validateInt(1, 3);
			if(userChoice == 1) {
				update(index);
			}else if(userChoice == 2){
				delete(index);
			}else if(userChoice == 3) {
				selectAll();
			}
		}else {
			System.out.println("1. �������");
			int userChoice = InputUtil.validateInt(1, 1);
			if(userChoice == 1) {
				selectAll();
			}
		}
	
	}//selectOne
	
	public void update(int index) throws IOException {
		BoardDTO b = boardController.selectOne(index);
		
		Calendar cal = Calendar.getInstance();
		
		System.out.print("����: ");
		b.setTitle(br.readLine());
		System.out.print("���� : ");
		b.setContent(br.readLine());
		b.setUpdatedDate(cal);
		boardController.update(index, b);
		selectOne(index);
	}//update
	
	
	
	public void delete(int index) throws IOException {
		System.out.println("�ش� ���� ������ �����Ͻðڽ��ϱ�? y/n");
		System.out.println("> ");
		String yn = br.readLine().toUpperCase();
		if(yn.equals("Y")) {
			boardController.delete(index);
			selectAll();
			
		}else {
			selectOne(index);
		}
	}
	
	
	
	
}//
