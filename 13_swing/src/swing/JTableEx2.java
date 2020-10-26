package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;




public class JTableEx2 extends JFrame implements ActionListener{
   private ArrayList<PersonDTO> list;
   private Vector<String> vector;
   private DefaultTableModel model;
   private JTable table;
   private JButton insertBtn, deleteBtn;
   
   public JTableEx2() {
//      setLayout(null);
//      insertBtn.setBounds(400, 450, 30, 20);
//      deleteBtn.setBounds(450, 450, 30, 20);
      
      //������
      list = new ArrayList<PersonDTO>();
      list.add(new PersonDTO("hong", "ȫ�浿", "111", "010-123-1234"));
      list.add(new PersonDTO("conan", "�ڳ�", " 333", "010-777-7777"));
      
      //Ÿ��Ʋ
      vector = new Vector<String>();
      vector.addElement("���̵�");
      vector.addElement("�̸�");
      vector.add("��й�ȣ");
      vector.add("�ڵ���");
      
      
      
      
      model = new DefaultTableModel(vector, 0) {
         @Override
         public boolean isCellEditable(int r, int c) {
            
            return (c!=0) ? true : false;
         }
      };
      //�̰��� â�� ������� ������ ������ ���� ���� �ǵ��� ������ �� // ���� ���� �ʿ���         
      table = new JTable(model);
      JScrollPane scroll = new JScrollPane(table);
      
      add("Center", scroll);
      
      //���̺� - ������
      for(PersonDTO dto : list) {
         Vector<String> v = new Vector<String>();
         v.add(dto.getId());
         v.add(dto.getName());
         v.add(dto.getPwd());
         v.add(dto.getTel());
         
         model.addRow(v);//������� ���̰ڴٶ�� �ǹ�
               
      }
      //��ư �߰�
      insertBtn = new JButton("�߰�");
      deleteBtn = new JButton("����");      
      
      
      JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      p.add(insertBtn);
      p.add(deleteBtn);
      add("South", p);
      
      Container c = this.getContentPane();
      c.add("Center", scroll);
      c.add("South", p);
      
      
      setBounds(200,200,500,400);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      
      //event
      insertBtn.addActionListener(this);
      deleteBtn.addActionListener(this);
      
   }//������======================================================================
   
   

   @Override
   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == insertBtn) {
         insert();
      }else if(e.getSource() == deleteBtn) {
         delete();
      }
      
   }
   
   private void insert() {
	   //���� �� : ����ڰ� �Է��� ���ڿ�, ��� ��ư�� ���õǰų� â�� ������ null����
      String id = JOptionPane.showInputDialog(this, "���̵� �Է��ϼ���");
      if(id == null ) return;
         
      
	  if(id.length() == 0) {
	         JOptionPane.showMessageDialog(this, "���̵�� �ʼ� �׸��Դϴ�");
	         return;//�޼ҵ带 �����
	         
	      }
      for(int i = 0; i < model.getRowCount(); i++) {
         if(model.getValueAt(i, 0).equals(id)) {
            JOptionPane.showMessageDialog(this, "��� ���� ���̵� �Դϴ�");
            
            return;
      
         }
      }
//      System.out.println(model.getValueAt(1, 0));
      //������� ���̵��Դϴ� ��� ���� ���̵� ������ ���°� ���� 1�� ����====================================================================
      
      
      
      String name = JOptionPane.showInputDialog(this, "�̸��� �Է��ϼ���");
      String pwd = JOptionPane.showInputDialog(this, "��й�ȣ�� �Է��ϼ���");
      String tel  = JOptionPane.showInputDialog(this,"��ȭ��ȣ�� �Է��ϼ���");
      
      Vector<String> v = new Vector<String>();
      v.add(id);
      v.add(name);
      v.add(pwd);
      v.add(tel);
      
      model.addRow(v);
      JOptionPane.showMessageDialog(this, "�߰� �Ϸ�");
      list.add(new PersonDTO(id, name, pwd, tel));
      //list�� ���� �߰� �����൵ �Ǵ���
   }
   
   //2�� ����===================================================================================================================
   private void delete() {
      String name = JOptionPane.showInputDialog(this, "�̸��� �Է��ϼ���");
      if(name == null) return;
      int count = 0;
      
      for(int i = 0; i < model.getRowCount(); i ++) {
         if(model.getValueAt(i, 1).equals(name)) {
            model.removeRow(i);
            i--;// ������ �ε����� ����� ���� Ȯ���ϱ� ���ؼ� -1 ó�� 
            count++;
         }
         
      }
      if(count == 0) JOptionPane.showMessageDialog(this, "����  �̸� �Դϴ�");
      else JOptionPane.showMessageDialog(this, "�����Ϸ�");
//      ���� �Ϸ�(���� ���� �̸��� �������̸� ������ ��� ����)
//      �Ǵ�
//      ���� �̸� �Դϴ�.
      
      
   }



   
   
   
   public static void main(String[] args) {
      new JTableEx2();
   }//main
}//