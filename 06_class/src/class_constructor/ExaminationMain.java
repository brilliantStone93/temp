package class_constructor;

import java.util.Scanner;

public class ExaminationMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ExaminationMain em = new ExaminationMain();
		
		System.out.print("인원 수 입력:");
		int size = scan.nextInt();
		Examination[] ex = new Examination[size];
		
		
		
		for(int i = 0 ; i <ex.length; i++) {
			ex[i] = em.input();
		}
		System.out.println("이름\t1\t2\t3\t4\t5\t점수");
		for(int i = 0 ; i <3; i++) {
			ex[i].display();
			
		}
		
		
	}//main
	
	
	
	private Examination input() {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("이름 입력:");
		String name = scan.next();
		
		System.out.print("답 입력:");
		String dap = scan.next();
		Examination e = new Examination(name, dap);
		e.compare();
		return e;
		
		
	}
	
	
}
