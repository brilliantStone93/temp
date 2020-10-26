package day0918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Student;
import util.ArrayUtil;

//Student 클래스 배열을 ArrayUtil을 사용해서 관리하는 프로그램
public class StudentEx01 {
	
	private static BufferedReader br;
	private static Student[] studentArray;
	public static void main(String[] args) throws NumberFormatException, IOException {
		studentArray = new Student[0];
		br = new BufferedReader( new InputStreamReader(System.in));
		
		//메인 메소드에서 초기화, 즉 생성자를 호출하고 나서부터는
		//만약 메인메소드가 다른 메소드를 그 이후에 호출하게 된다면
		//이미 초기화가 된 상태이기 때문에 NullPointerException이 발생하지 않고
		//정상적으로 사용할 수 있다.
		
			showMenu();
			
		
	}
	
	private static void showMenu() throws NumberFormatException, IOException {
		while(true) {
		System.out.println("비트 성적 관리 프로그램");
		System.out.println("1. 입력 2. 출력 3. 종료");
		System.out.println("> ");
		int userChoice = Integer.parseInt(br.readLine());
		
		if(userChoice == 1) {
			//입력 메소드 실행
			add();
		}else if(userChoice == 2) {
			//출력 메소드 실행
			printArray();
		}else if(userChoice == 3) {
			System.out.println("사용해주셔서 감사합니다");
			break;
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		}//while
	
	}//showmenu
	
	
	private static void add() throws IOException {
		studentArray = ArrayUtil.add(studentArray, setStudentInfo());	
	
	}//add
	
	
	private static Student setStudentInfo() throws IOException {
		Student s = new Student();
		System.out.println("학생 이름 : ");
		s.setName(br.readLine());
		System.out.println("학생 번호 : ");
		s.setId(Integer.parseInt(br.readLine()));
		System.out.println("국어 점수 : ");
		s.setKorean(Integer.parseInt(br.readLine()));
		System.out.println("영어 점수 : ");
		s.setEnglish(Integer.parseInt(br.readLine()));
		System.out.println("수학 점수 : ");
		s.setMath(Integer.parseInt(br.readLine()));
		return s;
		
	}//setStudentInfo
	
	private static void printArray() {
		for(int i = 0 ; i < studentArray.length; i ++) {
			System.out.println(studentArray[i]);
		}
	}
	
}
