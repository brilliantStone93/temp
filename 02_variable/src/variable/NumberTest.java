package variable;

public class NumberTest {

	public static void main(String[] args) {
		System.out.print("안녕하세요\n");
		System.out.println(25+36);
		System.out.println("25+36");
		System.out.println("25+36 = "+25+36);
		System.out.println("25+36 = "+(25+36));
		System.out.println("25/36 = "+(25/36));
		System.out.println("25/36 = "+(25.0/36));
		System.out.printf("25/36 = %.2f\n",(25.0/36));
		System.out.printf("25/36 = %.1f\n",(25.0/36));
		System.out.println("25/36 = "+ String.format("%.2f", (25.0/36)));
	//중서형 값을 원한다 %d
	//실수형                 %f
    //문자                    %c
	//문자열                 %s
	
	//%전체자리수. 소수 이하 자리수 f
	// |2|5|.|3| 이렇게 총 4자리를 말함-> %4.1f
		
    //Overload
		
		System.out.println();
		
		System.out.println('A'+3);
		System.out.println('A'+32);
		System.out.println((char)('A'+32));//형변환을 시키겠다-char
		System.out.println();
		
		System.out.println(2+5);
		System.out.println('2'+'5'); //103
		System.out.println('2'-48+'5'-48); //문자를 숫자로 변환
		System.out.println("2"+"5"); 		
		System.out.println(Integer.parseInt("2")+Integer.parseInt("5"));//문자열을 숫자로 변환, 7
		System.out.println("25.3"+"45.6");
		System.out.println(Double.parseDouble("25.3")+Double.parseDouble("45.6"));//문자열을 실수로 변환
		
		
		
	}
	

}
