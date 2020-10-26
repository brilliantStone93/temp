package nested;

public class Outer {
	private String name;
	
	public void output() {
		//Inner i = new Inner();
		System.out.println("이름 = "+ name + "\t 나이 ="+new Inner().age);
	}
	
	class Inner{
		private int age;
		
		public void disp() {
			System.out.println("이름 = "+name+"\t 나이 =" + age);
			
		}
		
		public int getAge() {
			return age;
		}

		
	}
	
	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.name = "홍길동";
		ou.output();
		System.out.println();
		
		Outer.Inner in = ou.new Inner();
		in.age = 25;
		in.disp();
		System.out.println();
		
		
		Inner in2 = ou.new Inner();
		in2.age = 30;
		in2.disp();
		System.out.println();
		
		Outer.Inner in3 = new Outer().new Inner();
		in3.age = 35;
		in3.disp();
		
		
		
		
		
		
		
	}

}
