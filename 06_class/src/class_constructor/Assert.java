package class_constructor;

import java.util.Scanner;

public class Assert {
	private int x, y;
	
	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("x �Է� :");
		x = s.nextInt();
		
		System.out.print("y �Է� :");
		y = s.nextInt();
	}
	
	
	public void output() {
		//y�� �ݵ�� ����� �Է¹޵��� �ϰڴ�.
		//assert y >= 0; ���콺 �� Ŭ���ϰ� run as����  run configurastion���� Arguments���� vm�� -da�� �س�����
		//assert�����ϰ� ���� ���ϰ� -ea�� �صθ� ������
		assert y >= 0 : "y�� 0���� ũ�ų� ���ƾ��Ѵ�.";// �ڿ� ""����κ��� ������� ����
		
		int result = 1;
		for(int i = 1; i <= y ; i++) {
			result *= x;
		}
		System.out.println(x+"�� "+ y+ "���� " + result);
	}
	public static void main(String[] args) {
		Assert a = new Assert();
		a.input();
		a.output();
		
		
	}
	
}

