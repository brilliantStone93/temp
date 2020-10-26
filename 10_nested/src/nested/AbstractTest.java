package nested;

public abstract class AbstractTest {//POJO
	String name;
	
	
	//setter, getter
	public abstract void setName(String name);//추상메소드
	
	public String getName() {//구현
		return name;
	}
	
	
}
