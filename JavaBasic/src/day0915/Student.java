package day0915;

public class Student {
	
	//�л��� �ʵ带 ������
	//�ʵ�� ����ó��
	//�츮�� ������Ÿ�� �ʵ��̸��� �������ָ� �ȴ�.
	
	//�л��� �̸�
	private String name;
	//name�� ���� ����
	public void setName(String name) {
		this.name = name;
	}
	//name�� ���� ����
	public String getName() {
		return name;
	}
	
	//�л��� ��������
	private int korean;
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getKorean() {
		return korean;
	}
	//�л��� ��������
	private int english;
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getEnglish() {
		return english;
	}
	//�л��� ��������
	private int math;
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	//�л��� ������ȣ
	private int id;
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	//�޼ҵ带 ������
	//1. ������ ���ϴ� �޼ҵ�
	public int calculateSum() {
		return korean + english+ math;
	}
	
	//2. ����� ���ϴ� �޼ҵ�
	public double calculateAverage() {
		return calculateSum() / 3.0;
	}
	
	//�Ķ���Ͱ� �ִ� ������
	public Student(String name, int id, int korean, int english, int math) {
		//���� �̸��� ������
		//�Ķ���ʹ� �ʵ庸�� ȣ�� �켱������ ����.
		//���� ���� �̸����� ������ �� �ʵ带 ȣ���� ������
		// ��Ȯ�ϰ� "�ش� ��ü�� �ʵ�"��� �������־�� �Ѵ�.
		// �̷� ������ this.�ʵ�� ������ �� �մ�.
		// �� this�� �� �޼ҵ带 �����ϴ� Ŭ���� ��ü �ڽ��� ����Ű�� �ȴ�.
		this.name = "abc";
		this.name = name;//Student �޼ҵ��� �Ķ���� ���� �ʵ� name�� �ִ´ٶ� ����
		this.korean = korean;
		this.english = english;
		this.math = math;
		
	}
	//�Ķ���Ͱ� ���� ������
	public Student() {
		id = 0;
		korean = 0;
		english = 0;
		math = 0;
		name = new String();
		
	}
	//static keyword�� �ش� �ʵ� Ȥ�� �޼ҵ带
	//��ü �������� ���� ȣ���� �� �ְ� ������ش�.
	//�ٸ� �� ����ƽ�̶� Ű����� �ش� �޼ҵ��� �ڵ带
	//���α׷� ���࿩���� ������ ���Խ�Ű�� ���̱� ������
	//���� �ش� �޼ҵ峪 �ʵ嵵 ���������� ����ƽ�� �ٿ���
	//���ؿ����� ���Խ����־�� �Ѵ�.
	//��ǥ���� �� : Integer.parseInt(br.readLine());
	
	public void printInfo( ) {
		System.out.printf("�̸� : %s ID : %d\n", name ,  id);
		System.out.printf("����: %d�� ���� : %d�� ���� : %d��\n", korean, english, math);
		System.out.printf("��� : %.2f�� ���� : %d��\n", calculateAverage(),calculateSum());
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(id == s.id && name.equals(s.name)) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return "�̸� : " + name +
				"�й� : "+ id +
				"���� : "+ korean + "��, "+
				"���� : "+ english + "��, "+
				"���� : "+ math + "��, "+
				"��� : "+ calculateAverage()+"��, "+
				"���� : "+ calculateSum()+"��";
				
	}
}

	
