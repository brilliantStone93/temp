package day0915;

public class Student {
	
	//학생의 필드를 만들어보자
	//필드는 변수처럼
	//우리가 데이터타입 필드이름을 선언해주면 된다.
	
	//학생의 이름
	private String name;
	//name에 대한 셋터
	public void setName(String name) {
		this.name = name;
	}
	//name에 대한 셋터
	public String getName() {
		return name;
	}
	
	//학생의 국어점수
	private int korean;
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getKorean() {
		return korean;
	}
	//학생의 영어점수
	private int english;
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getEnglish() {
		return english;
	}
	//학생의 수학점수
	private int math;
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	//학생의 관리번호
	private int id;
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	//메소드를 만들어보자
	//1. 총점을 구하는 메소드
	public int calculateSum() {
		return korean + english+ math;
	}
	
	//2. 평균을 구하는 메소드
	public double calculateAverage() {
		return calculateSum() / 3.0;
	}
	
	//파라미터가 있는 생성자
	public Student(String name, int id, int korean, int english, int math) {
		//같은 이름이 있을때
		//파라미터는 필드보다 호출 우선순위가 높다.
		//따라서 같은 이름으로 존재할 때 필드를 호출할 때에는
		// 명확하게 "해당 객체의 필드"라고 지정해주어야 한다.
		// 이럴 때에는 this.필드로 지정할 수 잇다.
		// 즉 this란 이 메소드를 실행하는 클래스 객체 자신을 가리키게 된다.
		this.name = "abc";
		this.name = name;//Student 메소드의 파라미터 값을 필드 name에 넣는다란 뜻임
		this.korean = korean;
		this.english = english;
		this.math = math;
		
	}
	//파라미터가 없는 생성자
	public Student() {
		id = 0;
		korean = 0;
		english = 0;
		math = 0;
		name = new String();
		
	}
	//static keyword는 해당 필드 혹은 메소드를
	//객체 생성없이 곧장 호출할 수 있게 만들어준다.
	//다만 이 스태틱이란 키워드는 해당 메소드의 코드를
	//프로그램 실행여역에 강제로 포함시키는 것이기 때문에
	//만약 해당 메소드나 필드도 마찬가지로 스태틱을 붙여서
	//실해영역에 포함시켜주어야 한다.
	//대표적인 예 : Integer.parseInt(br.readLine());
	
	public void printInfo( ) {
		System.out.printf("이름 : %s ID : %d\n", name ,  id);
		System.out.printf("국어: %d점 영어 : %d점 수학 : %d점\n", korean, english, math);
		System.out.printf("평균 : %.2f점 총점 : %d점\n", calculateAverage(),calculateSum());
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(id == s.id && name.equals(s.name)) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return "이름 : " + name +
				"학번 : "+ id +
				"국어 : "+ korean + "점, "+
				"영어 : "+ english + "점, "+
				"수학 : "+ math + "점, "+
				"평균 : "+ calculateAverage()+"점, "+
				"총점 : "+ calculateSum()+"점";
				
	}
}

	
