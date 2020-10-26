package method;

/*
 이름(name), 국어(kor), 영어(eng), 수학(math)점수를 입력받아서 총점(tot),평균(avg)를 구하시오

총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수

[실행결과]
이름 입력 : 홍길동
국어 입력 : 95
영어 입력 : 90
수학 입력 : 91

   *** 홍길동 성적 ***
국어      영어      수학      총점      평균
95      90      91      xxx      xx.xxx
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class SungJuk {
	public static void main (String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));//생성
//키보드입력값은 buffer라는 임시기억장소를 통해 자바로 들어오는 것 그래서 위의 길을 닦아주는 작업이 필요		
		System.out.println("***성적을 입력해주세요***");
		
		System.out.print("이름? ");
		String name = br.readLine();
		System.out.print("국어? ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어? ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학? ");
		int math = Integer.parseInt(br.readLine());
		int sum = kor+eng+math;
		double div = (double)sum/3;		
		
		System.out.println("***"+name+"성적***");
		System.out.println("국어"+kor+"영어"+eng+"수학"+math+"총점"+sum+"평균"+String.format("%.3f",div));
		
	}
}
