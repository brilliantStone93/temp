package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfTest3 {
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("a ���� : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("b ���� : ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("c ���� : ");
		int c = Integer.parseInt(br.readLine());
		
		if (a<b && a<c) { //a �� ���� �۴ٸ�
			if(b<c) {
				System.out.println(a+"\t"+b+"\t"+c);
			}
			else {
				System.out.println(a+"\t"+c+"\t"+b);
			}
		}
		else if(b<c){// a�� ���� ������ �ʰ� b�� �����۴ٸ�
			if(a<c) {
				System.out.println(b+"\t"+a+"\t"+c);
			}else {
				System.out.println(b+"\t"+c+"\t"+a);
			}
		}
		else {//c�� ���� �۴ٸ�
			if(a<c) {
				System.out.println(c+"\t"+a+"\t"+b);
			}else {
				System.out.println(c+"\t"+b+"\t"+a);
			}
		}

		
		
		
		}
	}

