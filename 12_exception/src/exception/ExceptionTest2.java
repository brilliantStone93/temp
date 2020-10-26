package exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExceptionTest2 {
	private int dan;
	
	private void input() throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("원하는 단을 입력 : ");
		dan = Integer.parseInt(br.readLine());
				
	}
	
	private void output() {
		if(dan >= 2 && dan <= 9) {
		
			for(int i  = 1; i < 10; i++) {
				int result = dan * i;
				System.out.println(dan+" * "+i+" = "+result);
				
			}
			
		}else {
			//System.out.println("범위 초과");
			
			try {
				//강제로 Exception 발생
				//throw new Exception();// throws는 에러를 잡고 throw는 에러를 발생시킨다
				throw new MakeException("범위 초과");//MakeException클래스에서 정의해줌
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException  {
		ExceptionTest2 e = new ExceptionTest2();
		e.input();
		e.output();
		
	}
	//상속하여 받은 메소드 오바라이드 된 후 throws는 사용할 수 없다 왜냐하면 부모와 자식이 같은 형태를 갖고있어야하기 때문
	
	
	
}
