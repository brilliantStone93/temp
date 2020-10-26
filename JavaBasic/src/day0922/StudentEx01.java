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
			System.out.println("1. �Է� 2. ��� 3. ����");
			System.out.print(">");
			int choice = validateInt(1,3);
			if(choice == 1) {
				insert();
			}else if(choice == 2) {
				selectAll();
			}else if(choice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}
			
		}//while
		
		
	}//showMenu
	
	
	private static int stringToInteger() throws IOException {
		String userInput = br.readLine();
		while(!userInput.matches("\\d*")) {
			System.out.println("���ڸ� �Է����ּ���");
			System.out.print(">");
			userInput = br.readLine();
			
		}
		return Integer.parseInt(userInput);
	
	}//stringToInteger
	
	private static int validateInt(int minimum, int maximum) throws IOException {
		int value = stringToInteger();
		while(value < minimum || value > maximum ) {
			System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.");
			value = stringToInteger();
			
		}
		return value;
	}//validateInt
	
	private static void insert() throws IOException {
		Student s = new Student();
		s.setId(id);
		id++;
		System.out.println("�̸�");
		System.out.print("> ");
		s.setName(br.readLine());
		
		System.out.println("��������");
		System.out.print("> ");
		s.setKorean(validateInt(0, 100));
		
		System.out.println("��������");
		System.out.print("> ");
		s.setEnglish(validateInt(0, 100));
		
		System.out.println("��������");
		System.out.print("> ");
		s.setMath(validateInt(0, 100));
		
		list.add(s);
		
		
	}//insert
	
	
	private static void selectAll() throws IOException	{
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%d. %s\n", i+1 , list.get(i).getName());
		}
		System.out.println("�󼼺����� ��ȣ�� �Է��� �ּ���(0�� ����)");
		int userChoice = validateInt(0, list.size()) - 1;
		if(userChoice == -1) {
			System.out.println("�������� ���ư��ϴ�.");
			
		}else {
			selectOne(userChoice);
		}
	}//selectAll
	
	private static void selectOne(int index) throws IOException {
		Student s = list.get(index);
		System.out.printf("�̸� : %s, �й�: %d\n", s.getName(), s.getId());
		System.out.printf("���� : %d ����: %d ���� : %d\n", s.getKorean(), s.getEnglish(), s.getMath());
		System.out.printf("���� : %d ���: %.2f\n", s.calculateSum(), s.calculateAverage());
		System.out.println("1. ���� 2. ���� 3. �������");
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
		System.out.println("���� �����ϰڽ��ϱ�? (y/n)");
		System.out.print("> ");
		String yn = br.readLine().toUpperCase();//����ڰ� �Է��� ���ĺ��� �빮�ڷ� �ٲ㼭 �Է��ϰڴ�
		
		if(yn.equals("y")) {
			list.remove(index);
			selectAll();
		}else if(yn.equals("n")) {
			selectOne(index);
		}
	}//delete
	
	private static void update(int index) throws IOException {
		System.out.println("�̸�");
		System.out.print("> ");
		list.get(index).setName(br.readLine());
		System.out.println("����");
		list.get(index).setKorean(validateInt(0,100));
		
		System.out.println("����");
		list.get(index).setEnglish(validateInt(0,100));
		
		System.out.println("����");
		list.get(index).setMath(validateInt(0,100));
		selectOne(index);
	}//update
}//
