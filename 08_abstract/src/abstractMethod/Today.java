package abstractMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {
	public static void main(String[] args) throws InterruptedException, ParseException {

		Date date = new Date();
		System.out.println("오늘 날짜:"+date);
	
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss	");	
		System.out.println("오늘날짜 : "+ sdf.format(date));
		System.out.println();
		
		//입력 - 내생일 yyyyMMddhhmmss
		//예) 19910716131503
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19930323131503");//String -> Date 형으로 변환하려는 것
		
		System.out.println("내생일 = "+birth);
		System.out.println("내생일 = "+ sdf.format(birth));
		System.out.println();
		
//		Calendar cal = new Calendar(); 캘린더는 추상클래스여서 절대 new 할 수 가 없다.
//		Calendar를 생성하면 현재 시간만 얻어온다
		Calendar cal = Calendar.getInstance();//메소드 이용하여 생성 추상클래스 이용 제한 시.방법 1
		
//		Calendar cal = new GregorianCalendar();//Sub class를 이용하여 생성.방법 2
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);//1월 => 0, 2월 => 1
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);// 일요일 => 1, 월요일 => 2
		
		String dayOfWeek = null;
		switch(week) {
		case 1 : dayOfWeek = "일"; break;
		
		case 2 : dayOfWeek = "월"; break;
		case 3 : dayOfWeek = "화"; break;
		case 4 : dayOfWeek = "수"; break;
		case 5 : dayOfWeek = "목"; break;
		case 6 : dayOfWeek = "금"; break;
		case 7 : dayOfWeek = "토"; break;
		}
		System.out.println("오늘날짜 : "+ year+ "년"+ month+"월"+day+"일"+dayOfWeek);
		
		
		
	}
}
