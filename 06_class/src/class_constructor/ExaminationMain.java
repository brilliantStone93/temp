package class_constructor;

import java.util.Scanner;

public class ExaminationMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ExaminationMain em = new ExaminationMain();
		
		System.out.print("�ο� �� �Է�:");
		int size = scan.nextInt();
		Examination[] ex = new Examination[size];
		
		
		
		for(int i = 0 ; i <ex.length; i++) {
			ex[i] = em.input();
		}
		System.out.println("�̸�\t1\t2\t3\t4\t5\t����");
		for(int i = 0 ; i <3; i++) {
			ex[i].display();
			
		}
		
		
	}//main
	
	
	
	private Examination input() {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("�̸� �Է�:");
		String name = scan.next();
		
		System.out.print("�� �Է�:");
		String dap = scan.next();
		Examination e = new Examination(name, dap);
		e.compare();
		return e;
		
		
	}
	
	
}
