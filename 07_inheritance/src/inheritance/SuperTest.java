package inheritance;

public class SuperTest {
	protected double weight;
	protected double height;
	
	public SuperTest(double weight , double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public SuperTest() {
		System.out.println("SuperTest �⺻ ������");
		
	}
	
	public void disp() {
		System.out.println("SuperTestŬ������ disp()");
		System.out.println("������ ="+weight);
		System.out.print("Ű = "+height);
	}
}
