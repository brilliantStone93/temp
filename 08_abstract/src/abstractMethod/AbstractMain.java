package abstractMethod;

public class AbstractMain extends AbstractTest{
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
//		Ŭ���� ����
		//AbstractTest at  = new AbstractTest();
		//����, �߻�Ŭ������ �ڱ� �ڽ��� new �� �� ����. �� ������ �߻�޼ҵ� ����
		//1. ���
		//2. �ݵ�� �ڽ� Ŭ������ �߻�޼ҵ带 Override�������
		AbstractTest at  = new AbstractMain();
		at.setName("ȫ�浵");
		System.out.println(at.getName());
		
		
	}
}
