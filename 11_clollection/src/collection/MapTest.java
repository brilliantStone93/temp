package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
	private String code;
	

	public static void main (String[] args) {
		Map <String, String> map = new HashMap<String, String>();
		map.put("book101","�鼳����");
		map.put("book201", "�ξ����");
		map.put("book102", "�鼳����");// Value �ߺ����
		map.put("book301", "�ǿ���");
		map.put("book101", "��������");//key  �ߺ���� 
		
		System.out.println(map.get("book101"));
		System.out.println(map.get("book102"));
		System.out.println();
		
		
		MapTest mt = new MapTest();
		while(true) {
			mt.input();
			
			if(map.get(mt.code) == null) {
				System.out.println("���� KEY�Դϴ�");
			}else {System.out.println(map.get(mt.code));
					break;
			}//if~else
		}//while
		//map.containsKey(key)�� ����ؼ� ���� �����ִ��� Ȯ�����൵ �ȴ�
		
		
	}//main
	
	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("�ڵ� �Է� :");
		code = s.next();
	}//input
	
	
}//
