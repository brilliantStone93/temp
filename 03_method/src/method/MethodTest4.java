package method;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;


public class MethodTest4 {
	
	
	public static void main(String[] args) throws IOException {
		System.out.println(Math.abs(-25));
		
		//난수 - 컴퓨터가 무작위로 발생하는 수 , 0 <= 난수 < 1
		System.out.println("난수 = "+ Math.random());
		
		//난수만 처리 하는 클래스
		Random r = new Random(); // 생성
		System.out.println("난수 = "+ r.nextDouble());
		
		//숫자를 3자리마다 , 찍기
		int num = 1234567;
		
		DecimalFormat df = new DecimalFormat();
		System.out.println(df.format(num));
		
		//키보드 입력- 키보드로 통해서 입력하면 모두 '문자'로 인식
		System.out.print("데이터 a : ");
		char a = (char)System.in.read();
		//엔터 - 커서를 맨 앞으로 이동 \r
		//   - 다음 줄 이동              \n
		//이걸 읽어서 숫자로 나타내기 떄문에 지워주기위해 System.in.read(); 두번넣어줌
		System.in.read();
		System.in.read();
		System.out.print("데이터 b : ");
		char b = (char)System.in.read();
		System.out.println("결과 = "+ a + "\t" + b );
		
		
		
		//자동차 보험을 왜들어요?
		//사고가 날까봐..
		//이걸 대비해서 대비책으로 드는것이다.
		//예외처리 Exception try ~
		
		
		//사용자 정의 함수 - a와 b중에서 큰 값을 출력하는 메소드를 작성
		MethodTest4 mt = new MethodTest4();
		//System.out.println("큰 값 =" + mt.big(a, b));
		char max = mt.big(a, b);
		System.out.println("큰 값 = " + max);
		
		
	}
	
	public char big(char a, char b){//구현, 함수 괄호안에 있는 애들parameter(매개변수), argumet(인수)
		return a >= b? a : b;
		
		
	}
	
}


