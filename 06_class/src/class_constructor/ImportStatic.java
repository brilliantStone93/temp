package class_constructor;

//import static java.lang.Math.random;
//import static java.lang.Math.pow;

import static java.lang.Math.*;//와일드 카드 여기서 *은 모든 것이라는 의미를 갖고 있고 다른 언어에서도 많이 사용된다
import static java.lang.String.format;

public class ImportStatic {
	
	
	public static void main(String[] args) {
		System.out.println("난수 = " + random());//원래는 Math.random을 해줘야하는데 위에 static으로잡아놔서 생략가능
		
		System.out.println("제곱승  = " + pow(2, 10));
		
		System.out.println("소수이하 2째자리 = "+ format("%.2f", 123.456));
		
		
		
	}//main
	
}//
