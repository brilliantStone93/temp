package _interface;

public interface InterA {
	//절대 변하지 않는 상수만 들어와야한다.
	public static final String NAME = "홍길동";
	public int AGE = 25; // 상수 인터페이스 안에서는 static final 생략 가능
	
	public abstract void aa(); // 추상메소드
	public void bb();//메소드는 오로지 추상 메소드만 들어올 수 있음
	
//	안되는 예
//	public void cc() {
//		
//	}
	
	
	
	
}
