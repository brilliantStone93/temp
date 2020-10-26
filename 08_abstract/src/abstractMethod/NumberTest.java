package abstractMethod;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberTest {
	
	public static void main(String[] args) {
		NumberFormat nf = new DecimalFormat();
		//3�ڸ����� , ��� �Ҽ� ���� 3°�ڸ�
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###,##��");
		//�Ҽ��� ������ ���ڰ� ��ȿ���ڰ� �ƴѰ��� ǥ������ �ʴ´�
		
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00��");
		//0�� ������ ǥ��
		
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//NumberFormat nf4 = NumberFormat.getInstance();
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();//��ǥ��
		nf4.setMaximumFractionDigits(2);//�Ҽ� ���� 2°�ڸ�
		nf4.setMinimumFractionDigits(0);//������ 0�� ǥ��
		
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		
		//NumberFormat nf4 = NumberFormat.getInstance(Locals.US);
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);//��ǥ��
		nf4.setMaximumFractionDigits(2);//�Ҽ� ���� 2°�ڸ�
		nf4.setMinimumFractionDigits(0);//������ 0�� ǥ��
		
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();

		
	}//main
}