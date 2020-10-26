package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터의 크기 = "+v.size());//0
		System.out.println("벡터 용량 ="+ v.capacity());//기본용량 10개, 10개씩 증가
		System.out.println();
		
		System.out.println("항복 추가");
		for(int i = 1; i <= 10; i++) {
			v.add(i+"");
		}
		
		System.out.println("벡터의 크기 = "+v.size());//10
		System.out.println("벡터 용량 ="+ v.capacity());//10
		System.out.println();
		
		v.addElement(5+"");
		System.out.println("벡터의 크기 = "+v.size());//11
		System.out.println("벡터 용량 ="+ v.capacity());//20
		System.out.println();
		
		for(int i = 0 ; i < v.size(); i ++) {
			System.out.print(v.get(i)+"  ");//1  2  3  4  5  6  7  8  9  10  5
		}
		System.out.println();
		
		//v.remove("5"); 앞에 있는 5가 지워진다 ""이기 때문에 해당 문자열이 삭제
		v.remove(10); // 뒤에 있는 5가 지워진다 인댁스 번호가 10번째인것이 지워지기 때문
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
			
		}
		System.out.println();
		
		Vector<String> v2 = new Vector<String>(5,2); // 기본용량 5개, 2개씩 증가
	}
}
