package abstractMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {
	public static void main(String[] args) throws InterruptedException, ParseException {

		Date date = new Date();
		System.out.println("���� ��¥:"+date);
	
		SimpleDateFormat sdf = new SimpleDateFormat("y�� MM�� dd�� E���� HH:mm:ss	");	
		System.out.println("���ó�¥ : "+ sdf.format(date));
		System.out.println();
		
		//�Է� - ������ yyyyMMddhhmmss
		//��) 19910716131503
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19930323131503");//String -> Date ������ ��ȯ�Ϸ��� ��
		
		System.out.println("������ = "+birth);
		System.out.println("������ = "+ sdf.format(birth));
		System.out.println();
		
//		Calendar cal = new Calendar(); Ķ������ �߻�Ŭ�������� ���� new �� �� �� ����.
//		Calendar�� �����ϸ� ���� �ð��� ���´�
		Calendar cal = Calendar.getInstance();//�޼ҵ� �̿��Ͽ� ���� �߻�Ŭ���� �̿� ���� ��.��� 1
		
//		Calendar cal = new GregorianCalendar();//Sub class�� �̿��Ͽ� ����.��� 2
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);//1�� => 0, 2�� => 1
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);// �Ͽ��� => 1, ������ => 2
		
		String dayOfWeek = null;
		switch(week) {
		case 1 : dayOfWeek = "��"; break;
		
		case 2 : dayOfWeek = "��"; break;
		case 3 : dayOfWeek = "ȭ"; break;
		case 4 : dayOfWeek = "��"; break;
		case 5 : dayOfWeek = "��"; break;
		case 6 : dayOfWeek = "��"; break;
		case 7 : dayOfWeek = "��"; break;
		}
		System.out.println("���ó�¥ : "+ year+ "��"+ month+"��"+day+"��"+dayOfWeek);
		
		
		
	}
}
