package day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//두 와일을 다시 한번 파보시다.
public class Ex04DoWhile03 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//점수 맞추기 게임
		//기존whlie의 경우에는
		//whlie 옆의 조건식이 false가 나오면
		//반복이 중단되고
		//true가 나오면 반복되는 형식이었따.
		System.out.println("숫자를 하나 입력해주세요 :");
		int number = Integer.parseInt(br.readLine());
		while(number<0) {
			System.out.println("자연수를 입력해주세요.");
			System.out.println("숫자를 하나 입력해주세요 : ");
			number = Integer.parseInt(br.readLine());
		}
		//위while문의 경우 사용자가 맨처음에  0보다 크거나 같은 수를 입력하면 number<0이라는 조건식이 
		//false가 나오므로 반복이 되지 않게 된다.
		System.out.println("사용자가 입력한 숫자:"+number);
		
		//그에 반해서 do while 구조에서는
		//무조건 한번은 실행이 된다.
		do {
			System.out.println("두 와일 첫번째 줄");
			
		}while(number<0);
		
	}
}
