package day0916;
//����ڷκ��� ���� ������ �Է¹ް� ����ϴ� ���α׷��� �ۼ��ϼ���
//���� 1. ���� �ƹ��� ������ ���ٸ� ����� ���� �ʰ� �Ͻÿ�
//���� 2. ���ѷ����� ���ؼ� �Է°� ����� ����ڰ� �����ϴ� ��ŭ �ݺ��ϰ� ���弼��

//����:
//1. �Է� 2. ��� 3. ���� : 1
//���� ��ȣ��? (00�� 0000)
//���� ������ .....
//���� ������? (������)
//�Է¿Ϸ�
//1. �Է� 2. ��� 3. ���� : 2 
//(������ ������ ��µ�)

//20�б���
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarEx02 {
	
	static void showMeue() {
		System.out.println("==================");
		System.out.println(" 1.�Է�\t2.���\t3.����");
		System.out.print("> ");
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Car c1 = new Car();
		//���� ��ȣ
		 String number = "";
		//���� ����
		 String type = "";
		//����
		 int year = 0;
		//����
		 int price = 0;
		//����
		 String color = "";
		
		while(true) {
			showMeue();
			int choice = Integer.parseInt(br.readLine());
			if(choice == 1) {//
				
				System.out.print("���� ��ȣ : ");
				number = br.readLine();
				c1.setNumber(number);
				System.out.print("���� ���� : ");
				type = br.readLine();
				c1.setNumber(type);
				System.out.print("���� ���� : ");
				color = br.readLine();
				c1.setColor(color);
				System.out.print("���� ���� : ");
				price = Integer.parseInt(br.readLine());
				c1.setPrice(price);
				System.out.print("���� ���� : ");
				year = Integer.parseInt(br.readLine());
				c1.setYear(year);
				System.out.println("�Է¿Ϸ�");
			}else if(choice == 2) {
				if(c1.getNumber().equals ("")) {
					System.out.println("������ �����ϴ�");
				}else c1.printInfo();
				
				
			}else if(choice == 3) {
				System.out.println("���α׷� ����"); break;
			}else System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
		
	}
}

//package day0916;
////����ڷκ��� ���� ������ �Է¹ް� ����ϴ� ���α׷��� �ۼ��ϼ���
////���� 1. ���� �ƹ��� ������ ���ٸ� ����� ���� �ʰ� �Ͻÿ�
////���� 2. ���ѷ����� ���ؼ� �Է°� ����� ����ڰ� �����ϴ� ��ŭ �ݺ��ϰ� ���弼��
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
////����:
////1. �Է� 2. ��� 3. ���� : 1
////���� ��ȣ��? (00�� 0000)
////���� ������ .....
////���� ������? (������)
////�Է¿Ϸ�
////1. �Է� 2. ��� 3. ���� : 2 
////(������ ������ ��µ�)
//
////20�б���
//public class CarEx02 {
// public static void main(String[] args) throws NumberFormatException, IOException {
//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//    Car c = new Car();
//    while(true) {
//       System.out.println("��Ʈ ���� ���� ���α׷�");
//       System.out.println("1. �Է� 2. ��� 3. ����");
//       int choice = Integer.parseInt(bufferedReader.readLine());
//       if(choice == 1) {
//          // ���� ���� �Է�
//          // ���� ��ȣ �Է� �غ���
//          System.out.print("��ȣ: ");
//          c.setNumber(bufferedReader.readLine());
//          System.out.print("����: ");
//          c.setType(bufferedReader.readLine());
//          System.out.print("����: ");
//          c.setYear(Integer.parseInt(bufferedReader.readLine()));
//          System.out.print("����: ");
//          c.setPrice(Integer.parseInt(bufferedReader.readLine()));
//          System.out.print("����: ");
//          c.setColor(bufferedReader.readLine());
//       }else if(choice == 2) {
//          // ���� ���� ���
//          // ���� c�� �ʵ尪�� 0�̰ų� ""�̸� �ƹ��� ������ �Էµ��� �ʾҴٴ� ���̹Ƿ�
//          // ���޽����� ����Ѵ�.
//          if(c.getYear() == 0) {
//             System.out.println("���� �Էµ� ������ �����ϴ�.");
//          }else {
//             c.printInfo();
//          }
//          
//       }else if(choice == 3) {
//          System.out.println("������ּż� �����մϴ�.");
//          break;
//       }else {
//          System.out.println("�߸��Է��ϼ̽��ϴ�.");
//       }
//    }
// }
//}

