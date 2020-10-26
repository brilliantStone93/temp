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
		
		System.out.println("제목");
		b.setTitle(br.readLine());
		System.out.println("내용: ");
		b.setContent(br.readLine());
		
		boardController.add(b);
		
	}
	
	public void selectAll() throws IOException{
		ArrayList<BoardDTO> list = boardController.selectAll();
		for(int i = 0 ; i < list.size(); i ++) {
			System.out.printf("%d. %s | %s\n", i+1 , list.get(i).getTitle(), list.get(i).getWriterName());
			
		}
		System.out.println("상세보기할 번호를 입력하세요(0은 뒤로)");
		int userChoice = InputUtil.validateInt(0, list.size())-1;
		if(userChoice == -1) {
			System.out.println("메뉴로 돌아갑니다");
			
		}else  {
			selectOne(userChoice);
			
		}
	}
	
	public void selectOne(int index) throws IOException {
		BoardDTO b = boardController.selectOne(index);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 H시 m분 s초");
		System.out.println("제목 : "+ b.getTitle());
		System.out.println("작성자 : "+b.getWriterName());
		System.out.println("작성일 : "+sdf.format(b.getWritterenDate().getTime()));
		System.out.println("수정일 ㅣ "+sdf.format(b.getUpdatedDate().getTime()));
		System.out.println("-------------------------------------------------");
		System.out.println("내용");
		System.out.println("-------------------------------------------------");
		System.out.println(b.getContent());
		if(logInUser.getId() == b.getWriterId()) {
			System.out.println("1. 수정 2. 삭제 3. 목록으로");
			int userChoice = InputUtil.validateInt(1, 3);
			if(userChoice == 1) {
				update(index);
			}else if(userChoice == 2){
				delete(index);
			}else if(userChoice == 3) {
				selectAll();
			}
		}else {
			System.out.println("1. 목록으로");
			int userChoice = InputUtil.validateInt(1, 1);
			if(userChoice == 1) {
				selectAll();
			}
		}
	
	}//selectOne
	
	public void update(int index) throws IOException {
		BoardDTO b = boardController.selectOne(index);
		
		Calendar cal = Calendar.getInstance();
		
		System.out.print("제목: ");
		b.setTitle(br.readLine());
		System.out.print("내용 : ");
		b.setContent(br.readLine());
		b.setUpdatedDate(cal);
		boardController.update(index, b);
		selectOne(index);
	}//update
	
	
	
	public void delete(int index) throws IOException {
		System.out.println("해당 글을 정말로 삭제하시겠습니까? y/n");
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
