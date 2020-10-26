package variable;

/*
 * 변수에 저장하여 320, 258의 합을 구하시오
 * 320+258=xxx(sum)
 * 320-258=xxx(sub)
 * 320*258=xxx(mul)
 * 320/258=xxx(div) 소수 이하 2째자리까지
 *
 */


public class CalcTest {
	public static void main(String[] args) {
		short a = 320;
		short b = 258;
		//short sum = a+b; -error short형 + short형 = int형이 나옴
		int sum = a + b;
		System.out.println(a+"+ "+b +"="+sum);
		int sub = a - b ;
		System.out.println(a+"-"+b +"="+sub);
		int mul = a * b;
		System.out.println(a+"*"+b +"="+mul);
		double div = (double)a/b;//강제형변환/ 자동형변환		
		System.out.println(a+"/"+b +String.format("= %.2f", div));

		
	}

}
