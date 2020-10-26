package inheritance;

public class SubTest extends SuperTest{
	protected String name;
	protected int age;
	
	public SubTest() {
		System.out.println("SubTest 기본 생성자");
	}
	public SubTest(double weight, double height, String name, int age) {
		System.out.println("SubTest 생성자");
		this.weight = weight;
		this.height = height;
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
//		SubTest aa = new SubTest();
////		//부모기본생성자 + 자기것도 기본 생성자
//		
		SubTest aa = new SubTest(75.3, 185.5, "홍길동", 25);		
//		//부모기본생성자 + 자기것은 파라메터가 있는 생성자 호출
		aa.output();//output()를 SubTest에서 찾는다. 없으면 부모클래스에 가서 찾는다
		System.out.println();
		
				
		aa.disp();//disp()를 SubTest에서 찾는다 없으면 부모클래스에 가서 잔느다.
		System.out.println("-----------------"	);
		
		SuperTest bb = new SubTest(35.8, 156.3, " 코난", 13);
//		bb.output(); 이렇게 하면 에러가 나는데 왜냐하면 bb의 주소 값이 SuperTest이기 때문에 subTest에 속한 
//		output()을 부를 수 없다
		bb.disp();
	}
	
	public void output() {
		System.out.println("몸무게 ="+weight);
		//여기에 this가 없는것은 subTest에서 먼저 찾고 그다음 superTest로가서 자동으로 값을 찾는다
		System.out.println("키 = "+height);
		System.out.println("이름  =" + name );
		System.out.println("나이 = "+age);
		
	}
}
