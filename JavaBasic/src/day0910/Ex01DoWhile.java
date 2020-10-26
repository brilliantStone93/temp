package day0910;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01DoWhile {
	public static void main(String[] args) throws IOException{
		int number = 5;
		while(number>5) {
			System.out.println("반복이 될까요?");//안된다 왜냐하면 조건이 틀렸기 때문
			
		}
		//그에 반해서 do while은 무조건 한번은 실행이 된다.
		do {
//			System.out.println("반복이 될까요?");
			
		}while(number>5);
		
		// 사용자로부터 숫자를 입력 받되
		//10보다 큰 수 가 나오면 다시 입력하도록 만들어보자
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		//while을 사용하면 다음과 같이 코드를 만들어야한다.
		System.out.println("숫자를 입력하세요: ");
		String number2 = br.readLine();
		int stringToInt = Integer.parseInt(number2);
		
		while(stringToInt > 10) {
			//만약 사용자가 10보다 작거나 같은 수를 입력한다면
			//stringToInt>10은false가 나오기 때문에
			//이 whlie문은 실행이 되지 않는다.
			System.out.println("다시 입력해주세요.");
			number2 = br.readLine();
			stringToInt = Integer.parseInt(number2);
		}
		System.out.println("사용자가 입력한 수 : "+ number2);
		
		//do while을 쓰면 요로케 쓸 수 있다.
		int userNumber = 0;
		do { 
			System.out.println("숫자를 입력해주세요 : ");
			userNumber = Integer.parseInt(br.readLine());
			
		}while(userNumber > 10 );
		System.out.println("userNumber : "+ userNumber);
		
		
	}
}
