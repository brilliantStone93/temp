package method;

/*
ch에 있는 데이터가 대문자이면 소문자로 출력하고 아니면(소문자) 대문자로 출력하시오
A 65 Z 90
a 97 z 122

[실행결과]
T → t

또는

e → E
 
 */


public class CompTest2 {
	
	public int sum(int a, int b){
		return a+b;
	}
	public int sub(int a, int b){
		return a-b;
	}
	public static void main(String[] args) {
		int ch = 'B';
		CompTest2 c = new CompTest2();
		
		int result = ch>= 65 && ch<=90 ? c.sum(ch, 32) : c.sub(ch, 32);
		
		
		System.out.println((char)ch+" → " + (char)result);
		
		//기본형 객체 는 서로 형변환 안됨
	}
}
