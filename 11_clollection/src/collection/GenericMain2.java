package collection;

class GenericTest2<T> {
	private T a;
	
	
	public GenericTest2(T a) {
		this.a = a;
		
	}
	
	public void setA(T a) {
		this.a = a;
	}
	
	public T getA() {
		 return a;
	}
	
	
	
	
}
//-----------------------------------------------
public class GenericMain2 {
	
	
	public static void main(String[] args) {
		GenericTest2<?> aa = new GenericTest2<String>("홍길동");
		//aa.setA("홍길동"); - 반드시 생성자를 통해서만 데이터가 전달된다
		
		String name = (String)aa.getA();// 자식 = (자식)부모 를 통해 다운케스팅해줘야함
		System.out.println("이름 = "+ name);
		
		GenericTest2<?> bb = new GenericTest2<Integer>(25);
		int age = (Integer)bb.getA();
		System.out.println("나이 = "+ age);
		
		
	
	}
}
