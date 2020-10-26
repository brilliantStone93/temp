package exception;

public class SnackTest extends Thread{
	//������ ���� ù ��° ��� ��ӹޱ�  ��
	
	private String str;
	
	public SnackTest(String str) {
		this.str = str;
	}
	
	public void run() {
		for(int i = 1; i <= 5; i ++) {
			System.out.println(str + "\t" + "i = "+ i + "\t"+ Thread.currentThread());
			//static���� 
		}
	}
	
	public static void main(String[] args) {
		SnackTest aa = new SnackTest("�����");//������ ����
		SnackTest bb = new SnackTest("��īĨ");//������ ����
		SnackTest cc = new SnackTest("��Ĩ");//������ ����
		
		//������ �̸� �ο�
		aa.setName("�����");
		bb.setName("��īĨ");
		cc.setName("��Ĩ");
		
		//�켱���� 1~10(�ִ�/MAX_PRIORITY)(default: 5/ �߰����� 5�� �ο��Ǵ� ��), �켱������ �������ΰ��� �ƴ�
		aa.setPriority(10);//aa.setPriority(Thread.MAX_PRIORITY);
		bb.setPriority(Thread.MIN_PRIORITY); //1
		cc.setPriority(Thread.NORM_PRIORITY); //5
		
		
//		aa.run();
//		bb.run();
//		cc.run();
		aa.start();//������ �����ϴ� �޼ҵ� -> ������ ����(run()�� ã�ư���)
					//�츮�� ���ټ��ִ°� �̰� �ٰ� �� �������ʹ� �ü���� �˾Ƽ� ���ش�
//		try {
//			aa.join();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		} //aa�� ���������� �ٸ� ������ ���� �ȵǵ����Ѵ�
		
		bb.start();
		cc.start();
		
	}//main
}//
