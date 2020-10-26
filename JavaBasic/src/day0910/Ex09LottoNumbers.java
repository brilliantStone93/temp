package day0910;

import java.util.Random;

// �ζǹ�ȣ ���۱�


public class Ex09LottoNumbers {
	//�ζ� ��ȣ�� 1~45���� 6���� ���ڰ� �ʿ��ϴϱ�
	//�츮�� �̸� ����� ����� ����
	
	//�ϵ��ڵ�
	//�ϵ��ڵ��̶� ������ �ڵ��̶� �����ν�
	//�ڵ��� ���̵��� ������ ���������� ��������� ������ �ڵ��� �ϵ��ڵ��̶���Ѵ�.
	
	final static int SIZE = 6;
	final static int MAX = 45;
	
	public static void main(String[] args) {
		//�ζ� ��ȣ�� ������ ��Ʈ�迭�� ���������
		int[] lottoNumbers = new int[SIZE];
		Random random = new Random();
		
		//for���� ���ؼ� ���� ���ڸ� ��	������ ���ʴ�� �־��
		for(int i = 0; i < lottoNumbers.length; i++) {
			//���� ������ nextInt() �޼ҵ��
			//��ȣ���� �ִ밪�� �������� �� �ִ�.
			//������ �ִ밪�� �־��ָ�
			//0���� �ִ밪 -1������ ���ڰ� ������ ������
			//���� 1���� �ִ밪������ �̾Ƴ��� ������
			//������ ������� 1�� �����ָ� �ȴ�.
						
			lottoNumbers[i] = random.nextInt(MAX)+1;//0~44������ ������ +1�Ͽ� 1~45���� �����߻�
		}
		//�迭�� �� ������ Ȯ���غ���
		System.out.println("���� ��������");
		for(int i = 0; i < lottoNumbers.length; i++) {
			System.out.println(lottoNumbers[i]);
		}
		//��������� �츮�� �ߺ����� ���Ű� �εǾ��ְ�
		//������ ���׹����̴�. ���� �ߺ����� �������ְ�
		//���ο� ���� �־��ְ� �׸��� ���������� ���ı��� ���־���Ѵ�.
		
		//�ߺ��̶�?
		//Ȯ���ϴ� �� �ε����� �ٸ�����
		//�ش� �ε����� ����Ǿ��ִ� ���� ���� ���� �ߺ��̶�� �Ѵ�.
		//���� : 5 13 2 13 4 8
		//�� ����Ǿ� �ִ� �ε�������
		//1��°�� 3��°�� �ε����� �ٸ�����
		//����� ���� �����Ƿ� �ߺ��̴�.
		
		//�츮�� ����for���� ����ؼ�
		//i��°�� j��°�� ���ؼ� ���� i�� j�� �ٸ�����
		//�׷��ٸ� �ߺ��̹Ƿ� i��°�� ���ο� ���� �־��ش�.
		
		for(int i = 0; i < SIZE; i ++) {
			for(int j = 0; j < SIZE; j++) {
				//i �� 0�϶�
				//j�� 0~5���� �˻��ؼ�
				//���� ���� ������
				//i��°�� ���ο� ���� �־��ְ�
				//i�� -1�� �ʱ�ȭ ���ش�.
				//�ֳ��ϸ� i�� -1�� �ʱ�ȭ���ְ� ����
				//����Ǵ� ��ɾ�� i++�̱� ������
				//i�� 0�� �ȴ�.
				//���� ó������ �ٽ� �˻簡 �ȴ�.
				
				//���� i�� j�� �ٸ�����
				//lottoNumbers[i]��lottoNumbers[j]�� ������ �ߺ��̶�� �Ѵ�.
				
				//18 23 29 5 45 45
				// j : 0
				// j : 1
				// lottoNumbers[i]: 18
				// lottoNumbers[j]: 18
				
				
				
				if(i != j && lottoNumbers[i]==lottoNumbers[j]) {
					lottoNumbers[i] = random.nextInt(MAX)+1;
					j = -1;
				}
			}
		}
		System.out.println("�ߺ����� ��");
		for(int i = 0; i < lottoNumbers.length;i++) {
			System.out.println(lottoNumbers[i]);
			}
		//������ �غ���
		//������ ���
		//i��°�� i+1���� ���� ũ��?
		//2���� ��ġ�� �ٲ��ָ� �ȴ�.
		//�ٲٰ� ������ i�� -1�� �ʱ�ȭ�ϸ�
		//i++������
		//i�� 0���� �ٽ� �˻��Ѵ�.
		//18 23 29 5  23 45
		//i�� 0�϶�
		//lottoNumber[i]:18
		//lottoNumber[i+1]:23
		
		// ���α׷����� �� ���� �� ���� ��ȯ�Ϸ��� ��� �ؾ��ұ�?
		// int a=  5;
		// int b = 6; 
		// int temp = a;
		// a = b;
		// b = a;
		// ������ �ϳ� �����ؼ� �ӽ� �����ؾ��մϴ�.
		
		for(int i = 0; i < lottoNumbers.length-1; i++) {
			if(lottoNumbers[i] > lottoNumbers[i+1]) {
				int temp = lottoNumbers[i];
				lottoNumbers[i]= lottoNumbers[i+1];
				lottoNumbers[i+1] = temp;
				i=-1; //
			}
		}
		System.out.println("���� �� ");
		for(int i = 0; i < lottoNumbers.length;i++) {
			System.out.println(lottoNumbers[i]);
			}
	}
}
