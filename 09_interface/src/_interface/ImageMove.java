package _interface;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ImageMove extends Frame implements ActionListener, KeyListener, WindowListener {
   private Button resetBtn, leftBtn, upBtn, downBtn, rightBtn;
   private int x = 100;
   private int y = 100;
   
   public void init() {
      // 버튼 생성
      resetBtn = new Button("초기화");
      leftBtn = new Button("왼쪽");
      upBtn = new Button("위쪽");
      downBtn = new Button("아래쪽");
      rightBtn = new Button("오른쪽");
      
      Panel p = new Panel();
      p.add(resetBtn);
      p.add(leftBtn);
      p.add(rightBtn);
      p.add(upBtn);
      p.add(downBtn);
      
      add("North", p);
      //버튼 포커스 해체
      resetBtn.setFocusable(false);
      leftBtn.setFocusable(false);
      upBtn.setFocusable(false);
      downBtn.setFocusable(false);
      rightBtn.setFocusable(false);
      
      setBounds(900, 100, 500, 500);
      setVisible(true);
      setResizable(false);
      
      //이벤트
      this.addWindowListener(this);
      this.addKeyListener(this);
      
      resetBtn.addActionListener(this);
      leftBtn.addActionListener(this);
      rightBtn.addActionListener(this);
      upBtn.addActionListener(this);
      downBtn.addActionListener(this);
      
       
       
   }
   
   @Override
   public void paint(Graphics g) {
      Image img = Toolkit.getDefaultToolkit().getImage("스마일.jpg"); //이미지 불러오기
      g.drawImage(img, x, y, this);
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      System.out.println("x : "+x+"\t y : "+y);
      
      if(e.getSource()==resetBtn) {
         x = y = 100;
         
      }else if(e.getSource()==leftBtn) {
         x -= 10;
         if(x < -130) x=470;
         
      }else if(e.getSource()==upBtn) {
         y -= 10;
         if(y < -100) y = 460;
         
      }else if(e.getSource()==downBtn) {
         y += 10;
         if(y > 460) y = -100;
         
      }else if(e.getSource()==rightBtn) {
         x += 10;
         if(x > 470) x=-130;
      }
      
      repaint();
   }

   @Override
   public void windowActivated(WindowEvent e) {}

   @Override
   public void windowClosed(WindowEvent e) {}

   @Override
   public void windowClosing(WindowEvent e) {
      System.exit(0); //프로그램 강제 종료
   }

   @Override
   public void windowDeactivated(WindowEvent e) {}

   @Override
   public void windowDeiconified(WindowEvent e) {}

   @Override
   public void windowIconified(WindowEvent e) {}

   @Override
   public void windowOpened(WindowEvent e) {}
   
   public static void main(String[] args) {
      ImageMove i = new ImageMove();
      i.init();
   }
   
   //KeyListener Override
   @Override
   public void keyPressed(KeyEvent e) {
      //if(e.getKeyCode() == 27)
      if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
         System.exit(0);
      }else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
    	  x -= 10;
          if(x < -130) x=470;
      }else if(e.getKeyCode() == KeyEvent.VK_UP) {
    	  y -= 10;
          if(y < -100) y = 460;
      }else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
    	  y += 10;
          if(y > 460) y = -100;
      }else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
    	  x += 10;
          if(x > 470) x=-130;
      }
      repaint();
   }

   @Override
   public void keyReleased(KeyEvent e) {}

   @Override
   public void keyTyped(KeyEvent e) {}

}
