package method;

public class Boxing {
	public static void main(String[] args) {
	int a = 25; 
	double b = (double)a/3; // ��������ȯ/�ڵ�����ȯ, Casting, Cast����
	
	
	int c = 5;
	Integer d = c; // jdk 5.0�̻���� �����ϰ� ��, AutoBoxing = �ڵ����� �Ʒ��� ó���� ���ִ� ��
	//��ü��         int(�⺻��)
	//Integer d = new Integer(c); / ������ �̰� ���� �̰� �ڵ����� ����
	
	Integer e = 5;
	int f = e;
	//�⺻�� = ��ü��
	f = e.intValue();
	//�⺻�� = ��ü��
	//int f = e.intValue();
	
	
	}
}
