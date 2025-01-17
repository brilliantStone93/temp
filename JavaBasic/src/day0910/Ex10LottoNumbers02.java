package day0910;
//로또 번호제작기 2번
//사용자로부터 숫자를 입력 받아서
//6개가 다 맞을시: 1등
//5개가 맞을시: 2등
//4개: 3등
//3개: 4등
//이 출력되는 프로그램을 작성하시오.
//단 사용자가 1~45를 벗어난 값을 입력하면
//올바른 값을 입력할때까지 다시 입력을 하게 만드세요

//프로그램 예시:
//로또번호 추첨 완료
//1번째 숫자를 입력하세요: 3
//2번째 숫자를 입력하세요: 1
//3번째 숫자를 입력하세요: 1000
//잘못 입력하셨습니다.
//3번째 숫자를 입력하세요: -150
//잘못 입력하셨습니다.
//3번째 숫자를 입력하세요: 43
//4번째 숫자를 입력하세요: 23
//5번째 숫자를 입력하세요: 12
//6번째 숫자를 입력하세요: 11
//총 4개 맞추셨습니다. 3등 당첨입니다!!! (55분까지)


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Random;



public class Ex10LottoNumbers02 {
	
	final static int SIZE = 6;
	final static int MAX = 45;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] lottoNumbers = new int[SIZE];
		Random random = new Random();
		
		for(int i = 0; i < lottoNumbers.length; i++) {
			
			lottoNumbers[i] = random.nextInt(MAX)+1;
			for(int j = 0; j<lottoNumbers.length; j++) {
				if(i!=j && lottoNumbers[i]==lottoNumbers[j]) {
					lottoNumbers[i]= random.nextInt(MAX)+1;
					j = -1;
				}
			}
			
		}
		
		for(int i = 0; i < lottoNumbers.length-1; i++) {
			if(lottoNumbers[i] > lottoNumbers[i+1]) {
				int temp = lottoNumbers[i];
				lottoNumbers[i]= lottoNumbers[i+1];
				lottoNumbers[i+1] = temp;
				i=-1; 
			}
		}
//		System.out.println("중복제거 후");
//		for(int i = 0; i < lottoNumbers.length;i++) {
//			System.out.println(lottoNumbers[i]);
//			}
		int[] userNumbers = new int[SIZE];
		
		
		for(int i = 0; i < lottoNumbers.length; i++) {
		
				System.out.println(i+"번째 숫자를 입력하세요: ");
			userNumbers[i] = Integer.parseInt(br.readLine());
			if(userNumbers[i]>46 || userNumbers[i]<0) {
				System.out.println("잘못 입력하셨습니다");
				i = i -1;
				}
			}
		
		
		
		int count = 0;
		for(int i = 0; i < lottoNumbers.length; i++) {
			if(userNumbers[i]==lottoNumbers[i]) count++;
		}
		System.out.println();
		//6개가 다 맞을시: 1등
		//5개가 맞을시: 2등
		//4개: 3등
		//3개: 4등
		
		int rank = 0;
		switch(count) {
		case 0 : 
		case 1 :
		case 2 : rank = 0; break;
		case 3 : rank = 4; break;
		case 4 : rank = 3; break;
		case 5 : rank = 2; break;
		case 6 : rank = 1; 
		}
	
		System.out.println("총"+count+"개 맞추셨습니다."+rank+"등 당첨 입니다.");
	
	
	
	}
