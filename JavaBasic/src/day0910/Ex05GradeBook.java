package day0910;

//성적관리 프로그램
//우리가 사용자로부터 입력을 받되
//제일 마지막에 사용자로부터 계속할지 말지를 입력 받아서
//만약 사용자가 종료를 선택하면 프로그램이 종료가 되는 형식으로 만들어보자

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05GradeBook {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String yn = new String();
		
		do {
			System.out.print("이름 : ");
			String name = br.readLine();
			
			System.out.println("국어 : ");
			int korean = Integer.parseInt(br.readLine());
			
			System.out.println("영어 : ");
			int english = Integer.parseInt(br.readLine());
			
			System.out.println("수학 : ");
			int math = Integer.parseInt(br.readLine());
			
			int sum = korean + english + math;
			System.out.println("총점  : " + sum);
			
			System.out.println("계속하시겠습니까? (y/n)");
			yn = br.readLine().toUpperCase();
			//toUpperCase()메소드는 
			//해당 내용을 모두 대문자로 바꿔주는 메소드 이다.

		}while(yn.equals("Y"));
		
	}
}
