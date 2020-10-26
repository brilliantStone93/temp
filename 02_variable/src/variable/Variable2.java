package variable;

public class Variable2 {
	int a; // 필드, 인스턴스 변수, 초기화(0)
	static int b; // 필드, 클래스 변수, 초기화(0)
	int c;
	String d;
	
	
	
	public static void main(String[] args) {
		int a = 10; //지역 변수(local variable), 쓰레기값
		System.out.println("지역변수 a="+ a);
		System.out.println("필드 b = "+ b);//b앞에 클래스명 생략되어 있다
		System.out.println("필드 b = "+ Variable2.b);
		System.out.println("필드 a = "+ new Variable2().a);
		
	}

}
