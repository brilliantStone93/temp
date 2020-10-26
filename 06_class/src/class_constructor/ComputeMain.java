package class_constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
x와 y의 값을 받아서 합,차,곱,몫을 구하시오

클래스명 : Compute
필드      : x, y, sum, sub, mul, div
메소드   : 생성자를 통해서 데이터를 주입
        calc() - 합, 차, 곱, 몫을 계산
        getX()
        getY()
        getSum()
        getSub()
        getMul()
        getDiv()
        
[실행결과]
X      Y      SUM      SUB      MUL      DIV
320      258
 */
public class ComputeMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("x값을 입력해 주세요: ");
		int x = Integer.parseInt(br.readLine());
		
		System.out.print("y값을 입력해 주세요: ");
		int y = Integer.parseInt(br.readLine());
		Compute c = new Compute(x,y);
		c.calc();
		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV");
		System.out.println(c.getX()+"\t"+c.getY()+"\t"+c.getSum()+"\t"+
							c.getSub()+"\t"+c.getMul()+"\t"+c.getDiv());
	}
}
