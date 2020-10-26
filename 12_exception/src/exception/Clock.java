package exception;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Clock extends Frame implements Runnable{
	
	public Clock() {
		
		this.setFont(new Font("고딕체", Font.PLAIN, 24)); // PLAIN은 보통, BOLD(1)는 굵게
		setForeground(Color.RED); // 글자 색 지정
		
		setBounds(700, 200, 300, 100);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
		
		//스레드 생성해줘야한다
		Thread t = new Thread(this); // 나를 스레드로 만들어주기 위해 this사용
		//스레드 시작 - 스레드 실행(run())
		t.start();
		
	}//생성자

	
	@Override
	public void run() {
		while(true) {
			repaint();
			try {
				Thread.sleep(1000);// 기본이 1/1000초여서 1000을 주면 1초 딜레이하라는 이야기
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} 
			
		}//while
		
	}
	
	
	@Override
	public void paint(Graphics g) {
		SimpleDateFormat s = new SimpleDateFormat("HH시 mm분 ss초 ");
		
			Date d = new Date(); //이 방법도 있음
			Calendar c = Calendar.getInstance();
			
			g.drawString(s.format(d), 50, 50);
		
	
	}//paint
	
	public static void main(String[] args) {
		new Clock();
	}//main

}//
