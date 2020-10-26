package exception;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//������ ��ư�� ��� ������ ���ڰ� ��� �ö󰡰�
//��ư���� ���� ���� ���ڰ� �������ϴ�
//�ٽ� ��ư�� ������ ���ڰ� �̾ ��� �ö󰣴�


public class ThreadOnOff extends Frame implements Runnable{
	private Button upBtn;
	private Label number;
	private boolean aa = true;
	private static int ii;
	
	public ThreadOnOff() {
		
		
		
		upBtn = new Button("���");
		number = new Label("0");
		number.setFont(new Font("���ü", Font.BOLD, 50));
		
		upBtn.setBounds(250, 150, 30, 30);
		number.setBounds(70, 30, 100, 100);
		
		add(upBtn);
		add(number);
		
		setLayout(null);
		
		setVisible(true);
		setBounds(500,500, 300, 200);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		//mouseListener
		upBtn.addMouseListener(new MouseAdapter() {
			Thread t;
			@Override
			public void mousePressed(MouseEvent e) {
				t = new Thread(ThreadOnOff.this);	
				t.start();
				
				aa = true;
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				t = null;
				
				aa= false;
			}
		});
		
		
	}//������
	
	
	@Override
	public void run() {
		int i = ii;
		
		while(true) {
			
			i++;
			ii = i;
			number.setText(i+"");
			if(!aa) break;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}//while
	}
		
	

	public static void main(String[] args) {
		new ThreadOnOff();
		
		
		
		
		
	}//main
	
	
}//
