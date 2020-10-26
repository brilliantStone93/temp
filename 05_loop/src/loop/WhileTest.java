package loop;

public class WhileTest {
	public static void main(String[] args) {
		
//		int a = 0;
//		while(a<=10) {// 무한로프가된다 왜냐면 a에 +값이 없어 10에 도달할 수 가 없어서 계속 반복
//			
//			System.out.println(a+"  ");
//		}//while
		
//		int a = 0;
//		while(a<10) {
//			a++; //증가연산자 추가하면 1~11까지 찍힘  해서 while(a<=10)에서 =을 빼주면 10까지나옴
//			System.out.print(a+"  ");
//		}//while
		
//		int a = 0;
//		while(true) {//무한루프
//			a++; // 1, 2, 3, 4,.....
//			System.out.print(a+"  ");
//			
//			if(a==10) break;// while를 벗어나라
//		}//while
		
		int a = 0;
		while(a<10) {
			//a++; 
			//System.out.print(a+"  ");
			// 위 두대의 식을 합친 것이 아래의 식
			System.out.print(++a+"  ");
		}//while
		
		
	}
}
