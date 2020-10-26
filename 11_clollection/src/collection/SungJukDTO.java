package collection;
//번호   이름   국어   영어   수학   총점   평균
public class SungJukDTO implements Comparable<SungJukDTO> {
	private int rank, korean, english, math, tot;
	private String name;
	private double avg;
	
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public int compareTo(SungJukDTO s) {
		if(this.tot < s.tot) return 1;
		else if(this.tot > s.tot) return -1;
		else return 0;
	}//sort사용하기 위한 기준점
	
//	public String toString() {
//	
//		return rank + "\t"
//				+ name + "\t"
//				+ korean + "\t"
//				+ english + "\t"
//				+ math + "\t"
//				+ tot + "\t"
//				+ avg;
//	}
	// toString Override
	
	

}
