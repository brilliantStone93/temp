package class_constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
x�� y�� ���� �޾Ƽ� ��,��,��,���� ���Ͻÿ�

Ŭ������ : Compute
�ʵ�      : x, y, sum, sub, mul, div
�޼ҵ�   : �����ڸ� ���ؼ� �����͸� ����
        calc() - ��, ��, ��, ���� ���
        getX()
        getY()
        getSum()
        getSub()
        getMul()
        getDiv()
        
[������]
X      Y      SUM      SUB      MUL      DIV
320      258
 */
public class ComputeMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("x���� �Է��� �ּ���: ");
		int x = Integer.parseInt(br.readLine());
		
		System.out.print("y���� �Է��� �ּ���: ");
		int y = Integer.parseInt(br.readLine());
		Compute c = new Compute(x,y);
		c.calc();
		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV");
		System.out.println(c.getX()+"\t"+c.getY()+"\t"+c.getSum()+"\t"+
							c.getSub()+"\t"+c.getMul()+"\t"+c.getDiv());
	}
}
