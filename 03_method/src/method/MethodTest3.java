package method;

public class MethodTest3 {
	int a;//�ʵ�
	
	public int sum(int a, int b){//���� �޼ҵ� - ����, �޼ҵ�(parameter, argument)
		return a+b;
		
	}
	
	public int sub(int a, int b){
		return a-b;
	}
	
	public int 	mul(int a, int b) {
		return a*b;
	}
	public double div(int a, int b) {
		return (double)a/b;
	}
	
	public static void main(String[] args) {
		int a;//��������
		
		MethodTest3 mt = new MethodTest3();
		System.out.println("�� = "+mt.sum(25, 36));//ȣ��
		//ȣ��
		System.out.println("�� = "+mt.sub(25, 36));
		System.out.println("�� = "+mt.mul(25, 36));
		System.out.printf("�� = %.2f", mt.div(25, 36));
		//System.out.println("�� = "+ String.format("%.2f", mt.div(25, 36)));
}
}
