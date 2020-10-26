//package day0911;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
////리턴 타입이 없는 메소드
////그리고 메소드 중간에 리턴하는 메소드
//public class Ex05Method02 {
//	//1.리턴타입이 없는 메소드
//	// 아무것도 리턴하지 않을 때에는 void라고 적어주고
//	// 또한 그러한 경우엔 return 명령어를 쓰지 않는다.
//	static void showMenu() {
//		System.out.println("----------------------");
//		System.out.println("비트고등학교 성적관리 프로그램");
//		System.out.println("\t1. 입력");
//		System.out.println("\t2. 출력");
//		System.out.println("\t3. 종료");
//	}
//	
//	
//	final static int SIZE = 5;
//	static int input(BufferedReader br) throws NumberFormatException, IOException {
//		String [] name = new String[SIZE];
//		int [] korean = new int[SIZE];
//		int [] english = new int[SIZE];
//		int [] math = new int[SIZE];
//		
//		for(int i=0; i<SIZE;i++) {
//			System.out.println("이름 : ");
//			name [i] = br.readLine();
//			System.out.println("국어점수 :" );
//			korean [i] = Integer.parseInt(br.readLine());
//			while(true) {
//				if(korean [i] >=0 && korean [i] <=100) break;
//				else {
//					System.out.println("잘 못 입력하셨습니다");
//					System.out.println("국어점수 :" );
//					korean [i] = Integer.parseInt(br.readLine());
//				}
//			}
//			System.out.println("영어점수 :" );
//			english [i] = Integer.parseInt(br.readLine());
//			while(true) {
//				if(english [i] >=0 && english [i] <=100) break;
//				else {
//					System.out.println("잘 못 입력하셨습니다");
//					System.out.println("영어점수 :" );
//					english [i] = Integer.parseInt(br.readLine());
//				}
//			}
//			System.out.println("수학점수 :" );
//			math [i] = Integer.parseInt(br.readLine());
//			while(true) {
//				if(math [i] >=0 && math [i] <=100) break;
//				else {
//					System.out.println("잘 못 입력하셨습니다");
//					System.out.println("수학점수 :" );
//					math [i] = Integer.parseInt(br.readLine());
//				}
//			}	
//		}//for
//		
//	}//input
//	
//	static void output(BufferedReader br, String name [], int korean [], int english [], int math []) throws NumberFormatException, IOException {
//	
//		
//		System.out.println("학생 번호를 입력하시오 : ");
//		int number = Integer.parseInt(br.readLine())-1;
//		System.out.println(number+1+"번 학생의 이름 : "+ name[number]);
//		System.out.println("국어 : "+korean [number] + "영어 : "+ english [number] +"수학 : "+math [number]  );
//	}
//	
//	public static void main(String[ ] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//		String name ;
//		int korean = 0;
//		int english = 0;
//		int math = 0;
//		
//		while(true) {
//			showMenu();
//			int userChoice = Integer.parseInt(br.readLine());
//			if(userChoice == 1) {
//				input(br);
//				//입력 메소드 실행
//				korean = input(br);
//				// 점수를 입력 받아서 유효한 점수를 리턴해주는 메소드를 만들어서
//				// 국영수 점수를 입력 시키시오
//				
//			}else if (userChoice ==2) {
//				output(br,  name, korean  ,  english ,  math);
//				//출력 메소드 실행
//				
//				// 파라미터로 넘어온 이름, 국영수 점수를
//				// 예쁘게 출력하는 메소드를 작성하시오
//			}else if (userChoice == 3) {
//				System.out.println("사용해주셔서 감사합니다.");
//				break;
//			}
//		}
//		
//	}
//
//}


//강사님 답안
  package day0911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//리턴타입이 없는 메소드
//그리고 메소드 중간에 리턴하는 메소드
public class Ex05Method02 {
   //1. 리턴 타입이 없는 메소드
   //   아무것도 리턴하지 않을 때에는 void라고 적어주고
   //   또한 그러한 경우엔 return 명령어를 쓰지 않는다.
   static void showMenu() {
      System.out.println("----------------------");
      System.out.println("비트고등학교 성적관리 프로그램");
      System.out.println("\t1. 입력");
      System.out.println("\t2. 출력");
      System.out.println("\t3. 종료");
   }
   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      int korean = 0;
      int math = 0;
      int english = 0;
      String name = new String();
      while(true) {
         showMenu();
         int userChoice = Integer.parseInt(bufferedReader.readLine());
         if(userChoice == 1) {
            //입력 메소드 실행
            
            // 점수를 입력받아서 유효한 점수를 리턴해주는 메소드를 만들어서
            // 국영수 점수에 입력 시키시오
            System.out.print("이름: ");
            name = bufferedReader.readLine();
            
            System.out.print("국어 ");
            korean = validateScore(bufferedReader);
            
            System.out.print("영어 ");
            english = validateScore(bufferedReader);
            
            System.out.print("수학 ");
            math = validateScore(bufferedReader);
         }else if(userChoice == 2) {
            //출력 메소드 실행
            
            // 파라미터로 넘어온 이름, 국영수 점수를 
            // 예쁘게 출력하는 메소드를 작성하시오
            printScore(name, korean, english, math);
         }else if(userChoice == 3) {
            System.out.println("사용해주셔서 감사합니다.");
            break;
         }
      }
   }
   static int validateScore(BufferedReader b) throws NumberFormatException, IOException {
      System.out.print("점수를 입력하세요: ");
      int score = Integer.parseInt(b.readLine());
      
      while(score < 0 || score > 100) {
         System.out.println("잘못 입력하셨습니다.");
         System.out.print("점수를 입력하세요: ");
         score = Integer.parseInt(b.readLine());
      }
      return score;
   }
   
   static void printScore(String name, int korean, int english, int math) {
      System.out.println("=========================");
      System.out.println("\t이름: "+name);
      System.out.printf("국어: %d 영어: %d 수학: %d\n", korean, english, math);
      int sum = korean + english + math;
      double average = sum / (double)3;
      System.out.printf("총점: %d 평균: %.2f\n", sum, average);
   }
}

