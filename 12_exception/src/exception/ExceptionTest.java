package exception;

import java.util.Scanner;

public class ExceptionTest {
	
	
	
	public static void main(String[] args) {
		//main(String[] args)에 args배열을 이용하는 방법 => 우 마우스 클릭 => run as => run configuration => arguments => program arguments에 입력 

		System.out.println(args[0]);//값을 안넣어주고 돌리면 java.lang.ArrayIndexOutOfBoundsException 해당 오류가 발생한다
									// 이러한 오류는 사용자(개발자)의 실수로 프로그램으로 막아야한다./throws나 try catch사용하는 것이 아니라
									//막는 예) if(args.length>0)System.out.println(args[0]);을 붙여주면됨
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자입력 : ");
			int num2 = scan.nextInt();
			
			int num1 = Integer.parseInt(args[0]);
			
			System.out.println(num1 + "/" + num2 + "=" +((double)num1/num2) );
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력하세요");//숫자 대신 호랑이 같은 String이 오면 numberformatException발생 이에 따른 try~catch 예외 처리
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다");//0으로 숫자를 나눌 수 없어 발생하는 예외처리, 위에 나누기에 double로 형변환해주고 0으로 나누면 infinity가 나옴
		}finally {
			System.out.println("error가 있건 없건 무조건 실행!!");//error가 있건 없건 실행시키는 finally!, db처리할때 100프로 사용하니까 알고는 있자
		}
		
		
		
		
	}//main
}//
