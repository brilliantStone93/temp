package day0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//String 클래스에 대해 알아보자
//String 이란?
// 여러개의 문자가 모여있는 char[]dmf
// 우리가 다루기 쉽게 클래스의 형태로 바꿔놓은것.

// String 클래스 안에는 스트링을 다루는데 도움이 되는 다양한 메소드가 준비되어있다.

public class Ex01String {
	public static void main(String[] args) throws IOException {
		String string1 = new String("abc");
		String string2 = "abc";
		
		//1번 : 해당 스트링의 몇번재 칸에 무슨글자가 있는지 확인할 대에는
		//charAt(index)를 실행하면 된다.
		 System.out.println("string1.charAt(0): "+ string1.charAt(0));
		//2번  : 2개의 문자열을 연결시킬때에는 concat을 사용한다.
		 System.out.println("string1.concat(string2): "+string1.concat(string2));
		//3번 : 해당 문자열에 이러한 하위 문자열이 있는지 체크할 때에는 contains()를 사용한다.
		 System.out.println("string1.contains(\"ab\"): " + string1.contains("ab"));
		//4번 :  해당 문자열이 초기화는 되어있지만 비어있는 문자열인지 체크할 때에는 isEmpty()를 사용한다.
		 System.out.println("string1.isEmpty():" +string1.isEmpty());
		 //null != ""; => true / 위에 4번은 ""인지를 확인해주는 것 null이 아닌
		 //null인 상태에선 아무것도 할 수 없다. 새로운 초기화를 할 때까지
		 // ""혹은 new String()으로 초기화하면 모든 메소드들을 호출 할 수 있지만
		 // 다만 아무런 문자도 문자열에 없는 상태인 것이다.
		 
		 //null이란 스택 영역에 주소값이 부여는 되어있지만
		 // 힙 영역에 해당 주소가 아무런 초기화가 안되어있는 상태를 널이라고 한다.
		 
		 // 우리가 그 클래스의 필드 혹은 메소드를 접근하려면
		 // 힙 영역에서 그 내용을 찾아야하는데
		 // null인 상태에서는 그 내용들이 없으므로
		 // 접근할 수 없게 되는 것이다.
		 
		 // 즉 isEmpty()메소드는
		 // 해당 스트링이 널이 아닐때만 실행가능하다.
		 System.out.println("\"\".isEmpty():" +"".isEmpty());
		 
		 //5번 : 해당 스트링의 길이를 알고 싶을때는 length()
		 System.out.println("string1.length(): "+string1.length());
		 
//		   6번 : 해당 문자열이 문자패턴과 일치하는지 확인할 때에는 matches()을 사용한다.
//		 		문자 패턴은 정규표현식을 사용해야한다.
//		 		다양한 정규표현식을 사용해서 우리가 문자열이 여러가지 형태를 만족하는지
//		 		테스트 가능하다.
//		 		ex) 핸드폰 번호
//				하지만 어려운 개념이므로 우리는 해당 문자열이 숫자로만 이루어졌는가 아닌가만 배워보도록하자
//		 		해당 스트링이 모두 다 스트링으로 이루어졌는지 체크할 때에는 \d*으로 테스트한다.
		 		System.out.println("string1.matches(\\d*): "+string1.matches("\\d*"));
		 		System.out.println("\"12345\"string1.matches(\\d*): "+"12345".matches("\\d*"));
		 
		 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 		System.out.println("숫자를 입력해주세요 : ");
		 		String userInput = br.readLine();
		 		
		 		while(!userInput.matches("\\d*")) {
		 			System.out.println("숫자만 입력해주세요");
		 			System.out.print("> ");
		 			userInput = br.readLine();
		 			
		 		}
		 		int userNumber = Integer.parseInt(userInput);
		 		System.out.println("사용자가 입력할 숫자: " + userNumber);
		 
		 
		 
	}
}
