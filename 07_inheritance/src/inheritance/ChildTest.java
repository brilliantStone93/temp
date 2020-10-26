package inheritance;

public class ChildTest extends SuperTest{
	protected String name;
	protected int age;
	
	public ChildTest() {
		System.out.println("ChildTest 기본 생성자");
	}
	public ChildTest(double weight, double height, String name, int age) {
		super(weight, height);
		System.out.println("ChildTest 생성자");
		this.weight = weight;
		this.height = height;
		this.name = name;
		this.age = age;
	}
	
	
	public void disp() {
		System.out.println("몸무게 ="+weight);
		System.out.println("키 = "+height);
		System.out.println("이름  =" + name );
		System.out.println("나이 = "+age);
		
	}
	public static void main(String[] args) {
		ChildTest aa = new ChildTest(75.3, 185.5, "홍길동", 25);
		aa.disp();//disp()를 ChildTest에서 먼저 찾고 부모에서 찾음
		System.out.println();
		
		
		System.out.println("---------------------------------");
		SuperTest bb = new ChildTest(35.8, 156.3, " 코난", 13);
		bb.disp();
		System.out.println();
		//부모클래스 자식클래스 똑같은 메소드가 존재(Override) 무조건 자식클래스를 메소드를 호출 부모클래스 메소드는 무시된다.
		 
		
	}
	
	
}
