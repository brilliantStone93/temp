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


//frame �� BorderLayout(��������)�̴�
public class RunRace extends Frame implements ActionListener{
	private Button btn;
	private int count;
	//private Racer r;
	private Racer[] r ;
	
	public  RunRace(String[] s) {
		btn = new Button("���");
		count = Integer.parseInt(s[0]);   //s.length-1;
		//r = new Racer();//Racer�� �� ��ü�� Canvas�̱� ������ �׳� ���̸�ȴ�
		r = new Racer[count];
		
		for(int i = 0 ; i < count; i ++) {
			r[i] = new Racer(s[i+1]); // Ŭ���� ����
		}
		
		Panel p2 = new Panel(new GridLayout(3,1));
		for(int i = 0 ; i < count ; i++) {
			p2.add(r[i]);
		}
		add("Center", p2);
		
		//Panel�� flowLayout�̴�
		Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT)); // FlowLayout�� �⺻�� center�̴� �����ڿ� ��ġ�� �������ָ� �������� ����
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
		
	}//������
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		btn.setEnabled(false);
		Thread[] t = new Thread[count];
		//������ ����
		
		for(int i = 0 ; i < count ; i ++) {
			t[i] = new Thread(r[i]); //������ ����
			t[i].setPriority((int)(Math.random())*10+1);
			t[i].start();//������
			
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		if(args.length < 2 ) {
			System.out.println("Usage : java RunRace count name1, ...	"); //
			System.exit(0);
		}
		
		if(Integer.parseInt(args[0])!= args.length -1){
			System.out.println("�� ������ �� �̸��� ������ ���� �ʽ��ϴ�");
			System.exit(0);
		}
		RunRace r = new RunRace(args);
		
		
		
	}//main



	
	
	
	
}//
