package class_constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBufferTest {
	private int dan;
	private BufferedReader br ;
	public StringBufferTest() throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("원하는 단 입력: ");
		dan = Integer.parseInt(br.readLine());
		
	}
	
	public  void disp() throws NumberFormatException, IOException{
		StringBuffer buffer = new StringBuffer();
		
		
		
		
		for(int i = 1 ; i < 10 ; i++) {
			//System.out.println(dan+("x")+i+"="+dan*i);
			
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			System.out.println(buffer);
			
			buffer.delete(0, buffer.length());
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBufferTest st = new StringBufferTest();
		st.disp();
		
	}
}
