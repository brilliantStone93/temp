package if_switch;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int days = 0;
		System.out.print("원하는 월 입력 : ");
		int month = Integer.parseInt(br.readLine());
		//숫자로 들어온 것은 parseInt는 가능하나 "a"와 같이 숫자형태가아닌게 들어오면 error난다
		
		switch(month) {
		case 1 : 
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :days = 31;
		         break;
		case 2 : days = 28; break;
		case 4 : 
		case 6 :
		case 9 :
		case 11 : days = 30; 
		          break;
		default : days=0;
		}//break; 없이 프로그램을 돌리게되면 마지막 값만 출력됨, break;는 앞에 문장과 다른 문장
		System.out.println(month + " 월은" + days + "일 입니다");
		
	}
}
