package class_constructor;



public class VarArgs {
//	private int sum(int a, int b) {
//		int result = a + b;
//		
//		
//		return result;
//	}
//	
//	private int sum(int a, int b, int c) {
//		int result = a + b+ c;
//		
//		
//		return result;
//	}
//	
//	private int sum(int a, int b, int c, int d) {
//		int result = a + b + c + d;
//		
//		
//		return result;
//	}
//	이렇게하면 파라미터에 들어가는 갯수가 달라서 파라미터가 추가 될때마다 코드가 추가되어 지저분해지고 불편하다 
//	이를 편리하게 해주기 위해 사용하는 것이 VarArgs이다
	
	public int sum(int...ar) {
		int hap =0;
		for(int i = 0; i < ar.length; i++) {
			hap += ar[i];
		}
		return hap;
	}
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println("합 ="+va.sum(10,20));//호출
		System.out.println("합 ="+va.sum(10,20,30));
		System.out.println("합 ="+va.sum(10,20,30,40));
	
	
	}//main




















}//
