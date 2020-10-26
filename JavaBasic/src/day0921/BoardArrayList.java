package day0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import homeWork.Board01;


public class BoardArrayList {
	private static ArrayList <Board01> boardList;
	private static BufferedReader br;
	private static Board01 b;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		boardList  = new ArrayList <>();
		br = new BufferedReader ( new InputStreamReader ( System.in));
		b = new Board01();
		
			showMenu();
		
		
				
	}//main
	
	
	
	private static void showMenu() throws NumberFormatException, IOException {
		while(true) {
			System.out.println("============================");
			System.out.println("1. 작성하기 2. 목록보기 3.종료하기");
			System.out.print(">");
			int choice = Integer.parseInt(br.readLine());
			if(choice == 1) {
				boardList.add(add());
			}else if(choice == 2) {
				printArray();
			}else if(choice == 3){
				System.out.println("시스템을 종료합니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다");
			}
		}//while
	}//showMenu
	
	
	private static Board01 add() throws IOException {
		b = new Board01();
		System.out.print("제목을 입력하세요 : ");
		b.setTitle(br.readLine());
		System.out.print("작성자를 입력하세요 : ");
		b.setName(br.readLine());
		System.out.println("내용을 입력하세요 : ");
		b.setContents(br.readLine());
		
		return  b;
	}//Board01
	
	private static void printArray() throws NumberFormatException, IOException {
		for(int i = 0; i < boardList.size(); i++ ) {
			System.out.println((i+1)+". "+boardList.get(i).getTitle());	
		}
		System.out.print("개별보기할 제목의 번호를 고르세요(0번 누르면 돌아가기): ");
		int userChoice = Integer.parseInt(br.readLine())-1;
		if(userChoice < -1 || userChoice > boardList.size() ) {
			System.out.println("잘 못 입력하셨습니다");
		}else if(userChoice == -1){
			System.out.println("매뉴로 돌아갑니다");
		}else {
			printOne(userChoice);
		}
		
	}//printArray
	
	
	private static void printOne(int userChoice) throws IOException {
		System.out.println("============================");
		
		System.out.printf("제목 : %s, 작성자 : %s\n", boardList.get(userChoice).getTitle(), boardList.get(userChoice).getName() );
		System.out.printf("내용 : %s\n", boardList.get(userChoice).getContents());
		
		//수정 및 삭제
		System.out.println("============================");
		System.out.println("1.수정하기  2.삭제하기  3.목록보기");
		System.out.print("> ");
		int index = Integer.parseInt(br.readLine());
		if(index == 1) {
			System.out.println("제목을 입력해주세요 : ");
			boardList.get(userChoice).setTitle(br.readLine());
			
			System.out.println("작성자를 입력해주세요 : ");
			boardList.get(userChoice).setName(br.readLine());
			
			System.out.println("내용을 입력해주세요 : ");
			boardList.get(userChoice).setContents(br.readLine());
			
		}else if(index == 2) {
			System.out.print("정말로 삭제하시겠습니까? (y/n) :");
			String yn = br.readLine();
			if(yn.equals("y") || yn.equals("Y")) {
				boardList.remove(userChoice);
				printArray();
			}else if(yn.equals("n") || yn.equals("N")) {
				printOne(userChoice);
			}else {
				System.out.println("잘못입력하셨습니다");
				printOne(userChoice);
			}
		}else if(index == 3) {
			printArray();
		}else {
			System.out.println("잘못입력하셨습니다");
			printOne(userChoice);
		}
		
		
	}
}
