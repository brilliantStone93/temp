package class_constructor;

public class FinalMain {
	private final String FRUIT = "사과";
	private final String FRUIT2;
	
	private static final String ANIMAL = "사자";
	private static final String ANIMAL2;
	
	static {
		ANIMAL2 = "기린";
	}
	
	
	public FinalMain() {
		FRUIT2 = "딸기";
		
	}
	
	public static void main(String[] args) {
		
		final int AGE = 10;
//		AGE++; 상수는 바꿀수 없음 따라서 에러가 나는것
		System.out.println("상수 = "+ AGE);
		
		final int AGE2;
		AGE2 = 20;
		//AGE2 = 30; 마찬가지 바꿀수없는 것 그래서 에러
		
		FinalMain fm = new FinalMain();
		System.out.println("FRUIT = "+fm.FRUIT);
		System.out.println("FRUIT = "+fm.FRUIT2);
		
		System.out.println("ANIMAL = "+ FinalMain.ANIMAL);
		System.out.println("ANIMAL = "+ FinalMain.ANIMAL2);
	}
}
