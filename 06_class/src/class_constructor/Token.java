package class_constructor;

import java.util.StringTokenizer;

public class Token {
	
	
	public static void main(String[] args) {
		String str = "�п�, ��,,���ӹ�";
		
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println("��ū ����="+st.countTokens());
		
		while(st.hasMoreTokens()) {//true / false
			System.out.println(st.nextToken());
			
			
		}
		
		System.out.println("-------------------------");
		
		String[] ar = str.split(",");
		
		for(String data : ar) {
			System.out.println(data);
		}
	}//main
}//
