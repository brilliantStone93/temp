package day0910;

//사용자로부터 국어, 영어, 수학 점수를 입력받아서 
//총점을 계산해주는 프로그램
//단 사용자가 입력한 점수가 잘못된 형식(0보다 작거나 100보다 큰 경우)
//일 때에는 
//올바른 점수가 들어올 때 까지 
//다시 입력을 받는다.
//입력을 할 때에는 do while을 사용하도록 한다.



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex02DoWhile02 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int kor =0, eng=0, math=0;
		
		do {
			if(kor>100 ||kor <0) {
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println("국어 점수 :");
			kor = Integer.parseInt(br.readLine());
		}while(kor>100 ||kor <0 );
		
		do {
			if(eng>100 ||eng <0) {
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println("영어 점수 :");
			eng = Integer.parseInt(br.readLine());

		}while(eng>100 ||eng <0 );
		
		do {
			if(math>100 ||math <0) {
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println("수학 점수 :");
			math = Integer.parseInt(br.readLine());

		}while(math>100 ||math <0 );
		
		int tot = kor + eng + math;
		System.out.println("총점 :" + tot);
		
		
	}
}
