package class_constructor;



public class VarArgs {
//	private int sum(int a, int b) {
//		int result = a + b;
//		
//		
//		return result;
//	}
//	
//	private int sum(int a, int b, int c) {
//		int result = a + b+ c;
//		
//		
//		return result;
//	}
//	
//	private int sum(int a, int b, int c, int d) {
//		int result = a + b + c + d;
//		
//		
//		return result;
//	}
//	�̷����ϸ� �Ķ���Ϳ� ���� ������ �޶� �Ķ���Ͱ� �߰� �ɶ����� �ڵ尡 �߰��Ǿ� ������������ �����ϴ� 
//	�̸� ���ϰ� ���ֱ� ���� ����ϴ� ���� VarArgs�̴�
	
	public int sum(int...ar) {
		int hap =0;
		for(int i = 0; i < ar.length; i++) {
			hap += ar[i];
		}
		return hap;
	}
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println("�� ="+va.sum(10,20));//ȣ��
		System.out.println("�� ="+va.sum(10,20,30));
		System.out.println("�� ="+va.sum(10,20,30,40));
	
	
	}//main




















}//
