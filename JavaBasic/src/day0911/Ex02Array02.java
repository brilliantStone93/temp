package day0911;
//Ex01 ���׷��̵� ����
//�������� �ƴ϶�
//������ ������ �����ϴ� 
//���ѷ��� ���α׷��� �ۼ��Ͻÿ�(20�б���)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���� 1. ó�� �Է½ÿ��� for �ݺ����� ����ؼ� 5���� �� �Է��Ѵ�.
//���� 2. �Է��Ŀ��� ���ѷ����� ���ؼ� ���� ������� �л��� �̸��� ���� ���� ��ո� ���� �ְ� �Ѵ�.
//���� ���� ���� �л��� �̸��� ����, ����, ��ո� ���� �ְ� �Ѵ�.
//����:
//���� ���� �л��� ��ȣ�� �Է��ϼ���: (1�Է�)
//1�� �趯�� �л�
//����: 80�� ����: 80�� ����: 81��
//����: 241�� ���: 80.33��
//���� ���� �л��� ��ȣ�� �Է��ϼ���: (20000 �Է�)
//�߸��Է��ϼ̽��ϴ�.
//���� ���� �л��� ��ȣ�� �Է��ϼ���: (2�Է�)
//2�� �ֵ��� �л�
//����: 70�� ����: 69�� ����: 68��
//����: 207�� ���: 69��
//���� ���� �л��� ������ �Է��ϼ���: (-1�Է�)
//������ּż� �����մϴ�.

public class Ex02Array02 {
	
	static final int SIZE = 5;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] name = new String[SIZE];
		int [] kor = new int[SIZE];
		int [] eng = new int[SIZE];
		int [] math = new int[SIZE];
		int [] sum = new int[SIZE];
		double [] avg = new double[SIZE];
		for(int i = 0; i <SIZE; i++) {
			System.out.print("�л� �̸� : ");
			name [i] = br.readLine();
			System.out.print("���� ���� : ");
			kor [i] = Integer.parseInt(br.readLine());
			while(kor[i]<0||kor[i]>100) {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				System.out.print("���� ���� : ");
				kor [i] = Integer.parseInt(br.readLine());
			}
			System.out.print("���� ���� : ");
			eng [i] = Integer.parseInt(br.readLine());
			while(eng[i]<0||eng[i]>100) {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				System.out.print("���� ���� : ");
				eng [i] = Integer.parseInt(br.readLine());
			}
			
			System.out.print("���� ���� : ");
			math [i] = Integer.parseInt(br.readLine());
			while(math[i]<0||math[i]>100) {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				System.out.print("���� ���� : ");
				math [i] = Integer.parseInt(br.readLine());
			}
			
			sum[i] = kor[i]+eng[i]+math[i];
			avg [i] = (double)sum[i]/3;
		}

		//���� 2. �Է��Ŀ��� ���ѷ����� ���ؼ� ���� ������� �л��� �̸��� ���� ���� ��ո� ���� �ְ� �Ѵ�.
		//����:
		//���� ���� �л��� ��ȣ�� �Է��ϼ���: (1�Է�)
		//1�� �趯�� �л�
		//����: 80�� ����: 80�� ����: 81��
		//����: 241�� ���: 80.33��
		//���� ���� �л��� ��ȣ�� �Է��ϼ���: (20000 �Է�)
		//�߸��Է��ϼ̽��ϴ�.
		while(true) {
			System.out.print("������� �л��� ��ȣ�� �Է��ϼ���");
			int number = Integer.parseInt(br.readLine())-1;
			if(number>=0 && number<=4) {
				System.out.println((number+1)+"��"+name[number]+"�л�");
				System.out.println("����"+ kor[number]+"���� : "+eng[number]+"����: "+math[number]);
				System.out.println("����: "+sum[number]+"��� : "+String.format("%.2f", avg[number]));
			}else if(number == -2) {System.out.println("������ּż� �����մϴ�."); break;
			}else System.out.println("�߸��Է��ϼ̽��ϴ�.");
			
		}
		
	}
}
