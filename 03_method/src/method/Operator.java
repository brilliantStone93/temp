package method;

public class Operator {
	public static void main(String[] args) {
		int a = 0;
		a += 5; // a= a+5
		a *= 2;
		a -= 3;
		System.out.println("a = "+a); // a=7
		
		a++; //a=a+1
		System.out.println("a = "+a);// a=8
		int b = a++;	
		//���� �Լ��� Ǯ�� �� ��
		//int b = a;
		//a++;
		System.out.println("a = "+ a + " b = " +b); // a = 9 b = 8
		
		int c = ++a;
		//���� �Լ��� Ǯ�� �� �� 
		//++a;
		//int c = a;
		System.out.println("a = "+ a+ " c = "+c);//a=10 c= 10
		
		int d = ++a - b--;
		//���� ���� Ǯ�� ����
		//++a;
		//int d= a - b;
		//b--;
		System.out.println("a = "+ a +" b = " + b + " d = " + d); // a= 11 b = 7 d = 3
		
		System.out.println("a++ = " + a++);
		// ���� ���� Ǯ��  �� ��
		// System.out.println("a++ =" + a);
		// a++;
		System.out.println(" a= "+ a);// a = 12
	
		System.out.println("++a = "+ ++a);
		
		
		
		
	
	}

}
