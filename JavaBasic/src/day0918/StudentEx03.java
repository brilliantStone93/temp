package day0918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Student;
import util.ArrayUtil;

//학생 등록에 추가적인 메소드를 더 만들어 보자
// 1. 만약 학생번호와 이름이 같은 학생이 입력되면
//    잘못 입력했다고 알려주고
//    중복이 아닌 학생이 입력될때까지 다시 입력 받자
// 2. 잘못된 점수는 잘못 입력했다고 알려주고
//    올바른 점수가 들어올때 까지 다시 입력을 받자
//Student 클래스 배열을 ArrayUtil을 사용해서 관리하는 프로그램
public class StudentEx03 {
	
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
	
	}//showMenu
	
	
	private static void add() throws IOException {
		studentArray = ArrayUtil.add(studentArray, setStudentInfo());	
	
	}//add
	
	
	private static Student setStudentInfo() throws IOException {
		Student s = new Student();
		System.out.print("학생 이름 : ");
		s.setName(br.readLine());
		
		System.out.print("학생 번호 : ");
		s.setId(Integer.parseInt(br.readLine()));
		//우리가 이름과 번호를 입력하고 나서
		// 만약 해당 이름과 번호가 중복이면
		// 중복인걸 알려주고
		// 다시 이름과 번호를 입력받게 한다.
		// 즉 어레이유틸의 contains의 결과값이 true인 동안에는
		// 계속 입력 받으면 되는 것이다!
		while(ArrayUtil.contain(studentArray, s)) {
			//중복된 이름과 번호이므로 다시 입력을 받는다.
			System.out.print("중복된 학생입니다.");
			System.out.print("다시 입력해주세요: ");
			
			System.out.print("학생 이름: ");
			s.setName(br.readLine());
		
			System.out.print("학생 번호 : ");
			s.setId(Integer.parseInt(br.readLine()));
			
			
		}
		System.out.print("국어 점수 : ");
		s.setKorean(validateScore());
		System.out.print("영어 점수 : ");
		s.setEnglish(validateScore());
		System.out.print("수학 점수 : ");
		s.setMath(validateScore());
		return s;
		
	}//setStudentInfo
	
	private static int validateScore() throws NumberFormatException, IOException {
		int score = Integer.parseInt(br.readLine());
		while(score < 0 || score > 100) {
			System.out.println("잘못입력하셨습니다.");
			System.out.println("다시 입력해주세요 : ");
			score = Integer.parseInt(br.readLine());
			
		}
		
		return score;
		
	}//validateScore
	
	
	private static void printArray() throws NumberFormatException, IOException {
		System.out.println("==============================");
		System.out.println("번호\t이름");
		System.out.println("==============================");
		for(int i = 0 ; i < studentArray.length; i ++) {
			System.out.printf("%d\t%s\n", (i+1), studentArray[i].getName());
			
		}
		System.out.println("상세보기할 번호를 눌러주세요(0은 뒤로가기): ");
		int userChoice = Integer.parseInt(br.readLine())-1;
		//만약 userChoice가 올바르지 않으면, 다시 입력을 하도록 시킨다.
		//userchoice가 올바르지 않은 경우는 몇부터 몇인가?
		//-1미만이거나 studentArray.legnth-1초과이면 
		while(userChoice < -1 || userChoice > studentArray.length -1) {
			System.out.println("잘못된 번호입니다.");
			System.out.println("상세보기할 번호를 눌러주세요: ");
			userChoice = Integer.parseInt(br.readLine())-1;
			
		}
		if(userChoice == -1) {
			//메시지만 출력
			System.out.println("메뉴로 돌아갑니다.");
						
		}else {
			//상세보기 메소드 호출
			printOne(userChoice);
			
		}
		
	}//printArray
	
	private static void printOne(int index) throws NumberFormatException, IOException {
		System.out.printf("%s학생의 정보\n", studentArray[index].getName());
		System.out.printf("학번 : %d 이름: %s ", studentArray[index].getId(), studentArray[index].getName()	);
		System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",
				studentArray[index].getKorean(), studentArray[index].getEnglish(),studentArray[index].getMath());
		System.out.printf("총점: %03d점 평균 : %.2f점\n", studentArray[index].calculateSum(), studentArray[index].calculateAverage());
		//수정, 삭제를 위한 입력을 받는다.
		System.out.println("==========================");
		System.out.println("1. 수정 2. 삭제 3. 목록으로");
		int userChoice = Integer.parseInt(br.readLine());
		if(userChoice == 1) {
			//수정 메소드 호출
			System.out.print("국어 : ");
			studentArray[index].setKorean(validateScore());
			System.out.print("영어 : ");
			studentArray[index].setEnglish(validateScore());
			System.out.print("수학 : ");
			studentArray[index].setMath(validateScore());
			
			printOne(index);
			
		}else if(userChoice == 2) {
			//삭제 메소드 호출
			//삭제시에는 정말 삭제하시겠습니까? y/n 물어봐서
			//다시 요 메소드로 돌아온다.
			System.out.print("정말 삭제하시겠습니까? (y/n): ");
			String agree = br.readLine();
			if(agree.contentEquals("y")) {
				//삭제하고 학생목록 보기로 이동
				studentArray = ArrayUtil.removeByIndex(studentArray, index);
				printArray();
			}else if(agree.equals("n")) {
				printOne(index);
			}
		}else if(userChoice == 3) {
			printArray();
		}
	
	
	}
	
	
	
}
