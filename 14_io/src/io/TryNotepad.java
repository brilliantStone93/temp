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
		super("���ܸ޸���");
		
		//�ؽ�Ʈâ, ��ũ�� ����
		output = new JTextArea();
		JScrollPane scroll = new JScrollPane(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		//���� ��ũ�� �� �׻����
		//HORIZONTAL�� ���� ���� ����
		
		menu = new MenuPane();
		this.setJMenuBar(menu);
		
		Container c = this.getContentPane();
		c.add("Center", scroll);
	
		setVisible(true);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
	}//������
	
	private void event() {
		//�̺�Ʈ
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
				int result = JOptionPane.showConfirmDialog(TryNotepad.this, "����� ������ �����Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
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
			int result = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?",
														"����", JOptionPane.YES_NO_CANCEL_OPTION,
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
		//if(file == null) return; //nullpointexcetpion�߻��� �ذ��� 1 
		
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(file)); // ���� file���� null�̾ fileWriter������ �ȵǾ� nullpointException�߻��Ѵ� �ذ����� �ΰ���
			String line = output.getText();
			br.write(line);
			br.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	private void saveDialog() {
		JFileChooser chooser = new JFileChooser(); 
		
		//������̾�α� 
		int result = chooser.showSaveDialog(this);
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			fileWrite(); //���⿡�ٰ��޼ҵ带 �־ file nullpointexception �ذ��� 2
		}
		JOptionPane.showMessageDialog(this, file);
		
		
	}

	private void fileRead() {
		output.setText("");
		//���⿡ ����ó���� �߻��ϴµ� �̶� throws�� ����ϸ� �ȵȴ� �ֳ��ϸ�
		//�� �޼ҵ带 ȣ����  actionPerformed�� �������̵�Ǿ��� ������ ������ �� ���� => ������� ����!
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			
			while((line = br.readLine()) != null) { // int Ÿ���� -1 String�� null���� ���ö����� �о��ָ� �ȴ� 
//				output.setText(line); �������
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
		
		//�Է´��̾�α� 
		chooser.showOpenDialog(this); // null������ ������ ���� â�� ������� ����� �ǹ̿��� â�� ������� ������ ���
									  //this�� �ϸ� â �߰��� ��
		int result = chooser.showOpenDialog(this);
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile(); //chooser.getSelectedFiles() �� ������ ������ �����ü� �ִ� file[]�̴�
			fileRead();
		}
		
		JOptionPane.showMessageDialog(this, file);
		
	}

	
	//=====main========================================
	public static void main(String[] args) {
		new TryNotepad().event();
	}

	

}