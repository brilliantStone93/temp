package day0911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2���� �迭�� ���ÿ� ����ؼ�
//�̸��� ������ ���ÿ� �����غ���

public class Ex01Array {
	
	final static int SIZE = 5;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�̸��� ����� �迭�� �ϳ� ������
		String[] nameArray =new String[SIZE];
		//������ ����� �迭�� �ϳ� ������
		int[] sumArray = new int[SIZE];
		
		//���ʴ�� �Է��� �غ���
		for(int i =0; i<SIZE; i++) {
			System.out.print((i+1)+"�� �л��� �̸� : " );
			nameArray[i] = br.readLine();
			System.out.print(nameArray[i]+" �л��� �������� : ");
			int korean = Integer.parseInt(br.readLine());
			while(korean<0|| korean>100) {
				System.out.println("�߸��Է��ϼ̽��ϴ�."	);
				System.out.print(nameArray[i]+" �л��� �������� : ");
				korean = Integer.parseInt(br.readLine());
			}
			System.out.print(nameArray[i]+" �л��� �������� : ");
			int english = Integer.parseInt(br.readLine());
			while(english < 0 || english > 100) {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				System.out.print(nameArray[i]+" �л��� �������� : ");
				english = Integer.parseInt(br.readLine());
			}
			
			System.out.print(nameArray[i]+" �л��� �������� : ");
			int math = Integer.parseInt(br.readLine());
			while(math<0||math>100) {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				System.out.println(nameArray[i]+"�л��� ��������:");
				math = Integer.parseInt(br.readLine());
			}
			sumArray[i] = korean + english + math;
			
		}
		
		//���� ���� �л��� ��ȣ�� �Է��ϸ� �� �л��� ������ ����ϰ� ������
		
//		System.out.println("���� ���� �л��� ��ȣ�� �Է��ϼ���(1~5): " );
//		int userChoice = Integer.parseInt(br.readLine())-1;
//		while(userChoice >4 || userChoice < -1) {
//			System.out.println("�߸��Է��ϼ̽��ϴ�.");
//			System.out.println("���� ���� �л��� ��ȣ�� �Է��ϼ���(1~5): " );
//			userChoice = Integer.parseInt(br.readLine())-1;
//		}
//		if(userChoice == -1) {System.out.println("������ּż� �����մϴ�.");}
//		else System.out.println(nameArray[userChoice]+"�л��� ���� : "+ sumArray[userChoice]);
		
		//20�е��� �����е��� ����ϴ� �κ��� ���ϴ� ���ѷ����� ����ð�  
		//���� ����ڰ� ������� �л��� ��ȣ�� �Է��Ҵ� -1 �� �Է��ϸ� ���α׷�����
		//Ȥ�� ����ڰ� �߸��� ��ȣ�� �Է��ϸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���~��� �Է��ϰ� ���α׷��� �����غ�����.
		
		while(true) {
			System.out.println("��������л��� ��ȣ�� �Է��ϼ���(1~5, -1�� ����): ");
			System.out.println(">");
			int userChoice = Integer.parseInt(br.readLine());
			if(userChoice == -1) {
				//����ڰ� ���Ḧ �������� ��
				System.out.println("������ּż� �����մϴ�");
				break;
			}else if(userChoice>=1&&userChoice<=5) {
				//�л� ��ȣ�� ��ȿ�Ҷ�
				int index = userChoice -1;
				System.out.println(nameArray[index]+"�л��� ���� : "+ sumArray[index]);
			}else {
				//�߸��Է�������
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
		
	}
}
