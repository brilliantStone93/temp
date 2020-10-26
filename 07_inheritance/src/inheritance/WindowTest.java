package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame{
	
	
	
	
	public WindowTest() {//구현
		super("내가 만든 윈도우");//부모생성자 호출
		//setTitle("내가만든윈도우")
		
		System.out.println("도형");
		
		//setBackground(Color.MAGENTA);//바탕색
		this.setBackground(new Color(1, 186, 140));//바탕색
		setForeground(Color.YELLOW);//선의 색을 바꿔줌
		
		//창크기
			
		setBounds(700,100,300,400);
		setSize(300, 400);
		setVisible(true);
	}
	
	public void paint(Graphics g) {//구현
		g.drawString("도형", 100, 80);
		g.drawLine(70, 120, 200, 300);
		g.drawLine(200, 120, 70, 300);
		g.drawRect(70, 120, 130, 180);
		g.drawOval(70, 120, 130, 180);
		
	}
	public static void main(String[] args) {
		WindowTest aa = new WindowTest();
		new WindowTest();
		
	}//main
}//
