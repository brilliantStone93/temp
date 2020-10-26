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
		//==============���� �Ʒ� �� ��=================
		//�Ʒ��� getInstance��� �޼ҵ带 ���ؼ� �Ѱ��� ��ü�� ���� ���� �ȴ�
		//�̶� �ʵ忡 ����� SingelTon�� static�� �ʿ��ϴ� 
		//cc�� ����ǰ� �޼ҵ带 ���ؼ� instance�� null���� �ּҰ��� ���Եǰ�
		//dd�� �޼ҵ忡 ���� ���� �ּҰ��� ���Եȴ�
		System.out.println("** �̱��� **");
		SingleTon cc = SingleTon.getInstance(); //����
		cc.num++;
		System.out.println("bb = "+ bb);
		System.out.println("num = "+ bb.num);
		System.out.println();
		
		SingleTon dd = SingleTon.getInstance(); //����
		dd.num++;
		System.out.println("bb = "+ bb);
		System.out.println("num = "+ bb.num);
		System.out.println();
		
		
	}//main
}//
