package day1026;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

public class ChatClientObject extends JFrame implements ActionListener, Runnable {
	private JTextField input;
	private JButton send;
	private JTextArea output;
	
	private Socket socket;
	private ObjectOutputStream ow;
	private ObjectInputStream oi;
	
	private String nickName;
	
	
	
	
	public ChatClientObject() {
		super("ä��â");
		
		//JTextField
		input = new JTextField();
		input.setBackground(new Color(230,255,255));
		
		
		//JButton
		send = new JButton("������");
		
		
		//JTextArea
		output = new JTextArea();
		output.setBackground(new Color(200,255,255));
		output.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(output); 
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		
		p.add("Center", input);
		p.add("East", send);
		
		Container c = this.getContentPane();
		
		c.add("Center", scroll );
		c.add("South", p);
		
		setVisible(true);
		setBounds(300,200, 300,300);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addWindowListener(new WindowAdapter() {//xâ�� ���� �� quit�� ���������ν� ������ ���� ���� ������ ���� �߻���Ű�� ���� ������
			@Override
			public void windowClosing(WindowEvent e) {
				InfoDTO dto = new InfoDTO();
				dto.setNickName(nickName);
				
				dto.setCommand(Info.EXIT);
				try {
					ow.writeObject(dto);
					ow.flush();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
		});
	}
	
	private void service() {
		InfoDTO dto = new InfoDTO();
		String serverIP = JOptionPane.showInputDialog(this, "���� ip�� �Է����ּ���", "192.168.0.");//192.168.0.
		if(serverIP == null || serverIP.length() == 0) {
			System.out.println("���� ip�� �Էµ��� �ʾҽ��ϴ�");
			System.exit(0);
		}
		
		nickName = JOptionPane.showInputDialog(this, "�г����� �Է����ּ���");
		if(nickName == null || nickName.length() == 0) {
			System.out.println("�г����� �Էµ��� �ʾҽ��ϴ�");
			System.exit(0);
		}
		
		dto.setNickName(nickName);
		dto.setCommand(Info.JOIN);
		try {
			socket = new Socket(serverIP, 9500);
			oi = new ObjectInputStream(socket.getInputStream());
			ow = new ObjectOutputStream(socket.getOutputStream());
			
			
			ow.writeObject(dto);
			ow.flush();
			
			
			
		} catch (UnknownHostException e) {
			System.out.println("������ ã�� �� �����ϴ�");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("������ ������ �ȵǾ����ϴ�");			
			e.printStackTrace();
			System.exit(0);
		}
		
		
		Thread t = new Thread(this);
		t.start();
		
		send.addActionListener(this);
		input.addActionListener(this);
		
	}//������
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String line = input.getText();
		
		

		InfoDTO dto = new InfoDTO();
		dto.setNickName(nickName);
		dto.setCommand(Info.SEND);
		dto.setMessage(line);
		try {
			
			ow.writeObject(dto);
			ow.flush();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		input.setText(""); // �޼��� ������ JTextField �ʱ�ȭ
		
	}//ActionPerformed
	
	
	
	@Override
	public void run() {
		
		InfoDTO dto = null;
		while(true) {
			try {
				
				 
				dto = (InfoDTO)oi.readObject();
				
				if(dto.getCommand() == Info.EXIT || dto.getMessage() == null) {
					ow.close();
					oi.close();
					socket.close();
					
					
				}
				
				output.append("["+dto.getNickName()+"]"+dto.getMessage()+"\n");
				int pos = output.getText().length(); 
				output.setCaretPosition(pos);
		
			} catch (ClassNotFoundException e) {
				
				
				e.printStackTrace();
				
				
			} catch (IOException e) {
				break;
				
				
			}
		
		}
		System.exit(0);
	}
	
	
	
	public static void main(String[] args) {
		new ChatClientObject().service();
	}

	
}
