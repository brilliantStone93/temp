package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame{
	
	
	
	
	public WindowTest() {//����
		super("���� ���� ������");//�θ������ ȣ��
		//setTitle("��������������")
		
		System.out.println("����");
		
		//setBackground(Color.MAGENTA);//������
		this.setBackground(new Color(1, 186, 140));//������
		setForeground(Color.YELLOW);//���� ���� �ٲ���
		
		//âũ��
			
		setBounds(700,100,300,400);
		setSize(300, 400);
		setVisible(true);
	}
	
	public void paint(Graphics g) {//����
		g.drawString("����", 100, 80);
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
