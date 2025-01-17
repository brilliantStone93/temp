package swing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//강사님 보내주신 결과물 보고 틀잡기가 숙제
//가운데 내모난 박스는 canvas이다
public class MsPaint extends JFrame implements ActionListener{
   private JLabel x1L, y1L, x2L, y2L, z1L, z2L;
   private JTextField x1T, y1T, x2T, y2T, z1T, z2T;
   private JCheckBox fill;
   private JRadioButton line, circle, rect, roundRect, pen;
   private JComboBox<String> combo;
   private JButton draw;
   private DrCanvas can;
   private ArrayList<ShapeDTO> list = new ArrayList<ShapeDTO>();

   

   public static void main(String[] args) {
	   new MsPaint();
	   
	}//main
   
   
//   이너를 사용하면 편해지나 실무에서는 쪼개는것이 좋다
//   class DrCanvas extends Canvas {
//      public DrCanvas() {
//         this.setBackground(new Color(200,255,255));
//         
//      }
//      
//      @Override
//      public void paint(Graphics g) {
//    	  int x1;
//    	  
//    	  x1 = Integer.parseInt(x1T.getText());
//    	  System.out.println(x1);
//      }
//   }
   
   //생성자=============================================================
   public MsPaint() {
      super("미니 그림판");
      
      //라벨 생성
      x1L = new JLabel("X1");
      y1L = new JLabel("Y1");
      x2L = new JLabel("X2");
      y2L = new JLabel("Y2");
      z1L = new JLabel("Z1");
      z2L = new JLabel("Z2");
      
      //FTextField
      x1T = new JTextField("0",7);
      y1T = new JTextField("0",7);
      x2T = new JTextField("0",7);
      y2T = new JTextField("0",7);
      z1T = new JTextField("0",7);
      z2T = new JTextField("0",7);
      //()에 들어가는 숫자는 박스 크기를 정한다
      
      
      //JCheckBox fill
      fill = new JCheckBox("채우기", true);
      System.out.println(fill);
      
      //JRadioButton
      
      
      
      line = new JRadioButton("선");
      circle = new JRadioButton("원");
      rect = new JRadioButton("사각형", true); //true가 들어가면 시작할때부터 값이 잡혀있음
      roundRect = new JRadioButton("둥근사각형");
      pen = new JRadioButton("연필");
      
      ButtonGroup group = new ButtonGroup();
      group.add(line);
      group.add(circle);
      group.add(rect);
      group.add(roundRect);
      group.add(pen);
      
      
      
      //JComboBox<String>
      String color[] = {"빨강", "초록", "파랑", "보라", "하늘"};
      combo = new JComboBox<String>(color);
      
      //위에 스트링 배열로 처리 가능
//      combo.addItem("빨강");
//      combo.addItem("초록");
//      combo.addItem("파랑");
//      combo.addItem("보라");
//      combo.addItem("하늘");
      //=====================
      
      
      //JButton
      draw = new JButton("그리기");
      
      
      //DrCanvas
      can = new DrCanvas(this);
      
   
      
      //윗쪽
      JPanel north = new JPanel();//new GridLayout(1, 10, 10, 10)
      north.add(x1L);
      north.add(x1T);
      
      north.add(y1L);
      north.add(y1T);
                                                                                         
      north.add(x2L);
      north.add(x2T);
      
      north.add(y2L);
      north.add(y2T);
      
      north.add(z1L);
      north.add(z1T);
      
      north.add(z2L);
      north.add(z2T);
      
      north.add(fill);
     
      
      
      
      
      
      
      
      //아래쪽
      JPanel south = new JPanel();//new GridLayout(1, 10, 10, 10)
      south.add(line);
      south.add(circle);
      south.add(rect);
      south.add(roundRect);
      south.add(pen);
      south.add(combo);
      south.add(draw);
      
      
      Container c = this.getContentPane();
      c.add("North", north);
      c.add("Center", can); //중간 캔버스
      c.add("South", south);
     
      
      
      
      
   
      
      //창 생성
      setVisible(true);
      setBounds(300, 300, 1000, 500);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      //event
      draw.addActionListener(this);
      
      can.addMouseListener(new MouseAdapter() {
    	  @Override
    	public void mousePressed(MouseEvent e) {
    		x1T.setText(e.getX()+"");
    		y1T.setText(e.getY()+"");
    		
    	}
    	  
    	@Override
    	public void mouseReleased(MouseEvent e) {
    		//마우스를 손에서 때는 순간 정보를 ShapeDTO에 저장해야한다.
    		if(x1T.getText().equals(e.getX()+"") &&
    				y1T.getText().equals(e.getY()+"")) 	return;
//			드래그를 안한 상태에서 list가 추가되는 것을 막기 위한 식
    		//아래는 강사님 답안, if 조건에 추가하기엔 너무 길어서 아래와 같이 표현
//    		int x1 = Integer.parseInt(x1T.getText());
//    		int y1 = Integer.parseInt(y1T.getText());
//    		if(x1 == e.getX() && y1 == e.getY()) return;
    		
    		
    		insert();
    		can.repaint();
    		
    	}  
    	 //MouseListener에는 mouseDragged가 없다 따라서 (아래) 다른 걸 사용해줘야한다

		
	});
      
      can.addMouseMotionListener(new MouseAdapter() {
    	
      	@Override
      	public void mouseDragged(MouseEvent e) {
      		x2T.setText(e.getX()+"");
      		y2T.setText(e.getY()+"");
      		can.repaint();	
      			
      		if(pen.isSelected()) {
      			
      			
      			insert();
      			
      			x1T.setText(x2T.getText());
      			y1T.setText(y2T.getText());
      		}
      			

      			
      			
      	}
      	
      	      	
   
	});
      
   }//생성자==============================================

