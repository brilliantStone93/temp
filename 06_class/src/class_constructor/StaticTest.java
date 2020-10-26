package class_constructor;

public class StaticTest {
	private int a; //�ʵ�, �ν��Ͻ� ����
	private static int b; //�ʵ�
	
	static {//����ƽ�� ���ο��� new�ϴ� �Ͱ� ������� static�� �ʱ�ȭ �����ֱ����ؼ� static������ �̰� �̿�
		System.out.println("�ʱ�ȭ ����");
		b = 3;
	}
	
	public StaticTest() {//�ν��Ͻ� ������ �Ϲ� �����ڸ� ���ؼ� �ʱ�ȭ
		this.a = 3;
		
		
	}
	
	public void calc() {
		a++;
		b++;
	}
	
	public void disp()	{
		System.out.println("a ="+a+"\t b=" + b);
	}
	
	public static void output() {
		
//		System.out.println("a ="+this.a+"\t b=" + b); ����ƽ �Լ�, �޼ҵ� �ȿ����� this, super�� �������� �޸𸮰� static���� ������ ������
		System.out.println("static method...");
	}
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		System.out.println("static �޼ҵ� ȣ��");
		StaticTest.output();
		output();
		
		
	}//main
}//
