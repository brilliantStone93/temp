package swing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class DrCanvas extends Canvas {
	private MsPaint ms;
	private ArrayList<ShapeDTO> list;
	private Image bufferImage;
	private Graphics bufferG;
	
//	public DrCanvas() {
//		this.setBackground(new Color(200,255,255));
//	}
	public DrCanvas(MsPaint ms) {
		this.ms = ms;
		this.setBackground(new Color(200,255,255));
		
		
		//�̺�Ʈ
      addKeyListener(new KeyAdapter() {

          @Override
          public void keyPressed(KeyEvent e) {

             if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                System.exit(0);
             }
          }
       });
		
    }
      
	@Override
	public void update(Graphics g) {
		Dimension d = this.getSize();
		if(bufferG == null) {
			bufferImage = createImage(d.width,d.height);
			bufferG = bufferImage.getGraphics();
		}
		
		//�����
		Color c = this.getBackground();//���� Canvas �������� ������
		bufferG.setColor(c);
		bufferG.fillRect( 0, 0, d.width, d.height);
		
		
		
		int x1, y1, x2, y2, z1, z2;
		
		
		//ArrayList���� ������ �ϳ��� ������ �ٽ� �׷��ش�.
		list = ms.getList();
		
	
		for(int i = 0 ; i < list.size(); i++) {
			ShapeDTO s = list.get(i);
//			DrCanvas dc  = new DrCanvas();
			//��ǥ
			x1 = s.getX1();			
			y1 = s.getY1();
			x2 = s.getX2();
			y2 = s.getY2();
			z1 = s.getZ1();
			z2 = s.getZ2();
			
			
			//��
			switch(s.getColor()) {
				case 0 : bufferG.setColor(new Color(255,0,0));
				 break;
				case 1 : bufferG.setColor(new Color(0,255,0));
				 break;
				case 2 : bufferG.setColor(new Color(0,0,255));
				 break;
				case 3 : bufferG.setColor(new Color(255,0,255));
				 break;
				case 4 : bufferG.setColor(new Color(0,255,255));
			}
		
			//����
			if(s.isFill()) {//ä���� ����
				if(s.getShape() == Figure.LINE) {
					bufferG.drawLine(x1, y1, x2, y2);
					
				}else if(s.getShape() == Figure.CIRCLE) {
					bufferG.fillOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
				}else if(s.getShape() == Figure.RECT) {
					bufferG.fillRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
				}else if(s.getShape() == Figure.ROUNDERECT) {
					bufferG.fillRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1), 50, 50);
				}else if(s.getShape() == Figure.PEN) {
					bufferG.drawLine(x1, y1, x2, y2);
					

				}
			}else {//����
				if(s.getShape() == Figure.LINE) {
					bufferG.drawLine(x1, y1, x2, y2);
				}else if(s.getShape() == Figure.CIRCLE) {
					bufferG.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
				}else if(s.getShape() == Figure.RECT) {
					bufferG.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
				}else if(s.getShape() == Figure.ROUNDERECT) {
					bufferG.drawRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1), 50, 50);
				}else if(s.getShape() == Figure.PEN) {

					bufferG.drawLine(x1, y1, x2, y2);
				}
			}
		}//for
		
//		
		//��ǥ
		x1 = Integer.parseInt(ms.getX1T().getText().trim());
		//trim()�� �Է¹��� ���� ��, 
//		�� ������ ���� ��� �������ִ� �޼ҵ��̴�
		y1 = Integer.parseInt(ms.getY1T().getText().trim());
		x2 = Integer.parseInt(ms.getX2T().getText().trim());
		y2 = Integer.parseInt(ms.getY2T().getText().trim());
		z1 = Integer.parseInt(ms.getZ1T().getText().trim());
		z2 = Integer.parseInt(ms.getZ2T().getText().trim());
		
		//�̴�� �����ϸ�Exception in thread "AWT-EventQueue-0" java.lang.NumberFormatException: For input string: ""
		//���� �߻��ϴ� �̷��� ������ �ݹ� �޼ҵ�� �׷���
		//setVisible�� �� �޼ҵ尡 ����Ǵµ� ���� �Է¹ޱ� ���̾ ""�� �޾ƿ��µ�
		//�̰� parseInt�� ��ȯ�����ַ��� �߻��ϴ� �޼ҵ��̴�
		//���� �̸� ������ؼ��� �ʱⰪ�� �־��־���Ѵ� �ش� ���� �־��ִ°� msPaint�� ftextField ���� �ִ�
		
		
		//��
		switch(ms.getCombo().getSelectedIndex()) {
		case 0 : bufferG.setColor(new Color(255,0,0));
		 break;
		case 1 : bufferG.setColor(new Color(0,255,0));
		 break;
		case 2 : bufferG.setColor(new Color(0,0,255));
		 break;
		case 3 : bufferG.setColor(new Color(255,0,255));
		 break;
		case 4 : bufferG.setColor(new Color(0,255,255));
		}
		
		

//		int width = (x2 - x1) > 0 ?  x2 -x1 :  x1 - x2; 
//		int heigth = (y2 - y1) > 0 ? y2 -y1 : y1 - y2; 
		//Math.abs();�ϸ� ���밪�� ������ �� �ִ�.
		
		

		//����
		if(ms.getFill().isSelected()) {//ä���� ����
			if(ms.getLine().isSelected()) {
				bufferG.drawLine(x1, y1, x2, y2);
				
			}else if(ms.getCircle().isSelected()) {
				bufferG.fillOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
			}else if(ms.getRect().isSelected()) {
				bufferG.fillRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
			}else if(ms.getRoundRect().isSelected()) {
				bufferG.fillRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);
			}
		
		}else {//����
			if(ms.getLine().isSelected()) {
				bufferG.drawLine(x1, y1, x2, y2);
			}else if(ms.getCircle().isSelected()) {
				bufferG.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
			}else if(ms.getRect().isSelected()) {
				bufferG.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1));
			}else if(ms.getRoundRect().isSelected()) {
				bufferG.drawRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2-x1), Math.abs(y2-y1), z1, z2);
			}
		}
		
		paint(g);
	}
	
	
	
	  @Override
	public void paint(Graphics g) {
		g.drawImage(bufferImage, 0 , 0 , this);
	}//paint

	
      
   }
