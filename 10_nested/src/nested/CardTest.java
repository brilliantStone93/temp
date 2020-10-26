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
		
		frame.setLayout(card);//기존에 동서남북BorderLayout에서 층층이 쌓는 card로 바꿔준것
		
		//Panel 6장
		Panel[] p = new Panel[6];
		Color[] color = {Color.RED, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.CYAN, Color.YELLOW};
		String[] title = {"빨강", "초록","파랑", "보라", "하늘", "노랑"};
		
		for(int i = 0; i< p.length; i++) {
			p[i] = new Panel();
			p[i].setBackground(color[i]);
			
			frame.add(p[i], title[i]);
			//이벤트
			p[i].addMouseListener(new MouseAdapter(){
				
				@Override
				public void mouseClicked(MouseEvent e) {
					//card.show(frame, "하늘");
					card.next(frame);//다음장을 보여달라는 이야기
				}
			});
		}//for
		
				
		frame.setVisible(true);
		frame.setBounds(100, 100, 300, 300);
		
		//이벤트
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
