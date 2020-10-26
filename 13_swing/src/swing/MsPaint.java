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

//����� �����ֽ� ����� ���� Ʋ��Ⱑ ����
//��� ���� �ڽ��� canvas�̴�
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
   
   
//   �̳ʸ� ����ϸ� �������� �ǹ������� �ɰ��°��� ����
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
   
   //������=============================================================
   public MsPaint() {
      super("�̴� �׸���");
      
      //�� ����
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
      //()�� ���� ���ڴ� �ڽ� ũ�⸦ ���Ѵ�
      
      
      //JCheckBox fill
      fill = new JCheckBox("ä���", true);
      System.out.println(fill);
      
      //JRadioButton
      
      
      
      line = new JRadioButton("��");
      circle = new JRadioButton("��");
      rect = new JRadioButton("�簢��", true); //true�� ���� �����Ҷ����� ���� ��������
      roundRect = new JRadioButton("�ձٻ簢��");
      pen = new JRadioButton("����");
      
      ButtonGroup group = new ButtonGroup();
      group.add(line);
      group.add(circle);
      group.add(rect);
      group.add(roundRect);
      group.add(pen);
      
      
      
      //JComboBox<String>
      String color[] = {"����", "�ʷ�", "�Ķ�", "����", "�ϴ�"};
      combo = new JComboBox<String>(color);
      
      //���� ��Ʈ�� �迭�� ó�� ����
//      combo.addItem("����");
//      combo.addItem("�ʷ�");
//      combo.addItem("�Ķ�");
//      combo.addItem("����");
//      combo.addItem("�ϴ�");
      //=====================
      
      
      //JButton
      draw = new JButton("�׸���");
      
      
      //DrCanvas
      can = new DrCanvas(this);
      
   
      
      //����
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
     
      
      
      
      
      
      
      
      //�Ʒ���
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
      c.add("Center", can); //�߰� ĵ����
      c.add("South", south);
     
      
      
      
      
   
      
      //â ����
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
    		//���콺�� �տ��� ���� ���� ������ ShapeDTO�� �����ؾ��Ѵ�.
    		if(x1T.getText().equals(e.getX()+"") &&
    				y1T.getText().equals(e.getY()+"")) 	return;
//			�巡�׸� ���� ���¿��� list�� �߰��Ǵ� ���� ���� ���� ��
    		//�Ʒ��� ����� ���, if ���ǿ� �߰��ϱ⿣ �ʹ� �� �Ʒ��� ���� ǥ��
//    		int x1 = Integer.parseInt(x1T.getText());
//    		int y1 = Integer.parseInt(y1T.getText());
//    		if(x1 == e.getX() && y1 == e.getY()) return;
    		
    		
    		insert();
    		can.repaint();
    		
    	}  
    	 //MouseListener���� mouseDragged�� ���� ���� (�Ʒ�) �ٸ� �� ���������Ѵ�

		
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
      
   }//������==============================================

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
		
	
	// ��ǥ
	s.setX1(Integer.parseInt(getX1T().getText().trim()));
	s.setY1(Integer.parseInt(getY1T().getText().trim()));
	s.setX2(Integer.parseInt(getX2T().getText().trim()));
	s.setY2(Integer.parseInt(getY2T().getText().trim()));
	s.setZ1(Integer.parseInt(getZ1T().getText().trim()));
	s.setZ2(Integer.parseInt(getZ2T().getText().trim()));
	
	
	
	//ä������

	s.setFill(getFill().isSelected());
	
	
	
	//���
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
	
	
	
	//��	
	s.setColor(combo.getSelectedIndex());
	
	//list�� �߰�
	list.add(s);
	System.out.println(list.size());
}//insert



   
   
   
}