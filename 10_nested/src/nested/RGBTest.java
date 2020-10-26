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
	
	//Canvas - rayout이 없다 (null)
	class DrCanvas extends Canvas {
		public DrCanvas() {
			this.setBackground(new Color(255,255,0));
			
		}
		
		@Override
		public void paint(Graphics g) {
			g.drawString("바보", 100, 100);
		}
	}//DrCanvas
	
	public RGBTest() {
		red = new Button("빨강");
		blue = new Button("파랑");
		green = new Button("초록");
		can = new DrCanvas();
	
		//창만들기
		setVisible(true);
		setBounds(100, 300 , 300, 300);
		
		//버튼 생성
		Panel panel = new Panel();//Panel - FlowLayout(순서배치-중앙)
//		panel.setLayout(new GridLayout(1, 3));//GridLayout(행열 배열) 균등하게 같은 크기로 잘라주는 것
		panel.setLayout(new GridLayout(1, 3, 5, 0));//new GridLayout(행, 열, 가로여백, 세로여백)
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
////Frame - BorderLayout(동서남북)
//public class RGBTest extends Frame {
//   private Button redBtn, greenBtn, blueBtn;
//   private DrCanvas can;
//   
//   public RGBTest() {
//      redBtn = new Button("빨강");
//      greenBtn = new Button("초록");
//      blueBtn = new Button("파랑");
//      can = new DrCanvas();
//      
//      Panel p = new Panel();//Panel - FlowLayout(순서배치-중앙)
//      //p.setLayout(new GridLayout(1, 3)); //GridLayout(행열배치, 균등배열), new GridLayout(행, 열, 가로여백, 세로여백)
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
//      //이벤트
//      addWindowListener(new WindowAdapter() {
//         @Override
//         public void windowClosing(WindowEvent e) {
//            System.exit(0);
//         }
//      });
//      
//      //이벤트
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
//   //Canvas - null (Layout 이 없다)
//   class DrCanvas extends Canvas {
//      public DrCanvas() {
//         this.setBackground(new Color(255,255,0));
//      }
//      
//      @Override
//      public void paint(Graphics g) {
//         g.drawString("바보", 100, 100);
//      }
//   }//class Canvas
//   
//   public static void main(String[] args) {
//      new RGBTest();
//      
//   }
//}
