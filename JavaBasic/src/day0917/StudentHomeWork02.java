package day0917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Student;
import util.ArrayUtil;

public class StudentHomeWork02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Student [] studentArray = new Student[0];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			showMenu();
			int choice = Integer.parseInt(br.readLine());
			if(choice == 1) {
				//입력 메소드
				studentArray = add(studentArray, br);
			}else if(choice == 2) {
				//출력메소드
				printStudentArray(studentArray);
			}else if(choice == 3) {
				System.out.println("사용해주셔서 감사합니다");
				break;
			}else {System.out.println("잘못입력하셨습니다");}
		}//while
		
	}//main
	
	//메뉴 메소드
	public static void showMenu() {
		System.out.println("====================");
		System.out.println("비 트 고 학 생 관 리 프 로 그 램");
		System.out.println("1. 입력 2. 출력 3. 종료");
		System.out.print("> ");
	}//showMenu
	
	//입력 및 추가를 담당하는 메소드
	private static Student [] add(Student [] studentArray, BufferedReader br) throws IOException {
		studentArray = ArrayUtil.add(studentArray, setStudentInfo(br));
		
		return studentArray;
	}
	
	private static Student  setStudentInfo(BufferedReader br) throws IOException {
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
		
	}
	
	//출력 담당 메소드
	private static void printStudentArray(Student[] studentArray) {
		for(int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}
	}
}
