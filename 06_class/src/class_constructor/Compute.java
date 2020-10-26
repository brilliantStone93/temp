package class_constructor;

public class Compute {
	private int x;
	private int y;
	private int sum;
	private int sub;
	private int mul;
	private double div;
	
	public Compute(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	public int getX() {
		return x;
	}
	
	public int getY()	{
		return y;
	}
    
	
	public int getSum()	{
		return sum;
	}
	
	public int getSub()	{
		return sub;
	}
	
	public int getMul()	{
		return mul;
	}
	
	public double getDiv()	{
		return div;
	}
	
	
	
	
	
	
//	[실행결과]
//	X      Y      SUM      SUB      MUL      DIV
//	320      258
//	
	public void calc() {
		sum = x + y;
		sub = x - y;
		mul = x * y;
		div = (double)x / y;
		
		
	}
}
