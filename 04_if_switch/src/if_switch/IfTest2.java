package if_switch;

/*3����(a,b,c)�� ������ �Է¹޾Ƽ� �հ����� ���հ����� ����Ͻÿ�
�հ��� ����� 60�� �̻��̾�� �ϰ� �� ������ 40�� �̻��̾�� �Ѵ�

[������]
a : 98
b : 90
c : 85
�հ�

a : 98
b : 90
c : 35
�������� ���հ� 

a : 68
b : 50
c : 45
���հ� 
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class IfTest2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*3����(a,b,c)�� ������ �Է¹޾Ƽ� �հ����� ���հ����� ����Ͻÿ�
�հ��� ����� 60�� �̻��̾�� �ϰ� �� ������ 40�� �̻��̾�� �Ѵ�
*/
		System.out.println("a ���� : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("b ���� : ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("c ���� : ");
		int c = Integer.parseInt(br.readLine());
		
		int avr = (int)(a+b+c/3);
		
		//if(avr>=60 && a>=40 && b>=40 && c>=40)
		//	System.out.println("�հ�");
		///else
		//	System.out.println("���հ�");
		if(avr>=60) {
			if(a>=40 && b>=40 && c>=40) {
				System.out.println("�հ�");
			}else {
				System.out.println("�������� ���հ�");
			}
		}else {
				System.out.println("���հ�");
			}
		
		
		
	}
}
