package day0910;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�� ������ �ٽ� �ѹ� �ĺ��ô�.
public class Ex04DoWhile03 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//���� ���߱� ����
		//����whlie�� ��쿡��
		//whlie ���� ���ǽ��� false�� ������
		//�ݺ��� �ߴܵǰ�
		//true�� ������ �ݺ��Ǵ� �����̾���.
		System.out.println("���ڸ� �ϳ� �Է����ּ��� :");
		int number = Integer.parseInt(br.readLine());
		while(number<0) {
			System.out.println("�ڿ����� �Է����ּ���.");
			System.out.println("���ڸ� �ϳ� �Է����ּ��� : ");
			number = Integer.parseInt(br.readLine());
		}
		//��while���� ��� ����ڰ� ��ó����  0���� ũ�ų� ���� ���� �Է��ϸ� number<0�̶�� ���ǽ��� 
		//false�� �����Ƿ� �ݺ��� ���� �ʰ� �ȴ�.
		System.out.println("����ڰ� �Է��� ����:"+number);
		
		//�׿� ���ؼ� do while ����������
		//������ �ѹ��� ������ �ȴ�.
		do {
			System.out.println("�� ���� ù��° ��");
			
		}while(number<0);
		
	}
}
