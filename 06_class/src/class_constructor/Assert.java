package class_constructor;

import java.util.Scanner;

public class Assert {
	private int x, y;
	
	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("x 입력 :");
		x = s.nextInt();
		
		System.out.print("y 입력 :");
		y = s.nextInt();
	}
	
	
	public void output() {
		//y는 반드시 양수만 입력받도록 하겠다.
		//assert y >= 0; 마우스 우 클릭하고 run as에서  run configurastion에서 Arguments에서 vm에 -da로 해놓으면
		//assert무시하고 실행 안하고 -ea로 해두면 실행함
		assert y >= 0 : "y는 0보다 크거나 같아야한다.";// 뒤에 ""여기부분은 경고문구로 들어간다
		
		int result = 1;
		for(int i = 1; i <= y ; i++) {
			result *= x;
		}
		System.out.println(x+"의 "+ y+ "승은 " + result);
	}
	public static void main(String[] args) {
		Assert a = new Assert();
		a.input();
		a.output();
		
		
	}
	
}

