package loop;


/*
���ϱ� ���� ���α׷�
10~99 ������ ������ 2��(a, b) �߻��Ͽ� ���� ���ϴ� ���α׷�
�������� �� 5������ �����Ѵ� - for
1������ ���� 20���� ���

[������]
[1] 25 + 36 = 45
Ʋ�ȴ�

[2] 78 + 10 = 88
������
...

[5] 12 + 25 = 37
������

����� �� x������ ���߾ xx�� �Դϴ�

���ҷ�(Y/N) : n
���α׷��� �����մϴ�

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		int result;
		int correct = 0;
		//String choice;
		int yn;
		while(true) {
			for(int i = 1; i<=5;i++) {
				a = (int)(Math.random()*88)+10;
				//System.out.println(a);
				b = (int)(Math.random()*88)+10;
				System.out.print("["+i+"]"+a+"+"+b+"=");
				result = Integer.parseInt(br.readLine());
				if(result==a+b) { System.out.println("������"); correct++;}
				else if(result != a+b)System.out.println("Ʋ�ȴ�");
			}
			int score = correct*20;
			System.out.println("����� ��"+correct+"������ ���缭"+score+"�� �Դϴ�.");
			//System.out.print("�� �ҷ� (Y/N) : ");
			//choice = br.readLine();
			//if(choice.equals("n")||choice.equals("N")) break;
			while(true) {
				System.out.print("�� �ҷ� (Y/N) : ");
				yn = br.read();
				br.read();
				br.read();
				if(yn=='Y'||yn=='y'||yn=='N'||yn=='n') break;
			}
			if(yn=='N'||yn=='n') break;
		
		}
		System.out.println("���α׷� �����մϴ�");
		
	}
}
