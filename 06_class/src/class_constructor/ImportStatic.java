package class_constructor;

//import static java.lang.Math.random;
//import static java.lang.Math.pow;

import static java.lang.Math.*;//���ϵ� ī�� ���⼭ *�� ��� ���̶�� �ǹ̸� ���� �ְ� �ٸ� ������ ���� ���ȴ�
import static java.lang.String.format;

public class ImportStatic {
	
	
	public static void main(String[] args) {
		System.out.println("���� = " + random());//������ Math.random�� ������ϴµ� ���� static������Ƴ��� ��������
		
		System.out.println("������  = " + pow(2, 10));
		
		System.out.println("�Ҽ����� 2°�ڸ� = "+ format("%.2f", 123.456));
		
		
		
	}//main
	
}//
