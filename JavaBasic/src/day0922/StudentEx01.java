package day0922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import day0915.Student;

public class StudentEx01 {
	private static ArrayList<Student> list;
	private static BufferedReader br;
	private static int id;
	public static void main(String[] args) throws IOException {
		list = new ArrayList<>();
		br = new BufferedReader ( new InputStreamReader(System.in));
		id = 1;
		showMenu();
		
	}
	
	private static void showMenu() throws IOException {
		while(true) {
			System.out.println("1. 입력 2. 출력 3. 종료");
			System.out.print(">");
			int choice = validateInt(1,3);
			if(choice == 1) {
				insert();
			}else if(choice == 2) {
				selectAll();
			}else if(choice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
			
		}//while
		
		
	}//showMenu
	
	
	private static int stringToInteger() throws IOException {
		String userInput = br.readLine();
		while(!userInput.matches("\\d*")) {
			System.out.println("숫자만 입력해주세요");
			System.out.print(">");
			userInput = br.readLine();
			
		}
		return Integer.parseInt(userInput);
	
	}//stringToInteger
	
	private static int validateInt(int minimum, int maximum) throws IOException {
		int value = stringToInteger();
		while(value < minimum || value > maximum ) {
			System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
			value = stringToInteger();
			
		}
		return value;
	}//validateInt
	
	private static void insert() throws IOException {
		Student s = new Student();
		s.setId(id);
		id++;
		System.out.println("이름");
		System.out.print("> ");
		s.setName(br.readLine());
		
		System.out.println("국어점수");
		System.out.print("> ");
		s.setKorean(validateInt(0, 100));
		
		System.out.println("영어점수");
		System.out.print("> ");
		s.setEnglish(validateInt(0, 100));
		
		System.out.println("수학점수");
		System.out.print("> ");
		s.setMath(validateInt(0, 100));
		
		list.add(s);
		
		
	}//insert
	
	
	private static void selectAll() throws IOException	{
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%d. %s\n", i+1 , list.get(i).getName());
		}
		System.out.println("상세보기할 번호를 입력해 주세요(0은 종료)");
		int userChoice = validateInt(0, list.size()) - 1;
		if(userChoice == -1) {
			System.out.println("메인으로 돌아갑니다.");
			
		}else {
			selectOne(userChoice);
		}
	}//selectAll
	
	private static void selectOne(int index) throws IOException {
		Student s = list.get(index);
		System.out.printf("이름 : %s, 학번: %d\n", s.getName(), s.getId());
		System.out.printf("국어 : %d 영어: %d 수학 : %d\n", s.getKorean(), s.getEnglish(), s.getMath());
		System.out.printf("총점 : %d 평균: %.2f\n", s.calculateSum(), s.calculateAverage());
		System.out.println("1. 수정 2. 삭제 3. 목록으로");
		int userChoice = validateInt(1, 3);
		if (userChoice == 1) {
			update(index);
		}else if(userChoice == 2) {
			delete(index);
		}else if(userChoice == 3) {
			selectAll();
		}
		
	}//selectOne
	
	private static void delete(int index) throws IOException {
		System.out.println("정말 삭제하겠습니까? (y/n)");
		System.out.print("> ");
		String yn = br.readLine().toUpperCase();//사용자가 입력한 알파벳을 대문자로 바꿔서 입력하겠다
		
		if(yn.equals("y")) {
			list.remove(index);
			selectAll();
		}else if(yn.equals("n")) {
			selectOne(index);
		}
	}//delete
	
	private static void update(int index) throws IOException {
		System.out.println("이름");
		System.out.print("> ");
		list.get(index).setName(br.readLine());
		System.out.println("국어");
		list.get(index).setKorean(validateInt(0,100));
		
		System.out.println("영어");
		list.get(index).setEnglish(validateInt(0,100));
		
		System.out.println("수학");
		list.get(index).setMath(validateInt(0,100));
		selectOne(index);
	}//update
}//
