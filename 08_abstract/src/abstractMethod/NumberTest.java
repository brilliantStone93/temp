package abstractMethod;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberTest {
	
	public static void main(String[] args) {
		NumberFormat nf = new DecimalFormat();
		//3자리마다 , 찍고 소수 이하 3째자리
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###,##원");
		//소수점 이하의 숫자가 유효숫자가 아닌것은 표현하지 않는다
		
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		//0을 강제로 표시
		
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//NumberFormat nf4 = NumberFormat.getInstance();
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();//￦표시
		nf4.setMaximumFractionDigits(2);//소수 이하 2째자리
		nf4.setMinimumFractionDigits(0);//강제로 0이 표시
		
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		
		//NumberFormat nf4 = NumberFormat.getInstance(Locals.US);
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);//＄표시
		nf4.setMaximumFractionDigits(2);//소수 이하 2째자리
		nf4.setMinimumFractionDigits(0);//강제로 0이 표시
		
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();

		
	}//main
}
