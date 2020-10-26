package exception;

public class SnackTest extends Thread{
	//스레드 생성 첫 번째 방법 상속받기  ↑
	
	private String str;
	
	public SnackTest(String str) {
		this.str = str;
	}
	
	public void run() {
		for(int i = 1; i <= 5; i ++) {
			System.out.println(str + "\t" + "i = "+ i + "\t"+ Thread.currentThread());
			//static이자 
		}
	}
	
	public static void main(String[] args) {
		SnackTest aa = new SnackTest("새우깡");//스레드 생성
		SnackTest bb = new SnackTest("포카칩");//스레드 생성
		SnackTest cc = new SnackTest("썬칩");//스레드 생성
		
		//스레드 이름 부여
		aa.setName("새우깡");
		bb.setName("포카칩");
		cc.setName("썬칩");
		
		//우선순위 1~10(최대/MAX_PRIORITY)(default: 5/ 중간값인 5가 부여되는 것), 우선순위가 절대적인것은 아님
		aa.setPriority(10);//aa.setPriority(Thread.MAX_PRIORITY);
		bb.setPriority(Thread.MIN_PRIORITY); //1
		cc.setPriority(Thread.NORM_PRIORITY); //5
		
		
//		aa.run();
//		bb.run();
//		cc.run();
		aa.start();//스레드 시작하는 메소드 -> 스레드 실행(run()를 찾아간다)
					//우리가 해줄수있는건 이게 다고 이 다음부터는 운영체제가 알아서 해준다
//		try {
//			aa.join();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		} //aa가 끝날때까지 다른 스레드 실행 안되도록한다
		
		bb.start();
		cc.start();
		
	}//main
}//
