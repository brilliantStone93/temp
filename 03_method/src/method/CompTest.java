package method;

public class CompTest {
	
	public int sub(int a, int b){
		return a-b;
	}
	
	public static void main(String[] args) {
		int score = 85;
		
		
		String result = score>= 80 && score<=100 ? "�հ�" : "���հ�";
		System.out.println("��� = " + result);
		System.out.println();
		
		//score�� ���� ¦��(2�� ���� �������� 0�̸�) "¦��"  �ƴϸ� "Ȧ��"
		int score2 = 80;
		result = score2%2==0 ? "¦��" : "Ȧ��";
		
		System.out.println("��� = " + result);
		System.out.println();
		
		// a, b�߿��� ū ���� ����Ͻÿ�
		int a=26, b= 125;
		int big = a > b ? a : b;
		System.out.println("��� = " + big);
		
		System.out.println(" ū �� = " + Math.max(a, b));
		System.out.println(" �ּ� �� = " + Math.min(a, b));
		System.out.println("���� = " + Math.pow(2.0, 5.0));
		double p = Math.pow(2.0, 5.0);
		
		
		System.out.println("���� = "+ p);
		System.out.println();
		
		//
		int c = 15;
		result = c%2==0 && c%3==0 ? "2�� 3�� �����": "2�� 3�� ������� �ƴϴ�";
		System.out.println("��� = " + result);
		System.out.println();
		
		
		
		
		
		
		
	}

}