package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonMain {
	
	
	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("또  치", 40);
		PersonDTO cc = new PersonDTO("도우너", 30);
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
			System.out.println("이름 :"+a.get(i).getName()+"\t나이 :"+a.get(i).getAge());
		}//for
		System.out.println("==================================================");
		
		for(PersonDTO dto : a) {
			System.out.println("이름 = "+ dto.getName() + "\t 나이 = "+dto.getAge()	);
		
		}//확장형으로 사용
		System.out.println("==================================================");
		
		Iterator<PersonDTO> it = a.iterator();
		while(it.hasNext()) {
			PersonDTO dto = it.next();
			System.out.println("이름 = "+ dto.getName() + "\t 나이 = "+dto.getAge()	);
		
		}//Iterator 사용
		
	}//main
}//
