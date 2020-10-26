package exception;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//누르기 버튼을 계속 누르면 숫자가 계속 올라가고
//버튼에서 손을 때면 숫자가 정지도니다
//다시 버튼을 누르면 숫자가 이어서 계속 올라간다

public class Ex extends Frame {
	private Button bt;
	private Label number;
	private int a;

	
	public Ex() {
		bt = new Button("누르시오");
		number = new Label("0");
		number.setFont(new Font("나눔고딕", Font.BOLD, 100));	
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
	}//생성자
	
	
	
	
	public static void main(String[] args) {
		new Ex();
	}//main
	
}//
