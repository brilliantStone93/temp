package variable;

public class Variable2 {
	int a; // �ʵ�, �ν��Ͻ� ����, �ʱ�ȭ(0)
	static int b; // �ʵ�, Ŭ���� ����, �ʱ�ȭ(0)
	int c;
	String d;
	
	
	
	public static void main(String[] args) {
		int a = 10; //���� ����(local variable), �����Ⱚ
		System.out.println("�������� a="+ a);
		System.out.println("�ʵ� b = "+ b);//b�տ� Ŭ������ �����Ǿ� �ִ�
		System.out.println("�ʵ� b = "+ Variable2.b);
		System.out.println("�ʵ� a = "+ new Variable2().a);
		
	}

}
