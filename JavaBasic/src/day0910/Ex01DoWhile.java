package day0910;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01DoWhile {
	public static void main(String[] args) throws IOException{
		int number = 5;
		while(number>5) {
			System.out.println("�ݺ��� �ɱ��?");//�ȵȴ� �ֳ��ϸ� ������ Ʋ�ȱ� ����
			
		}
		//�׿� ���ؼ� do while�� ������ �ѹ��� ������ �ȴ�.
		do {
//			System.out.println("�ݺ��� �ɱ��?");
			
		}while(number>5);
		
		// ����ڷκ��� ���ڸ� �Է� �޵�
		//10���� ū �� �� ������ �ٽ� �Է��ϵ��� ������
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		//while�� ����ϸ� ������ ���� �ڵ带 �������Ѵ�.
		System.out.println("���ڸ� �Է��ϼ���: ");
		String number2 = br.readLine();
		int stringToInt = Integer.parseInt(number2);
		
		while(stringToInt > 10) {
			//���� ����ڰ� 10���� �۰ų� ���� ���� �Է��Ѵٸ�
			//stringToInt>10��false�� ������ ������
			//�� whlie���� ������ ���� �ʴ´�.
			System.out.println("�ٽ� �Է����ּ���.");
			number2 = br.readLine();
			stringToInt = Integer.parseInt(number2);
		}
		System.out.println("����ڰ� �Է��� �� : "+ number2);
		
		//do while�� ���� ����� �� �� �ִ�.
		int userNumber = 0;
		do { 
			System.out.println("���ڸ� �Է����ּ��� : ");
			userNumber = Integer.parseInt(br.readLine());
			
		}while(userNumber > 10 );
		System.out.println("userNumber : "+ userNumber);
		
		
	}
}
