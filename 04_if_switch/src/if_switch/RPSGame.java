package if_switch;

/*
가위(1), 바위(2), 보(3) 게임

[실행결과]
가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 바위   나 : 보자기
You Win!!

가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 가위   나 : 보자기
You Lose!!

가위(1),바위(2),보(3) 중 번호 입력 : 2 (user)
컴퓨터 : 가위   나 : 가위
You Draw!!

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RPSGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com, user;
		String comrps = null, userrps = null; //질문 String 초기화는 항상 null로 선언해주어야하나요? 네 항상 null로 선언해줘야합니다 class객체의 경우
		int result = 0;                           //처음 String comrps, userrps ;이렇게 했는데 오류가 났었어요
		//난수 - 컴퓨터가 무작위로 발생하는 수 , 0 <= 난수 <1
		// a~b사이의 난수 발생 =>(int)(Math.random()*(b-a+1)+a);
		
		System.out.println("가위(1), 바위(2), 보(3) 중 번호 입력 :");
		user = Integer.parseInt(br.readLine());
		
		com = (int)(Math.random()*3)+1;
		
		if(user == 1) userrps = "가위";
		else if(user == 2) userrps = "바위";
		else if(user == 3) userrps = "보";
		
		if(com == 1) comrps = "가위";
		else if(com == 2) comrps = "바위";
		else if(com == 3) comrps = "보";
		
		
		System.out.println("컴퓨터 : "+ comrps + " 나 : "+ userrps);
		
		if(com == user) {
			System.out.println("You Draw!!");
		} else if(user>com) {
			if(user - com == 2) {
				System.out.println("You Lose!!");
			}else if(user - com == 1) {
				System.out.println("You Win");
			}
		} else if(com>user) {
			if(com - user == 2) {
				System.out.println("You Win!!");
			}else if(com - user == 1) {
				System.out.println("You Lose");
			}
		}
		
		
		/* 강사님 해설
		int com, user;
      
      com = (int)(Math.random()*3)+1; //1~3 난수 발생
      
      System.out.print("가위(1),바위(2),보(3) 중 번호 입력 : ");
      //user = System.in.read()-48; //1개 문자 입력
      user = System.in.read()-'0';
      
      if(com==1) {//컴이 가위인 경우
         if(user==1) {
            System.out.println("컴퓨터 : 가위\t 사용자 : 가위");
            System.out.println("Draw!!");
         }else if(user==2){
            System.out.println("컴퓨터 : 가위\t 사용자 : 바위");
            System.out.println("Win!!");
         }else if(user==3){
            System.out.println("컴퓨터 : 가위\t 사용자 : 보자기");
            System.out.println("Lose!!");
         }
         
      }else if(com==2) {//컴이 바위인 경우
         if(user==1){
            System.out.println("컴퓨터 : 바위\t 사용자 : 가위");
            System.out.println("Lose!!");
         }
         else if(user==2){
            System.out.println("컴퓨터 : 바위\t 사용자 : 바위");
            System.out.println("Draw!!");
         }
         else if(user==3){
            System.out.println("컴퓨터 : 바위\t 사용자 : 보자기");
            System.out.println("Win!!");
         }
         
      }else if(com==3) {//컴이 보자기인 경우
         if(user==1){
            System.out.println("컴퓨터 : 보자기\t 사용자 : 가위");
            System.out.println("Win!!");
         }
         else if(user==2){
            System.out.println("컴퓨터 : 보자기\t 사용자 : 바위");
            System.out.println("Lose!!");
         }
         else if(user==3){
            System.out.println("컴퓨터 : 보자기\t 사용자 : 보자기");
            System.out.println("Draw!!");
         }
      }
		 */
		
		
		
	}
}
