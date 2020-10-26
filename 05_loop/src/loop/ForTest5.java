package loop;



/*
거듭제곱을 구하시오
x의 y승을 계산하시오

[실행결과]
x값 입력 : 2
y값 입력 : 5
2의 5승 xx   (2*2*2*2*2)

x값 입력 : 3
y값 입력 : 4
3의 4승 xx   (3*3*3*3)

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("x값 입력 : ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("y값 입력 : ");
		int y = Integer.parseInt(br.readLine());
		int t = 1;
		for(int i=1;i<=y;i++) {
			 t *= x; // x = x*x
			
		}
		System.out.println(x+"의"+y+"승  :"+t);
		
//		System.out.print("x값 입력 : ");
//	      int x = System.in.read()-48; //1개 문자
//	      System.in.read(); //버퍼 비우기
//	      System.in.read();
//	      
//	      System.out.print("y값 입력 : ");
//	      int y = System.in.read()-'0';
//	      System.in.read(); //버퍼 비우기
//	      System.in.read();
//	      
//	      int mul = 1;
//	      for(int i=1; i<=y; i++) {
//	         mul *= x;
//	      }
//	      
//	      System.out.println(x+"의 "+y+"승은 "+mul);	

		
//      멀티for // for문 안에 for가 들어가는 형태		
//		public static void main(String[] args) throws IOException {
//		      int x, y, mul;
//		      
//		      for(int j=1; j<=3; j++) { //3번   j=1
//		         
//		         System.out.print("x값 입력 : ");
//		         x = System.in.read()-48; //1개 문자
//		         System.in.read(); //버퍼 비우기
//		         System.in.read();
//		         
//		         System.out.print("y값 입력 : ");
//		         y = System.in.read()-'0';
//		         System.in.read(); //버퍼 비우기
//		         System.in.read();
//		         
//		         mul = 1;
//		         for(int i=1; i<=y; i++) { // 1,2,3,4,....
//		            mul *= x;
//		         }//for i
//		         
//		         System.out.println(x+"의 "+y+"승은 "+mul);
//		         System.out.println("-------------");
//		      }//for j
//		      
//		   }
		
		
		
	}
}
