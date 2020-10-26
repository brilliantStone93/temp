package nested;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginResult extends Frame{
	private String id, pwd;
	
	
	public LoginResult(String id, String pwd){
		this.id = id;
		this.pwd = pwd;
		setVisible(true);
		setBounds(200, 200, 200, 200);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
//				System.exit(0);
				setVisible(false);
				
			}
		});
		
		
	}
	
	@Override
		public void paint(Graphics g) {
			if(id.equals("angel") && pwd.equals("1004")) {
				g.drawString("로그인 성공", 100, 100);
			}else g.drawString("로그인 실패", 100, 100);
		}
	
}
