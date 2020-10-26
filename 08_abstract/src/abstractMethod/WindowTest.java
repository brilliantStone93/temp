package abstractMethod;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class WindowTest extends Frame{
	
	public WindowTest() {
		setTitle("이미지");
		setBounds(900, 100, 1000, 1000);
		setVisible(true);
		
	}
	
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image img = t.getImage("수지.jpg");//이미지 불러오기
		
		//g.drawImage(img,0, 200, this);//이미지 그리기, 이미지를 넣을 때 *.bmp는 잘 안됨 그래서 저거 제외한 움직이는 사진도 가능
		
		//이미지 작게
//		g.drawImage(img,
//				30,30,400,630,
//				0,0,600,840,
//				this);
		//4개의 좌표를 넣을 건데 이건 화면 위치
		//또다른 4개 좌표를 넣을건데 이건 이미지 크기
		//this =>나한태 넣을 것이다
		
		//이미지 거꾸로
		g.drawImage(img,
				400,630,30,30,
				0,0,600,840,
				this);
		
		
	}
	
	public static void main(String[] args) {
		new WindowTest();
		
	}
}
