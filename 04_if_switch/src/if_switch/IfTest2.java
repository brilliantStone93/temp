package if_switch;

/*3과목(a,b,c)의 점수를 입력받아서 합격인지 불합격인지 출력하시오
합격은 평균이 60점 이상이어야 하고 각 과목이 40점 이상이어야 한다

[실행결과]
a : 98
b : 90
c : 85
합격

a : 98
b : 90
c : 35
과락으로 불합격 

a : 68
b : 50
c : 45
불합격 
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class IfTest2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*3과목(a,b,c)의 점수를 입력받아서 합격인지 불합격인지 출력하시오
합격은 평균이 60점 이상이어야 하고 각 과목이 40점 이상이어야 한다
*/
		System.out.println("a 점수 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("b 점수 : ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("c 점수 : ");
		int c = Integer.parseInt(br.readLine());
		
		int avr = (int)(a+b+c/3);
		
		//if(avr>=60 && a>=40 && b>=40 && c>=40)
		//	System.out.println("합격");
		///else
		//	System.out.println("불합격");
		if(avr>=60) {
			if(a>=40 && b>=40 && c>=40) {
				System.out.println("합격");
			}else {
				System.out.println("과락으로 불합격");
			}
		}else {
				System.out.println("불합격");
			}
		
		
		
	}
}
