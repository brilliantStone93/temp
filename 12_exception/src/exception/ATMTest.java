package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTest implements Runnable{
	private long depositeMoney = 100000;//�ܾ�
	private long balance;//ã���� �ϴ� �ݾ�
	
	
	
	
	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		//������ ����
		Thread mom = new Thread(atm); // ������ �����ڿ� (atm, "����")�̷��� ���ָ� �̸����� ���� ����
		Thread son = new Thread(atm);
		//������ ���� - ������ ���� => run����
		mom.start();
		son.start();
		
		mom.setName("����");
		son.setName("�Ƶ�");
		
	}//main




	@Override
	public synchronized void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(Thread.currentThread().getName()+"�� �ȳ��ϼ���"	); // ���� ���� �����尡 �������� �����ִ� �żҵ�
		
		System.out.print("ã�����ϴ� �ݾ� �Է�:");
		try {
			balance = Long.parseLong(br.readLine());
			if(balance % 10000 != 0) {
				System.out.println("���� ������ �Է��ϼ���");
				System.out.println("ã�����ϴ� �ݾ� �Է�:");
				balance = Long.parseLong(br.readLine());
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// throws�� ������� �ʴ� ������ �������̵� �Ǿ��ֱ� ������ �ٲܼ���� ������ �ٲ��ִ� ��
		//�ܾװ��	
		
		if(depositeMoney >= balance) {
			System.out.println("�ܾ���"+(depositeMoney - balance)+"�� �Դϴ�");
			depositeMoney = depositeMoney - balance;
		}else if(depositeMoney < balance) {
			System.out.println("�ܾ׺���");
		}
		
		
	}//run	
	
	
	
	
}//
