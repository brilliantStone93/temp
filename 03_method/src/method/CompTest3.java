package method;

public class CompTest3 {
	public static void main(String[] args) {
		int num1= 0, num2=0;
		boolean result;
		
		result = ((num1+=10)< 0&&(num2+=10)>0);
		//num1 = num1 +10 -> num1 = 10은 0보다 큼으로 f
		// 앞에 연산에서 f 가 나왔기 떄문에 &&은 뒤에 연산을 수행하지 않는다 따라서 num2 =0
		// 밑에서도 마찬가지 
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1 +"num2 = "+num2);
		System.out.println();
		
		result = ((num1+=10) > 0 || (num2 +=10)>0);
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1 +"num2 = "+num2);
	}
}
