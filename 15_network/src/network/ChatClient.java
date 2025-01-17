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
		super("채팅창");
		//JTextField
		input = new JTextField();
		input.setBackground(new Color(230,255,255));
		
		//JButton
		send = new JButton("보내기");
		
		//JTextArea
		output = new JTextArea();
		output.setBackground(new Color(200,255,255));
		output.setEditable(false); // 채팅창에 글을 못쓰도록 막은것, 여기는 내용을 받아줄 부분
		
		
		JScrollPane scroll = new JScrollPane(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		//스크롤바 계속 세로줄에 있게해주는 것
		
		
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
		addWindowListener(new WindowAdapter() {//x창을 누를 때 quit를 전송함으로써 강제로 내가 꺼서 서버에 에러 발생시키는 것을 막아줌
			@Override
			public void windowClosing(WindowEvent e) {
				pw.println("quit");
				pw.flush();
			}
		});
	
	
	}//ChatClient()
	
	public void service() {
		//서버IP
//		String serverIP = JOptionPane.showInputDialog(this,"서버IP를 입력하세요", "서버IP", JOptionPane.INFORMATION_MESSAGE);
		String serverIP = JOptionPane.showInputDialog(this, "서버IP를 입력하세요", "192.168.0.");
		if(serverIP == null || serverIP.length() == 0) {
			System.out.println("서버 IP가 입력되지 않았습니다");
			System.exit(0);
		}
		
		String nickName = JOptionPane.showInputDialog(this, "닉네임을 입력하세요", "닉네임", JOptionPane.INFORMATION_MESSAGE);
		if(nickName == null || nickName.length() == 0) {
			nickName = "guest";
		}
		
		//소켓 생성
		try {
			socket = new Socket(serverIP, 9500); // 소켓이라 쓰고 핸드폰이라 읽는다, 받는 severIP와 포트까지 잡아줘야한다 / severIP와 포트 이것이 소켓의 번호
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			

			
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("서버와 연결이 안되었습니다");
			
			e.printStackTrace();
			System.exit(0);
		}
		
		//서버로 닉네임 보내기
		pw.println(nickName);
		pw.flush();
		
		
		//Thread 생성
		
		Thread t = new Thread(this);
		//스레드 시작 - 스레드 실행(run())
		t.start();
		
		send.addActionListener(this);
		input.addActionListener(this);// JTextField에서 엔터가 일어남
		
	}//service
	
	
	@Override
	public void run() {
		//서버로부터 받는쪽
		
		String line;
		while(true) {
			try {
				line = br.readLine();
				
				if(line == null || line.toLowerCase().equals("quit")) { //상대 방으로 부터 연결을 끊겠다는 코드(quit)가 오면 반응
					br.close();
					pw.close();
					socket.close();
					
					System.exit(0);
										
				}
					output.append(line+ "\n");
					
					int pos = output.getText().length(); // TextArea에 글자 수를 꺼내서 pos에저장 이걸 밑에 메소드에 넣어주면
					output.setCaretPosition(pos);//스크롤 바에 위치를 잡아주는 친구이다 
					
					
					
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
			
		}//while
		
		
	}//run
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//여기에 조건문으로 send와 input을 통해 들어오는 값을 구분해줄 필요가 없다 
		// 왜냐하면 두개 모두 같은일을 해주기 떄문
		String msg = input.getText();
		
		pw.println(msg); //줄을 바꿔주는 println사용
		pw.flush();
		input.setText(""); // 메세지 보내고 JTextField 초기화
		
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
//      send = new JButton("보내기");
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
//      //서버IP
////      String serverIP = JOptionPane.showInputDialog(this,
////                                       "서버IP를 입력하세요",
////                                       "서버IP",
////                                       JOptionPane.INFORMATION_MESSAGE);
//      
//      String serverIP = JOptionPane.showInputDialog(null,"서버IP를 입력하세요","192.168.0.");
//      if(serverIP==null || serverIP.length()==0){
//         System.out.println("서버IP가 입력되지 않았습니다");
//         System.exit(0);
//      }
//      
//      //닉네임
//      String nickName = JOptionPane.showInputDialog(null,
//                                       "닉네임을 입력하세요",
//                                       "닉네임",
//                                       JOptionPane.INFORMATION_MESSAGE);
//      if(nickName==null || nickName.length()==0){
//         nickName="guest";
//      }
//      
//      //소켓생성
//      try {
//         socket = new Socket(serverIP, 9500);
//
//         br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//         pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
//      
//      } catch (UnknownHostException e) {
//         System.out.println("서버를 찾을 수 없습니다");
//         e.printStackTrace();
//         System.exit(0);
//         
//      } catch (IOException e) {
//         System.out.println("서버를 찾을 수 없습니다");
//         e.printStackTrace();
//         System.exit(0);
//      }
//      
//      //서버로 닉네임 보내기
//      pw.println(nickName);
//      pw.flush();
//      
//      //스레드 생성
//      Thread t = new Thread(this);
//      //스레드 시작 - 스레드 실행(run())
//      t.start();
//      
//      //이벤트
//      send.addActionListener(this);
//      input.addActionListener(this); //JTextField에서 엔터
//      
//   }//service()
//   
//   @Override
//   public void run() {
//      //서버로부터 받는 쪽
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
//      //서버로 보내는 쪽
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
