package io;

import java.awt.Event;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuPane extends JMenuBar {
	private JMenu fileM, editM, viewM;
	private JMenuItem newM, openM, saveM, exitM, cutM, copyM, pasteM;
	private TryNotepad t;
	
	
	public MenuPane() {
		fileM = new JMenu("파일");
		editM = new JMenu("편집");
		viewM = new JMenu("보기");
		
		
		newM = new JMenuItem("새로만들기");
		openM = new JMenuItem("열기");
		saveM = new JMenuItem("저장하기");
		exitM= new JMenuItem("나가기");
		cutM= new JMenuItem("자르기");
		copyM= new JMenuItem("복사하기");
		pasteM= new JMenuItem("붙여넣기");
		
		
		fileM.add(newM);
		fileM.add(openM);
		fileM.add(saveM);
		fileM.add(exitM);
		
		editM.add(cutM);
		editM.add(copyM);
		editM.add(pasteM);
		
		
		
		
		add(fileM);
		add(editM);
		add(viewM);
		
		//단축키
		
		cutM.setAccelerator(KeyStroke.getKeyStroke('X', Event.ALT_MASK)); // Alt + X
		copyM.setAccelerator(KeyStroke.getKeyStroke('C', Event.ALT_MASK)); // Alt + C
		pasteM.setAccelerator(KeyStroke.getKeyStroke('V', Event.ALT_MASK)); // Alt + V
		
		
		
	}//생성자

	public JMenuItem getExitM() {
		return exitM;
	}
	
	public JMenuItem getNewM() {
		return newM;
	}

	public JMenu getFileM() {
		return fileM;
	}

	public JMenu getEditM() {
		return editM;
	}

	public JMenu getViewM() {
		return viewM;
	}

	public JMenuItem getOpenM() {
		return openM;
	}

	public JMenuItem getSaveM() {
		return saveM;
	}

	public JMenuItem getCutM() {
		return cutM;
	}

	public JMenuItem getCopyM() {
		return copyM;
	}

	public JMenuItem getPasteM() {
		return pasteM;
	}

	public TryNotepad getT() {
		return t;
	}
	

	
	
	
}//
