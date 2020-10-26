package variable;

public class Variable3 {
	int a;
	static int b;
	

	
	public static void main(String[] args) {
		int a = 10;
		System.out.println("지역변수 a = "+a);
		
		Variable3 v;//'v'를 객체라고한다 클래스의 주소를 나타낸다.
		v = new Variable3();
		System.out.println("필드 a = " + v.a);
		v.a = 20;
		System.out.println("필드 a = "+ v.a);
		
		Variable3 v2;//객체
		v2 = new Variable3();
		System.out.println("필드 a = "+ v2.a);
		
		int sum = v.a + v2.a;
		System.out.println("sum int = " +sum);
		
		System.out.println("필드b = " + Variable3.b);
		System.out.println("필드b = " + b);
		System.out.println("필드b = " + v.b);

	}

}
