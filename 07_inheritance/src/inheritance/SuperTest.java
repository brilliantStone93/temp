package inheritance;

public class SuperTest {
	protected double weight;
	protected double height;
	
	public SuperTest(double weight , double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public SuperTest() {
		System.out.println("SuperTest 기본 생성자");
		
	}
	
	public void disp() {
		System.out.println("SuperTest클래스의 disp()");
		System.out.println("몸무게 ="+weight);
		System.out.print("키 = "+height);
	}
}
