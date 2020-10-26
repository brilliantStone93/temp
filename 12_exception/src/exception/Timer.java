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
		label.setFont(new Font("���ü", Font.BOLD, 85)); //bold�� ���ü
		label.setForeground(Color.BLUE);
		startBtn = new Button("����");
		stopBtn = new Button("����");
		
		label.setBounds(70, 30, 100, 100);
		startBtn.setBounds(200, 40, 60, 30);
		stopBtn.setBounds(200, 80, 60, 30);
		
		add(label);
		add(startBtn);
		add(stopBtn);
		
		startBtn.setEnabled(true);
		stopBtn.setEnabled(false);
		
		
		setLayout(null); // Layout�� null�� ���� ���������� ������
		setTitle("Ÿ�̸�");
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
		
		
		
		
	}//Timer������
	
	//actionPerformed
	@Override
	public void actionPerformed(ActionEvent e) {
		Thread t;
		if(e.getSource() == startBtn) {
			//������ ����
			t = new Thread(this);
			//������ ����
			t.start();
			
			aa = true;
			
			//���۹�ư ��Ȱ��
			startBtn.setEnabled(false);
			
			
			//������ư Ȱ��
			stopBtn.setEnabled(true);
			
			
			
			
			
			
		}else if(e.getSource() == stopBtn) {
			//������ ����
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
