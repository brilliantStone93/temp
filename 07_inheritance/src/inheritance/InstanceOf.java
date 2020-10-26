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
		
		AA aa4 = bb;//부모 = 자식 이기 때문에 된다.
		if(bb instanceof AA)System.out.println("2. TRUE");
		else System.out.println("2. FALSE");
		
		BB bb2 = (BB)aa2; // 자식 = (자식)부모
		if(aa2 instanceof BB)System.out.println("3. TRUE");
		else System.out.println("3. FALSE");
		
//		BB bb3 = (BB)aa3; // aa3는 AA만 메모리에 잡혀있기때문에 BB로 형변환 해줄 수 없다
		if(aa3 instanceof BB )System.out.println("4.TRUE");
		else System.out.println("4. FALSE");
		
		
	} 
	
}
