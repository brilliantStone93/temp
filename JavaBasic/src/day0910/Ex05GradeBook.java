package day0910;

//�������� ���α׷�
//�츮�� ����ڷκ��� �Է��� �޵�
//���� �������� ����ڷκ��� ������� ������ �Է� �޾Ƽ�
//���� ����ڰ� ���Ḧ �����ϸ� ���α׷��� ���ᰡ �Ǵ� �������� ������

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05GradeBook {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String yn = new String();
		
		do {
			System.out.print("�̸� : ");
			String name = br.readLine();
			
			System.out.println("���� : ");
			int korean = Integer.parseInt(br.readLine());
			
			System.out.println("���� : ");
			int english = Integer.parseInt(br.readLine());
			
			System.out.println("���� : ");
			int math = Integer.parseInt(br.readLine());
			
			int sum = korean + english + math;
			System.out.println("����  : " + sum);
			
			System.out.println("����Ͻðڽ��ϱ�? (y/n)");
			yn = br.readLine().toUpperCase();
			//toUpperCase()�޼ҵ�� 
			//�ش� ������ ��� �빮�ڷ� �ٲ��ִ� �޼ҵ� �̴�.

		}while(yn.equals("Y"));
		
	}
}
