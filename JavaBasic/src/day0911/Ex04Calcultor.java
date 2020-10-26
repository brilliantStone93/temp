package day0911;

//계산기 프로그램
//사용자가 첫번재 정수를 입력하고
//+ - * / % 를 선택하고
//두번째 정수를 입력하면
//해당 기능에 맞춘 메소드가 실행되서 
//결과값을 화면에
//출력하게 만들어보세요

//예시
//첫번째 값을 입력해주세요: (1입력)
//연산자를 선택해주세요: +
//두번째 값을 입력해주세요: (100입력)
//결과값: 101


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04Calcultor {
	
	//main  메소드에서 각각의 메소드를 호출할 수 있게 만들어주자
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("첫번째 값을 입력해주세요 :");
		int a = Integer.parseInt(br.readLine());
		System.out.println("연산자를 선택해주세요");
		String operator = br.readLine();
		while(true) {
			if(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")) {
				break;
			}else {System.out.println("잘못된 연산자 입니다"); 		
					System.out.println("연산자를 선택해주세요");
					operator = br.readLine();}
			}
		System.out.println("두번째 값을 입력해주세요 :");
		int b = Integer.parseInt(br.readLine());
		if(operator.equals("+")) {
			System.out.println("결과값"+add(a, b));
		}else if(operator.equals("-")) {
			System.out.println("결과값"+sub(a, b));
		}else if(operator.equals("*")) {
			System.out.println("결과값"+ mul(a, b));
		}else if(operator.equals("/")) {
			System.out.println("결과값"+String.format("%.2f", div(a, b)));
		}
		
		
	}
	
	static int add(int a, int b) {
		return a + b ;
	}
	static int sub(int a, int b) {
		return a - b ;
	}
	static int mul(int a, int b) {
		return a * b;
	}
	static double div(int a, int b) {
		return (double)a/b;
	}
}

//조재연강사님 답
//package day0911;
////계산기 프로그램
//
////사용자가 첫번재 정수를 입력하고
////+ - * / % 를 선택하고
////두번째 정수를 입력하면
////해당 기능에 맞춘 메소드가 실행되서 
////결과값을 화면에
////출력하게 만들어보세요
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
////예시
////첫번째 값을 입력해주세요: (1입력)
////연산자를 선택해주세요: +
////두번째 값을 입력해주세요: (100입력)
////결과값: 101
////50분까지
//public class Ex04Calculator {
//// 두개의 숫자를 더하는 메소드
//static int add(int a, int b) {
//   return a + b;
//}
//
//static int minus(int a, int b) {
//   return a - b;
//}
//
//static int multiply(int a, int b) {
//   return a * b;
//}
//
//static double divide(int a, int b) {
//   return (double) a / b;
//}
//
//static int remainder(int a, int b) {
//   return a % b;
//}
//
//// main 메소드에서 각각의 메소드를 호출할 수 있게 만들어주자
//public static void main(String[] args) throws NumberFormatException, IOException {
//   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//   System.out.print("첫번째 숫자: ");
//   int number1 = Integer.parseInt(bufferedReader.readLine());
//
//   System.out.print("연산자: ");
//   String operator = bufferedReader.readLine();
//
//   System.out.print("두번째 숫자: ");
//   int number2 = Integer.parseInt(bufferedReader.readLine());
//
//   switch (operator) {
//   case "+":
//      System.out.println(add(number1, number2));
//      break;
//   case "-":
//      System.out.println(minus(number1, number2));
//      break;
//   case "*":
//      System.out.println(multiply(number1, number2));
//      break;
//   case "/":
//      System.out.printf("%.2f\n", divide(number1, number2));
//      break;
//   case "%":
//      System.out.println(remainder(number1, number2));
//      break;
//   default:
//      System.out.println("잘못 입력하셨습니다.");
//      break;
//   }
//}
//}
