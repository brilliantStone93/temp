package exception;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

//말 1마리
//Canvas는 Layout이 없다 어디든 그릴 수 있다!

public class Racer extends Canvas	implements Runnable{
	private Image img;
	private String name;
	private int pos;
	private static int rank ;
	public Racer(String name) {
		this.name = name;
		img = Toolkit.getDefaultToolkit().getImage("horse.gif");
//		int a = (int)(Math.random()*255+1);
//		int a1 = (int)(Math.random()*255+1);
//		int a2 = (int)(Math.random()*255+1);
//		setBackground(new Color (a, a1, a2));
		
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine( 0, getSize().height/2 , getSize().width, getSize().height/2);
		g.drawImage(img, pos, 0,  50, this.getSize().height, this);
		
	}

	@Override
	public void run() {
		for(int i = 0 ; i < 600; i +=((int)((Math.random())*10)+1)) {
			repaint();
			pos = i;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
		}//for
		rank++;
		
		System.out.println(rank + " 등 " +name);
		
		
	}
}
