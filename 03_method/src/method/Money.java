package method;

/*
 금액(money)이 5679원일때 다음과 같이 출력하시오
[실행결과]
금액 : 5679원
천원 : 5장
백원 : 6개
십원 : 7개
일원 : 9개 
(%나머지 연산자로 풀어주세요)
 */
public class Money {
	public static void main(String[] args) {
		int money = 5679;
		int a = money%10000 - money%1000;
		int b = money%1000 - money%100;
		int c = money%100 - money%10;
		int d = money%10;
		
		System.out.println("금액 : "+ money+ "원");
		System.out.println("천원 : "+ a/1000+ "장");
		System.out.println("백원 : "+ b/100+ "개");
		System.out.println("십원 : "+ c/10+ "개");
		System.out.println("일원 : "+ d+ "개");
	}

}
