package abstractMethod;

public abstract class AbstractTest {//POJO(Plain Old Java Object)����, �߻� �޼ҵ带 ���� �־ abstract�߰��Ͽ� �߻�Ŭ������ ����
	protected String name;            //�׷��� �߻�Ŭ������ �߻�޼ҵ尡 ��� �������

	
	
//	public void setName(String name) {
//		this.name = name;
//	}

	public abstract void setName(String name);//�߻� �޼ҵ�
	//�߻�޼ҵ尡 �ִ� Ŭ������ �ݵ�� �߻�Ŭ���������Ѵ�

	
	public String getName() {
		return name;
	}
	
	
	
	
}//
