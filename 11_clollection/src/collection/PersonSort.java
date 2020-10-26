package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {
	
	
	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.println("정렬 전 = ");
		for(String data : ar) {
			System.out.print(data+"  ");
			
		}
		System.out.println();
		
		
		Arrays.sort(ar);
		
		
		System.out.println("정렬 후 =  ");
		for(String data: ar) {
			System.out.print(data +"  ");
			
		}
		
		System.out.println("\n");
		
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("또  치", 40);
		PersonDTO cc = new PersonDTO("도우너", 30);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		
		System.out.println("정렬 전 = "+list);
		
		Collections.sort(list); // ArrayList는 이방식으로 정렬시켜줘야함
		
		System.out.println("정렬 후 ="+list);
		System.out.println();
		
		//정렬 기준을 이름으로 변경
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			public int compare(PersonDTO p1, PersonDTO p2) {
				return p1.getName().compareTo(p2.getName())*-1;//오름차순 , 내림차순 변경은 -1을 곱해주면된다 
																//왜냐하면 비교값은 값은 1, 0, -1로 나와 return해주는데 이값을 -1을 곱해주어 역행시키면됨
				 
			}
		};
		
		System.out.println("\n이름으로 정렬");
		
		Collections.sort(list, com);
		System.out.println("정렬 후 ="+ list);
		System.out.println();
		
		
		
		
	}//main
}//
