package abstractMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

//년도 입력 : 2002
//월 입력 : 10   
//
//일   월   화   수   목   금   토
//      1   2   3   4   5
//6   7   8   9   10   11   12
//13   14   15   16   17   18   19
//20   21   22   23   24   25   26
//27   28   29   30   31
//
//기본생성자 - 년도, 월 입력
//calculator() - 매달 1일이 무슨 요일로 시작?, 매달 끝나는 일?
//display() - 출력

public class CalendarMain{
	private int last;
	private int start;
	private static BufferedReader br;
	private CalendarEx ce;
	
	
	private void input() throws NumberFormatException, IOException {
		
		System.out.print("년도를 입력해주세요 :");
		int year = Integer.parseInt(br.readLine());
		System.out.print("월을 입력해주세요 :");
		int month =Integer.parseInt(br.readLine())-1;
		ce = new CalendarEx(year, month);
	}
	
	private void calculator() {
		//CalendarEx ce = new CalendarEx();
		Calendar c = new GregorianCalendar();
		c.set(ce.getYear(), ce.getMonth(), 1);
		last = c.getActualMaximum(c.DAY_OF_MONTH);
		start = c.get(c.DAY_OF_WEEK);
		
	
	}
	
	private void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		switch(start){
		case 7 : System.out.print("\t");
		case 6 : System.out.print("\t");
		case 5 : System.out.print("\t");
		case 4 : System.out.print("\t");
		case 3 : System.out.print("\t");
		case 2 : System.out.print("\t");
		
		}
		
		int count = start;
		for(int i = 1 ; i <= last; i++) {
			System.out.print(i+"\t");
			if(count%7 ==0) {
				System.out.println();
			}
			count++;
		}
		
	}
	
	
	//main
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader ( new InputStreamReader ( System.in));
		CalendarMain cal = new CalendarMain();
		cal.input();
		cal.calculator();
		cal.display();
	}//main
}//

class CalendarEx {
	private int year;
	private int month;

	
	public CalendarEx(int year, int month) {
		this.year = year;
		this.month = month;
	}
	public CalendarEx() {
		
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	
}


//public class CalendarMain {
//	   private int year, month, week, lastDay;
//	   
//	   public CalendarMain() throws IOException {
//	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	      System.out.print("년도 입력 : ");
//	      year = Integer.parseInt(br.readLine());
//	      System.out.print("월 입력 : ");
//	      month = Integer.parseInt(br.readLine()) - 1 ;
//	   }
//	   
//	   public void calculator() {
//	      Calendar cal = Calendar.getInstance();//클래스 생성
//	            
//	      //기준 - 2020년 9월 29일
//	      //cal.set(Calendar.YEAR, year);
//	      //cal.set(cal.MONTH, month-1);
//	      //cal.set(cal.DAY_OF_MONTH, 1);
//	      
//	      cal.set(year, month, 1);
//	      week = cal.get(cal.DAY_OF_WEEK); //1991년 7월 1일이 무슨 요일로 시작
//	      lastDay = cal.getActualMaximum(cal.DAY_OF_MONTH); //매달 끝나는 일, 28, 29, 30, 31
//	      
//	      System.out.println("week = "+week);
//	   }
//	   
//	   public void display() {
//	      System.out.println("일\t월\t화\t수\t목\t금\t토");
//	      
//	      for(int i=1; i<week; i++) {
//	         System.out.print("\t");
//	      }//for
//	      
//	      for(int i=1; i<=lastDay; i++) {
//	         System.out.print(i+"\t");
//	         
//	         if(week%7==0) System.out.println();
//	         week++;
//	      }//for
//	   }
//	   
//	   public static void main(String[] args) throws IOException {
//	      CalendarMain cm = new CalendarMain();
//	      cm.calculator();
//	      cm.display();
//	   }
//
//	}