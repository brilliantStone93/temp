package loop;


/*
더하기 연습 프로그램
10~99 사이의 난수를 2개(a, b) 발생하여 합을 구하는 프로그램
문제수는 총 5문제를 제공한다 - for
1문제당 점수 20점씩 계산

[실행결과]
[1] 25 + 36 = 45
틀렸다

[2] 78 + 10 = 88
딩동뎅
...

[5] 12 + 25 = 37
딩동뎅

당신의 총 x문제를 맞추어서 xx점 입니다

또할래(Y/N) : n
프로그램을 종료합니다

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		int result;
		int correct = 0;
		//String choice;
		int yn;
		while(true) {
			for(int i = 1; i<=5;i++) {
				a = (int)(Math.random()*88)+10;
				//System.out.println(a);
				b = (int)(Math.random()*88)+10;
				System.out.print("["+i+"]"+a+"+"+b+"=");
				result = Integer.parseInt(br.readLine());
				if(result==a+b) { System.out.println("딩동뎅"); correct++;}
				else if(result != a+b)System.out.println("틀렸다");
			}
			int score = correct*20;
			System.out.println("당신은 총"+correct+"문제를 맞춰서"+score+"점 입니다.");
			//System.out.print("또 할래 (Y/N) : ");
			//choice = br.readLine();
			//if(choice.equals("n")||choice.equals("N")) break;
			while(true) {
				System.out.print("또 할래 (Y/N) : ");
				yn = br.read();
				br.read();
				br.read();
				if(yn=='Y'||yn=='y'||yn=='N'||yn=='n') break;
			}
			if(yn=='N'||yn=='n') break;
		
		}
		System.out.println("프로그램 종료합니다");
		
	}
}
