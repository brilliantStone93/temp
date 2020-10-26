package inheritance;

public class ChildTest extends SuperTest{
	protected String name;
	protected int age;
	
	public ChildTest() {
		System.out.println("ChildTest �⺻ ������");
	}
	public ChildTest(double weight, double height, String name, int age) {
		super(weight, height);
		System.out.println("ChildTest ������");
		this.weight = weight;
		this.height = height;
		this.name = name;
		this.age = age;
	}
	
	
	public void disp() {
		System.out.println("������ ="+weight);
		System.out.println("Ű = "+height);
		System.out.println("�̸�  =" + name );
		System.out.println("���� = "+age);
		
	}
	public static void main(String[] args) {
		ChildTest aa = new ChildTest(75.3, 185.5, "ȫ�浿", 25);
		aa.disp();//disp()�� ChildTest���� ���� ã�� �θ𿡼� ã��
		System.out.println();
		
		
		System.out.println("---------------------------------");
		SuperTest bb = new ChildTest(35.8, 156.3, " �ڳ�", 13);
		bb.disp();
		System.out.println();
		//�θ�Ŭ���� �ڽ�Ŭ���� �Ȱ��� �޼ҵ尡 ����(Override) ������ �ڽ�Ŭ������ �޼ҵ带 ȣ�� �θ�Ŭ���� �޼ҵ�� ���õȴ�.
		 
		
	}
	
	
}
