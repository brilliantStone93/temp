package day0918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0915.Student;
import util.ArrayUtil;

//�л� ��Ͽ� �߰����� �޼ҵ带 �� ����� ����
// 1. ���� �л���ȣ�� �̸��� ���� �л��� �ԷµǸ�
//    �߸� �Է��ߴٰ� �˷��ְ�
//    �ߺ��� �ƴ� �л��� �Էµɶ����� �ٽ� �Է� ����
// 2. �߸��� ������ �߸� �Է��ߴٰ� �˷��ְ�
//    �ùٸ� ������ ���ö� ���� �ٽ� �Է��� ����
//Student Ŭ���� �迭�� ArrayUtil�� ����ؼ� �����ϴ� ���α׷�
public class StudentEx03 {
	
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
	
	}//showMenu
	
	
	private static void add() throws IOException {
		studentArray = ArrayUtil.add(studentArray, setStudentInfo());	
	
	}//add
	
	
	private static Student setStudentInfo() throws IOException {
		Student s = new Student();
		System.out.print("�л� �̸� : ");
		s.setName(br.readLine());
		
		System.out.print("�л� ��ȣ : ");
		s.setId(Integer.parseInt(br.readLine()));
		//�츮�� �̸��� ��ȣ�� �Է��ϰ� ����
		// ���� �ش� �̸��� ��ȣ�� �ߺ��̸�
		// �ߺ��ΰ� �˷��ְ�
		// �ٽ� �̸��� ��ȣ�� �Է¹ް� �Ѵ�.
		// �� �����ƿ�� contains�� ������� true�� ���ȿ���
		// ��� �Է� ������ �Ǵ� ���̴�!
		while(ArrayUtil.contain(studentArray, s)) {
			//�ߺ��� �̸��� ��ȣ�̹Ƿ� �ٽ� �Է��� �޴´�.
			System.out.print("�ߺ��� �л��Դϴ�.");
			System.out.print("�ٽ� �Է����ּ���: ");
			
			System.out.print("�л� �̸�: ");
			s.setName(br.readLine());
		
			System.out.print("�л� ��ȣ : ");
			s.setId(Integer.parseInt(br.readLine()));
			
			
		}
		System.out.print("���� ���� : ");
		s.setKorean(validateScore());
		System.out.print("���� ���� : ");
		s.setEnglish(validateScore());
		System.out.print("���� ���� : ");
		s.setMath(validateScore());
		return s;
		
	}//setStudentInfo
	
	private static int validateScore() throws NumberFormatException, IOException {
		int score = Integer.parseInt(br.readLine());
		while(score < 0 || score > 100) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			System.out.println("�ٽ� �Է����ּ��� : ");
			score = Integer.parseInt(br.readLine());
			
		}
		
		return score;
		
	}//validateScore
	
	
	private static void printArray() throws NumberFormatException, IOException {
		System.out.println("==============================");
		System.out.println("��ȣ\t�̸�");
		System.out.println("==============================");
		for(int i = 0 ; i < studentArray.length; i ++) {
			System.out.printf("%d\t%s\n", (i+1), studentArray[i].getName());
			
		}
		System.out.println("�󼼺����� ��ȣ�� �����ּ���(0�� �ڷΰ���): ");
		int userChoice = Integer.parseInt(br.readLine())-1;
		//���� userChoice�� �ùٸ��� ������, �ٽ� �Է��� �ϵ��� ��Ų��.
		//userchoice�� �ùٸ��� ���� ���� ����� ���ΰ�?
		//-1�̸��̰ų� studentArray.legnth-1�ʰ��̸� 
		while(userChoice < -1 || userChoice > studentArray.length -1) {
			System.out.println("�߸��� ��ȣ�Դϴ�.");
			System.out.println("�󼼺����� ��ȣ�� �����ּ���: ");
			userChoice = Integer.parseInt(br.readLine())-1;
			
		}
		if(userChoice == -1) {
			//�޽����� ���
			System.out.println("�޴��� ���ư��ϴ�.");
						
		}else {
			//�󼼺��� �޼ҵ� ȣ��
			printOne(userChoice);
			
		}
		
	}//printArray
	
	private static void printOne(int index) throws NumberFormatException, IOException {
		System.out.printf("%s�л��� ����\n", studentArray[index].getName());
		System.out.printf("�й� : %d �̸�: %s ", studentArray[index].getId(), studentArray[index].getName()	);
		System.out.printf("����: %03d�� ����: %03d�� ����: %03d��\n",
				studentArray[index].getKorean(), studentArray[index].getEnglish(),studentArray[index].getMath());
		System.out.printf("����: %03d�� ��� : %.2f��\n", studentArray[index].calculateSum(), studentArray[index].calculateAverage());
		//����, ������ ���� �Է��� �޴´�.
		System.out.println("==========================");
		System.out.println("1. ���� 2. ���� 3. �������");
		int userChoice = Integer.parseInt(br.readLine());
		if(userChoice == 1) {
			//���� �޼ҵ� ȣ��
			System.out.print("���� : ");
			studentArray[index].setKorean(validateScore());
			System.out.print("���� : ");
			studentArray[index].setEnglish(validateScore());
			System.out.print("���� : ");
			studentArray[index].setMath(validateScore());
			
			printOne(index);
			
		}else if(userChoice == 2) {
			//���� �޼ҵ� ȣ��
			//�����ÿ��� ���� �����Ͻðڽ��ϱ�? y/n �������
			//�ٽ� �� �޼ҵ�� ���ƿ´�.
			System.out.print("���� �����Ͻðڽ��ϱ�? (y/n): ");
			String agree = br.readLine();
			if(agree.contentEquals("y")) {
				//�����ϰ� �л���� ����� �̵�
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
