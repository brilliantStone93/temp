package _interface;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class WindowTest extends Frame implements ActionListener, MouseListener, MouseMotionListener {//java.awt�� ����
	
	//�ڹ� Ŭ������ ���� ��Ӹ� ������
	//�ٸ� Ŭ�����κ��� �����ΰ� �ް������ interface�� ������ȴ�
	
	private Button exitBtn;//���⿡ ���� = new ~~�ᵵ�ǰ� �Ʒ� init�� ��ó���ص��ȴ�
	
	
	public void init() {
		exitBtn = new Button("����");
		
		//��ġ
		this.add("North",exitBtn);
		
		setBounds(900, 100, 300, 400);
		setVisible(true);
		
		//�̺�Ʈ ȣ���Ұ���
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
		System.out.println("���콺 Ŭ��");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���콺 IN");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("���콺 OUT");
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
		System.out.println("���콺 �巡��");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		new WindowTest().init();
		
	}//main



	
	
}//
