package loop;

/*
���ڸ��߱� ����
1~100������ ������ �߻��Ͽ� ���ߴ� ����

[������]
���� �Է� : 50
50���� Ů�ϴ�

���� �Է� : 90
90���� �۽��ϴ�

...

���� �Է� : 87
������ xx������ ���߼̽��ϴ�

continue(Y/N) : n
���α׷��� �����մϴ�

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NumberGame {
	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int com, user, count;
	      String yn;
	      
	      for(;;) {
	         com   = (int)(Math.random()*99)+1; //1~100 ���� �߻�
	         System.out.println(com);
	         
	         count=0;
	         while(true) {
	            System.out.print("���� �Է� : ");
	            user = Integer.parseInt(br.readLine());
	            count++;
	            
	            if(com > user) {
	               System.out.println(user+"���� Ů�ϴ�\n");
	            
	            }else if(com < user) {
	               System.out.println(user+"���� �۽��ϴ�\n");
	            
	            }else
	               break;//while�� �����
	            
	         }//while
	         
	         System.out.println("������    "+count+"������ ���߼̽��ϴ�");
	         System.out.println("-----------");
	         
	         System.out.print("continue(Y/N) : ");
	         yn = br.readLine();
	         
	         if(yn.equals("n") || yn.equals("N")) break; //for�� �����
	         
	      }//for
	      
	      System.out.println("���α׷��� �����մϴ�");
	      
	   }
		
		
		
		
		
	
//		int rn = (int)(Math.random()*100)+1;
//		//NumberGame ng = new NumberGame(); ���� ���� Ŭ������������ ��ü ���� �ʿ� ���� �Ҽ� �ֳ���? �� �ٸ� �޼ҵ尡 ������ �������� �ʿ� �����ϴ�
//		                                    
//		
//		int a = 0;
//		while(true) {
//			System.out.print("���� �Է�: ");
//			int pn = Integer.parseInt(br.readLine());
//			a++;
//			
//			if(pn==rn) {
//				System.out.println(" ������! "+a+"�� ���� ���߼̽��ϴ�");
//				break;
//				}
//			else if(pn>rn)  
//				System.out.println(pn + "���� �۽��ϴ�"); 
//			else if(pn<rn) 
//				System.out.println(pn + "���� Ů�ϴ�"); 
//		}
//		System.out.print("continue(Y/N) : ");
//		String choice = br.readLine();
//		if(choice.equals("Y")) main(args); ������ ȣ���ϸ�ȵȴ�, ��� continue�� ����ϸ��
//		else if(choice.equals("N")) System.out.println("���α׷��� �����մϴ�");
//	}
	

}
