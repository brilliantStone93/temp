package nested;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login extends Frame implements ActionListener	{
	private Label idL, pwdL;
	private TextField idT, pwdT;
	private Button loginBtn, cancelBtn;
	private String id, pwd;
	

	
	public Login() {
		id = new String();
		pwd = new String();
		idL = new Label("���̵�");
		pwdL = new Label("��й�ȣ");
		
		idT = new TextField();
		pwdT = new TextField();
		
		loginBtn = new Button("�α���");
		cancelBtn = new Button("���");
		
		
		//idL.setLocation(50,80);
		//idL.setSize(50, 30); 
		idL.setBounds(50, 80, 50, 30);// setBounds�� �и��ϸ� ���� �� ��
		pwdL.setBounds(50, 150,50,30 );
		idT.setBounds(120, 80, 100, 30);
		pwdT.setBounds(120, 150, 100, 30);
		loginBtn.setBounds(50,220,70,30);
		cancelBtn.setBounds(150, 220, 70, 30);
		
		
		this.add(idL);
		this.add(pwdL);
		
		this.add(idT);
		this.add(pwdT);
		
		this.add(loginBtn);
		this.add(cancelBtn);
		
		setLayout(null);
		setBounds(800,100,300,300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//�̺�Ʈ
		loginBtn.addActionListener(this);
		cancelBtn.addActionListener(this);
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loginBtn) {
			id = idT.getText();
			pwd = pwdT.getText();
			LoginResult loginResult = new LoginResult(id, pwd);
		}else if(e.getSource() == cancelBtn) {
			idT.setText(" ");idT.setText("");//���� ���ڸ� ����� �ʱ�ȭ�ϰڴ�
			pwdT.setText(" ");pwdT.setText("");//������ �ٿ������͸� �Ἥ �Ǵµ� ���⼱ �ȵǾ ���� ������ ���� ������ �����ְ� 
												//������� �� ���� ""�� �����ָ�ȴ�
			
		}
		
	}
	
	public static void main(String[] args) {
		new Login();
	}


}
