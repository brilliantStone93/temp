package method;
/*
 * 10진수 250을 2진수, 8진수, 16진수로 변환 하시오
 * 단) Integer의 메소드를 이용하여 구하시오
 */
public class MethodTest {
	public static void main(String[] args) {
		int dec = 290;
		String binary = Integer.toBinaryString(dec);
		String octal = Integer.toOctalString(dec);
		String hexa = Integer.toHexString(dec);
		
		System.out.println("2진수 = "+binary);
		System.out.println("8진수 = "+octal);
		System.out.println("16진수 = "+hexa);
		
	}

}
