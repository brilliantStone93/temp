package loop;

public class ForTest {
	public static void main(String[] args) {
//		for(반곡 횟수 지정) {
//	}	
		int i;
		for( i = 1; i<=10; i+=1) {
			System.out.println("hello kitty" + i);
		}//i는 앞의 중괄호 안에서만 존재 
		System.out.println("탈출 i = "+i);
		System.out.println();
		
		for(i = 10; i >0; i-=1) {
			System.out.println(i);
		}
		
		for(i='A'; i<='Z'; i++) {
			System.out.println((char)i);
		}
		
	}
}