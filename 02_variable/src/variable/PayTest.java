package variable;

/*
�̸��� L(name)�� ����� �⺻��(basePay)�� 2500000�϶� 3.3% ����(tax)�� ����(salary)�� ����Ͻÿ�
�Ҽ������� �ڸ��� or ������ ����ع������
���� = �⺻�� * 3.3%(0.033)
���� = �⺻��-����
      
[������]
*** L�� ���� ***
�⺻�� : 2500000��
����   : 82500��
����   : 2417500��
 */
public class PayTest {

	public static void main(String[] args) {
		char name = 'L';
		int basePay;
		basePay = 2500000;
		double tax = basePay*0.033; 
		double salary = basePay - tax; 
		
		System.out.println("***L�� ����***");
		System.out.println("�⺻�� : "+ basePay+"��");
		System.out.println("���� : " + (int)tax+"��");
		System.out.println("���� : " + (int)salary+"��");
		

	}

}
