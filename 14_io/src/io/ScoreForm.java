package io;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ScoreForm extends JFrame implements ActionListener{
	private JLabel hakL, nameL, KorL, engL, mathL;//
	private JTextField hakT, nameT, korT, engT, mathT;
	private JButton inputB, printB, searchB, rankB, saveB, loadB;
	private DefaultTableModel model;
	private JTable table;
	private Vector<String> vector;
	private Score score;
	
	
	
	public ScoreForm() {
		super("��������");
		
		//JLabel 
		 hakL = new JLabel("�й�");
		 nameL = new JLabel("�̸�");
		 KorL = new JLabel("����");
		 engL = new JLabel("����");
		 mathL = new JLabel("����");

		//JTextField
		 hakT = new JTextField(30);

		 nameT = new JTextField(30);
		 korT = new JTextField(30);
		 engT = new JTextField(30);
		 mathT = new JTextField(30);
		 
		 //JButton
		 inputB = new JButton("�Է�");
		 printB = new JButton("���");
		 searchB = new JButton("�г�˻�");
		 rankB = new JButton("����");
		 saveB = new JButton("��������");
		 loadB = new JButton("�����б�");
		 
		 
		 vector = new Vector<String>();
		 vector.add("�й�");
		 vector.add("�̸�");
		 vector.add("����");
		 vector.add("����");
		 vector.add("����");
		 vector.add("����");
		 vector.add("���");
		 //DefaultTableModel
		 
		 model = new DefaultTableModel(vector, 0) {
			 @Override
			public boolean isCellEditable(int r, int c) {
				
				return (c!=0) ? true : false;
			}
		 };
		 
		 //JTable 
		 table = new JTable(model);
		 JScrollPane scroll = new JScrollPane(table);
		 
		
		 score = new ScoreImpl(); // Score�� �������̽����� �ڽ� Ŭ������ ����
		 
		
		 JPanel p1 = new JPanel();//FlowLayout(5, 30, 50)
		 
		 p1.add(hakL);
		 p1.add(hakT);

		 JPanel p2 = new JPanel();
		 p2.add(nameL);
		 p2.add(nameT);

		 JPanel p3 = new JPanel();
		 p3.add(KorL);
		 p3.add(korT);

		 JPanel p4 = new JPanel();
		 p4.add(engL);
		 p4.add(engT);

		 JPanel p5 = new JPanel();
		 p5.add(mathL);		 
		 p5.add(mathT);

		 //���� JPanel
		 JPanel inputP = new JPanel(new GridLayout(5,1));
		 inputP.add(p1);
		 inputP.add(p2);
		 inputP.add(p3);
		 inputP.add(p4);
		 inputP.add(p5);
		 
		 //�Ʒ� ��ư
		 JPanel jp2 = new JPanel(new GridLayout(1,6,3,3));
		 jp2.add(inputB);
		 jp2.add(printB);
		 jp2.add(searchB);
		 jp2.add(rankB);
		 jp2.add(saveB);
		 jp2.add(loadB);
		
		 
		 JPanel jp3 = new JPanel(new GridLayout(1,7));
		 jp3.add(scroll);
		 
		 Container con = this.getContentPane();
		 con.add("South", jp2);
		 con.add("Center", jp3);
		 con.add("West", inputP);
		 
		 
		setVisible(true);		
		setBounds(300,300, 1000,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
	}//������

	//�̺�Ʈ
	public void event() {
		inputB.addActionListener(this);
		printB.addActionListener(this);
		searchB.addActionListener(this);
		rankB.addActionListener(this);
		saveB.addActionListener(this);
		loadB.addActionListener(this);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == inputB) {
			//������
			String hak = hakT.getText();
			String name = nameT.getText();
			int kor = Integer.parseInt(korT.getText().trim());
			int eng = Integer.parseInt(engT.getText().trim());
			int math = Integer.parseInt(mathT.getText().trim());
			
						
			//ScoreDTO�� ����
			ScoreDTO dto = new ScoreDTO();
			dto.setHak(hak);
			dto.setName(name);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMath(math);
			
			//���� ��� ���
			dto.calc();
			
			//������ ����(������)
			score.input(dto);
			
			
			//JTable�� �� �ֱ�
			Vector<String> v = new Vector<String>();
			v.add(hak);
			v.add(name);
			v.add(kor+"");
			v.add(eng+"");
			v.add(math+"");
			v.add(dto.getTot()+"");
			v.add(dto.getAvg()+"");
			model.addRow(v);
			
			JOptionPane.showMessageDialog(this, "��� �Ϸ�!!");
			//�ʱ�ȭ
			hakT.setText("");
			nameT.setText("");
			korT.setText("");
			engT.setText("");
			mathT.setText("");
			
			
		}else if(e.getSource() == printB) {
			
			
			score.print(model); //list�� �׸��� ��� ������ JTable�� �Ѹ���
			
		}else if(e.getSource() == searchB) {
			score.search(model);
		}else if(e.getSource() == rankB) {
			score.tot_desc();
			score.print(model);
		}else if(e.getSource() == saveB) {
			score.save();
			
		}else if(e.getSource() == loadB) {
			score.load();
			score.print(model);
		}
		
	}

	
	

}