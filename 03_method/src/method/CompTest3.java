package method;

public class CompTest3 {
	public static void main(String[] args) {
		int num1= 0, num2=0;
		boolean result;
		
		result = ((num1+=10)< 0&&(num2+=10)>0);
		//num1 = num1 +10 -> num1 = 10�� 0���� ŭ���� f
		// �տ� ���꿡�� f �� ���Ա� ������ &&�� �ڿ� ������ �������� �ʴ´� ���� num2 =0
		// �ؿ����� �������� 
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1 +"num2 = "+num2);
		System.out.println();
		
		result = ((num1+=10) > 0 || (num2 +=10)>0);
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1 +"num2 = "+num2);
	}
}
