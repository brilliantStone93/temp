package day0910;
//다중 for 문
public class Ex03NestedFor {
	public static void main(String[] args) {
		for(int i = 0 ; i <=5; i++) {
			// i의 현재값 :0
			// i<=5 :true
			//스트링을 초기화 해주는 방법
			//
			
			for(int j = 10 ; j<=12; j++) {
				//j의 현재값 : 10
				//j<=12:true
				
				System.out.println("i:" + i + ", j:" + j );
			}
			
			System.out.println("i for 문 종료");
		}
	}
}
