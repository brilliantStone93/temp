package class_constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
치환하는 프로그램을 작성하시오
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : cc
ccbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : cc
ccbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : cc
ccbbcc
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다

indexOf()
replace(??, ??)
 */


public class StringTest2 {
	private static BufferedReader br;
	private static String line = null;
	
	
	//문자열 입력
	private void string() throws IOException {
		
		System.out.print("문자열 입력: ");
		line = br.readLine();
		
	}//string
	
	//문자열 변경
	private void replace() throws IOException {
		System.out.print("현재 문자열 입력:");
		String userChoice = br.readLine();
		line.indexOf(userChoice);
		
		if(line.indexOf(userChoice)==-1) {
			System.out.println("잘못입력하셨습니다.");
			System.out.print("현재 문자열 입력:");
			userChoice = br.readLine();
		}//if
		
		System.out.print("바꿀 문자열 입력:");
		String change  = br.readLine();
		
		if(change.length() > line.length() ) {
			System.out.println("잘못입력하셨습니다.");
			System.out.print("바꿀 문자열 입력:");
			change  = br.readLine();
		}//if
		
		System.out.println(line.replace(userChoice, change));
		indexOf(line, line.replace(userChoice, change), userChoice);
		
						

	}//replace

	
	// 치환 횟 수 카운트
	private void indexOf(String before, String after, String userChoice) {
		int count = 0;
		for(int i = 0 ; i < line.length(); i += userChoice.length()) {
			if(before.charAt(i) != after.charAt(i)) {
				count++;
			}
		}
		
		System.out.println(count+"개 치환");
	}//indexOf
	
	//프로그램 실행
	public static void main(String[] args) throws IOException {
//		String str = "aabbaa";
//		System.out.println(str.replace("aa", "tt"));
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTest2 stringTest2 = new StringTest2();
		stringTest2.string();
	
		stringTest2.replace();
	
	
	}//main
}//


//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class StringTest2 {
//
//   public static void main(String[] args) throws IOException {
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      String str, target, replaceing;
//      int index, count;
//      
//      System.out.print("문자열 입력 : ");
//      str = br.readLine();
//      
//      System.out.print("현재 문자열 입력 : ");
//      target = br.readLine();
//      
//      System.out.print("바꿀 문자열 입력 : ");
//      replaceing = br.readLine();
//      
//      if(str.length() < target.length())
//         System.out.println("입력한 문자열의 크기가 작습니다");
//      
//      else {
//         str = str.toLowerCase();//소문자 변환
//         target = target.toLowerCase();
//         
//         index = count = 0;
//         while( (index=str.indexOf(target, index)) != -1 ) {
//            
//            index += target.length();
//            count++;
//            
//         }//while
//         
//         System.out.println(str.replace(target, replaceing));
//         System.out.println(count+"개 치환");
//         
//      }//else
//   }
//
//}