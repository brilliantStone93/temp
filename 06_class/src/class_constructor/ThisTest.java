package class_constructor;

public class ThisTest {
	private String name;
	private int age;
	
	public ThisTest() {
		System.out.println("default 생성자");
		System.out.println("this = "+ this);
		System.out.println();
	}
	

	public ThisTest(String name) {
		this();
		System.out.println("ThisTest(String name)");
		System.out.println("this = "+ this);
		
		this.name = name;
		System.out.println();
	}
	
	public ThisTest(int age) {
		this("코난");// 반드시 생성자 안에서 맨 첫줄에 쓰여야 한다.
		System.out.println("ThisTest(int age)");
		System.out.println("this = "+this);
		
		this.age = age;
		System.out.println();
	}
	public static void main(String[] args) {
		ThisTest aa = new ThisTest();
		System.out.println("이름 = "+aa.name+" 나이 ="+aa.age);
		System.out.println("객체aa ="+aa);
		System.out.println();
		
		ThisTest bb = new ThisTest("홍길동");
		System.out.println("객체bb ="+bb);
		System.out.println("이름 = "+bb.name+" 나이 ="+bb.age);
		System.out.println();
		
		ThisTest cc = new ThisTest(25);
		System.out.println("객체cc ="+cc);
		System.out.println("이름 = "+cc.name+" 나이 ="+cc.age);
		System.out.println();
		
		
	}
}