//	
//	package day0910;
//
//	import java.io.BufferedReader;
//	import java.io.IOException;
//	import java.io.InputStreamReader;
//	import java.util.Random;
//
//	// 로또 번호제작기 2번
//	// 사용자로부터 숫자를 입력 받아서
//	// 6개가 다 맞을시: 1등
//	// 5개가 맞을시: 2등
//	// 4개: 3등
//	// 3개: 4등
//	// 이 출력되는 프로그램을 작성하시오.
//	// 단 사용자가 1~45를 벗어난 값을 입력하면
//	// 올바른 값을 입력할때까지 다시 입력을 하게 만드세요
//
//	// 프로그램 예시:
//	// 로또번호 추첨 완료
//	// 1번째 숫자를 입력하세요: 3
//	// 2번째 숫자를 입력하세요: 1
//	// 3번째 숫자를 입력하세요: 1000
//	// 잘못 입력하셨습니다.
//	// 3번째 숫자를 입력하세요: -150
//	// 잘못 입력하셨습니다.
//	// 3번째 숫자를 입력하세요: 43
//	// 4번째 숫자를 입력하세요: 23
//	// 5번째 숫자를 입력하세요: 12
//	// 6번째 숫자를 입력하세요: 11
//	// 사용자 번호 를 정렬했습니다.
//	// 총 4개 맞추셨습니다. 3등 당첨입니다!!! (55분까지)
//	public class Ex10LottoNumbers02 {
//	   final static int SIZE = 6;
//	   final static int MAX = 45;
//	   public static void main(String[] args) throws NumberFormatException, IOException {
//	      //먼저 추첨 배열을 만들어서
//	      //중복되지 않는 난수를 넣고 정렬해주자
//	      int[] lottoNumbers = new int[SIZE];
//	      Random random = new Random();
//	      //1-A. lottoNumbers에 난수 입력
//	      for(int i = 0; i < lottoNumbers.length; i++) {
//	         lottoNumbers[i] = random.nextInt(MAX) + 1;
//	      }
//	      
//	      //1-B. lottoNumbers에서 중복 제거
//	      for(int i = 0; i < lottoNumbers.length; i++) {
//	         for(int j = 0; j < lottoNumbers.length; j++) {
//	            if(i != j && lottoNumbers[i] == lottoNumbers[j]) {
//	               lottoNumbers[i] = random.nextInt(MAX) + 1;
//	               j = -1;
//	            }
//	         }
//	      }
//	      
//	      //1-C. lottoNumbers의 숫자 정렬
//	      for(int i = 0; i < lottoNumbers.length - 1; i++) {
//	         if(lottoNumbers[i] > lottoNumbers[i+1]) {
//	            int temp = lottoNumbers[i];
//	            lottoNumbers[i] = lottoNumbers[i+1];
//	            lottoNumbers[i+1] = temp;
//	            i = -1;
//	         }
//	      }
//	      System.out.println("로또 번호 추첨 완료");
//	      
//	      //2. 사용자 번호 배열 입력을 준비하자
//	      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	      int[] userNumbers = new int[SIZE];
//	      
//	      //2-A. 사용자로부터 숫자 입력 받기
//	      for(int i = 0; i < userNumbers.length; i++) {
//	         System.out.print((i+1)+"번째 숫자를 입력해주세요: ");
//	         int number = Integer.parseInt(bufferedReader.readLine());
//	         
//	         //6 13 0 0 0 0
//	         
//	         
//	         //중복을 입력하면 true가 boolean 변수에 저장되도록 만들어보자
//	         boolean isDuplicated = false;
//	         for(int j = 0; j < i; j++) {
//	            if(number == userNumbers[i]) {
//	               isDuplicated = true;
//	            }
//	         }
//	         
//	         while(number < 0 || number > MAX || isDuplicated) {
//	            System.out.println("잘못입력하셨습니다.");
//	            System.out.print((i+1)+"번째 숫자를 입력해주세요: ");
//	            number = Integer.parseInt(bufferedReader.readLine());
//	            
//	            isDuplicated = false;
//	            for(int j = 0; j < i; j++) {
//	               if(number == userNumbers[i]) {
//	                  isDuplicated = true;
//	               }
//	            }
//	         }
//	         userNumbers[i] = number;
//	         
//	      }
//	      //2-B. 사용자가 입력한 숫자로 이루어진 배열을 정렬하기
//	      for(int i = 0; i < userNumbers.length - 1; i++) {
//	         if(userNumbers[i] > userNumbers[i+1]) {
//	            int temp = userNumbers[i];
//	            userNumbers[i] = userNumbers[i+1];
//	            userNumbers[i+1] = temp;
//	            i = -1;
//	         }
//	      }
//	      
//	      //3. 두 배열을 비교해서
//	      //   같은 숫자가 있을 때마다 점수를 1점씩 올려주자
//	      int score = 0;
//	      for(int i = 0; i < lottoNumbers.length; i++) {
//	         for(int j = 0; j < userNumbers.length; j++) {
//	            //lottoNumbers[i]번째를
//	            //userNumber 전체와 비교해서
//	            //한번이라도 같으면 score++; 해주면 된다.
//	            if(lottoNumbers[i] == userNumbers[j]) {
//	               score++;
//	            }
//	         }
//	      }
//	      
//	      //4. 두 배열을 0~5번째를 나란히 출력하고 
//	      //   출력이 끝나면 switch를 통해서 몇등인지를 출력해주자
//	      System.out.println("추첨 번호\t사용자 번호");
//	      for(int i = 0; i < lottoNumbers.length; i++) {
//	         System.out.println(lottoNumbers[i]+"\t"+userNumbers[i]);
//	      }
//	      
//	      switch(score) {
//	      case 6:
//	         System.out.println("총"+ score+ "개 맞추셨습니다. 1등입니다.");
//	         break;
//	      case 5:
//	         System.out.println("총"+ score+ "개 맞추셨습니다. 2등입니다.");
//	         break;
//	      case 4:
//	         System.out.println("총"+ score+ "개 맞추셨습니다. 3등입니다.");
//	         break;
//	      case 3:
//	         default:
//	            System.out.println("탈락입니다 ㅠㅠ");
//	            break;
//	      }
//	   }
//	}




















}
