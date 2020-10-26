package exception;

public class Synchronized extends Thread{
	private static int count;
	
	
	
	
	public static void main(String[] args) {
		Synchronized aa =new Synchronized(); // 스레드 생성
		Synchronized bb =new Synchronized();
		Synchronized cc =new Synchronized();
		
		aa.setName("aa");
		bb.setName("bb");
		cc.setName("cc");	

		aa.start();// 스레드 시작
		bb.start();
		cc.start();
	
	
	}//main

	
	
	
	
	@Override
	public void run() { // 각각의 run메소드를 갖고 있기 때문에 synchronized해줘도 안된다 
						// 따라서 밑에 방법으로 동기화 해준다
		 synchronized(Synchronized.class) {
			 //synchronized(this) { this를 사용하면 안된다 왜냐하면 this가 불러오는 각각의 객체의 주소값이 다 다르기 때문
			 for(int i = 0 ; i <= 5; i++) {
					count ++;
					System.out.println(Thread.currentThread().getName()+" : "+count);
				}//for
				
		 }
		
	}//run
	
	
}//
