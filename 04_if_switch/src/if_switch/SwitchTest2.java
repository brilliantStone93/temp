package if_switch;
//2���� ������ ���ڿ� ������(+,-,*,/)�� �Է��Ͽ� ����Ͻÿ�
//
//[������]
//a �Է� : 25
//b �Է� : 36
//������(+,-,*,/) �Է� : +(op)
//25 + 36 = xx
//
//a �Է� : 25
//b �Է� : 36
//������(+,-,*,/) �Է� : /
//25 / 36 = 0.xxx
//
//a �Է� : 25
//b �Է� : 36
//������(+,-,*,/) �Է� : $
//������ error

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class SwitchTest2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("���� a : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("���� b : ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("������ : ");
		String op = br.readLine();
		System.out.println();
		
		
		switch(op) {
		case "+" : System.out.println(a+"+"+b+"="+(a+b));//int sum = a + b;
					break;
		case "-" : System.out.println(a+"-"+b+"="+(a-b));//int p = a - b;
					break;
		case "*" : System.out.println(a+"*"+b+"="+(a*b));//int mul = a*b;
					break;
		case "/" : System.out.println(a+"/"+b+"="+String.format("%.3f",(double)a/b));//int div = a/b;
					break;
		default : System.out.println("������ error");
					System.exit(0);//���α׷� ���� ����
		}
		
		
		
		
		
		
			
		
		
	}
}
