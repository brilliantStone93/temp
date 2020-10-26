package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
	private String code;
	

	public static void main (String[] args) {
		Map <String, String> map = new HashMap<String, String>();
		map.put("book101","백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주");// Value 중복허용
		map.put("book301", "피오나");
		map.put("book101", "엄지공주");//key  중복허용 
		
		System.out.println(map.get("book101"));
		System.out.println(map.get("book102"));
		System.out.println();
		
		
		MapTest mt = new MapTest();
		while(true) {
			mt.input();
			
			if(map.get(mt.code) == null) {
				System.out.println("없는 KEY입니다");
			}else {System.out.println(map.get(mt.code));
					break;
			}//if~else
		}//while
		//map.containsKey(key)를 사용해서 값을 갖고있는지 확인해줘도 된다
		
		
	}//main
	
	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("코드 입력 :");
		code = s.next();
	}//input
	
	
}//