   @Override
   public void actionPerformed(ActionEvent e) {
	   if(e.getSource() == draw) {
		   can.repaint();
	   }
	   

   	
   }
  


   //getter=====================================
	public JTextField getX1T() {
		return x1T;
	}
	
	
	
	public JTextField getY1T() {
		return y1T;
	}
	
	
	
	public JTextField getX2T() {
		return x2T;
	}
	
	
	
	public JTextField getY2T() {
		return y2T;
	}
	
	
	
	public JTextField getZ1T() {
		return z1T;
	}
	
	
	
	public JTextField getZ2T() {
		return z2T;
	}
	
	
	
	public JCheckBox getFill() {
		return fill;
	}
	
	
	
	public JRadioButton getLine() {
		return line;
	}
	
	
	
	public JRadioButton getCircle() {
		return circle;
	}
	
	
	
	public JRadioButton getRect() {
		return rect;
	}
	
	
	
	public JRadioButton getRoundRect() {
		return roundRect;
	}
	
	
	
	public JRadioButton getPen() {
		return pen;
	}
	
	
	
	public JComboBox<String> getCombo() {
		return combo;
	}
	
	
	
	public JButton getDraw() {
		return draw;
	}
	
	public ArrayList<ShapeDTO> getList(){
		return list;
	}
//===================================================	
	
	
	
	public void insert() {
		ShapeDTO s = new ShapeDTO();
		
	
	// 좌표
	s.setX1(Integer.parseInt(getX1T().getText().trim()));
	s.setY1(Integer.parseInt(getY1T().getText().trim()));
	s.setX2(Integer.parseInt(getX2T().getText().trim()));
	s.setY2(Integer.parseInt(getY2T().getText().trim()));
	s.setZ1(Integer.parseInt(getZ1T().getText().trim()));
	s.setZ2(Integer.parseInt(getZ2T().getText().trim()));
	
	
	
	//채워지기

	s.setFill(getFill().isSelected());
	
	
	
	//모양
	if(getLine().isSelected()) {
		s.setShape(Figure.LINE);		
	}else if(getCircle().isSelected()) {
		s.setShape(Figure.CIRCLE);
	}else if(getRect().isSelected()) {
		s.setShape(Figure.RECT);
	}else if(getRoundRect().isSelected()) {
		s.setShape(Figure.ROUNDERECT);
	}else if(getPen().isSelected()) {
		s.setShape(Figure.PEN);
		
	}
	
	
	
	//색	
	s.setColor(combo.getSelectedIndex());
	
	//list에 추가
	list.add(s);
	System.out.println(list.size());
}//insert



   
   
   
}
