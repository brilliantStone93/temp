package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {
	
	
	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.println("���� �� = ");
		for(String data : ar) {
			System.out.print(data+"  ");
			
		}
		System.out.println();
		
		
		Arrays.sort(ar);
		
		
		System.out.println("���� �� =  ");
		for(String data: ar) {
			System.out.print(data +"  ");
			
		}
		
		System.out.println("\n");
		
		PersonDTO aa = new PersonDTO("ȫ�浿", 25);
		PersonDTO bb = new PersonDTO("��  ġ", 40);
		PersonDTO cc = new PersonDTO("�����", 30);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		
		System.out.println("���� �� = "+list);
		
		Collections.sort(list); // ArrayList�� �̹������ ���Ľ��������
		
		System.out.println("���� �� ="+list);
		System.out.println();
		
		//���� ������ �̸����� ����
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			public int compare(PersonDTO p1, PersonDTO p2) {
				return p1.getName().compareTo(p2.getName())*-1;//�������� , �������� ������ -1�� �����ָ�ȴ� 
																//�ֳ��ϸ� �񱳰��� ���� 1, 0, -1�� ���� return���ִµ� �̰��� -1�� �����־� �����Ű���
				 
			}
		};
		
		System.out.println("\n�̸����� ����");
		
		Collections.sort(list, com);
		System.out.println("���� �� ="+ list);
		System.out.println();
		
		
		
		
	}//main
}//
