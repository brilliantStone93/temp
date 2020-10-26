package exception;


class JoinTest implements Runnable{


	
	@Override
	public void run() {
		for(int i = 1 ; i<=5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
		
	}
	
	
}


//--------------------------
public class JoinMain {
	
	

	
	
	public static void main(String[] args) {
		JoinTest jt = new JoinTest();
		Thread t = new Thread(jt); //스레드 생성
		System.out.println("스레드 시작");
		t.start();
		try {
			t.join(); // 스레드가 끝날때까지 기다렸다가 다음거 실행
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("스레드 종료");
		//main이 끝나도 백그라운드에서 스레드는 돌아가기 때문에 종료되지 않는다.
		
	
	}//main
}//
