package abstractMethod;

public abstract class AbstractTest {//POJO(Plain Old Java Object)형식, 추상 메소드를 갖고 있어서 abstract추가하여 추상클래스로 변경
	protected String name;            //그러나 추상클래스는 추상메소드가 없어도 상관없다

	
	
//	public void setName(String name) {
//		this.name = name;
//	}

	public abstract void setName(String name);//추상 메소드
	//추상메소드가 있는 클래스는 반드시 추상클래스여야한다

	
	public String getName() {
		return name;
	}
	
	
	
	
}//
