package class_constructor;

class PersonTest{
	private String name;
	private int age;
	
	public PersonTest() {
		System.out.println("defult 생성자");
	}
	
	public PersonTest(String n, int a) {
		name = n;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setData(String n , int a) {
		name = n;
		age = a;
	}
	
	//식당 메뉴판과 같은 클래스임
}// PersonTest

public class PersonMain {
	public static void main(String[] args) {
	//프로그램의 시작점이 되는 곳이 main의 { 중괄호 시작, 끝은 } 중괄호 닫는 기호
		PersonTest aa; // 클래스 변수라 안하고 객체라고 한다.
		aa = new PersonTest("홍길동", 25);//뒤에 ()이것은 생성자라고 보면됨
		System.out.println("객체 aa = "+ aa);
//		aa.name = "홍길동";;
//		aa.age = 25;
		System.out.println("이름  ="+aa.getName()+"\t 나이 ="+aa.getAge());
		System.out.println();
				
		PersonTest bb = new PersonTest();
		System.out.println("객체 bb = "+ bb);
//		bb.name = "코난";
//		bb.age = 13;
		bb.setData("코난", 13);
		System.out.println("이름  ="+bb.getName()+"\t 나이 ="+bb.getAge());
		System.out.println();
		
		PersonTest cc = new PersonTest();
//		cc.setData();
		
	}//main
}//
