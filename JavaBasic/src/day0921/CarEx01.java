package day0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

import day0916.Car;

//�ڵ��� ���� ���α׷���  ArrayList�� �ۼ��ϼ���(
public class CarEx01 {
	private static BufferedReader br;
	private static ArrayList<Car> list;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		 list = new ArrayList<>();
		 br = new BufferedReader(new InputStreamReader(System.in));
		 
		 showMenu();
	}//main
	
	private static void showMenu() throws NumberFormatException, IOException {
		while(true) {
			System.out.println("========�ڵ������� ���α׷�==========");
			System.out.println("1. �Է�\t2. ���\t3. ����");
			System.out.print("> ");
			int choice = validateNumber(1,3);
			if(choice==1) {
				add();
			}else if(choice == 2) {
				printArray();
			}else if(choice == 3) {
				System.out.println("���α׷� ��� ����");
				break;
			}
		}//while
	}//showMenu
	
	private static int validateNumber(int minimum, int maximum) throws NumberFormatException, IOException {
	      System.out.print("> ");
	      int value = Integer.parseInt(br.readLine());
	      while (value < minimum || value > maximum) {
	         System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
	         System.out.print("> ");
	         value = Integer.parseInt(br.readLine());
	      }

	      return value;
	   }//validateNumber
	
	private static void add() throws NumberFormatException, IOException {
		Car c = new Car();
		System.out.print("���� ��ȣ : ");
		c.setNumber(br.readLine());
		while(list.contains(c)) {
			System.out.println("�̹� �����ϴ� ������ȣ�Դϴ�.");
			System.out.print("���� ��ȣ : ");
			c.setNumber(br.readLine());
		}
		System.out.print("���� ���� : ");
		c.setType(br.readLine());
		System.out.print("���� ���� : ");
		c.setYear(Integer.parseInt(br.readLine()));
		System.out.print("���� ���� : ");
		c.setColor(br.readLine());
		System.out.print("���� ���� : ");
		c.setPrice(Integer.parseInt(br.readLine()));
		
		list.add(c);
	}
	
	private static void printArray() throws NumberFormatException, IOException {
		System.out.println("========���========");
		for(int i = 0 ; i < list.size(); i ++) {
		System.out.println((i+1)+". "+list.get(i).getNumber()) ;
		}
		System.out.println();
		System.out.print("�󼼺����� ��ȣ�� �����ϼ���(0���� �ڷΰ���): ");
		int userChoice = validateNumber(0, list.size())-1;
		if(userChoice == -1) {
			System.out.println("�Ŵ��� ���ư��ϴ�");
		}else printOne(userChoice);
		
	
	}//printArray
	
	private static void printOne(int index) throws NumberFormatException, IOException {
		System.out.println("===========================");
		System.out.printf("\t%s ���� ����\n", list.get(index).getNumber());
		System.out.printf("������ȣ: %s | ���� ���� : %s | ���� ���� : %s\n", list.get(index).getNumber(), list.get(index).getType(),list.get(index).getColor());
		DecimalFormat format = new DecimalFormat("#,###");
		System.out.printf("���� ���� : %d�� | ���� ���� : %s��\n", list.get(index).getYear(), format.format(list.get(index).getPrice()));
		System.out.println("============================");
		System.out.println("1. ���� 2. ���� 3. �������");
		System.out.println(" > " );
		int userChoice = validateNumber(1, 3);
		if(userChoice == 1) {
			//���� �޼ҵ� ����
			update(index);
		}else if(userChoice == 2) {
			//���� �޼ҵ� ����
			delete(index);
		}else if(userChoice == 3) {
			//���� �޴��� ���ư�����printAll()����
			printArray();
		}
	}//printOne
	
	private static void update(int index) throws NumberFormatException, IOException {
		System.out.print("���� ���� : ");
		list.get(index).setColor(br.readLine());
		
		System.out.print("���� ���� : ");
		list.get(index).setYear(Integer.parseInt(br.readLine()));
		
		System.out.print("���� ���� : ");
		list.get(index).setPrice(Integer.parseInt(br.readLine()));
		
		printOne(index);
		
	}//update
	
	
	private static void delete(int index) throws IOException{
		System.out.println("�ش� ������ ���� �����Ͻðڽ��ϱ�? (y/n)");
		System.out.print("> ");
		String yn = br.readLine();
		if(yn.equals("y")) {
			list.remove(index);
			printArray();
		}else if(yn.equals("n")) {
			printOne(index);
		}
	}//delete
	
}
