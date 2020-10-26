package nested;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RGBTest extends Frame implements ActionListener {
	private Button red, blue, green;
	private DrCanvas can;
	
	//Canvas - rayout�� ���� (null)
	class DrCanvas extends Canvas {
		public DrCanvas() {
			this.setBackground(new Color(255,255,0));
			
		}
		
		@Override
		public void paint(Graphics g) {
			g.drawString("�ٺ�", 100, 100);
		}
	}//DrCanvas
	
	public RGBTest() {
		red = new Button("����");
		blue = new Button("�Ķ�");
		green = new Button("�ʷ�");
		can = new DrCanvas();
	
		//â�����
		setVisible(true);
		setBounds(100, 300 , 300, 300);
		
		//��ư ����
		Panel panel = new Panel();//Panel - FlowLayout(������ġ-�߾�)
//		panel.setLayout(new GridLayout(1, 3));//GridLayout(�࿭ �迭) �յ��ϰ� ���� ũ��� �߶��ִ� ��
		panel.setLayout(new GridLayout(1, 3, 5, 0));//new GridLayout(��, ��, ���ο���, ���ο���)
		panel.add(red);
		panel.add(blue);
		panel.add(green);
		add("North", panel);
		add("Center",can);
		//event
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.addMouseListener(new MouseAdapter() {
			
		});
		
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		
		
		
		
	}
	
	
	
	
	//ActcionListener
	@Override
	public void actionPerformed(ActionEvent g) {
		if(g.getSource() == red) {
			can.setBackground(new Color(255, 0, 0));
		}else if(g.getSource() == blue) {
			can.setBackground(new Color(0, 0, 255));
		}else if(g.getSource() == green) {
			can.setBackground(new Color(0, 255, 0));
		}
		
	}
	
	public static void main(String[] args) {
		new RGBTest();
		
	}

	
}


//package nested;
//
//import java.awt.Button;
//import java.awt.Canvas;
//import java.awt.Color;
//import java.awt.Frame;
//import java.awt.Graphics;
//import java.awt.GridLayout;
//import java.awt.Panel;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
////Frame - BorderLayout(��������)
//public class RGBTest extends Frame {
//   private Button redBtn, greenBtn, blueBtn;
//   private DrCanvas can;
//   
//   public RGBTest() {
//      redBtn = new Button("����");
//      greenBtn = new Button("�ʷ�");
//      blueBtn = new Button("�Ķ�");
//      can = new DrCanvas();
//      
//      Panel p = new Panel();//Panel - FlowLayout(������ġ-�߾�)
//      //p.setLayout(new GridLayout(1, 3)); //GridLayout(�࿭��ġ, �յ�迭), new GridLayout(��, ��, ���ο���, ���ο���)
//      p.setLayout(new GridLayout(1, 3, 5, 0));
//      p.add(redBtn);
//      p.add(greenBtn);
//      p.add(blueBtn);
//      
//      add("North", p);
//      add("Center", can);
//      
//      setBounds(700,200,300,400);
//      setVisible(true);
//      
//      //�̺�Ʈ
//      addWindowListener(new WindowAdapter() {
//         @Override
//         public void windowClosing(WindowEvent e) {
//            System.exit(0);
//         }
//      });
//      
//      //�̺�Ʈ
//      redBtn.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent e) {
//            can.setBackground(Color.RED);
//         }
//      });
//      
//      greenBtn.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent e) {
//            can.setBackground(Color.GREEN);
//         }
//      });
//      
//      blueBtn.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent e) {
//            can.setBackground(Color.BLUE);
//         }
//      });
//   }
//
//   //Canvas - null (Layout �� ����)
//   class DrCanvas extends Canvas {
//      public DrCanvas() {
//         this.setBackground(new Color(255,255,0));
//      }
//      
//      @Override
//      public void paint(Graphics g) {
//         g.drawString("�ٺ�", 100, 100);
//      }
//   }//class Canvas
//   
//   public static void main(String[] args) {
//      new RGBTest();
//      
//   }
//}
