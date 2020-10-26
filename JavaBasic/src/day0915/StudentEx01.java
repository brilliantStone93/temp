package day0915;

import java.io.IOException;
//숙제 1. Student의 나머지 필드에 대해서 겟터 셋터를 구현하시고 
//StudentEx.java를 알맞게 고치시오
public class StudentEx01 {
	public static void main(String[] args) throws IOException {
		//객체를 만들어보자
		
		
		Student s1 = new Student("조재영" , 1, 100, 90, 91);
		s1 = new Student();
		System.out.printf("이름 : %s, 국어 : %d점  영어 : %d점  수학: %d점\n", s1.getName(), s1.getKorean(), s1.getEnglish(), s1.getMath());
		//객체의 필드 혹은 메소드를 접근 할 때에는
		// 접근 연산자 . 을 이용하면 된다.
		
		s1.setName("조재영");
		s1.setKorean(100);;
		s1.setEnglish(90);
		s1.setMath(91); 
		s1.setId(1);
		
		System.out.printf("이름 : %s, 국어 : %d점  영어 : %d점  수학: %d점\n", s1.getName(), s1.getKorean(), s1.getEnglish(), s1.getMath());
		System.out.printf("%s 학생의 총점 : %d점  평균 : %.2f점\n", s1.getName(), s1.calculateSum(), s1.calculateAverage());
		
		
		Student s2 = new Student("김철수" , 2,90 , 90, 90);
		s2.setName("김철수");
		s2.setKorean(90);;
		s2.setEnglish(90);
		s2.setMath(90); 
		s2.setId(2);
		System.out.printf("이름 : %s, 국어 : %d점  영어 : %d점  수학: %d점\n", s2.getName(), s2.getKorean(), s2.getEnglish(), s2.getMath());
		System.out.printf("%s 학생의 총점 : %d점  평균 : %.2f점\n", s2.getName(), s2.calculateSum(), s2.calculateAverage());
		
		String str1 = new String();// 이 코드는 String str1 = ""; 과 같은 의미이다. 다만 좀더 정석적인  표현이다.
		System.out.println(str1.length());
		
		
		Student s3 = new Student("abc", 4, 5, 6, 7);
		Student s4 = new Student("abc", 4, 5, 5, 7);
		
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		
		System.out.println("s3.equal(s4) : "+s3.equals(s4));
	}
}
