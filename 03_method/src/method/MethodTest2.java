package method;

public class MethodTest2 {
    public void disp() {
    	System.out.println("non-static method");
    	//���� 
    }
    public static void output() {
    	System.out.println("static method");
    	//���� 
    }
	
	public static void main(String[] args) {
		MethodTest2.output(); //ȣ��, ��� �޼ҵ�� �ݵ�� ȣ���� ������ �ǵ��� �;� �Ѵ�.
		
		
		MethodTest2 m = new MethodTest2();
		m.disp();
		//new MethodTEst2().disp(); �̰� ��ȸ���� �ֳ��ϸ� ��ä�� ���� ������ ��ã�ư�
	}// ��� �Լ��� ���۰� ���� main
}
