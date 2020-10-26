package method;

public class Boxing {
	public static void main(String[] args) {
	int a = 25; 
	double b = (double)a/3; // 강제형변환/자동형변환, Casting, Cast연산
	
	
	int c = 5;
	Integer d = c; // jdk 5.0이상부터 가능하게 됨, AutoBoxing = 자동으로 아래의 처리를 해주는 것
	//객체형         int(기본형)
	//Integer d = new Integer(c); / 원래는 이게 맞음 이걸 자동으로 해줌
	
	Integer e = 5;
	int f = e;
	//기본형 = 객체형
	f = e.intValue();
	//기본형 = 객체형
	//int f = e.intValue();
	
	
	}
}
