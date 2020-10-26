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
		//������������ �����Ѱ�
		/*
		if(this.age < p.age) return -1;
		else if(this.age>p.age)return 1;
		else return 0;
		*/
		//��������
		if(this.age < p.age) return 1;
		else if(this.age>p.age)return -1;
		else return 0;
		//�������� �������ָ� �ڹٰ� �˾Ƽ� �����͸� �ٲ���
	}
	@Override
	public String toString() {
		return "�̸� = "+ name + "\t ���� = "+ age;
	}
}