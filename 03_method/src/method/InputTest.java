package method;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputTest {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수 a : ");
		int a = Integer.parseInt(br.readLine());//= String a = br.readLin();
		System.out.println("실수 b : ");
		double b = Double.parseDouble(br.readLine());
		System.out.println(a+ "+"+b+"="+(a+b));
		
		
	
	}
}
