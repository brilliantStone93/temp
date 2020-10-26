package _interface;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Frame��  BorderLayout(��������) LinearLayout - ����, ����
public class WindowTest2 extends Frame implements ActionListener,MouseListener , WindowListener{
	private Button redBtn, greenBtn, blueBtn,exitBtn;
	private int x, y;
	
	public static void main(String[] args) {
		new WindowTest2().init();
		
	}//main
	
	
	
	public void init() {
		redBtn = new Button("����");
		greenBtn = new Button("�ʷ�");
		blueBtn = new Button("�Ķ�");
		exitBtn = new Button("����");
//		this.add("North", redBtn);
//		this.add("Center", blueBtn);
//		this.add("South", greenBtn);
		
		Panel p = new Panel();
		p.add(redBtn);
		p.add(blueBtn);
		p.add(greenBtn);
		p.add(exitBtn);
		this.add("North", p);
//		this.add("North",exitBtn);
		
		setBounds(900, 100, 300, 400);
		setVisible(true);
		
		//�̺�Ʈ
		
		this.addWindowListener(this);
		exitBtn.addActionListener(this);
		greenBtn.addActionListener(this);
		blueBtn.addActionListener(this);
		redBtn.addActionListener(this);
		
		this.addMouseListener(this);
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺 Ŭ��");
		System.out.println("x: "+e.getX()+"\t Y : "+ e.getY());
	
		this.x = e.getX();
		this.y = e.getY();
		
		repaint();//paint �޼ҵ� ȣ���ϴ� �޼ҵ�
	}

	@Override
	public void paint(Graphics g) {
		g.drawString("x : " + x+"\t Y : "+y, x, y);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e ) {
		// TODO Auto-generated method stub
		if(e.getSource()==redBtn) {
			this.setBackground(new Color(255,0,0));
		}else if(e.getSource() == greenBtn) {
			this.setBackground(new Color(0,255,0));
		}else if(e.getSource() == blueBtn) {
			this.setBackground(new Color(0,0,255));
		}else if(e.getSource()==exitBtn) {
			System.exit(0);
		}
	}
	

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}





	
}
