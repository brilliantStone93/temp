package class_constructor;

class PersonTest{
	private String name;
	private int age;
	
	public PersonTest() {
		System.out.println("defult ������");
	}
	
	public PersonTest(String n, int a) {
		name = n;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setData(String n , int a) {
		name = n;
		age = a;
	}
	
	//�Ĵ� �޴��ǰ� ���� Ŭ������
}// PersonTest

public class PersonMain {
	public static void main(String[] args) {
	//���α׷��� �������� �Ǵ� ���� main�� { �߰�ȣ ����, ���� } �߰�ȣ �ݴ� ��ȣ
		PersonTest aa; // Ŭ���� ������ ���ϰ� ��ü��� �Ѵ�.
		aa = new PersonTest("ȫ�浿", 25);//�ڿ� ()�̰��� �����ڶ�� �����
		System.out.println("��ü aa = "+ aa);
//		aa.name = "ȫ�浿";;
//		aa.age = 25;
		System.out.println("�̸�  ="+aa.getName()+"\t ���� ="+aa.getAge());
		System.out.println();
				
		PersonTest bb = new PersonTest();
		System.out.println("��ü bb = "+ bb);
//		bb.name = "�ڳ�";
//		bb.age = 13;
		bb.setData("�ڳ�", 13);
		System.out.println("�̸�  ="+bb.getName()+"\t ���� ="+bb.getAge());
		System.out.println();
		
		PersonTest cc = new PersonTest();
//		cc.setData();
		
	}//main
}//
