package inheritance;


class AA{}

class BB extends AA{}


public class InstanceOf {
	public static void main(String[] args) {
		AA aa = new AA();
		BB bb = new BB();
		AA aa2 = new BB();
		
//		AA aa3 = new AA();
		AA aa3 = aa;
		
		if(aa instanceof AA)System.out.println("1. TRUE");
		else System.out.println("1. FALSE");
		
		AA aa4 = bb;//�θ� = �ڽ� �̱� ������ �ȴ�.
		if(bb instanceof AA)System.out.println("2. TRUE");
		else System.out.println("2. FALSE");
		
		BB bb2 = (BB)aa2; // �ڽ� = (�ڽ�)�θ�
		if(aa2 instanceof BB)System.out.println("3. TRUE");
		else System.out.println("3. FALSE");
		
//		BB bb3 = (BB)aa3; // aa3�� AA�� �޸𸮿� �����ֱ⶧���� BB�� ����ȯ ���� �� ����
		if(aa3 instanceof BB )System.out.println("4.TRUE");
		else System.out.println("4. FALSE");
		
		
	} 
	
}
