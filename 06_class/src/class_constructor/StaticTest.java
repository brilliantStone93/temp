package class_constructor;

public class StaticTest {
	private int a; //필드, 인스턴스 변수
	private static int b; //필드
	
	static {//스택틱은 메인에서 new하는 것과 관계없고 static을 초기화 시켜주기위해선 static구역인 이걸 이용
		System.out.println("초기화 영역");
		b = 3;
	}
	
	public StaticTest() {//인스턴스 변수는 일반 생성자를 통해서 초기화
		this.a = 3;
		
		
	}
	
	public void calc() {
		a++;
		b++;
	}
	
	public void disp()	{
		System.out.println("a ="+a+"\t b=" + b);
	}
	
	public static void output() {
		
//		System.out.println("a ="+this.a+"\t b=" + b); 스태틱 함수, 메소드 안에서는 this, super등 쓸수없음 메모리가 static으로 잡히기 때문에
		System.out.println("static method...");
	}
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		System.out.println("static 메소드 호출");
		StaticTest.output();
		output();
		
		
	}//main
}//
