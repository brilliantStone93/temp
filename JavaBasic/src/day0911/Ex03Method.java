package day0911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�޼ҵ�
//�޼ҵ�� �ش� Ŭ����
// �츮�� �޼ҵ���

//�츮�� ���нð���
//f(x) = 3x;
// �츮�� �ִ� ���ڿ� 3�� ������ ���� ����� ������ �ȴ�.

//�ڹ��� �޼ҵ嵵 ��������
//�츮�� � Ÿ���� ���� �������� �����ְ�
//�װ��� ���ؼ� � ����� ������ ������ �����ְ�
// �װ������ ȣ��� ������ ������ �ڷ����� �����ָ� �ȴ�.


//�޼ҵ带 �����غ���
//�޼ҵ带 ������ ������
//����Ÿ�� �޼ҵ��̸�(�Ķ����)
//�μ����Ҽ��ִ�.

//����Ÿ�� : �ش� �޼ҵ尡 ȣ��� ������ ������ ���� ������ Ÿ��
//        ���� ȣ��� ������ ������ ���� �ִ� ��쿡�� �޼ҵ� ���ο��� �ݵ��!!! return �̶�� ��ɾ ���ؼ� ���� �ǵ��� ����Ѵ�!
//		    ���� �ƹ��� ���� �������� ���� ���̶�� ���� Ÿ���� void�� �ȴ�.
//�޼ҵ� �̸� : �ҹ��ڷ� �����ϴ� ����(��Ÿ�� ǥ���)
//�Ķ���� : �ش� �޼ҵ尡 �����Ҷ� �ʿ�� �ϴ� �ܺ��� ��. �޼ҵ� ���ο��� ����ó�� ���̱� ������ �Ű�������� �Ѵ�.
public class Ex03Method {
	//����ڷκ��� ���� 2���� �޾Ƽ� �� ���� �����ִ� �޼ҵ�
	static int add(int a, int b) {//���⼭  a, b�� �Ķ���Ͷ�� �Ѵ�
		int sum = a+b;
		return sum;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int userNumber1 = 10;
		int userNumber2 = 150;
		
		int result = add(userNumber1, userNumber2);
		System.out.println("result : "+result);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("����");
		int korean = validateScore(br);
		System.out.println("����");
		int english = validateScore(br);
		System.out.println("����");
		int math = validateScore(br);
		
		int sum = korean + english + math;
	}
	//����ڷκ��� ���ڸ� �Է¹޾Ƽ�
	//���� �ش� ���ڰ� 0~100�� ������ �����
	//�ٽ� �Է��� �ϰ� ����
	//�������� ���ڰ� �Էµ������� �� ���ڸ� return�ϴ� �޼ҵ�

	static int validateScore(BufferedReader br) throws NumberFormatException, IOException {
		System.out.print("���� �Է����ּ���:");
		int score = Integer.parseInt(br.readLine());
		while(score<0||score>100) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			System.out.println("������ �Է����ּ���:");
			score = Integer.parseInt(br.readLine());
		}
		return score;
	}
}
