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
      
      //데이터
      list = new ArrayList<PersonDTO>();
      list.add(new PersonDTO("hong", "홍길동", "111", "010-123-1234"));
      list.add(new PersonDTO("conan", "코난", " 333", "010-777-7777"));
      
      //타이틀
      vector = new Vector<String>();
      vector.addElement("아이디");
      vector.addElement("이름");
      vector.add("비밀번호");
      vector.add("핸드폰");
      
      
      
      
      model = new DefaultTableModel(vector, 0) {
         @Override
         public boolean isCellEditable(int r, int c) {
            
            return (c!=0) ? true : false;
         }
      };
      //이것은 창을 띄웠을때 데이터 값말고 위에 줄은 건들지 마라라는 뜻 // 내용 수정 필요함         
      table = new JTable(model);
      JScrollPane scroll = new JScrollPane(table);
      
      add("Center", scroll);
      
      //테이블 - 데이터
      for(PersonDTO dto : list) {
         Vector<String> v = new Vector<String>();
         v.add(dto.getId());
         v.add(dto.getName());
         v.add(dto.getPwd());
         v.add(dto.getTel());
         
         model.addRow(v);//행단위로 붙이겠다라는 의미
               
      }
      //버튼 추가
      insertBtn = new JButton("추가");
      deleteBtn = new JButton("삭제");      
      
      
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
      
   }//생성자======================================================================
   
   

   @Override
   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == insertBtn) {
         insert();
      }else if(e.getSource() == deleteBtn) {
         delete();
      }
      
   }
   
   private void insert() {
	   //리턴 값 : 사용자가 입력한 무자열, 취소 버튼이 선택되거나 창이 닫히면 null리턴
      String id = JOptionPane.showInputDialog(this, "아이디 입력하세요");
      if(id == null ) return;
         
      
	  if(id.length() == 0) {
	         JOptionPane.showMessageDialog(this, "아이디는 필수 항목입니다");
	         return;//메소드를 벗어나라
	         
	      }
      for(int i = 0; i < model.getRowCount(); i++) {
         if(model.getValueAt(i, 0).equals(id)) {
            JOptionPane.showMessageDialog(this, "사용 중인 아이디 입니다");
            
            return;
      
         }
      }
//      System.out.println(model.getValueAt(1, 0));
      //사용중인 아이디입니다 라고 같은 아이디 나오면 막는거 구현 1번 숙제====================================================================
      
      
      
      String name = JOptionPane.showInputDialog(this, "이름을 입력하세요");
      String pwd = JOptionPane.showInputDialog(this, "비밀번호를 입력하세요");
      String tel  = JOptionPane.showInputDialog(this,"전화번호를 입력하세요");
      
      Vector<String> v = new Vector<String>();
      v.add(id);
      v.add(name);
      v.add(pwd);
      v.add(tel);
      
      model.addRow(v);
      JOptionPane.showMessageDialog(this, "추가 완료");
      list.add(new PersonDTO(id, name, pwd, tel));
      //list에 값을 추가 안해줘도 되는지
   }
   
   //2번 숙제===================================================================================================================
   private void delete() {
      String name = JOptionPane.showInputDialog(this, "이름을 입력하세요");
      if(name == null) return;
      int count = 0;
      
      for(int i = 0; i < model.getRowCount(); i ++) {
         if(model.getValueAt(i, 1).equals(name)) {
            model.removeRow(i);
            i--;// 지워진 인덱스로 당겨진 행을 확인하기 위해서 -1 처리 
            count++;
         }
         
      }
      if(count == 0) JOptionPane.showMessageDialog(this, "없는  이름 입니다");
      else JOptionPane.showMessageDialog(this, "삭제완료");
//      삭제 완료(만약 같은 이름이 여러개이면 여러개 모두 삭제)
//      또는
//      없는 이름 입니다.
      
      
   }



   
   
   
   public static void main(String[] args) {
      new JTableEx2();
   }//main
}//