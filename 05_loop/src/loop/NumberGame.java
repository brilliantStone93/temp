package loop;

/*
숫자맞추기 게임
1~100사이의 난수를 발생하여 맞추는 게임

[실행결과]
숫자 입력 : 50
50보다 큽니다

숫자 입력 : 90
90보다 작습니다

...

숫자 입력 : 87
딩동뎅 xx번만에 맞추셨습니다

continue(Y/N) : n
프로그램을 종료합니다

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
	         com   = (int)(Math.random()*99)+1; //1~100 난수 발생
	         System.out.println(com);
	         
	         count=0;
	         while(true) {
	            System.out.print("숫자 입력 : ");
	            user = Integer.parseInt(br.readLine());
	            count++;
	            
	            if(com > user) {
	               System.out.println(user+"보다 큽니다\n");
	            
	            }else if(com < user) {
	               System.out.println(user+"보다 작습니다\n");
	            
	            }else
	               break;//while를 벗어나라
	            
	         }//while
	         
	         System.out.println("딩동뎅    "+count+"번만에 맞추셨습니다");
	         System.out.println("-----------");
	         
	         System.out.print("continue(Y/N) : ");
	         yn = br.readLine();
	         
	         if(yn.equals("n") || yn.equals("N")) break; //for를 벗어나라
	         
	      }//for
	      
	      System.out.println("프로그램을 종료합니다");
	      
	   }
		
		
		
		
		
	
//		int rn = (int)(Math.random()*100)+1;
//		//NumberGame ng = new NumberGame(); 질문 같은 클래스내에서는 객체 선언 필요 없이 할수 있나요? 네 다른 메소드가 없으면 선언해줄 필요 없습니다
//		                                    
//		
//		int a = 0;
//		while(true) {
//			System.out.print("숫자 입력: ");
//			int pn = Integer.parseInt(br.readLine());
//			a++;
//			
//			if(pn==rn) {
//				System.out.println(" 딩동댕! "+a+"번 만에 맞추셨습니다");
//				break;
//				}
//			else if(pn>rn)  
//				System.out.println(pn + "보다 작습니다"); 
//			else if(pn<rn) 
//				System.out.println(pn + "보다 큽니다"); 
//		}
//		System.out.print("continue(Y/N) : ");
//		String choice = br.readLine();
//		if(choice.equals("Y")) main(args); 메인은 호출하면안된다, 대신 continue를 사용하면됨
//		else if(choice.equals("N")) System.out.println("프로그램을 종료합니다");
//	}
	

}
