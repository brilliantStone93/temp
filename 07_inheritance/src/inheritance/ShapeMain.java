package inheritance;

class ShapeTest{
	protected double area;
	
	public ShapeTest() {
		
		System.out.println("ShapeTest 기본 생성자");
	}
	
	public void calcArea() {
		
		System.out.println("도형을 계산합니다.");
	}
	
	public void dispArea() {
		
		System.out.println("도형을 출력합니다.");
	}
}//ShapeTest

class SamTest extends ShapeTest{
	protected double base, height;

	public SamTest(int base, int height) {
		System.out.println("SamTest 기본 생성자");
		this.base = base;
		this.height=height;
		
	}
	
	public void calcArea() {
		area = base *height / 2.0;
	}
	
	public void dispArea() {
		System.out.println("삼각형 넓이 = "+area);
		
	}
}//SamTest

class SaTest extends ShapeTest{
	protected int width;
	protected int height;
	
	public SaTest(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void calcArea() {
		area = width*height;
	}
	
	public void dispArea() {
		System.out.println("사격형 넓이 ="+area);
	}
}//saTest

class SadariTest extends ShapeTest{
	protected int top;
	protected int bottom;
	protected int height;
	
	public SadariTest(int top, int bottom, int height) {
		this.top = top;
		this.bottom = bottom;
		this.height = height;
	}
	
	public void calcArea() {
		area = (top+bottom)*height/2;
	}
	
	public void dispArea() {
		System.out.println("사다리꼴 넓이 = "+area);
	}
	
}//SadariTest


public class ShapeMain {
	
	public static void main(String[] args) {
		//클래스 생성
		SamTest sam = new SamTest(5,7);
		sam.calcArea();
		sam.dispArea();
		System.out.println();
		
		SaTest sa = new SaTest(5, 6);
		sa.calcArea();
		sa.dispArea();
		System.out.println();
		
		SadariTest sadari = new SadariTest(2,3,4);
		sadari.calcArea();
		sadari.dispArea();
		System.out.println();
				
		
		
		
	}//main
}//






















