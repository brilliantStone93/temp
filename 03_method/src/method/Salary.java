package method;
/*
  월급 계산 프로그램
이름(name), 직급(rank), 기본급(basePay), 수당(incentive)을 입력하여 세금과 월급을 계산하시오
세율은 급여가 4,000,000 만원 이상이면 3% 아니면 2%로 한다

만약 이 문제를 다 풀었다면
세금은 calcTax()
월급은 calcSalary()를 이용해서 계산하시오

급여 = 기본급 + 수당
세금 = 급여 * 세율
월급 = 급여 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4500000
수당 입력 : 200000

   *** 홍길동 월급 명세서 ***
직급 : 부장
기본급		      수당   		   급여   	   세율       세금          월급
4500000      200000     4700000   3%   xxxxx   xxxxxxx
                            
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Salary {

	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//클래스는 반드시 생성해야 한다.
		System.out.print("이름 입력 : ");
		String name = bufferedReader.readLine();
		System.out.print("직급 입력 : ");
		String rank = bufferedReader.readLine();
		System.out.print("기본급 입력 : ");
		int basePay = Integer.parseInt(bufferedReader.readLine());
		System.out.print("수당 입력 : ");
		int incentive = Integer.parseInt(bufferedReader.readLine());
	
		int pay = basePay+incentive;
		//세율은 급여가 4,000,000 만원 이상이면 3% 아니면 2%로 한다
		Salary salary = new Salary();
		//int tax = (int) (pay >= 4000000 ? salary.calcTax(pay) : salary.calcTax2(pay)) ;
		double taxRate = pay >= 4000000 ? 0.03 : 0.02;
		int tax = (int)salary.calcTax(pay, taxRate);
		System.out.println("*** "+name+" 월급 명세서***");
		System.out.println("직급 : "+rank);
		System.out.println("기본급"+"\t"+"수당"+"\t"+"급여"+"\t"+"세율"+"\t"+"세금"+"\t"+"월급");
		System.out.println(basePay+"\t"+incentive+"\t"+pay+"\t"+String.format("%.0f", taxRate*100)+"%"+"\t"+tax+"\t"+salary.calcSalary(pay,tax));
		
	}

	public double calcTax(int a,double b){
		return a*b;
		
	}
	
	public int calcSalary(int a, int b){
		return a - b;
		
	}
	
}
