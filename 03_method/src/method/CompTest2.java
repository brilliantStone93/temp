package method;

/*
ch�� �ִ� �����Ͱ� �빮���̸� �ҹ��ڷ� ����ϰ� �ƴϸ�(�ҹ���) �빮�ڷ� ����Ͻÿ�
A 65 Z 90
a 97 z 122

[������]
T �� t

�Ǵ�

e �� E
 
 */


public class CompTest2 {
	
	public int sum(int a, int b){
		return a+b;
	}
	public int sub(int a, int b){
		return a-b;
	}
	public static void main(String[] args) {
		int ch = 'B';
		CompTest2 c = new CompTest2();
		
		int result = ch>= 65 && ch<=90 ? c.sum(ch, 32) : c.sub(ch, 32);
		
		
		System.out.println((char)ch+" �� " + (char)result);
		
		//�⺻�� ��ü �� ���� ����ȯ �ȵ�
	}
}
