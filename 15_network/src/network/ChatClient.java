package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient extends JFrame implements ActionListener, Runnable	{
	private JTextField input;
	private JButton send;
	private JTextArea output;
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	
	
	public ChatClient() {
		super("ä��â");
		//JTextField
		input = new JTextField();
		input.setBackground(new Color(230,255,255));
		
		//JButton
		send = new JButton("������");
		
		//JTextArea
		output = new JTextArea();
		output.setBackground(new Color(200,255,255));
		output.setEditable(false); // ä��â�� ���� �������� ������, ����� ������ �޾��� �κ�
		
		
		JScrollPane scroll = new JScrollPane(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		//��ũ�ѹ� ��� �����ٿ� �ְ����ִ� ��
		
		
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add("Center", input);
		p.add("East", send);
		
		Container c = this.getContentPane();
		c.add("Center", scroll);
		c.add("South", p);
		
		
		
		
		
		
		setVisible(true);
		setBounds(200, 200, 300, 300);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {//xâ�� ���� �� quit�� ���������ν� ������ ���� ���� ������ ���� �߻���Ű�� ���� ������
			@Override
			public void windowClosing(WindowEvent e) {
				pw.println("quit");
				pw.flush();
			}
		});
	
	
	}//ChatClient()
	
	public void service() {
		//����IP
//		String serverIP = JOptionPane.showInputDialog(this,"����IP�� �Է��ϼ���", "����IP", JOptionPane.INFORMATION_MESSAGE);
		String serverIP = JOptionPane.showInputDialog(this, "����IP�� �Է��ϼ���", "192.168.0.");
		if(serverIP == null || serverIP.length() == 0) {
			System.out.println("���� IP�� �Էµ��� �ʾҽ��ϴ�");
			System.exit(0);
		}
		
		String nickName = JOptionPane.showInputDialog(this, "�г����� �Է��ϼ���", "�г���", JOptionPane.INFORMATION_MESSAGE);
		if(nickName == null || nickName.length() == 0) {
			nickName = "guest";
		}
		
		//���� ����
		try {
			socket = new Socket(serverIP, 9500); // �����̶� ���� �ڵ����̶� �д´�, �޴� severIP�� ��Ʈ���� �������Ѵ� / severIP�� ��Ʈ �̰��� ������ ��ȣ
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			

			
		} catch (UnknownHostException e) {
			System.out.println("������ ã�� �� �����ϴ�");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("������ ������ �ȵǾ����ϴ�");
			
			e.printStackTrace();
			System.exit(0);
		}
		
		//������ �г��� ������
		pw.println(nickName);
		pw.flush();
		
		
		//Thread ����
		
		Thread t = new Thread(this);
		//������ ���� - ������ ����(run())
		t.start();
		
		send.addActionListener(this);
		input.addActionListener(this);// JTextField���� ���Ͱ� �Ͼ
		
	}//service
	
	
	@Override
	public void run() {
		//�����κ��� �޴���
		
		String line;
		while(true) {
			try {
				line = br.readLine();
				
				if(line == null || line.toLowerCase().equals("quit")) { //��� ������ ���� ������ ���ڴٴ� �ڵ�(quit)�� ���� ����
					br.close();
					pw.close();
					socket.close();
					
					System.exit(0);
										
				}
					output.append(line+ "\n");
					
					int pos = output.getText().length(); // TextArea�� ���� ���� ������ pos������ �̰� �ؿ� �޼ҵ忡 �־��ָ�
					output.setCaretPosition(pos);//��ũ�� �ٿ� ��ġ�� ����ִ� ģ���̴� 
					
					
					
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
			
		}//while
		
		
	}//run
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//���⿡ ���ǹ����� send�� input�� ���� ������ ���� �������� �ʿ䰡 ���� 
		// �ֳ��ϸ� �ΰ� ��� �������� ���ֱ� ����
		String msg = input.getText();
		
		pw.println(msg); //���� �ٲ��ִ� println���
		pw.flush();
		input.setText(""); // �޼��� ������ JTextField �ʱ�ȭ
		
	}//ActionPerformed
	
	
	
	
	
	
	
	//main
	public static void main(String[] args) throws IOException {
		new ChatClient().service();
		
	}//main

	

	
}


