package loop;

public class ForTest {
	public static void main(String[] args) {
//		for(�ݰ� Ƚ�� ����) {
//	}	
		int i;
		for( i = 1; i<=10; i+=1) {
			System.out.println("hello kitty" + i);
		}//i�� ���� �߰�ȣ �ȿ����� ���� 
		System.out.println("Ż�� i = "+i);
		System.out.println();
		
		for(i = 10; i >0; i-=1) {
			System.out.println(i);
		}
		
		for(i='A'; i<='Z'; i++) {
			System.out.println((char)i);
		}
		
	}
}