package variable;

/*
 * ������ �����Ͽ� 320, 258�� ���� ���Ͻÿ�
 * 320+258=xxx(sum)
 * 320-258=xxx(sub)
 * 320*258=xxx(mul)
 * 320/258=xxx(div) �Ҽ� ���� 2°�ڸ�����
 *
 */


public class CalcTest {
	public static void main(String[] args) {
		short a = 320;
		short b = 258;
		//short sum = a+b; -error short�� + short�� = int���� ����
		int sum = a + b;
		System.out.println(a+"+ "+b +"="+sum);
		int sub = a - b ;
		System.out.println(a+"-"+b +"="+sub);
		int mul = a * b;
		System.out.println(a+"*"+b +"="+mul);
		double div = (double)a/b;//��������ȯ/ �ڵ�����ȯ		
		System.out.println(a+"/"+b +String.format("= %.2f", div));

		
	}

}