//
////
//package network;
//
//import java.awt.BorderLayout;
//import java.awt.Container;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.net.Socket;
//import java.net.UnknownHostException;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//import javax.swing.ScrollPaneConstants;
//
//public class ChatClient extends JFrame implements ActionListener, Runnable {
//   private JTextField input;
//   private JButton send;
//   private JTextArea output;
//   
//   private Socket socket;
//   private BufferedReader br;
//   private PrintWriter pw;
//   
//   public ChatClient() {
//      output = new JTextArea();
//      JScrollPane scroll = new JScrollPane(output);
//      scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//      output.setEditable(false);
//      
//      input = new JTextField();
//      
//      send = new JButton("������");
//      
//      JPanel p = new JPanel();
//      p.setLayout(new BorderLayout());
//      p.add("Center", input);
//      p.add("East", send);
//      
//      Container con = this.getContentPane();
//      con.add("Center",scroll);
//      con.add("South",p);
//      
//      setBounds(700,200,300,300);
//      setVisible(true);
//      //setDefaultCloseOperation(EXIT_ON_CLOSE);
//      addWindowListener(new WindowAdapter() {
//         @Override
//         public void windowClosing(WindowEvent e) {
//            pw.println("quit");
//            pw.flush();
//         }
//      });
//      
//      
//   }//ChatClient()
//   
//   public void service() {
//      //����IP
////      String serverIP = JOptionPane.showInputDialog(this,
////                                       "����IP�� �Է��ϼ���",
////                                       "����IP",
////                                       JOptionPane.INFORMATION_MESSAGE);
//      
//      String serverIP = JOptionPane.showInputDialog(null,"����IP�� �Է��ϼ���","192.168.0.");
//      if(serverIP==null || serverIP.length()==0){
//         System.out.println("����IP�� �Էµ��� �ʾҽ��ϴ�");
//         System.exit(0);
//      }
//      
//      //�г���
//      String nickName = JOptionPane.showInputDialog(null,
//                                       "�г����� �Է��ϼ���",
//                                       "�г���",
//                                       JOptionPane.INFORMATION_MESSAGE);
//      if(nickName==null || nickName.length()==0){
//         nickName="guest";
//      }
//      
//      //���ϻ���
//      try {
//         socket = new Socket(serverIP, 9500);
//
//         br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//         pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
//      
//      } catch (UnknownHostException e) {
//         System.out.println("������ ã�� �� �����ϴ�");
//         e.printStackTrace();
//         System.exit(0);
//         
//      } catch (IOException e) {
//         System.out.println("������ ã�� �� �����ϴ�");
//         e.printStackTrace();
//         System.exit(0);
//      }
//      
//      //������ �г��� ������
//      pw.println(nickName);
//      pw.flush();
//      
//      //������ ����
//      Thread t = new Thread(this);
//      //������ ���� - ������ ����(run())
//      t.start();
//      
//      //�̺�Ʈ
//      send.addActionListener(this);
//      input.addActionListener(this); //JTextField���� ����
//      
//   }//service()
//   
//   @Override
//   public void run() {
//      //�����κ��� �޴� ��
//      String line;
//      while(true) {
//         try {
//            line = br.readLine();
//            
//            if(line==null || line.toLowerCase().equals("quit")) {
//               br.close();
//               pw.close();
//               socket.close();
//
//               System.exit(0);
//            }
//            
//            output.append(line+"\n");
//            
//            int pos = output.getText().length();
//            output.setCaretPosition(pos);
//            
//         } catch (IOException e) {
//            e.printStackTrace();
//         }
//      }//while
//      
//   }
//   
//   @Override
//   public void actionPerformed(ActionEvent e) {
//      //������ ������ ��
//      String msg = input.getText();
//      pw.println(msg);
//      pw.flush();
//      input.setText("");
//   }
//   
//   public static void main(String[] args) {
//      new ChatClient().service();
//
//   }
//
//}
//