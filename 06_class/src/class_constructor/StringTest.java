package class_constructor;

public class StringTest {
	
	
	
	public static void main(String[] args) {
		String a = "apple";//문자열 literal 생성은 이 String만 가능 
		String b = "apple";
		if(a==b) System.out.println("a와 b는 참조값이 같다");
		else System.out.println("a와 b는 참조값이 다르다");
		
		if(a.equals(b)) System.out.println("a와 b는 참조값이 같다");
		else System.out.println("a와b는 참조값이 다르다");
		System.out.println();
		
		String c = new String("apple");
		String d = new String("apple");
		if(c==d) System.out.println("d와 c는 참조값이 같다");
		else System.out.println("c와 d는 참조값이 다르다");
		
		if(c.equals(d)) System.out.println("d와 c는 참조값이 같다");
		else System.out.println("c와 d는 참조값이 다르다");
		System.out.println();
		
		String e = "오늘 날짜는"+2020+9+25;
		System.out.println("e = "+e);
		
		
		System.out.println("문자열 크기 = "+e.length());
		
		for(int i = 0 ; i <e.length(); i++) {
			System.out.println(e.charAt(i));
		}
		System.out.println();
		
		System.out.println("부분 문자열 추출 = "+e.substring(7));
		System.out.println("부분 문자열 추출 = "+e.substring(7,11));
		
		System.out.println("대문자 변경 = "+"Hello".toUpperCase());
		System.out.println("소문자 변경 = "+"Hello".toLowerCase());
		
		System.out.println("문자열 검색="+e.indexOf("짜"));
		System.out.println("문자열 검색="+e.indexOf("날짜"));
		System.out.println("문자열 검색="+e.indexOf("개바부"));
		
		
	}//main
}//
