package exception;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//������ ��ư�� ��� ������ ���ڰ� ��� �ö󰡰�
//��ư���� ���� ���� ���ڰ� �������ϴ�
//�ٽ� ��ư�� ������ ���ڰ� �̾ ��� �ö󰣴�

public class Ex extends Frame {
	private Button bt;
	private Label number;
	private int a;

	
	public Ex() {
		bt = new Button("�����ÿ�");
		number = new Label("0");
		number.setFont(new Font("�������", Font.BOLD, 100));	
		setVisible(true);
		setBounds(300,300, 500,500);
		setLayout(null);
		
		bt.setBounds(430, 430, 50, 40);
		number.setBounds(200, 200, 200, 200);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		add(bt);
		add(number);
		
		
		
		Thread t = new Thread() {
			@Override
			public void run() {
				
				while(true) {
					a++;
					number.setText(a+"");
				}
			}
		};
	}//������
	
	
	
	
	public static void main(String[] args) {
		new Ex();
	}//main
	
}//
