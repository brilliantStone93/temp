package loop;

/*
�빮��(A~Z)�� �������� 100���� �߻��Ͽ� 1�ٿ� 10���� ����Ͻÿ�
���߿��� A�� ����� ����Ͻÿ�

[������]
H  D  D  R  A  Y  A  K  T  H
C  X  F  Z  B  S  L  Y  Q  D
H  K  O  H  O  B  Z  N  J  T
U  P  A  P  K  Q  G  W  F  A
S  U  D  Z  I  V  J  U  O  G
L  M  Z  L  H  U  Y  D  Q  R
F  T  I  Z  A  W  E  O  F  Z
A  Y  C  I  U  Z  O  B  C  G
H  G  Y  Z  V  P  I  R  L  G
Y  H  R  R  M  H  Y  S  B  P

A�� ���� = 6
 */



public class ForTest3 {
	public static void main(String[] args) {
		
		int r;
		int a =0;
		for(int i = 1; i <= 100; i++) {
			 r = (int)(Math.random()*('Z'-'A'+1)+'A');
			//System.out.print(i+" "+(char)r+" ");
			//System.out.printf("%3c", (char)r); ���ڰ� ������ �־��ٶ� ����ϴ� ���	���������� �ؿ��� ��������
			System.out.printf("%-3c", (char)r);
			
			if(i%10==0) System.out.println();//���ٿ� 10���� ��� �����ٷ� ����
			if(r=='A') a++;// a = a+1; 
			
		}
		System.out.println("A�� �� �� : " + a );	
		
		
	}
}