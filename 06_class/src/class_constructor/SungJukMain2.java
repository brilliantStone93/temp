package class_constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//SungJuk 클래스 이용하시오
//객체 배열
//
//[실행결과]
//인원수 입력 : 2
//
//이름 입력 : 홍길동
//국어 입력 : 85
//영어 입력 : 93
//수학 입력 : 100
//
//이름 입력 : 코난
//국어 입력 : 75
//영어 입력 : 86
//수학 입력 : 92
//
//----------------------------------------------------
//이름      국어      영어      수학      총점      평균      학점
//----------------------------------------------------
//홍길동   85      93      100

//코난      75      86      92
public class SungJukMain2 {
	private static BufferedReader br;
	private static SungJuk [] sungJuk;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("인원수를 입력하시오:");
		int size = Integer.parseInt(br.readLine());
		sungJuk = new SungJuk[size];
		
		for(int i = 0 ; i < size ; i++) {
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
		
		for(int i = 0 ; i < sungJuk.length ; i++) {
			
		System.out.println(sungJuk[i].getName()+"\t"+sungJuk[i].getKorean()+
							"\t"+sungJuk[i].getEnglish()+"\t"+sungJuk[i].getMath()+
							"\t"+sungJuk[i].getTotal()+"\t"+String.format("%.2f",sungJuk[i].getAvg())+"\t"+sungJuk[i].getGrade());
		
		
		}//for
	
	
	}//printInfo
		
		
	
}//
