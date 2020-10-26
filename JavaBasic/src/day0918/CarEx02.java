package day0918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0916.Car;
import util.ArrayUtil;

//�������� ���α׷�
//1. �Է�
// �Է½ÿ��� �迭�� �̹� �Ȱ��� ��ȣ�� ���� �ÿ��� ���� ��ȣ�� �ٽ� �Է¹ް� �ϼ���
//2. ��� ���
// ��� ��½ÿ���  
//         1. ������ȣ
//         2. ������ȣ
//         3. ������ȣ
// �� �������� ����� ��µǰ� ����ڰ� ��ȣ�� �����Ͽ� �󼼺���� �� �� �ְ� �ϼ���
//3. �� ����
// ��Ͽ��� ������ ��ȣ�� ���� �󼼺���� ����
// ���� ��ȣ ���� ���� ���� ����
// ���� ���� ���� ����
//   ����) ������ȣ: 00�� 0000 ��������: ���� ��������: ������
//        ��������: 2020 ����  ��������: 20000000�� 
// �� ��µǰ� 
// ���� ���� ��ϵ��ư��� �� ��µǰ� ���弼��
// A) ����
//    �������� ����, ����, ������ ������ �� �ְ� ���弼��.
// B) ����
//    ���� �ÿ��� ����ڰ� �����ϸ� �����ϰ� ������� �̵��ϰ� �������� ���� �ÿ��� �ش� ������ �������� �������� �̵��ϼ���
// C) ��Ϻ���
//    �ٽ� ������� �̵��մϴ�.
public class CarEx02 {
	private static BufferedReader br;
	private static Car [] carArray;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		carArray = new Car[0];
		showMenu();
		
	}
	
	private static void showMenu() throws NumberFormatException, IOException {
		while(true) {
			System.out.println("=====================");
			System.out.println("1. �Է� 2. ��� 3. ����");
			System.out.print("> ");

			int choice = Integer.parseInt(br.readLine());
			if(choice == 1) {
				//�Է� �޼ҵ�
				carArray = add();
			}else if(choice == 2) {
				//��� �޼ҵ�
				if(carArray.equals(null)) {
					System.out.println("�Էµ� ���� �����ϴ�");
				}else printInfo(carArray);
			}else if(choice == 3) {
				System.out.println("������ּż� �����մϴ�");
				break;
			}else {System.out.println("�߸��Է��ϼ̽��ϴ�");
			}
		}//while
	}//showMenu
	
	//�Է� �޼ҵ�  add
	private static Car [] add() throws NumberFormatException, IOException {
		carArray = ArrayUtil.add(carArray, setCarInfo());
		return carArray;
	}
	
	private static Car setCarInfo() throws NumberFormatException, IOException {
		Car c = new Car();
		
		System.out.print("���� ��ȣ : ");
		c.setNumber(br.readLine());
		System.out.print("���� ���� : ");
		c.setType(br.readLine());
		System.out.print("���� ���� : ");
		c.setYear(Integer.parseInt(br.readLine()));
		System.out.print("���� ���� : ");
		c.setPrice(Integer.parseInt(br.readLine()));
		System.out.print("���� ���� : ");
		c.setColor(br.readLine());
		
		return c;
	}
	
	//��� �޼ҵ� printInfo
	private static void printInfo(Car [] carArray) throws NumberFormatException, IOException	{
		
		while(true) {
			for(int i = 0 ; i < carArray.length; i++) {
				System.out.println((i+1)+". "+carArray[i].getNumber());
			}
			System.out.println("�󼼺����� ������ ��ȣ�� �����ϼ���");
			System.out.print("> ");
			int userChoice = Integer.parseInt(br.readLine())-1;
			
			
			if(userChoice < carArray.length && userChoice > -1 ) {
				while(true) {
					System.out.println(carArray[userChoice]);
					
					System.out.println("====================");
					System.out.println("1. ���� 2. ���� 3. ��Ϻ���");
					int choice = Integer.parseInt(br.readLine());
					if(choice == 1) {
						System.out.print("���� ���� : ");
						carArray[userChoice].setYear(Integer.parseInt(br.readLine()));
						System.out.print("���� ���� : ");
						carArray[userChoice].setPrice(Integer.parseInt(br.readLine()));
						System.out.print("���� ���� : ");
						carArray[userChoice].setColor(br.readLine());
						
					}else if(choice == 2) {
						System.out.print("������ ����ðڽ��ϱ�? (y/n): ");
						String yn = br.readLine();
						if(yn.equals("y")) {
							carArray = ArrayUtil.removeByIndex(carArray, userChoice);
							
						}else if(yn.equals("n")) {
							
						}else System.out.println("�߸��Է��ϼ̽��ϴ�");
						
					}else if(choice == 3) {
						System.out.println("������� ���ư��ϴ�");
						break;
					}
				}//while
			}else {System.out.println("�� �� �Է��ϼ̽��ϴ�");
			}
			
		}//while
			
	}//printInfo
}

	

