package class_constructor;

public class StringTest {
	
	
	
	public static void main(String[] args) {
		String a = "apple";//���ڿ� literal ������ �� String�� ���� 
		String b = "apple";
		if(a==b) System.out.println("a�� b�� �������� ����");
		else System.out.println("a�� b�� �������� �ٸ���");
		
		if(a.equals(b)) System.out.println("a�� b�� �������� ����");
		else System.out.println("a��b�� �������� �ٸ���");
		System.out.println();
		
		String c = new String("apple");
		String d = new String("apple");
		if(c==d) System.out.println("d�� c�� �������� ����");
		else System.out.println("c�� d�� �������� �ٸ���");
		
		if(c.equals(d)) System.out.println("d�� c�� �������� ����");
		else System.out.println("c�� d�� �������� �ٸ���");
		System.out.println();
		
		String e = "���� ��¥��"+2020+9+25;
		System.out.println("e = "+e);
		
		
		System.out.println("���ڿ� ũ�� = "+e.length());
		
		for(int i = 0 ; i <e.length(); i++) {
			System.out.println(e.charAt(i));
		}
		System.out.println();
		
		System.out.println("�κ� ���ڿ� ���� = "+e.substring(7));
		System.out.println("�κ� ���ڿ� ���� = "+e.substring(7,11));
		
		System.out.println("�빮�� ���� = "+"Hello".toUpperCase());
		System.out.println("�ҹ��� ���� = "+"Hello".toLowerCase());
		
		System.out.println("���ڿ� �˻�="+e.indexOf("¥"));
		System.out.println("���ڿ� �˻�="+e.indexOf("��¥"));
		System.out.println("���ڿ� �˻�="+e.indexOf("���ٺ�"));
		
		
	}//main
}//
