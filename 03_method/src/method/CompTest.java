package method;

public class CompTest {
	
	public int sub(int a, int b){
		return a-b;
	}
	
	public static void main(String[] args) {
		int score = 85;
		
		
		String result = score>= 80 && score<=100 ? "합격" : "불합격";
		System.out.println("결과 = " + result);
		System.out.println();
		
		//score의 값이 짝수(2로 나눈 나머지가 0이면) "짝수"  아니면 "홀수"
		int score2 = 80;
		result = score2%2==0 ? "짝수" : "홀수";
		
		System.out.println("결과 = " + result);
		System.out.println();
		
		// a, b중에서 큰 값이 출력하시오
		int a=26, b= 125;
		int big = a > b ? a : b;
		System.out.println("결과 = " + big);
		
		System.out.println(" 큰 값 = " + Math.max(a, b));
		System.out.println(" 최소 값 = " + Math.min(a, b));
		System.out.println("제곱 = " + Math.pow(2.0, 5.0));
		double p = Math.pow(2.0, 5.0);
		
		
		System.out.println("제곱 = "+ p);
		System.out.println();
		
		//
		int c = 15;
		result = c%2==0 && c%3==0 ? "2와 3의 곰배수": "2와 3의 공배수가 아니다";
		System.out.println("결과 = " + result);
		System.out.println();
		
		
		
		
		
		
		
	}

}
