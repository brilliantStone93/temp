package method;

public class MethodTest2 {
    public void disp() {
    	System.out.println("non-static method");
    	//구현 
    }
    public static void output() {
    	System.out.println("static method");
    	//구현 
    }
	
	public static void main(String[] args) {
		MethodTest2.output(); //호출, 모든 메소드는 반드시 호출한 곳으로 되돌아 와야 한다.
		
		
		MethodTest2 m = new MethodTest2();
		m.disp();
		//new MethodTEst2().disp(); 이건 일회성임 왜냐하면 객채가 없기 때문에 못찾아감
	}// 모든 함수의 시작과 끝은 main
}
