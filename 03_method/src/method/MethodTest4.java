package method;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;


public class MethodTest4 {
	
	
	public static void main(String[] args) throws IOException {
		System.out.println(Math.abs(-25));
		
		//���� - ��ǻ�Ͱ� �������� �߻��ϴ� �� , 0 <= ���� < 1
		System.out.println("���� = "+ Math.random());
		
		//������ ó�� �ϴ� Ŭ����
		Random r = new Random(); // ����
		System.out.println("���� = "+ r.nextDouble());
		
		//���ڸ� 3�ڸ����� , ���
		int num = 1234567;
		
		DecimalFormat df = new DecimalFormat();
		System.out.println(df.format(num));
		
		//Ű���� �Է�- Ű����� ���ؼ� �Է��ϸ� ��� '����'�� �ν�
		System.out.print("������ a : ");
		char a = (char)System.in.read();
		//���� - Ŀ���� �� ������ �̵� \r
		//   - ���� �� �̵�              \n
		//�̰� �о ���ڷ� ��Ÿ���� ������ �����ֱ����� System.in.read(); �ι��־���
		System.in.read();
		System.in.read();
		System.out.print("������ b : ");
		char b = (char)System.in.read();
		System.out.println("��� = "+ a + "\t" + b );
		
		
		
		//�ڵ��� ������ �ֵ���?
		//��� �����..
		//�̰� ����ؼ� ���å���� ��°��̴�.
		//����ó�� Exception try ~
		
		
		//����� ���� �Լ� - a�� b�߿��� ū ���� ����ϴ� �޼ҵ带 �ۼ�
		MethodTest4 mt = new MethodTest4();
		//System.out.println("ū �� =" + mt.big(a, b));
		char max = mt.big(a, b);
		System.out.println("ū �� = " + max);
		
		
	}
	
	public char big(char a, char b){//����, �Լ� ��ȣ�ȿ� �ִ� �ֵ�parameter(�Ű�����), argumet(�μ�)
		return a >= b? a : b;
		
		
	}
	
}


