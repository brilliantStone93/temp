package loop;

public class WhileTest2 {
	public static void main(String[] args) {
		char ch = 'A';
		int count = 0;
		
		while(true) {
			
			System.out.print(ch++ + "  ");
			count++;
			if(count%7==0) System.out.println();
			if(ch == 'Z'+1) break;
		}
	}
}
