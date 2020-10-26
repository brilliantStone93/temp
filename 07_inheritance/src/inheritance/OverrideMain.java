package inheritance;


class Test{
	int a = 3;
	
	public void disp() {
		a += 5; //a = a+5
		System.out.println("Test : a = "+a);
		
	}
	
}//Test

class Sample extends Test{
	int a = 8; 
	
	@Override
	public void disp() {
		a += 5; 
		System.out.println("Sample : a = "+a);
	}
	
}//Sample


public class OverrideMain {
	public static void main(String[] args) {
		Sample aa = new Sample();//Test 기본생성자 => Sample 기본생성자 호출
		aa.disp();//Sample 클래스의 disp() 호출
		System.out.println("aa : " +aa.a);
		System.out.println();
		
		Test bb = new Sample();
		bb.disp();//오버라이드 된 자식 클래스내 메소드를 호출하게됨
		System.out.println("bb : "+bb.a);
		System.out.println();
		
		Test cc = new Test();
		cc.disp();//Test 클래스의 disp() 호출한다 왜냐하면 메모리값이 부모만 잡혔기때문
		System.out.println("cc: "+cc.a);
		System.out.println();
		
		Sample dd = (Sample)bb; //자식 = (자식) 부모
		dd.disp();
		System.out.println("dd: "+dd.a);
		
		//Sample ee = (Sample)cc;//자식 = (자식)부모는 안된다, 클래스캐스트익셉션 예외처리가 발생함 왜냐하면 cc는  부모클래스만 선언되어 해당 메모리만 잡혔기 때문에 자식클래스메모리 값이 없기 때문이다
		
		
	}//main
}//
