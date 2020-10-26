package class_constructor;
//5문제의 시험지 채점하는 프로그램
//1번부터 5번까지 모든 답은 전부 1이다
//1문제당 20점씩 계산한다
//
//이름 입력 : 홍길동
//답   입력 : 12311
//
//이름      1 2 3 4 5   점수
//홍길동   O X X O O   60
//----------------
//객체 배열
//인원수 입력 : 3
//
//이름 입력 : 홍길동
//답 입력    : 13211
//
//이름 입력 : 코난
//답 입력    : 11111
//
//이름 입력 : 또치
//답 입력    : 13242
//
//이름      1 2 3 4 5   점수
//홍길동     O X X O O   60
//코난      O O O O O   100
//또치      O X X X X   20
public class Examination {
	private String name;
	private String dap; // "12311"
	private char[] ox = new char[JUNG.length()];
	private int score;
	public static final String JUNG = "11111"; //정답
	
	public Examination(String name, String dap) {
		this.name = name;
		this.dap = dap;
	}
	
	public  String getName() {
		return name;
		
	}
	

	
	public void compare() {
		for(int i = 0; i < JUNG.length(); i++) {
		if(dap.charAt(i) == JUNG.charAt(i)) {
			ox[i] = 'o';
			score += 20;
		}else ox[i] = 'x';
		
		}
	}//compare
	
	//이름      1 2 3 4 5   점수
	//홍길동     O X X O O   60
	//코난      O O O O O   100
	//또치      O X X X X   20
	public void display() {
		
		System.out.println(name+"\t"+ox[0]+"\t"+ox[1]+"\t"+ox[2]+"\t"+ox[3]+"\t"+ox[4]+"\t"+score);
		
	}
	

	
	
}//
