package if_switch;

/*
  �̸�(name),����(kor),����(eng),����(math)������ �Է¹޾Ƽ� 
����(tot),���(avg), ����(grade)�� ���Ͻÿ�

����� 90�̻��̸� 'A'����
����� 80�̻��̸� 'B'����
����� 70�̻��̸� 'C'����
����� 60�̻��̸� 'D'����
�׿ܴ� 'F'����


[������]
�̸� �Է� : ȫ�浿
���� �Է� : 78  
���� �Է� : 89 
�����Է�  : 100

   *** ȫ�浿 ���� ***
����      ����      ����      ����      ���      ����
78      89      100      xxx      xx.xxx   x
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SungJuk {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�̸� �Է� : ");
		String name = br.readLine();
		System.out.println("���� �Է� : ");
		int kr = Integer.parseInt(br.readLine());
		System.out.println("���� �Է� : ");
		int en = Integer.parseInt(br.readLine());
		System.out.println("���� �Է� : ");
		int m = Integer.parseInt(br.readLine());
		
		int tot = kr + en + m;
		double avg = tot/3;
//		if(avg>=90) {
//			System.out.println("A ����");
//		}else if(avg>=80){
//			System.out.println("B ����");
//		}else if(avg>=70){
//			System.out.println("C ����");
//		}else if(avg>=80){
//			System.out.println("D ����");
//		}else {
//			System.out.println("f ����");
//		}
		
		/* char grade;
		if(avg>=90)  grade = 'A';
		else if(avg>=80) grade = 'B';
		else if(avg>=70) grade = 'C';
		else if(avg>=80) grade = 'D';
		else grade = 'F';
		 * 
		 */
		char grade;
		switch((int)avg/10) {
		case 10 : 
		case 9 : grade='A'; break; 
		case 8 : grade='B'; break;
		case 7 : grade='C'; break;
		case 6 : grade='D'; break;
		default : grade='F'; 
			
		}
		
		System.out.println("***"+name+"����***");
		System.out.println("����\t����\t����\t����\t���\t����");
		
		System.out.println(kr+"\t"+en+"\t"+m+"\t"+tot+"\t"+String.format("%.3f",avg)+"\t"+grade);
		
	}

}
