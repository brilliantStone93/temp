package day0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//
public class CarEx04Array02 {
   private static int SIZE = 3;
   public static void main(String[] args) throws NumberFormatException, IOException {
      //����ڰ� �Է��� ������ Car ��ü�� ����
      //Car�迭�� ����ִ� ĭ�� �ְ�
      //����ִ� ĭ�� ������ "�� ĭ�� �����ϴ�" ��� ������ ���α׷��� ������
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Car[] carArray = new Car[SIZE];
      
      while(true) {
    	 
         showMenu();
         int userChoice = Integer.parseInt(br.readLine());
         //���� �Է��� ������ ��
         //��ĭ���� �ƴ����� ��� �� �� ������?
         if(userChoice == 1) {
            
            
            if(index(carArray) == -1) {
               System.out.println("��ĭ�� �����ϴ�.");
            }else {
            	
            	carArray[index(carArray)] = array(br);
            	
            }//if~else
         }else if(userChoice == 2) {
        	 //����� �ϵ� �ش�ĭ�� null �̸� ������� �ʴ´�.
        	 printInfo(carArray);
//        	 for(int i = 0; i < carArray.length; i++) {
//        		 if(carArray[i] != null) {
//        			 System.out.println(carArray[i]);
//        		 }
////        		System.out.printf("���� ��ȣ : %s ���� ���� : %s\n",  carArray[i].getNumber(),   carArray[i].getType());
////        		System.out.printf("����: %d�� ���� : %d��\n",  carArray[i].getYear(),  carArray[i].getPrice());
////        		System.out.printf("���� : %s\n",  carArray[i].getColor());
//    			
//        	 }
         }else if(userChoice == 3){
        	 System.out.println("���α׷� ����");break;
        	 
         }else System.out.println("�� �� �Է��ϼ̽��ϴ�");//else
      }//while
   }
// �޼ҵ� 1: �Է��� index�� ã�� �޼ҵ�, ������̶� ���� ����
   private static int index(Car [] carArray) {
	   
       for(int i = 0; i < carArray.length; i++) {
          if(carArray[i] == null) {
             
             
             return i;
          }
       }//for
       return  -1;
   }
// �޼ҵ� 2: �迭�� �ش���ġ�� Car ��ü�� �־ �迭�� �ٽ� �������ִ� �޼ҵ�
   private static Car array(BufferedReader br) throws IOException {
	   Car c = new Car();
	   System.out.print("��ȣ: ");
       c.setNumber(br.readLine());
       System.out.print("����: ");
       c.setType(br.readLine());
       System.out.print("����: ");
       c.setYear(Integer.parseInt(br.readLine()));
       System.out.print("����: ");
       c.setPrice(Integer.parseInt(br.readLine()));
       System.out.print("����: ");
       c.setColor(br.readLine());
       
       return c;
   }
//// �޼ҵ� 2: �迭�� �ش���ġ�� Car ��ü�� �־ �迭�� �ٽ� �������ִ� �޼ҵ� , ����� ���
//   private static Car[] add(Car[] carArray, Car c) {
//	   int index = index(carArray);
//	   carArray[index] = c;
//	   return carArray;
//   }

//���� 2: ���� ��� �ϴ� �ڵ���� �޼ҵ�� �и��ϼ���, ������̶� ���� ����
   
   private static void printInfo(Car[] carArray) {
	   for(int i = 0; i < carArray.length; i++) {
  		 if(carArray[i] != null) {
  			 System.out.println(carArray[i]);
  		 }
	   }
   }
//���� 3: �޴��� ����ϴ� �ڵ���� �޼ҵ�� �и��ϼ��� , ������̶� ���� ����
   static void showMenu() {
	  System.out.println("===================");
	  System.out.println("  �ڵ��� ���� ���α׷�  ");
	  System.out.println("1. �Է� 2. ��� 3. ����");
	  System.out.println(">");
   }
}

