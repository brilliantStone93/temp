package exception;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.omg.CORBA.portable.IDLEntity;

public class Packman extends Frame implements KeyListener, Runnable{
	private Image img, img2;
	private int sel;
	private int score = 0;
	private int x = 225, y =225;
	private int [] foodX = new int[5];
	private int [] foodY = new int[5];
//	private Label scoreL;
	
	public Packman() {
		setVisible(true);
		setBounds(100, 100, 500, 500);
		
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
		
		foodMaker();
		
		
		this.addKeyListener(this);
		
		Thread t = new Thread(this);
		t.start();
//		scoreL = new Label("score");
		
		
	}
	
	public void run() {
		while(true) {
			if(sel%2==0) sel ++;
			else sel--;
			if(sel == 0) {
				if(x > -50) x -= 10;
				else x = 550; 
			}else if(sel == 2) {
				if(x < 550) x += 10;
				else x = -50; 
			}else if(sel == 4) {
				if(y > -50) y -= 10;
				else y = 550;
			}else if(sel == 6) {
				if(y < 550) y += 10;
				else y = -50; 
			}
			
			
			
			foodEat();
			foodRe();
			repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} 
		}
	}

	
	@Override
	public void paint(Graphics g) {
		img = Toolkit.getDefaultToolkit().getImage("pacman.png");
		img2 = Toolkit.getDefaultToolkit().getImage("food.png");
		g.drawImage(img,
					x, y, x+50, y+50, // 화면 위치
					sel*50, 0, sel*50+50, 50, this);//이미지 
		for(int i = 0 ; i < 5; i ++) {
			g.drawImage(img2,foodX[i], foodY[i], this);//이미지 
		}
		
		
	}
	
	




	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			sel =0;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			sel =2;
		}else if(e.getKeyCode() == KeyEvent.VK_UP) {
			sel =4;
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			sel =6;
		}else if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
		
	}




	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	//먹이
	private void foodMaker() {
		
		for(int i = 0 ; i < 5; i++) {
			foodX[i] = (int)(Math.random()*401)+50; 
			foodY[i] = (int)(Math.random()*401)+50;
		}
	}
	
	private void foodRe() {
		int count = 0;
		for(int i = 0; i < 5 ; i++) {
			if(foodX[i] == -5 && foodY[i]==-5) {
				count++;
			}
		}//for
		if(count == 5) foodMaker();
	}
	
	private void foodEat() {
		int packX = (x+(x+50))/2;
		int packY = (y+(y+50))/2;
		for(int i = 0; i < 5; i++) {
			if(packX > foodX[i]-25 && packX <foodX[i]+25) {
				
				if(packY > foodY[i]-25 && packY <foodY[i]+25) {
					foodX[i] = -5;
					foodY[i] = -5;
					score += 10;
				}
			}//if
		}//for
			
	}
	// 먹이
	
	public static void main(String[] args) {
		new Packman();
		
	}
}
