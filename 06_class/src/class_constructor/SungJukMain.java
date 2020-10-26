 package class_constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 클래스명 : SungJuk
// 필드      : name, kor, eng, math, tot, avg, grade
// 메소드   : 생성자 
//         calc() - 총점, 평균, 학점 계산
//         getName()
//       getKor()
//       getEng()
//       getMath()
//       getTot()
//       getAvg()
//       getGrade()
//       
// [실행결과]
// ----------------------------------------------------
// 이름      국어      영어      수학      총점      평균      학점
// ----------------------------------------------------
// 홍길동   90      95      100
// 코난      100      89      75
// 또치      75      80      48

public class SungJukMain {
	private static BufferedReader br;
	private static SungJuk [] sungJuk;
	private final static int SIZE = 3;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		sungJuk = new SungJuk[SIZE];

		for(int i = 0 ; i < SIZE ; i++) {
			sungJuk[i] = add();
		}
		printInfo();
		
	}//main
	
	private static int validateScore(int minimum, int maximum) throws NumberFormatException, IOException {
		
		int score = Integer.parseInt(br.readLine());
		while(score < minimum || score > maximum) {
			System.out.println("잘못입력하셨습니다.");
			score = Integer.parseInt(br.readLine());
		}
		return score;
	}//validateScore
	
	private static SungJuk add() throws NumberFormatException, IOException {
				
		System.out.print("이름 : ");
		String name = br.readLine();
		System.out.print("국어점수: ");
		int korean = validateScore(0, 100);
		System.out.print("영어점수: ");
		int english = validateScore(0, 100);
		System.out.print("수학점수: ");
		int math = validateScore(0, 100);
		
		SungJuk temp = new SungJuk( name, korean, english, math);
		return temp;
		
	}//add

	private static void printInfo() {
		System.out.println("----------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("----------------------------------------------------");
		
		for(int i = 0 ; i < SIZE ; i++) {
			
			System.out.println(sungJuk[i].getName()+"\t"+sungJuk[i].getKorean()+
								"\t"+sungJuk[i].getEnglish()+"\t"+sungJuk[i].getMath()+
								"\t"+sungJuk[i].getTotal()+"\t"+String.format("%.2f",sungJuk[i].getAvg())+"\t"+sungJuk[i].getGrade());
			
		
		}//for	
	}//printInfo
	
	
	
	
}//
