package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfTest3 {
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("a 점수 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("b 점수 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("c 점수 : ");
		int c = Integer.parseInt(br.readLine());
		
		if (a<b && a<c) { //a 가 가장 작다면
			if(b<c) {
				System.out.println(a+"\t"+b+"\t"+c);
			}
			else {
				System.out.println(a+"\t"+c+"\t"+b);
			}
		}
		else if(b<c){// a가 가장 작지를 않고 b가 가장작다면
			if(a<c) {
				System.out.println(b+"\t"+a+"\t"+c);
			}else {
				System.out.println(b+"\t"+c+"\t"+a);
			}
		}
		else {//c가 가장 작다면
			if(a<c) {
				System.out.println(c+"\t"+a+"\t"+b);
			}else {
				System.out.println(c+"\t"+b+"\t"+a);
			}
		}

		
		
		
		}
	}

