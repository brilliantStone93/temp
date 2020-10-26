package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTest implements Runnable{
	private long depositeMoney = 100000;//잔액
	private long balance;//찾고자 하는 금액
	
	
	
	
	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		//스레드 생성
		Thread mom = new Thread(atm); // 생성시 생성자에 (atm, "엄마")이렇게 해주면 이름까지 설정 가능
		Thread son = new Thread(atm);
		//스레드 시작 - 스레드 실행 => run실행
		mom.start();
		son.start();
		
		mom.setName("엄마");
		son.setName("아들");
		
	}//main




	@Override
	public synchronized void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(Thread.currentThread().getName()+"님 안녕하세요"	); // 현재 들어온 스래드가 무엇인지 보여주는 매소드
		
		System.out.print("찾고자하는 금액 입력:");
		try {
			balance = Long.parseLong(br.readLine());
			if(balance % 10000 != 0) {
				System.out.println("만원 단위로 입력하세요");
				System.out.println("찾고자하는 금액 입력:");
				balance = Long.parseLong(br.readLine());
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// throws로 사용하지 않는 이유는 오버라이드 되어있기 때문에 바꿀수없어서 내용을 바꿔주는 것
		//잔액계산	
		
		if(depositeMoney >= balance) {
			System.out.println("잔액은"+(depositeMoney - balance)+"원 입니다");
			depositeMoney = depositeMoney - balance;
		}else if(depositeMoney < balance) {
			System.out.println("잔액부족");
		}
		
		
	}//run	
	
	
	
	
}//
