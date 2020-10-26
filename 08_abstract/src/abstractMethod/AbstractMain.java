package abstractMethod;

public class AbstractMain extends AbstractTest{
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
//		클래스 생성
		//AbstractTest at  = new AbstractTest();
		//생성, 추상클래스는 자기 자신을 new 할 수 없다. 그 원인은 추상메소드 때문
		//1. 상속
		//2. 반드시 자식 클래스는 추상메소드를 Override해줘야함
		AbstractTest at  = new AbstractMain();
		at.setName("홍길도");
		System.out.println(at.getName());
		
		
	}
}
