package exception;

import java.util.Scanner;

public class ExceptionTest {
	
	
	
	public static void main(String[] args) {
		//main(String[] args)�� args�迭�� �̿��ϴ� ��� => �� ���콺 Ŭ�� => run as => run configuration => arguments => program arguments�� �Է� 

		System.out.println(args[0]);//���� �ȳ־��ְ� ������ java.lang.ArrayIndexOutOfBoundsException �ش� ������ �߻��Ѵ�
									// �̷��� ������ �����(������)�� �Ǽ��� ���α׷����� ���ƾ��Ѵ�./throws�� try catch����ϴ� ���� �ƴ϶�
									//���� ��) if(args.length>0)System.out.println(args[0]);�� �ٿ��ָ��
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("�����Է� : ");
			int num2 = scan.nextInt();
			
			int num1 = Integer.parseInt(args[0]);
			
			System.out.println(num1 + "/" + num2 + "=" +((double)num1/num2) );
		}catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���");//���� ��� ȣ���� ���� String�� ���� numberformatException�߻� �̿� ���� try~catch ���� ó��
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ �����ϴ�");//0���� ���ڸ� ���� �� ���� �߻��ϴ� ����ó��, ���� �����⿡ double�� ����ȯ���ְ� 0���� ������ infinity�� ����
		}finally {
			System.out.println("error�� �ְ� ���� ������ ����!!");//error�� �ְ� ���� �����Ű�� finally!, dbó���Ҷ� 100���� ����ϴϱ� �˰�� ����
		}
		
		
		
		
	}//main
}//
