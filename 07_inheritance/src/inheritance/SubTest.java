package inheritance;

public class SubTest extends SuperTest{
	protected String name;
	protected int age;
	
	public SubTest() {
		System.out.println("SubTest �⺻ ������");
	}
	public SubTest(double weight, double height, String name, int age) {
		System.out.println("SubTest ������");
		this.weight = weight;
		this.height = height;
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
//		SubTest aa = new SubTest();
////		//�θ�⺻������ + �ڱ�͵� �⺻ ������
//		
		SubTest aa = new SubTest(75.3, 185.5, "ȫ�浿", 25);		
//		//�θ�⺻������ + �ڱ���� �Ķ���Ͱ� �ִ� ������ ȣ��
		aa.output();//output()�� SubTest���� ã�´�. ������ �θ�Ŭ������ ���� ã�´�
		System.out.println();
		
				
		aa.disp();//disp()�� SubTest���� ã�´� ������ �θ�Ŭ������ ���� �ܴ���.
		System.out.println("-----------------"	);
		
		SuperTest bb = new SubTest(35.8, 156.3, " �ڳ�", 13);
//		bb.output(); �̷��� �ϸ� ������ ���µ� �ֳ��ϸ� bb�� �ּ� ���� SuperTest�̱� ������ subTest�� ���� 
//		output()�� �θ� �� ����
		bb.disp();
	}
	
	public void output() {
		System.out.println("������ ="+weight);
		//���⿡ this�� ���°��� subTest���� ���� ã�� �״��� superTest�ΰ��� �ڵ����� ���� ã�´�
		System.out.println("Ű = "+height);
		System.out.println("�̸�  =" + name );
		System.out.println("���� = "+age);
		
	}
}
