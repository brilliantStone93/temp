package method;

/*
 �̸�(name), ����(kor), ����(eng), ����(math)������ �Է¹޾Ƽ� ����(tot),���(avg)�� ���Ͻÿ�

���� = ���� + ���� + ����
��� = ���� / �����

[������]
�̸� �Է� : ȫ�浿
���� �Է� : 95
���� �Է� : 90
���� �Է� : 91

   *** ȫ�浿 ���� ***
����      ����      ����      ����      ���
95      90      91      xxx      xx.xxx
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class SungJuk {
	public static void main (String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));//����
//Ű�����Է°��� buffer��� �ӽñ����Ҹ� ���� �ڹٷ� ������ �� �׷��� ���� ���� �۾��ִ� �۾��� �ʿ�		
		System.out.println("***������ �Է����ּ���***");
		
		System.out.print("�̸�? ");
		String name = br.readLine();
		System.out.print("����? ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("����? ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("����? ");
		int math = Integer.parseInt(br.readLine());
		int sum = kor+eng+math;
		double div = (double)sum/3;		
		
		System.out.println("***"+name+"����***");
		System.out.println("����"+kor+"����"+eng+"����"+math+"����"+sum+"���"+String.format("%.3f",div));
		
	}
}
