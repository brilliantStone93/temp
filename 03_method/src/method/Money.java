package method;

/*
 �ݾ�(money)�� 5679���϶� ������ ���� ����Ͻÿ�
[������]
�ݾ� : 5679��
õ�� : 5��
��� : 6��
�ʿ� : 7��
�Ͽ� : 9�� 
(%������ �����ڷ� Ǯ���ּ���)
 */
public class Money {
	public static void main(String[] args) {
		int money = 5679;
		int a = money%10000 - money%1000;
		int b = money%1000 - money%100;
		int c = money%100 - money%10;
		int d = money%10;
		
		System.out.println("�ݾ� : "+ money+ "��");
		System.out.println("õ�� : "+ a/1000+ "��");
		System.out.println("��� : "+ b/100+ "��");
		System.out.println("�ʿ� : "+ c/10+ "��");
		System.out.println("�Ͽ� : "+ d+ "��");
	}

}
