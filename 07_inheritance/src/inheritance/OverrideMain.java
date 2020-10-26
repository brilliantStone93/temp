package inheritance;


class Test{
	int a = 3;
	
	public void disp() {
		a += 5; //a = a+5
		System.out.println("Test : a = "+a);
		
	}
	
}//Test

class Sample extends Test{
	int a = 8; 
	
	@Override
	public void disp() {
		a += 5; 
		System.out.println("Sample : a = "+a);
	}
	
}//Sample


public class OverrideMain {
	public static void main(String[] args) {
		Sample aa = new Sample();//Test �⺻������ => Sample �⺻������ ȣ��
		aa.disp();//Sample Ŭ������ disp() ȣ��
		System.out.println("aa : " +aa.a);
		System.out.println();
		
		Test bb = new Sample();
		bb.disp();//�������̵� �� �ڽ� Ŭ������ �޼ҵ带 ȣ���ϰԵ�
		System.out.println("bb : "+bb.a);
		System.out.println();
		
		Test cc = new Test();
		cc.disp();//Test Ŭ������ disp() ȣ���Ѵ� �ֳ��ϸ� �޸𸮰��� �θ� �����⶧��
		System.out.println("cc: "+cc.a);
		System.out.println();
		
		Sample dd = (Sample)bb; //�ڽ� = (�ڽ�) �θ�
		dd.disp();
		System.out.println("dd: "+dd.a);
		
		//Sample ee = (Sample)cc;//�ڽ� = (�ڽ�)�θ�� �ȵȴ�, Ŭ����ĳ��Ʈ�ͼ��� ����ó���� �߻��� �ֳ��ϸ� cc��  �θ�Ŭ������ ����Ǿ� �ش� �޸𸮸� ������ ������ �ڽ�Ŭ�����޸� ���� ���� �����̴�
		
		
	}//main
}//
