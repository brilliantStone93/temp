package exception;

public class SingleTon {
	private int num = 3;
	private static SingleTon instance = null;
	
	public static SingleTon  getInstance() {
		if(instance == null) {
			synchronized(SingleTon.class) {
				instance = new SingleTon();
			}
		}
		
		return instance;
	}
	
	
	public static void main(String[] args) {
	
		SingleTon aa = new SingleTon();
		aa.num++;
		System.out.println("aa = "+ aa);
		System.out.println("num = "+ aa.num);
		System.out.println();
		
		SingleTon bb = new SingleTon();
		bb.num++;
		System.out.println("bb = "+ bb);
		System.out.println("num = "+ bb.num);
		System.out.println();
		//==============위와 아래 값 비교=================
		//아래는 getInstance라는 메소드를 통해서 한가지 객체를 같이 쓰게 된다
		//이때 필드에 선언된 SingelTon에 static이 필요하다 
		//cc가 선언되고 메소드를 통해서 instance가 null에서 주소값을 갖게되고
		//dd는 메소드에 의해 위의 주소값을 갖게된다
		System.out.println("** 싱글톤 **");
		SingleTon cc = SingleTon.getInstance(); //생성
		cc.num++;
		System.out.println("bb = "+ bb);
		System.out.println("num = "+ bb.num);
		System.out.println();
		
		SingleTon dd = SingleTon.getInstance(); //생성
		dd.num++;
		System.out.println("bb = "+ bb);
		System.out.println("num = "+ bb.num);
		System.out.println();
		
		
	}//main
}//
