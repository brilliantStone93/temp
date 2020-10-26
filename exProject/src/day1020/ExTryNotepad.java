package day1020;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class ExTryNotepad extends JFrame implements ActionListener{
	private ExMenuPane emp;
	private JTextArea ja;
	
	public ExTryNotepad() {
		super("간의 메모장");
		ja = new JTextArea();
		emp = new ExMenuPane();
		
		this.setJMenuBar(emp);
		JScrollPane scroll = new JScrollPane(ja);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		Container c = this.getContentPane();
		c.add("Center", scroll);
		
		
		setVisible(true);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		
		
	}//생성자
	
	private void event() {
		emp.getNewM().addActionListener(this);
		emp.getOpenM().addActionListener(this);
		emp.getSaveM().addActionListener(this);
		emp.getExitM().addActionListener(this);
		emp.getCutM().addActionListener(this);
		emp.getCopyM().addActionListener(this);
		emp.getPasteM().addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result =JOptionPane.showConfirmDialog(ExTryNotepad.this, "변경된 내용 저장?", "종료창", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.YES_OPTION) {
					
				}else if(result == JOptionPane.NO_OPTION) {
					System.exit(0);
				}else if(result == JOptionPane.CANCEL_OPTION) {
					return;
				}
			
			
			
			}
		});
		
		
		
	}//event
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == emp.getNewM() ) {
			ja.setText("");
		}else if(e.getSource() == emp.getOpenM()) {
			
		}else if(e.getSource() == emp.getSaveM()) {
			
		}else if(e.getSource() == emp.getExitM()) {
			System.exit(0);
		}else if(e.getSource() == emp.getCutM()) {
			ja.cut();
		}else if(e.getSource() == emp.getCopyM()) {
			ja.copy();
		}else if(e.getSource() == emp.getPasteM()) {
			ja.paste();
		}
			
		
	}

	public static void main(String[] args) {
		new ExTryNotepad().event();
		
	}//main

	
}//
