package _interface;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class WindowTest extends Frame implements ActionListener, MouseListener, MouseMotionListener {//java.awt에 있음
	
	//자바 클래스는 단일 상속만 가능함
	//다른 클래스로부터 무엇인가 받고싶으면 interface로 돌리면된다
	
	private Button exitBtn;//여기에 직점 = new ~~써도되고 아래 init쓴 것처럼해도된다
	
	
	public void init() {
		exitBtn = new Button("종료");
		
		//배치
		this.add("North",exitBtn);
		
		setBounds(900, 100, 300, 400);
		setVisible(true);
		
		//이벤트 호출할거임
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowExit());
		exitBtn.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	//MouseListener Override
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("마우스 클릭");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("마우스 IN");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("마우스 OUT");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	//MouseMotionListener Override
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 드래그");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		new WindowTest().init();
		
	}//main



	
	
}//
