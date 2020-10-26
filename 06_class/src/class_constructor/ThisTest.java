package class_constructor;

public class ThisTest {
	private String name;
	private int age;
	
	public ThisTest() {
		System.out.println("default ������");
		System.out.println("this = "+ this);
		System.out.println();
	}
	

	public ThisTest(String name) {
		this();
		System.out.println("ThisTest(String name)");
		System.out.println("this = "+ this);
		
		this.name = name;
		System.out.println();
	}
	
	public ThisTest(int age) {
		this("�ڳ�");// �ݵ�� ������ �ȿ��� �� ù�ٿ� ������ �Ѵ�.
		System.out.println("ThisTest(int age)");
		System.out.println("this = "+this);
		
		this.age = age;
		System.out.println();
	}
	public static void main(String[] args) {
		ThisTest aa = new ThisTest();
		System.out.println("�̸� = "+aa.name+" ���� ="+aa.age);
		System.out.println("��üaa ="+aa);
		System.out.println();
		
		ThisTest bb = new ThisTest("ȫ�浿");
		System.out.println("��übb ="+bb);
		System.out.println("�̸� = "+bb.name+" ���� ="+bb.age);
		System.out.println();
		
		ThisTest cc = new ThisTest(25);
		System.out.println("��ücc ="+cc);
		System.out.println("�̸� = "+cc.name+" ���� ="+cc.age);
		System.out.println();
		
		
	}
}
