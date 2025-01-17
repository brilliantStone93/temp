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
		super("성적관리");
		
		//JLabel 
		 hakL = new JLabel("학번");
		 nameL = new JLabel("이름");
		 KorL = new JLabel("국어");
		 engL = new JLabel("영어");
		 mathL = new JLabel("수학");

		//JTextField
		 hakT = new JTextField(30);

		 nameT = new JTextField(30);
		 korT = new JTextField(30);
		 engT = new JTextField(30);
		 mathT = new JTextField(30);
		 
		 //JButton
		 inputB = new JButton("입력");
		 printB = new JButton("출력");
		 searchB = new JButton("학년검색");
		 rankB = new JButton("순위");
		 saveB = new JButton("파일저장");
		 loadB = new JButton("파일읽기");
		 
		 
		 vector = new Vector<String>();
		 vector.add("학번");
		 vector.add("이름");
		 vector.add("국어");
		 vector.add("영어");
		 vector.add("수학");
		 vector.add("총점");
		 vector.add("평균");
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
		 
		
		 score = new ScoreImpl(); // Score가 인터페이스여서 자식 클래스로 생성
		 
		
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

		 //왼쪽 JPanel
		 JPanel inputP = new JPanel(new GridLayout(5,1));
		 inputP.add(p1);
		 inputP.add(p2);
		 inputP.add(p3);
		 inputP.add(p4);
		 inputP.add(p5);
		 
		 //아래 버튼
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
		
		
		
		
	}//생성자

	//이벤트
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
			//데이터
			String hak = hakT.getText();
			String name = nameT.getText();
			int kor = Integer.parseInt(korT.getText().trim());
			int eng = Integer.parseInt(engT.getText().trim());
			int math = Integer.parseInt(mathT.getText().trim());
			
						
			//ScoreDTO에 저장
			ScoreDTO dto = new ScoreDTO();
			dto.setHak(hak);
			dto.setName(name);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMath(math);
			
			//총점 평균 계산
			dto.calc();
			
			//데이터 보관(모으기)
			score.input(dto);
			
			
			//JTable에 값 넣기
			Vector<String> v = new Vector<String>();
			v.add(hak);
			v.add(name);
			v.add(kor+"");
			v.add(eng+"");
			v.add(math+"");
			v.add(dto.getTot()+"");
			v.add(dto.getAvg()+"");
			model.addRow(v);
			
			JOptionPane.showMessageDialog(this, "등록 완료!!");
			//초기화
			hakT.setText("");
			nameT.setText("");
			korT.setText("");
			engT.setText("");
			mathT.setText("");
			
			
		}else if(e.getSource() == printB) {
			
			
			score.print(model); //list의 항목을 모두 꺼내서 JTable에 뿌리기
			
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
