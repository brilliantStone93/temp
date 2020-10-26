package day0911;
//Ex01 업그레이드 버전
//총점ㄴ이 아니라
//국영수 점수를 관리하는 
//무한루프 프로그램을 작성하시오(20분까지)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//조건 1. 처음 입력시에는 for 반복문을 사용해서 5명을 다 입력한다.
//조건 2. 입력후에는 무한루프를 통해서 내가 보고싶은 학생의 이름과 점수 총점 평균만 볼수 있게 한다.
//내가 보고 싶은 학생의 이름과 점수, 총점, 평균만 볼수 있게 한다.
//예시:
//보고 싶은 학생의 번호를 입력하세요: (1입력)
//1번 김땡땡 학생
//국어: 80점 영어: 80점 수학: 81점
//총점: 241점 평균: 80.33점
//보고 싶은 학생의 번호를 입력하세요: (20000 입력)
//잘못입력하셨습니다.
//보고 싶은 학생의 번호를 입력하세요: (2입력)
//2번 최동동 학생
//국어: 70점 영어: 69점 수학: 68점
//총점: 207점 평균: 69점
//보고 싶은 학생의 점수를 입력하세요: (-1입력)
//사용해주셔서 감사합니다.

public class Ex02Array02 {
	
	static final int SIZE = 5;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] name = new String[SIZE];
		int [] kor = new int[SIZE];
		int [] eng = new int[SIZE];
		int [] math = new int[SIZE];
		int [] sum = new int[SIZE];
		double [] avg = new double[SIZE];
		for(int i = 0; i <SIZE; i++) {
			System.out.print("학생 이름 : ");
			name [i] = br.readLine();
			System.out.print("국어 점수 : ");
			kor [i] = Integer.parseInt(br.readLine());
			while(kor[i]<0||kor[i]>100) {
				System.out.println("잘못입력하셨습니다");
				System.out.print("국어 점수 : ");
				kor [i] = Integer.parseInt(br.readLine());
			}
			System.out.print("영어 점수 : ");
			eng [i] = Integer.parseInt(br.readLine());
			while(eng[i]<0||eng[i]>100) {
				System.out.println("잘못입력하셨습니다");
				System.out.print("국어 점수 : ");
				eng [i] = Integer.parseInt(br.readLine());
			}
			
			System.out.print("수학 점수 : ");
			math [i] = Integer.parseInt(br.readLine());
			while(math[i]<0||math[i]>100) {
				System.out.println("잘못입력하셨습니다");
				System.out.print("국어 점수 : ");
				math [i] = Integer.parseInt(br.readLine());
			}
			
			sum[i] = kor[i]+eng[i]+math[i];
			avg [i] = (double)sum[i]/3;
		}

		//조건 2. 입력후에는 무한루프를 통해서 내가 보고싶은 학생의 이름과 점수 총점 평균만 볼수 있게 한다.
		//예시:
		//보고 싶은 학생의 번호를 입력하세요: (1입력)
		//1번 김땡땡 학생
		//국어: 80점 영어: 80점 수학: 81점
		//총점: 241점 평균: 80.33점
		//보고 싶은 학생의 번호를 입력하세요: (20000 입력)
		//잘못입력하셨습니다.
		while(true) {
			System.out.print("보고싶은 학생의 번호를 입력하세요");
			int number = Integer.parseInt(br.readLine())-1;
			if(number>=0 && number<=4) {
				System.out.println((number+1)+"번"+name[number]+"학생");
				System.out.println("국어"+ kor[number]+"영어 : "+eng[number]+"수학: "+math[number]);
				System.out.println("총점: "+sum[number]+"평균 : "+String.format("%.2f", avg[number]));
			}else if(number == -2) {System.out.println("사용해주셔서 감사합니다."); break;
			}else System.out.println("잘못입력하셨습니다.");
			
		}
		
	}
}
