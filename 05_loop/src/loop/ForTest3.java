package loop;

/*
대문자(A~Z)를 무작위로 100개를 발생하여 1줄에 10개씩 출력하시오
이중에서 A가 몇개인지 출력하시오

[실행결과]
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

A의 개수 = 6
 */



public class ForTest3 {
	public static void main(String[] args) {
		
		int r;
		int a =0;
		for(int i = 1; i <= 100; i++) {
			 r = (int)(Math.random()*('Z'-'A'+1)+'A');
			//System.out.print(i+" "+(char)r+" ");
			//System.out.printf("%3c", (char)r); 글자간 간격을 넣어줄때 사용하는 방법	오른쪽정렬 밑에는 왼쪽정렬
			System.out.printf("%-3c", (char)r);
			
			if(i%10==0) System.out.println();//한줄에 10개씩 찍고 다음줄로 변경
			if(r=='A') a++;// a = a+1; 
			
		}
		System.out.println("A의 갯 수 : " + a );	
		
		
	}
}
