package day0915;

import java.io.IOException;
//���� 1. Student�� ������ �ʵ忡 ���ؼ� ���� ���͸� �����Ͻð� 
//StudentEx.java�� �˸°� ��ġ�ÿ�
public class StudentEx01 {
	public static void main(String[] args) throws IOException {
		//��ü�� ������
		
		
		Student s1 = new Student("���翵" , 1, 100, 90, 91);
		s1 = new Student();
		System.out.printf("�̸� : %s, ���� : %d��  ���� : %d��  ����: %d��\n", s1.getName(), s1.getKorean(), s1.getEnglish(), s1.getMath());
		//��ü�� �ʵ� Ȥ�� �޼ҵ带 ���� �� ������
		// ���� ������ . �� �̿��ϸ� �ȴ�.
		
		s1.setName("���翵");
		s1.setKorean(100);;
		s1.setEnglish(90);
		s1.setMath(91); 
		s1.setId(1);
		
		System.out.printf("�̸� : %s, ���� : %d��  ���� : %d��  ����: %d��\n", s1.getName(), s1.getKorean(), s1.getEnglish(), s1.getMath());
		System.out.printf("%s �л��� ���� : %d��  ��� : %.2f��\n", s1.getName(), s1.calculateSum(), s1.calculateAverage());
		
		
		Student s2 = new Student("��ö��" , 2,90 , 90, 90);
		s2.setName("��ö��");
		s2.setKorean(90);;
		s2.setEnglish(90);
		s2.setMath(90); 
		s2.setId(2);
		System.out.printf("�̸� : %s, ���� : %d��  ���� : %d��  ����: %d��\n", s2.getName(), s2.getKorean(), s2.getEnglish(), s2.getMath());
		System.out.printf("%s �л��� ���� : %d��  ��� : %.2f��\n", s2.getName(), s2.calculateSum(), s2.calculateAverage());
		
		String str1 = new String();// �� �ڵ�� String str1 = ""; �� ���� �ǹ��̴�. �ٸ� ���� ��������  ǥ���̴�.
		System.out.println(str1.length());
		
		
		Student s3 = new Student("abc", 4, 5, 6, 7);
		Student s4 = new Student("abc", 4, 5, 5, 7);
		
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		
		System.out.println("s3.equal(s4) : "+s3.equals(s4));
	}
}
