package method;
/*
  ���� ��� ���α׷�
�̸�(name), ����(rank), �⺻��(basePay), ����(incentive)�� �Է��Ͽ� ���ݰ� ������ ����Ͻÿ�
������ �޿��� 4,000,000 ���� �̻��̸� 3% �ƴϸ� 2%�� �Ѵ�

���� �� ������ �� Ǯ���ٸ�
������ calcTax()
������ calcSalary()�� �̿��ؼ� ����Ͻÿ�

�޿� = �⺻�� + ����
���� = �޿� * ����
���� = �޿� - ����

[������]
�̸� �Է� : ȫ�浿
���� �Է� : ����
�⺻�� �Է� : 4500000
���� �Է� : 200000

   *** ȫ�浿 ���� ���� ***
���� : ����
�⺻��		      ����   		   �޿�   	   ����       ����          ����
4500000      200000     4700000   3%   xxxxx   xxxxxxx
                            
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Salary {

	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//Ŭ������ �ݵ�� �����ؾ� �Ѵ�.
		System.out.print("�̸� �Է� : ");
		String name = bufferedReader.readLine();
		System.out.print("���� �Է� : ");
		String rank = bufferedReader.readLine();
		System.out.print("�⺻�� �Է� : ");
		int basePay = Integer.parseInt(bufferedReader.readLine());
		System.out.print("���� �Է� : ");
		int incentive = Integer.parseInt(bufferedReader.readLine());
	
		int pay = basePay+incentive;
		//������ �޿��� 4,000,000 ���� �̻��̸� 3% �ƴϸ� 2%�� �Ѵ�
		Salary salary = new Salary();
		//int tax = (int) (pay >= 4000000 ? salary.calcTax(pay) : salary.calcTax2(pay)) ;
		double taxRate = pay >= 4000000 ? 0.03 : 0.02;
		int tax = (int)salary.calcTax(pay, taxRate);
		System.out.println("*** "+name+" ���� ����***");
		System.out.println("���� : "+rank);
		System.out.println("�⺻��"+"\t"+"����"+"\t"+"�޿�"+"\t"+"����"+"\t"+"����"+"\t"+"����");
		System.out.println(basePay+"\t"+incentive+"\t"+pay+"\t"+String.format("%.0f", taxRate*100)+"%"+"\t"+tax+"\t"+salary.calcSalary(pay,tax));
		
	}

	public double calcTax(int a,double b){
		return a*b;
		
	}
	
	public int calcSalary(int a, int b){
		return a - b;
		
	}
	
}
