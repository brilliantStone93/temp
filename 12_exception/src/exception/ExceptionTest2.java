package exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExceptionTest2 {
	private int dan;
	
	private void input() throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���ϴ� ���� �Է� : ");
		dan = Integer.parseInt(br.readLine());
				
	}
	
	private void output() {
		if(dan >= 2 && dan <= 9) {
		
			for(int i  = 1; i < 10; i++) {
				int result = dan * i;
				System.out.println(dan+" * "+i+" = "+result);
				
			}
			
		}else {
			//System.out.println("���� �ʰ�");
			
			try {
				//������ Exception �߻�
				//throw new Exception();// throws�� ������ ��� throw�� ������ �߻���Ų��
				throw new MakeException("���� �ʰ�");//MakeExceptionŬ�������� ��������
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException  {
		ExceptionTest2 e = new ExceptionTest2();
		e.input();
		e.output();
		
	}
	//����Ͽ� ���� �޼ҵ� ���ٶ��̵� �� �� throws�� ����� �� ���� �ֳ��ϸ� �θ�� �ڽ��� ���� ���¸� �����־���ϱ� ����
	
	
	
}
