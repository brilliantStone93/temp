package day0918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Student;
import util.ArrayUtil;

//Student Ŭ���� �迭�� ArrayUtil�� ����ؼ� �����ϴ� ���α׷�
public class StudentEx01 {
	
	private static BufferedReader br;
	private static Student[] studentArray;
	public static void main(String[] args) throws NumberFormatException, IOException {
		studentArray = new Student[0];
		br = new BufferedReader( new InputStreamReader(System.in));
		
		//���� �޼ҵ忡�� �ʱ�ȭ, �� �����ڸ� ȣ���ϰ� �������ʹ�
		//���� ���θ޼ҵ尡 �ٸ� �޼ҵ带 �� ���Ŀ� ȣ���ϰ� �ȴٸ�
		//�̹� �ʱ�ȭ�� �� �����̱� ������ NullPointerException�� �߻����� �ʰ�
		//���������� ����� �� �ִ�.
		
			showMenu();
			
		
	}
	
	private static void showMenu() throws NumberFormatException, IOException {
		while(true) {
		System.out.println("��Ʈ ���� ���� ���α׷�");
		System.out.println("1. �Է� 2. ��� 3. ����");
		System.out.println("> ");
		int userChoice = Integer.parseInt(br.readLine());
		
		if(userChoice == 1) {
			//�Է� �޼ҵ� ����
			add();
		}else if(userChoice == 2) {
			//��� �޼ҵ� ����
			printArray();
		}else if(userChoice == 3) {
			System.out.println("������ּż� �����մϴ�");
			break;
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
		}//while
	
	}//showmenu
	
	
	private static void add() throws IOException {
		studentArray = ArrayUtil.add(studentArray, setStudentInfo());	
	
	}//add
	
	
	private static Student setStudentInfo() throws IOException {
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
		
	}//setStudentInfo
	
	private static void printArray() {
		for(int i = 0 ; i < studentArray.length; i ++) {
			System.out.println(studentArray[i]);
		}
	}
	
}
