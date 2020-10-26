package method;

public class Operator2 {
	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a= "+a); //a=false
		System.out.println("!a = "+ !a); //a=true
		System.out.println();
		
		String b = "apple";// literal 생성이 가능
		String c = new String("apple"); // 생성
		
		String result = b ==c ? "같다" : "다르다"; //주소
		System.out.println("b==c: "+ result);
		
		result = b !=c ? "참" : "거짓"; //주소
		System.out.println("b != c : "+ result);
		System.out.println();
		
		
		result = b.equals(c) ? "같다" : "다르다"; //문자열
		System.out.println("b.equals(c) : "+ result);
		result = !b.equals(c) ? "참" : "거짓"; //문자열
		System.out.println("!b.equals(c) : "+ result);
		
		
		
		
	}
}
