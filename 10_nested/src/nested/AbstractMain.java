package nested;

public class AbstractMain {
	
	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest();  �߻�Ŭ������ new �� �� ���� ����
		// ��� �Ǵ� �޼ҵ�� �ҷ��;��Ѵ�
//		at.setName("ȫ�浿");
//		System.out.println("�̸� = "+ at.getName());

		
		AbstractTest at = new AbstractTest() {//�͸� innerŬ���� ����ؼ� �������̵� ���ִ� ��
			
			public void setName(String name) {//����
				this.name = name;
			}
		};
		
		InterA in = new InterA() {//�տ� new�� ���� �͸� Ŭ������ new���� �� �������̽��� new�� �ȵ�
			public void aa() {}
			public void bb() {}
		};
		
		AbstractExam ae = new AbstractExam() {
			public void cc() {}
		};
		
	}
}

	

