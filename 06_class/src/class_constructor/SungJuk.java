package class_constructor;

public class SungJuk {
	private  String name, grade;
	private  int korean, english, math, total;
	private  double avg; // 여기에 static을 써주니까 값이 다 똑같이 출력되던되 왜그런가요
	
	
	//생성자
	public SungJuk(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		clac();
		this.grade = grade(avg);
	}
	
	
	
	//getter
	public String getName() {
		return name;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public int getKorean() {
		return korean;
	}
	
	public int getEnglish() {
		return english;
	}
	
	public int getMath() {
		return math;
	}
	
	public int getTotal() {
		return total;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void clac() {
		total = korean + english + math;
		avg = (double)total / 3;
	}
	
	public static String grade(double avg) {
		String grade = new String();
		switch((int)avg) {
			case 1 : if(avg > 90) {grade = "A";
					break;}
			case 2 : if(avg>80) {grade = "B";
					break;}
			case 3 : if(avg > 70) { grade = "c";
					break;}
			case 4 : if(avg > 60) {grade = "d";
					break;}
			case 5 : if(avg < 60  && avg >= 0) {grade = "f";
					break;}
		}
	
		return grade;
	}
	
}
