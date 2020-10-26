package day0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Student;

public class Ex01Student02 {
	
	static void showMenu() {
		System.out.println("==================");
		System.out.println(" 1.�Է�\t2.���\t3.����");
		System.out.print("> ");
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Student s = new Student();
		
		
		while(true) {
			showMenu();
			int choice = Integer.parseInt(br.readLine());
			if(choice == 1) {
				System.out.print("�̸� : ");
				s.setName(br.readLine());
				System.out.print("�л� ID : ");
				s.setId(Integer.parseInt(br.readLine()));
				System.out.print("���� ���� : ");
				s.setKorean(Integer.parseInt(br.readLine()));
				System.out.print("���� ���� : ");
				s.setEnglish(Integer.parseInt(br.readLine()));
				System.out.print("���� ���� : ");
				s.setMath(Integer.parseInt(br.readLine()));
				
			}else if(choice == 2) {
				if(s.getKorean() == 0) {
					System.out.println("�Էµ� ���� �����ϴ�.");
					
				}else s.printInfo();
			}else if(choice == 3) {
				System.out.println("���α׷� ����");
				break;
				
			}else System.out.println("�� �� �Է��ϼ̽��ϴ�.");
		}
	}
}
