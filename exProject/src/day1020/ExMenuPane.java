package day1020;

import java.awt.Event;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class ExMenuPane extends JMenuBar{
	private JMenu fileM, editM, viewM;
	private JMenuItem newM, openM, saveM, exitM, cutM, copyM, pasteM;
	
	
	public ExMenuPane() {
		fileM = new JMenu("����");
		editM = new JMenu("����");
		viewM = new JMenu("����");
		
		newM = new JMenuItem("���θ����");
		openM = new JMenuItem("����");
		saveM = new JMenuItem("�����ϱ�");
		exitM = new JMenuItem("�����ϱ�");
		cutM  = new JMenuItem("�ڸ���");
		copyM = new JMenuItem("�����ϱ�");
		pasteM = new JMenuItem("�ٿ��ֱ�");
		
		
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
		
		//����� ����
		cutM.setAccelerator(KeyStroke.getKeyStroke('X', Event.ALT_MASK));
		copyM.setAccelerator(KeyStroke.getKeyStroke('C', Event.ALT_MASK));
		pasteM.setAccelerator(KeyStroke.getKeyStroke('V', Event.ALT_MASK));
		
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

	public JMenuItem getNewM() {
		return newM;
	}

	public JMenuItem getOpenM() {
		return openM;
	}

	public JMenuItem getSaveM() {
		return saveM;
	}

	public JMenuItem getExitM() {
		return exitM;
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

	
	
	
}