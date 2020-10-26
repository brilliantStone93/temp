package nested;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//CardLayout
public class CardTest {
	private Frame frame; //Frame - BorderLayout
	private CardLayout card;
	
	
	
	public CardTest() {
		frame = new Frame();
		card  = new CardLayout();
		
		frame.setLayout(card);//������ ��������BorderLayout���� ������ �״� card�� �ٲ��ذ�
		
		//Panel 6��
		Panel[] p = new Panel[6];
		Color[] color = {Color.RED, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.CYAN, Color.YELLOW};
		String[] title = {"����", "�ʷ�","�Ķ�", "����", "�ϴ�", "���"};
		
		for(int i = 0; i< p.length; i++) {
			p[i] = new Panel();
			p[i].setBackground(color[i]);
			
			frame.add(p[i], title[i]);
			//�̺�Ʈ
			p[i].addMouseListener(new MouseAdapter(){
				
				@Override
				public void mouseClicked(MouseEvent e) {
					//card.show(frame, "�ϴ�");
					card.next(frame);//�������� �����޶�� �̾߱�
				}
			});
		}//for
		
				
		frame.setVisible(true);
		frame.setBounds(100, 100, 300, 300);
		
		//�̺�Ʈ
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		new CardTest();
		
	}
}
