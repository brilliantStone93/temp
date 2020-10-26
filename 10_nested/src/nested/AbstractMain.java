package nested;

public class AbstractMain {
	
	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest();  추상클래스는 new 할 수 없다 따라서
		// 상속 또는 메소드로 불러와야한다
//		at.setName("홍길동");
//		System.out.println("이름 = "+ at.getName());

		
		AbstractTest at = new AbstractTest() {//익명 inner클래스 대신해서 오버라이딩 해주는 것
			
			public void setName(String name) {//구현
				this.name = name;
			}
		};
		
		InterA in = new InterA() {//앞에 new는 지금 익명 클래스를 new해준 것 인터페이스는 new가 안됨
			public void aa() {}
			public void bb() {}
		};
		
		AbstractExam ae = new AbstractExam() {
			public void cc() {}
		};
		
	}
}

	

