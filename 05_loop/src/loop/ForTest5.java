package loop;



/*
�ŵ������� ���Ͻÿ�
x�� y���� ����Ͻÿ�

[������]
x�� �Է� : 2
y�� �Է� : 5
2�� 5�� xx   (2*2*2*2*2)

x�� �Է� : 3
y�� �Է� : 4
3�� 4�� xx   (3*3*3*3)

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("x�� �Է� : ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("y�� �Է� : ");
		int y = Integer.parseInt(br.readLine());
		int t = 1;
		for(int i=1;i<=y;i++) {
			 t *= x; // x = x*x
			
		}
		System.out.println(x+"��"+y+"��  :"+t);
		
//		System.out.print("x�� �Է� : ");
//	      int x = System.in.read()-48; //1�� ����
//	      System.in.read(); //���� ����
//	      System.in.read();
//	      
//	      System.out.print("y�� �Է� : ");
//	      int y = System.in.read()-'0';
//	      System.in.read(); //���� ����
//	      System.in.read();
//	      
//	      int mul = 1;
//	      for(int i=1; i<=y; i++) {
//	         mul *= x;
//	      }
//	      
//	      System.out.println(x+"�� "+y+"���� "+mul);	

		
//      ��Ƽfor // for�� �ȿ� for�� ���� ����		
//		public static void main(String[] args) throws IOException {
//		      int x, y, mul;
//		      
//		      for(int j=1; j<=3; j++) { //3��   j=1
//		         
//		         System.out.print("x�� �Է� : ");
//		         x = System.in.read()-48; //1�� ����
//		         System.in.read(); //���� ����
//		         System.in.read();
//		         
//		         System.out.print("y�� �Է� : ");
//		         y = System.in.read()-'0';
//		         System.in.read(); //���� ����
//		         System.in.read();
//		         
//		         mul = 1;
//		         for(int i=1; i<=y; i++) { // 1,2,3,4,....
//		            mul *= x;
//		         }//for i
//		         
//		         System.out.println(x+"�� "+y+"���� "+mul);
//		         System.out.println("-------------");
//		      }//for j
//		      
//		   }
		
		
		
	}
}