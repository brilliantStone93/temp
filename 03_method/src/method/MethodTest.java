package method;
/*
 * 10���� 250�� 2����, 8����, 16������ ��ȯ �Ͻÿ�
 * ��) Integer�� �޼ҵ带 �̿��Ͽ� ���Ͻÿ�
 */
public class MethodTest {
	public static void main(String[] args) {
		int dec = 290;
		String binary = Integer.toBinaryString(dec);
		String octal = Integer.toOctalString(dec);
		String hexa = Integer.toHexString(dec);
		
		System.out.println("2���� = "+binary);
		System.out.println("8���� = "+octal);
		System.out.println("16���� = "+hexa);
		
	}

}
