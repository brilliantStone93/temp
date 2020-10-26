package day0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Student;

public class Ex01Student02 {
	
	static void showMenu() {
		System.out.println("==================");
		System.out.println(" 1.입력\t2.출력\t3.종료");
		System.out.print("> ");
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Student s = new Student();
		
		
		while(true) {
			showMenu();
			int choice = Integer.parseInt(br.readLine());
			if(choice == 1) {
				System.out.print("이름 : ");
				s.setName(br.readLine());
				System.out.print("학생 ID : ");
				s.setId(Integer.parseInt(br.readLine()));
				System.out.print("국어 점수 : ");
				s.setKorean(Integer.parseInt(br.readLine()));
				System.out.print("영어 점수 : ");
				s.setEnglish(Integer.parseInt(br.readLine()));
				System.out.print("수학 점수 : ");
				s.setMath(Integer.parseInt(br.readLine()));
				
			}else if(choice == 2) {
				if(s.getKorean() == 0) {
					System.out.println("입력된 값이 없습니다.");
					
				}else s.printInfo();
			}else if(choice == 3) {
				System.out.println("프로그램 종료");
				break;
				
			}else System.out.println("잘 못 입력하셨습니다.");
		}
	}
}
