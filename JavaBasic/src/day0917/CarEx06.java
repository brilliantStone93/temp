package day0917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0916.Car;
import util.ArrayUtil;

public class CarEx06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Car []  carArray = new Car[0];
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		while(true) {
			showMenu();
			int userChoice = Integer.parseInt(br.readLine());
			if(userChoice == 1) {
				//carArray �߰� �޼ҵ� ����
				carArray = add(carArray, br);
			}else if(userChoice == 2) {
				//carArray ��� �޼ҵ� ����
				printArray(carArray);
			}else if(userChoice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			
		}
		
		
	}//main
	
	
	
	private static void showMenu() {
		System.out.println("1. �Է� 2. ��� 3. ����");
		System.out.print(">");
	}//showMenu
	
	

	private static Car[] add(Car[] carArray, BufferedReader br) throws IOException {
		carArray = ArrayUtil.add(carArray, setCarInfo(br));       //br�� ������ ������ϰ� �ѹ��� �ϵ��� �Ķ���ͷ� �Դٰ����Ұ���
		return carArray;
	}//add
	
	private static Car setCarInfo(BufferedReader br) throws IOException {
		Car c = new Car();
	
		System.out.println("���� ��ȣ : ");
		c.setNumber(br.readLine());
		
		System.out.println("���� ���� : ");
		c.setType(br.readLine());
		
		System.out.println("���� ���� : ");
		c.setYear(Integer.parseInt(br.readLine()));
		
		System.out.println("���� ���� : ");
		c.setPrice(Integer.parseInt(br.readLine()));
		
		System.out.println("���� ���� : ");
		c.setColor(br.readLine());
		
		
		return c;
	}
	
	private static void printArray(Car[] carArray) {
		for(int i = 0 ; i < carArray.length; i++) {
			System.out.println(carArray[i]);
		}
	}
	
}
