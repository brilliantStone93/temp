package nested;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;

public class WindowTest extends Frame  {
	   
	   public WindowTest() {
	      setBounds(900, 100, 300, 400);
	      setVisible(true);
	      
	      //이벤트
	      this.addWindowListener(new WindowAdapter() {
	    	  @Override
	    	public void windowClosing(WindowEvent e) {
	    		System.exit(0);
	    	}
	      });
	      
	      this.addMouseListener(new MouseAdapter() {
	    	  @Override
	    	public void mouseEntered(MouseEvent e) {
	    		  System.out.println("마우스 IN");
	    		      		  
	    	}
	    	  
	    	@Override
	    	public void mouseExited(MouseEvent e) {
	    		System.out.println("마우스 OUT");
	    	}
	      });
	   }
	  
	   
	   public static void main(String[] args) {
	      new WindowTest();

	   }

	}
	

