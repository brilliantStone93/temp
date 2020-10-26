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
		
		this.setFont(new Font("���ü", Font.PLAIN, 24)); // PLAIN�� ����, BOLD(1)�� ����
		setForeground(Color.RED); // ���� �� ����
		
		setBounds(700, 200, 300, 100);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
		
		//������ ����������Ѵ�
		Thread t = new Thread(this); // ���� ������� ������ֱ� ���� this���
		//������ ���� - ������ ����(run())
		t.start();
		
	}//������

	
	@Override
	public void run() {
		while(true) {
			repaint();
			try {
				Thread.sleep(1000);// �⺻�� 1/1000�ʿ��� 1000�� �ָ� 1�� �������϶�� �̾߱�
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} 
			
		}//while
		
	}
	
	
	@Override
	public void paint(Graphics g) {
		SimpleDateFormat s = new SimpleDateFormat("HH�� mm�� ss�� ");
		
			Date d = new Date(); //�� ����� ����
			Calendar c = Calendar.getInstance();
			
			g.drawString(s.format(d), 50, 50);
		
	
	}//paint
	
	public static void main(String[] args) {
		new Clock();
	}//main

}//
