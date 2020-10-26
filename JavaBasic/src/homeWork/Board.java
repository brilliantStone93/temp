package homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import util.ArrayUtil;

public class Board {
	private static BufferedReader br;
	private static Board01 [] boardArray;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader ( new InputStreamReader(System.in));
		boardArray = new Board01[0];
		
		while(true) {
			int choice = showMenu();
			if(choice == 1) {
				//입력 메소드
				add();
			}else if(choice == 2) {
				//출력 메소드
				if(ArrayUtil.size(boardArray) == 0) {
					System.out.println("게시글이 없습니다.");
				}else printArray();
			}else if(choice == 3) {
				System.out.println("사용해주셔서 감사합니다");
				break;
			}else {
				System.out.println("잘못입력하셨습니다");
			}
		}//while
	}//main

	private static int showMenu() throws NumberFormatException, IOException {
		
		while(true) {
			System.out.println("==========비트게시판==========");
			System.out.println("1. 작성하기 2. 목록보기 3. 종료하기 ");
			System.out.print(" > ");
			int choice = Integer.parseInt(br.readLine());
			
			//게시판 잘못 입력 시
			if(choice == 1) {
				return 1;
				
			}else if(choice == 2) {
				return 2;
				
			}else if(choice == 3) {
				return 3;
			}else {
				System.out.println("잘못입력하셨습니다");
			}
		}//while
	}
	
	//입력메소드
	private static void add() throws IOException {
		boardArray = ArrayUtil.add(boardArray, setboardInfo());
	}
	
	private static Board01 setboardInfo() throws IOException {
		Board01 b = new Board01();
		System.out.println("제목을 입력해주세요 : ");
		b.setTitle(br.readLine());
		
		System.out.println("작성자를 입력해주세요 : ");
		b.setName(br.readLine());
		
		System.out.println("내용을 입력해주세요 : ");
		b.setContents(br.readLine());
		
		return b;
	}
	
	private static void printArray() throws NumberFormatException, IOException {
		System.out.println("=========게시판 목록==========");
		for(int i = 0 ; i < boardArray.length; i++) {
			System.out.printf("%d\t%s\n",(i+1), boardArray[i].getTitle());
		}
		System.out.print("개별보기할 번호를 눌러주세요(0은 뒤로기기): ");
		int userChoice = Integer.parseInt(br.readLine())-1;
		while(userChoice < -1 || userChoice > boardArray.length -1) {
			System.out.println("잘못된 번호입니다.");
			System.out.println("개별보기할 번호를 눌러주세요(0은 뒤로기기): ");
			userChoice = Integer.parseInt(br.readLine())-1;
			
		}//
		if(userChoice == -1) {
			//메시지만 출력
			System.out.println("메뉴로 돌아갑니다.");
						
		}else {
			//상세보기 메소드 호출
			printOne(userChoice);
			
		}
		
		
	}//printArray
	
	private static void printOne(int userChoice) throws NumberFormatException, IOException {
		System.out.println("============================");
		
		System.out.printf("제목 : %s, 작성자 : %s\n", boardArray[userChoice].getTitle(), boardArray[userChoice].getName() );
		System.out.printf("내용 : %s\n", boardArray[userChoice].getContents());
		
		//수정 및 삭제
		System.out.println("============================");
		System.out.println("1.수정하기  2.삭제하기  3.목록보기");
		System.out.print("> ");
		int index = Integer.parseInt(br.readLine());
		if(index == 1) {
			System.out.println("제목을 입력해주세요 : ");
			boardArray[userChoice].setTitle(br.readLine());
			
			System.out.println("작성자를 입력해주세요 : ");
			boardArray[userChoice].setName(br.readLine());
			
			System.out.println("내용을 입력해주세요 : ");
			boardArray[userChoice].setContents(br.readLine());
			
		}else if(index == 2) {
			System.out.print("정말로 삭제하시겠습니까? (y/n) :");
			String yn = br.readLine();
			if(yn.equals("y") || yn.equals("Y")) {
				boardArray = ArrayUtil.removeByIndex(boardArray, userChoice);
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
		
		
	}//printOne
	
}//
