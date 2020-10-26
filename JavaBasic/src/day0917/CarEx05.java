package day0917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0916.Car;

//���� �� ���� 
//���� �տ� ���� �����ϰ�
//��ĭ�� ���ܼ� �� �������� ������ ��������
//�迭�� �����ϴ� ���α׷�
public class CarEx05 {
	private static int SIZE=3;
	public static void main(String[] args) throws NumberFormatException, IOException {
		Car[] carArray = new Car[SIZE];
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		while(true) {
			showMenu();
			int userChoice = Integer.parseInt(br.readLine());
			if(userChoice == 1) {
				//�Է� �޼ҵ� ����
				carArray = add(carArray);
				
			}else if( userChoice == 2) {
				//��� �޼ҵ� ����
				printArray(carArray);
			}else if(userChoice == 3) {
				//�޽��� ��� �� ����
				System.out.println("������ּż� �����մϴ�");
				break;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
	//�޴� �޼ҵ�
	private static void showMenu() {
		System.out.println("��Ʈ �������� ���α׷� ver 2.0");
		System.out.println("1. �Է� 2. ��� 3. ����");
		System.out.println(">");
	}
	//�Է� �޼ҵ�/�迭�� ��á���� ����ְ� ���ο� ���� �ֱ�
	private static Car [] add(Car[] carArray) throws NumberFormatException, IOException {
		int index = findEmptyIndex(carArray);
		if(index != -1) {
			//��ĭ�� �����ϹǷ� index �� ĭ��
			//Car ��ü�� �־��ش�.
			carArray[index] = setCarInfo();
			
		}else {
			//�迭�� ��δ� ��á���Ƿ� �迭�� ��ĭ�� ���ܼ�
			//�Ǹ�����ĭ�� ���ο� �Էµ� c�� �ְ� ���������
			for(int i = 1; i<carArray.length; i++) {
				carArray[i-1] = carArray[i];
			}
			carArray[SIZE -1] = setCarInfo();
		}
		return carArray;
	}
	//�Է� �޼ҵ�
	private static Car setCarInfo() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		Car c = new Car();
		System.out.println("���� ��ȣ : " );
		c.setNumber(br.readLine());
		System.out.println("���� ����: " );
		c.setType(br.readLine());
		System.out.println("���� ����: " );
		c.setYear(Integer.parseInt(br.readLine()));
		System.out.println("���� ����: " );
		c.setPrice(Integer.parseInt(br.readLine()));
		System.out.println("���� ���� : " );
		c.setColor(br.readLine());
		
		return c;
	}
	//Car�迭 �� ��ĭ�� ã�� �޼ҵ�
	private static int findEmptyIndex(Car[] carArray) {
		for(int i = 0; i < carArray.length; i ++) {
			if(carArray[i] == null) {
				return i;
			}
		}
		return -1;
	}
	//��� �޼ҵ�
	private static void printArray(Car[] carArray) {
		for(int i = 0 ; i < carArray.length; i++) {
			System.out.println(carArray[i]);
		}
	}


}

