package method;

public class Operator2 {
	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a= "+a); //a=false
		System.out.println("!a = "+ !a); //a=true
		System.out.println();
		
		String b = "apple";// literal ������ ����
		String c = new String("apple"); // ����
		
		String result = b ==c ? "����" : "�ٸ���"; //�ּ�
		System.out.println("b==c: "+ result);
		
		result = b !=c ? "��" : "����"; //�ּ�
		System.out.println("b != c : "+ result);
		System.out.println();
		
		
		result = b.equals(c) ? "����" : "�ٸ���"; //���ڿ�
		System.out.println("b.equals(c) : "+ result);
		result = !b.equals(c) ? "��" : "����"; //���ڿ�
		System.out.println("!b.equals(c) : "+ result);
		
		
		
		
	}
}
