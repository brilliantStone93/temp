package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonMain {
	
	
	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("ȫ�浿", 25);
		PersonDTO bb = new PersonDTO("��  ġ", 40);
		PersonDTO cc = new PersonDTO("�����", 30);
		ArrayList<PersonDTO> c = new ArrayList<PersonDTO>();
		c.add(aa);
		c.add(bb);
		c.add(cc);
		
		return c;
		
	}//init
	
	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
		
		ArrayList<PersonDTO> a = pm.init();
		
		for(int i = 0; i < a.size(); i++) {
			System.out.println("�̸� :"+a.get(i).getName()+"\t���� :"+a.get(i).getAge());
		}//for
		System.out.println("==================================================");
		
		for(PersonDTO dto : a) {
			System.out.println("�̸� = "+ dto.getName() + "\t ���� = "+dto.getAge()	);
		
		}//Ȯ�������� ���
		System.out.println("==================================================");
		
		Iterator<PersonDTO> it = a.iterator();
		while(it.hasNext()) {
			PersonDTO dto = it.next();
			System.out.println("�̸� = "+ dto.getName() + "\t ���� = "+dto.getAge()	);
		
		}//Iterator ���
		
	}//main
}//
