//package day0911;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
////���� Ÿ���� ���� �޼ҵ�
////�׸��� �޼ҵ� �߰��� �����ϴ� �޼ҵ�
//public class Ex05Method02 {
//	//1.����Ÿ���� ���� �޼ҵ�
//	// �ƹ��͵� �������� ���� ������ void��� �����ְ�
//	// ���� �׷��� ��쿣 return ��ɾ ���� �ʴ´�.
//	static void showMenu() {
//		System.out.println("----------------------");
//		System.out.println("��Ʈ����б� �������� ���α׷�");
//		System.out.println("\t1. �Է�");
//		System.out.println("\t2. ���");
//		System.out.println("\t3. ����");
//	}
//	
//	
//	final static int SIZE = 5;
//	static int input(BufferedReader br) throws NumberFormatException, IOException {
//		String [] name = new String[SIZE];
//		int [] korean = new int[SIZE];
//		int [] english = new int[SIZE];
//		int [] math = new int[SIZE];
//		
//		for(int i=0; i<SIZE;i++) {
//			System.out.println("�̸� : ");
//			name [i] = br.readLine();
//			System.out.println("�������� :" );
//			korean [i] = Integer.parseInt(br.readLine());
//			while(true) {
//				if(korean [i] >=0 && korean [i] <=100) break;
//				else {
//					System.out.println("�� �� �Է��ϼ̽��ϴ�");
//					System.out.println("�������� :" );
//					korean [i] = Integer.parseInt(br.readLine());
//				}
//			}
//			System.out.println("�������� :" );
//			english [i] = Integer.parseInt(br.readLine());
//			while(true) {
//				if(english [i] >=0 && english [i] <=100) break;
//				else {
//					System.out.println("�� �� �Է��ϼ̽��ϴ�");
//					System.out.println("�������� :" );
//					english [i] = Integer.parseInt(br.readLine());
//				}
//			}
//			System.out.println("�������� :" );
//			math [i] = Integer.parseInt(br.readLine());
//			while(true) {
//				if(math [i] >=0 && math [i] <=100) break;
//				else {
//					System.out.println("�� �� �Է��ϼ̽��ϴ�");
//					System.out.println("�������� :" );
//					math [i] = Integer.parseInt(br.readLine());
//				}
//			}	
//		}//for
//		
//	}//input
//	
//	static void output(BufferedReader br, String name [], int korean [], int english [], int math []) throws NumberFormatException, IOException {
//	
//		
//		System.out.println("�л� ��ȣ�� �Է��Ͻÿ� : ");
//		int number = Integer.parseInt(br.readLine())-1;
//		System.out.println(number+1+"�� �л��� �̸� : "+ name[number]);
//		System.out.println("���� : "+korean [number] + "���� : "+ english [number] +"���� : "+math [number]  );
//	}
//	
//	public static void main(String[ ] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//		String name ;
//		int korean = 0;
//		int english = 0;
//		int math = 0;
//		
//		while(true) {
//			showMenu();
//			int userChoice = Integer.parseInt(br.readLine());
//			if(userChoice == 1) {
//				input(br);
//				//�Է� �޼ҵ� ����
//				korean = input(br);
//				// ������ �Է� �޾Ƽ� ��ȿ�� ������ �������ִ� �޼ҵ带 ����
//				// ������ ������ �Է� ��Ű�ÿ�
//				
//			}else if (userChoice ==2) {
//				output(br,  name, korean  ,  english ,  math);
//				//��� �޼ҵ� ����
//				
//				// �Ķ���ͷ� �Ѿ�� �̸�, ������ ������
//				// ���ڰ� ����ϴ� �޼ҵ带 �ۼ��Ͻÿ�
//			}else if (userChoice == 3) {
//				System.out.println("������ּż� �����մϴ�.");
//				break;
//			}
//		}
//		
//	}
//
//}


//����� ���
  package day0911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//����Ÿ���� ���� �޼ҵ�
//�׸��� �޼ҵ� �߰��� �����ϴ� �޼ҵ�
public class Ex05Method02 {
   //1. ���� Ÿ���� ���� �޼ҵ�
   //   �ƹ��͵� �������� ���� ������ void��� �����ְ�
   //   ���� �׷��� ��쿣 return ��ɾ ���� �ʴ´�.
   static void showMenu() {
      System.out.println("----------------------");
      System.out.println("��Ʈ����б� �������� ���α׷�");
      System.out.println("\t1. �Է�");
      System.out.println("\t2. ���");
      System.out.println("\t3. ����");
   }
   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      int korean = 0;
      int math = 0;
      int english = 0;
      String name = new String();
      while(true) {
         showMenu();
         int userChoice = Integer.parseInt(bufferedReader.readLine());
         if(userChoice == 1) {
            //�Է� �޼ҵ� ����
            
            // ������ �Է¹޾Ƽ� ��ȿ�� ������ �������ִ� �޼ҵ带 ����
            // ������ ������ �Է� ��Ű�ÿ�
            System.out.print("�̸�: ");
            name = bufferedReader.readLine();
            
            System.out.print("���� ");
            korean = validateScore(bufferedReader);
            
            System.out.print("���� ");
            english = validateScore(bufferedReader);
            
            System.out.print("���� ");
            math = validateScore(bufferedReader);
         }else if(userChoice == 2) {
            //��� �޼ҵ� ����
            
            // �Ķ���ͷ� �Ѿ�� �̸�, ������ ������ 
            // ���ڰ� ����ϴ� �޼ҵ带 �ۼ��Ͻÿ�
            printScore(name, korean, english, math);
         }else if(userChoice == 3) {
            System.out.println("������ּż� �����մϴ�.");
            break;
         }
      }
   }
   static int validateScore(BufferedReader b) throws NumberFormatException, IOException {
      System.out.print("������ �Է��ϼ���: ");
      int score = Integer.parseInt(b.readLine());
      
      while(score < 0 || score > 100) {
         System.out.println("�߸� �Է��ϼ̽��ϴ�.");
         System.out.print("������ �Է��ϼ���: ");
         score = Integer.parseInt(b.readLine());
      }
      return score;
   }
   
   static void printScore(String name, int korean, int english, int math) {
      System.out.println("=========================");
      System.out.println("\t�̸�: "+name);
      System.out.printf("����: %d ����: %d ����: %d\n", korean, english, math);
      int sum = korean + english + math;
      double average = sum / (double)3;
      System.out.printf("����: %d ���: %.2f\n", sum, average);
   }
}

