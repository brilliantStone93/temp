package if_switch;
//2개의 정수형 숫자와 연산자(+,-,*,/)를 입력하여 계산하시오
//
//[실행결과]
//a 입력 : 25
//b 입력 : 36
//연산자(+,-,*,/) 입력 : +(op)
//25 + 36 = xx
//
//a 입력 : 25
//b 입력 : 36
//연산자(+,-,*,/) 입력 : /
//25 / 36 = 0.xxx
//
//a 입력 : 25
//b 입력 : 36
//연산자(+,-,*,/) 입력 : $
//연산자 error

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class SwitchTest2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("정수 a : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("정수 b : ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("연산자 : ");
		String op = br.readLine();
		System.out.println();
		
		
		switch(op) {
		case "+" : System.out.println(a+"+"+b+"="+(a+b));//int sum = a + b;
					break;
		case "-" : System.out.println(a+"-"+b+"="+(a-b));//int p = a - b;
					break;
		case "*" : System.out.println(a+"*"+b+"="+(a*b));//int mul = a*b;
					break;
		case "/" : System.out.println(a+"/"+b+"="+String.format("%.3f",(double)a/b));//int div = a/b;
					break;
		default : System.out.println("연산자 error");
					System.exit(0);//프로그램 강제 종료
		}
		
		
		
		
		
		
			
		
		
	}
}
