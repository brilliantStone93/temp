package exception;

public class Synchronized extends Thread{
	private static int count;
	
	
	
	
	public static void main(String[] args) {
		Synchronized aa =new Synchronized(); // ������ ����
		Synchronized bb =new Synchronized();
		Synchronized cc =new Synchronized();
		
		aa.setName("aa");
		bb.setName("bb");
		cc.setName("cc");	

		aa.start();// ������ ����
		bb.start();
		cc.start();
	
	
	}//main

	
	
	
	
	@Override
	public void run() { // ������ run�޼ҵ带 ���� �ֱ� ������ synchronized���൵ �ȵȴ� 
						// ���� �ؿ� ������� ����ȭ ���ش�
		 synchronized(Synchronized.class) {
			 //synchronized(this) { this�� ����ϸ� �ȵȴ� �ֳ��ϸ� this�� �ҷ����� ������ ��ü�� �ּҰ��� �� �ٸ��� ����
			 for(int i = 0 ; i <= 5; i++) {
					count ++;
					System.out.println(Thread.currentThread().getName()+" : "+count);
				}//for
				
		 }
		
	}//run
	
	
}//
