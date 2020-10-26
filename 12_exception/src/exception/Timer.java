package exception;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Timer extends Frame implements ActionListener, Runnable{
	private Label label;
	private Button startBtn, stopBtn;
	private boolean aa = true;
	
	
	public Timer() {
		
		label = new Label("0");
		label.setFont(new Font("고딕체", Font.BOLD, 85)); //bold는 고딕체
		label.setForeground(Color.BLUE);
		startBtn = new Button("시작");
		stopBtn = new Button("정지");
		
		label.setBounds(70, 30, 100, 100);
		startBtn.setBounds(200, 40, 60, 30);
		stopBtn.setBounds(200, 80, 60, 30);
		
		add(label);
		add(startBtn);
		add(stopBtn);
		
		startBtn.setEnabled(true);
		stopBtn.setEnabled(false);
		
		
		setLayout(null); // Layout을 null로 깨면 동서남북이 없어짐
		setTitle("타이머");
		setVisible(true);
		setBounds(700, 200 , 300, 200);
		
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		//event
		
		startBtn.addActionListener(this);
		stopBtn.addActionListener(this);
		
		
		
		
	}//Timer생성자
	
	//actionPerformed
	@Override
	public void actionPerformed(ActionEvent e) {
		Thread t;
		if(e.getSource() == startBtn) {
			//스래드 생성
			t = new Thread(this);
			//스래드 시작
			t.start();
			
			aa = true;
			
			//시작버튼 비활성
			startBtn.setEnabled(false);
			
			
			//정지버튼 활성
			stopBtn.setEnabled(true);
			
			
			
			
			
			
		}else if(e.getSource() == stopBtn) {
			//스래드 종료
			aa= false;
			
			t = null;
			startBtn.setEnabled(true);
			stopBtn.setEnabled(false);
			
		}
		
	}
	
	
	
	@Override
	public void run() {
		int i;
		for(i = 1; i<=100; i++) {
			label.setText(i+"");
			
			if(!aa) break;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}//for
		startBtn.setEnabled(true);
		stopBtn.setEnabled(false);
	}
	
	
	
	
	public static void main(String[] args) {
		new Timer();
	}//main

	


















	
}//
