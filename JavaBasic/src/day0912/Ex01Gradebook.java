package day0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//주말 숙제
//위 내용을 
//1차: 국어, 영어, 수학 순으로 관리 할 수 있게 변경하고
//2차: 무한루프를 이용하여 메뉴를 통해서 입력과 출력을 할 수 있게 바꾸
//3차: 메소드를 분리해보세요.

//출력 예시 : 2학년 1학기 중간 고사 국어에 80전이 입력되었씁니다.
public class Ex01Gradebook {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//국어, 영어, 수학에 대한 2차원 배열을 만들어 준다.
		int[][] koreanArray = new int [3][4];
		int[][] englishArray = new int [3][4];
		int[][] mathArray = new int [3][4];
		BufferedReader bufferedReader = new BufferedReader ( new InputStreamReader ( System.in));
		
		while(true) {
			showMenu();
			int choice = Integer.parseInt(bufferedReader.readLine());
			if(choice == 1 ) {
				int year = selectYear(bufferedReader);
				int testNumber = selecetTest(bufferedReader);
			 
				koreanArray[year -1][testNumber-1] = validateScore(bufferedReader, 1 );
				englishArray[year -1][testNumber-1] = validateScore(bufferedReader, 2 );
				mathArray[year -1][testNumber-1] = validateScore(bufferedReader, 3 );
			
//				
//				System.out.println("입력할 시험의 종류를 선택해 주세요 : ");
//				
//				System.out.println("1. 국어 2. 영어 3. 수학");
//				System.out.println(">");
//				int code = Integer.parseInt(bufferedReader.readLine());
			}else if(choice ==  2 ) {
				int year = selectYear(bufferedReader);
				int testNumber = selecetTest(bufferedReader);
				String message = new String();
				switch (testNumber) {
				case 1 : 
					message = " 1학기 중간고사";
					break ;
				case 2 : 
					message = " 1학기 기말고사";
					break ;
				case 3 : 
					message = " 2학기 중간고사";
					break ;
				case 4 : 
					message = " 2학기 기말고사";
					break ;
				}
				
				System.out.println(year+"학년 "+message);
	            printScore(koreanArray[year-1][testNumber-1], englishArray[year-1][testNumber-1], mathArray[year-1][testNumber-1]);

			}else if(choice == 3) {
				System.out.println("사용해주셔서 감사합니다");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}	
		}
	static void printScore(int korean, int english, int math) {
		System.out.printf("국어 : %03d점 영어 : %03d점 수학: %03d점\n", korean, english, math);
	}
	static int selectYear(BufferedReader bufferedReader)throws NumberFormatException, IOException {
		System.out.println("학년을 선택해주세요 : ");
		System.out.println("> ");
		int year = Integer.parseInt(bufferedReader. readLine());
		while(year < 1 || year > 3) {
			System.out.println("잘못된 학년입니다. ");
			System.out.println("학년을 선택해주세요 : ");
			year = Integer.parseInt(bufferedReader.readLine());
		}
		return year;	
	}
	
	static int selecetTest(BufferedReader bufferedReader) throws NumberFormatException, IOException {	
		System.out.println("시험을 선택해주세요 : " );
		System.out.println("1. 1학기 중간 2. 1학기 기말 3. 2학기중간 4. 2학기 기말 " );
		System.out.println("> " );
		int testNumber = Integer.parseInt(bufferedReader.readLine());
		while(testNumber < 1 || testNumber > 4) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("1. 1학기 중간 2. 1학기 기말 3. 2학기중간 4. 2학기 기말 " );
			System.out.println("> " );
			testNumber = Integer.parseInt(bufferedReader.readLine());
		}
		return testNumber;
	}
	
	
	static void showMenu() {
		System.out.println("=============================");
		System.out.println("비트고등학교 성적 관리 프로그램");
		System.out.println("\t1. 입력");
		System.out.println("\t2. 출력");
		System.out.println("\t3. 종료");	
		System.out.println(">");
	}
	
	// 점수가 올바른지 체크하고 올바르지 않으면 올바른 점수가 들어돌때까지 계속 입력받는 메소드
	static int validateScore(BufferedReader bufferedReader, int code) throws NumberFormatException, IOException {
		String  message = new String();
		switch(code) {
	    case 1:
	       message = "국어 점수를 입력해주세요 : ";
	       break;
	    case 2:
	    	message = "영어 점수를 입력해주세요 : ";
	       break;
	    case 3:
	    	message = "수학 점수를 입력해주세요 : ";
	       break;
	    
	    }
		
		System.out.print(message);
		int score = Integer.parseInt(bufferedReader.readLine());
		
		while (score < 0 || score > 100) {
			System.out.println("잘못입력하셨습니다.");
			System.out.println("점수를 입력해주세요 : ");
			score = Integer.parseInt(bufferedReader.readLine());
		}
		return score;
	}

}
