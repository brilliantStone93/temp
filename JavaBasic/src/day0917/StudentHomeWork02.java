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
				//�Է� �޼ҵ�
				studentArray = add(studentArray, br);
			}else if(choice == 2) {
				//��¸޼ҵ�
				printStudentArray(studentArray);
			}else if(choice == 3) {
				System.out.println("������ּż� �����մϴ�");
				break;
			}else {System.out.println("�߸��Է��ϼ̽��ϴ�");}
		}//while
		
	}//main
	
	//�޴� �޼ҵ�
	public static void showMenu() {
		System.out.println("====================");
		System.out.println("�� Ʈ �� �� �� �� �� �� �� �� ��");
		System.out.println("1. �Է� 2. ��� 3. ����");
		System.out.print("> ");
	}//showMenu
	
	//�Է� �� �߰��� ����ϴ� �޼ҵ�
	private static Student [] add(Student [] studentArray, BufferedReader br) throws IOException {
		studentArray = ArrayUtil.add(studentArray, setStudentInfo(br));
		
		return studentArray;
	}
	
	private static Student  setStudentInfo(BufferedReader br) throws IOException {
		Student s = new Student();
		System.out.println("�л� �̸� : ");
		s.setName(br.readLine());
		System.out.println("�л� ��ȣ : ");
		s.setId(Integer.parseInt(br.readLine()));
		System.out.println("���� ���� : ");
		s.setKorean(Integer.parseInt(br.readLine()));
		System.out.println("���� ���� : ");
		s.setEnglish(Integer.parseInt(br.readLine()));
		System.out.println("���� ���� : ");
		s.setMath(Integer.parseInt(br.readLine()));
		
		return s;
		
	}
	
	//��� ��� �޼ҵ�
	private static void printStudentArray(Student[] studentArray) {
		for(int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}
	}
}
