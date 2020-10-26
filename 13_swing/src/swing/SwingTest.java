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
import javax.swing.JFrame; // javax�� Ȯ�� ��Ű����� �Ѵ�.
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingTest extends JFrame implements ActionListener{
	private JButton newBtn, exitBtn;
	private JTextArea area;
	
	public SwingTest() {
		newBtn = new JButton("������",new ImageIcon("image/��.gif"));
		exitBtn = new JButton("����");
		area = new JTextArea();
		JScrollPane scroll = new JScrollPane(area);
		
		setBounds(700, 100, 300, 400);
		setVisible(true);
		
		
		JPanel p = new JPanel();
		p.add(newBtn);
		p.add(exitBtn);
		
		add("North", p);
		add("Center", scroll);
	
		Container c= this.getContentPane(); // �ڽ��� �����ؼ� �̻��ϴ� ���
		c.add("North", p);
		c.add("Center", scroll);
		
		
		setBounds(700, 100, 300, 400);
		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE); EXIT_ON_CLOSE �� â�� ���� ���
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //DO_NOTHING_ON_CLOSE â�� �������ʰ� �״�� �δ� ���
		newBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(SwingTest.this, "���� ����?", 
						"����", JOptionPane.YES_NO_OPTION, 
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
			int result = JOptionPane.showConfirmDialog(this, "���� ����?", 
														"����", JOptionPane.YES_NO_OPTION, 
														JOptionPane.QUESTION_MESSAGE); //����� JOptionPane���� ������������ �տ� �ٿ������
			//parentComponent = ��� ���ž�
			// message = ����� ������ �����Ͻðڽ��ϱ�?
			// optionType = Ȯ��, ��� , ������� ��ư
			// messageType = �޼��� Ÿ��
			// title  ����
			if(result == JOptionPane.YES_OPTION) System.exit(0);//JOptionPane.YES_OPTION �� ���� ���� 0�� / 0�� �־ ����
		}
		
	}
}
