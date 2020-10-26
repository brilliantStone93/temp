package collection;

public class PersonDTO implements Comparable<PersonDTO>{
	private String name;
	private int age;
	
	public PersonDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int compareTo(PersonDTO p) {
		//오름차순으로 정리한것
		/*
		if(this.age < p.age) return -1;
		else if(this.age>p.age)return 1;
		else return 0;
		*/
		//내림차순
		if(this.age < p.age) return 1;
		else if(this.age>p.age)return -1;
		else return 0;
		//기준점만 설정해주면 자바가 알아서 데이터를 바꿔줌
	}
	@Override
	public String toString() {
		return "이름 = "+ name + "\t 나이 = "+ age;
	}
}
