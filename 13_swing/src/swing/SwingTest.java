package swing;

import java.awt.Button;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame; // javax는 확장 패키지라고 한다.
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingTest extends JFrame implements ActionListener{
	private JButton newBtn, exitBtn;
	private JTextArea area;
	
	public SwingTest() {
		newBtn = new JButton("새파일",new ImageIcon("image/꽃.gif"));
		exitBtn = new JButton("종료");
		area = new JTextArea();
		JScrollPane scroll = new JScrollPane(area);
		
		setBounds(700, 100, 300, 400);
		setVisible(true);
		
		
		JPanel p = new JPanel();
		p.add(newBtn);
		p.add(exitBtn);
		
		add("North", p);
		add("Center", scroll);
	
		Container c= this.getContentPane(); // 박스로 포장해서 이사하는 방법
		c.add("North", p);
		c.add("Center", scroll);
		
		
		setBounds(700, 100, 300, 400);
		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE); EXIT_ON_CLOSE 는 창을 끄는 상수
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //DO_NOTHING_ON_CLOSE 창을 숨기지않고 그대로 두는 상수
		newBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(SwingTest.this, "정말 종료?", 
						"종료", JOptionPane.YES_NO_OPTION, 
						JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.YES_OPTION) System.exit(0);
				
			}
		});
	}
	
	public static void main(String[] args) {
		new SwingTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == newBtn) {
			area.setText("");
		}else if(e.getSource() == exitBtn) {
//			System.exit(0);
			int result = JOptionPane.showConfirmDialog(this, "정말 종료?", 
														"종료", JOptionPane.YES_NO_OPTION, 
														JOptionPane.QUESTION_MESSAGE); //상수는 JOptionPane예가 가지고있으니 앞에 붙여줘야함
			//parentComponent = 어디에 띄울거야
			// message = 변경된 내용을 저장하시겠습니까?
			// optionType = 확인, 취소 , 저장안함 버튼
			// messageType = 메세지 타입
			// title  제목
			if(result == JOptionPane.YES_OPTION) System.exit(0);//JOptionPane.YES_OPTION 이 값은 숫자 0임 / 0을 넣어도 성립
		}
		
	}
}
