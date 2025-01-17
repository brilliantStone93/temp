package io;

import java.io.Serializable;

public class ScoreDTO implements Serializable, Comparable<ScoreDTO> {
	
	
	/** 워드 같은 프로그램을 깔때 사용되어지는 키값과 같은것
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String hak, name;
	private int kor, eng, math, tot;
	private double avg;
	
	
	public void calc() {
		int tot = kor + eng + math;
		double avg = tot / 3.;
		
		this.tot = tot;
		this.avg = avg;
	}
	
	
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
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
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}



	@Override
	public int compareTo(ScoreDTO s) {
		
		return this.tot < s.tot ? -1 : 1 ; // 이렇게 하면 오름 차순, 1 : -1 이렇게 하면 내림 차순
	}
	
	
	
}
