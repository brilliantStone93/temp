package abstractMethod;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class WindowTest extends Frame{
	
	public WindowTest() {
		setTitle("�̹���");
		setBounds(900, 100, 1000, 1000);
		setVisible(true);
		
	}
	
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image img = t.getImage("����.jpg");//�̹��� �ҷ�����
		
		//g.drawImage(img,0, 200, this);//�̹��� �׸���, �̹����� ���� �� *.bmp�� �� �ȵ� �׷��� ���� ������ �����̴� ������ ����
		
		//�̹��� �۰�
//		g.drawImage(img,
//				30,30,400,630,
//				0,0,600,840,
//				this);
		//4���� ��ǥ�� ���� �ǵ� �̰� ȭ�� ��ġ
		//�Ǵٸ� 4�� ��ǥ�� �����ǵ� �̰� �̹��� ũ��
		//this =>������ ���� ���̴�
		
		//�̹��� �Ųٷ�
		g.drawImage(img,
				400,630,30,30,
				0,0,600,840,
				this);
		
		
	}
	
	public static void main(String[] args) {
		new WindowTest();
		
	}
}
