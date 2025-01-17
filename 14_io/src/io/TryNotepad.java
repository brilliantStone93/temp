package io;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class TryNotepad extends JFrame implements ActionListener{
	private JTextArea output;
	private MenuPane menu;
	private File file;
	
	
	
	public TryNotepad() {
		super("간단메모장");
		
		//텍스트창, 스크롤 제작
		output = new JTextArea();
		JScrollPane scroll = new JScrollPane(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		//세로 스크롤 바 항상띄우기
		//HORIZONTAL로 가면 가로 띄우기
		
		menu = new MenuPane();
		this.setJMenuBar(menu);
		
		Container c = this.getContentPane();
		c.add("Center", scroll);
	
		setVisible(true);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
	}//생성자
	
	private void event() {
		//이벤트
		menu.getExitM().addActionListener(this);
		menu.getNewM().addActionListener(this);
		menu.getOpenM().addActionListener(this);
		menu.getSaveM().addActionListener(this);
		menu.getCutM().addActionListener(this);
		menu.getCopyM().addActionListener(this);
		menu.getPasteM().addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(TryNotepad.this, "변경된 내용을 저장하시겠습니까?", "종료", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.YES_OPTION) {
					saveDialog();
					System.exit(0);
				}else if(result == JOptionPane.NO_OPTION) {
					System.exit(0);
				}else if(result == JOptionPane.CANCEL_OPTION) {
					return;
				}
			}
		});

		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() ==menu.getExitM()) {
			int result = JOptionPane.showConfirmDialog(this, "저장하시겠습니까?",
														"종료", JOptionPane.YES_NO_CANCEL_OPTION,
														JOptionPane.QUESTION_MESSAGE);
			if(result == JOptionPane.YES_OPTION) {
				saveDialog();
				System.exit(0);
			}else if(result == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
			
			
		}else if(e.getSource() ==menu.getNewM()) {
			output.setText("");			
		}else if(e.getSource() ==menu.getOpenM()) {
			openDialog();
			//fileRead();
			
		}else if(e.getSource() ==menu.getSaveM()) {
			saveDialog();
			//fileWrite();
			
		}else if(e.getSource() ==menu.getCutM()) {
			output.cut();
		}else if(e.getSource() ==menu.getCopyM()) {
			output.copy();
		}else if(e.getSource() ==menu.getPasteM())
			output.paste();
		
		
	}
	

	
	private void fileWrite() {
		//if(file == null) return; //nullpointexcetpion발생시 해결방안 1 
		
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(file)); // 여기 file값이 null이어서 fileWriter생성이 안되어 nullpointException발생한다 해결방법은 두가지
			String line = output.getText();
			br.write(line);
			br.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	private void saveDialog() {
		JFileChooser chooser = new JFileChooser(); 
		
		//저장다이얼로그 
		int result = chooser.showSaveDialog(this);
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			fileWrite(); //여기에다가메소드를 넣어서 file nullpointexception 해결방안 2
		}
		JOptionPane.showMessageDialog(this, file);
		
		
	}

	private void fileRead() {
		output.setText("");
		//여기에 예외처리가 발생하는데 이때 throws를 사용하면 안된다 왜냐하면
		//이 메소드를 호출한  actionPerformed가 오버라이드되었기 때문에 변경할 수 없다 => 연쇄반응 조심!
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			
			while((line = br.readLine()) != null) { // int 타입은 -1 String은 null값이 나올때까지 읽어주면 된다 
//				output.setText(line); 덮어쓰기임
				output.append(line+"\n");
				
			}//while
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void openDialog() {
		JFileChooser chooser = new JFileChooser(); // 
		
		//입력다이얼로그 
		chooser.showOpenDialog(this); // null값으로 넣으면 여기 창과 관계없이 띄우라는 의미여서 창과 관계없는 곳에서 뜬다
									  //this로 하면 창 중간에 뜸
		int result = chooser.showOpenDialog(this);
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile(); //chooser.getSelectedFiles() 는 여러개 파일을 가져올수 있는 file[]이다
			fileRead();
		}
		
		JOptionPane.showMessageDialog(this, file);
		
	}

	
	//=====main========================================
	public static void main(String[] args) {
		new TryNotepad().event();
	}

	

}
