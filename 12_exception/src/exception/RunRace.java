package exception;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//frame 은 BorderLayout(동서남북)이다
public class RunRace extends Frame implements ActionListener{
	private Button btn;
	private int count;
	//private Racer r;
	private Racer[] r ;
	
	public  RunRace(String[] s) {
		btn = new Button("출발");
		count = Integer.parseInt(s[0]);   //s.length-1;
		//r = new Racer();//Racer는 그 자체가 Canvas이기 때문에 그냥 붙이면된다
		r = new Racer[count];
		
		for(int i = 0 ; i < count; i ++) {
			r[i] = new Racer(s[i+1]); // 클래스 생성
		}
		
		Panel p2 = new Panel(new GridLayout(3,1));
		for(int i = 0 ; i < count ; i++) {
			p2.add(r[i]);
		}
		add("Center", p2);
		
		//Panel은 flowLayout이다
		Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT)); // FlowLayout의 기본은 center이다 생성자에 위치를 지정해주면 그쪽으로 간다
		p.add(btn);
		add("South", p);
		
		
		setResizable(false);
		setVisible(true);
		setBounds(100, 100, 600, 400);
		
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
		//event
		btn.addActionListener(this);
		
	}//생성자
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		btn.setEnabled(false);
		Thread[] t = new Thread[count];
		//스레드 생성
		
		for(int i = 0 ; i < count ; i ++) {
			t[i] = new Thread(r[i]); //스레드 생성
			t[i].setPriority((int)(Math.random())*10+1);
			t[i].start();//스레드
			
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		if(args.length < 2 ) {
			System.out.println("Usage : java RunRace count name1, ...	"); //
			System.exit(0);
		}
		
		if(Integer.parseInt(args[0])!= args.length -1){
			System.out.println("말 마리수 와 이름의 개수가 맞지 않습니다");
			System.exit(0);
		}
		RunRace r = new RunRace(args);
		
		
		
	}//main



	
	
	
	
}//
