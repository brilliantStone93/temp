package io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class ScoreImpl implements Score {
	private List<ScoreDTO> list;
	
	
	public ScoreImpl() {
		list = new ArrayList<ScoreDTO>();
		
	}

	@Override
	public void input(ScoreDTO dto) {
		list.add(dto);
		
	}

	
	
	@Override
	public void print(DefaultTableModel model) {
		//���̺� �ʱ�ȭ, �����ٽ� ������ ���� �����־ �ߺ��Ǿ� ���� �� ����
		model.setRowCount(0);
		
		for(ScoreDTO dto : list) {
			Vector<String> v = new Vector<String>();
			v.add(dto.getHak());
			v.add(dto.getName());
			v.add(dto.getKor()+ "");
			v.add(dto.getEng()+ "");
			v.add(dto.getMath()+"");
			v.add(dto.getTot()+"");
			v.add(dto.getAvg()+"");
			
			model.addRow(v);
		}//for
		
		
		
	}

	@Override
	public void save() {
		
		//JFileChooser chooser = new JFileChooser(); ���̾󷯱׸� ȭ�鿡 ����ִ� ģ��!
		JFileChooser chooser = new JFileChooser(); 
		int result = chooser.showSaveDialog(null);
		File file = null;
		
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			
		}
		if(file == null )return;
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			//���߿� new FileOutputStream(file) �̺κп� ��Ʈ��ũ�� �����ϸ� ��Ʈ��ũ�� �������� �� �ִ�
			//���´� �״�� ���������
			for(ScoreDTO dto : list) {
				//�������ٶ� list�� ������ �������൵ �ȴ�. ������ ������ Arraylist�� Serializable�� �ɷ��ֱ� ������ �����ϴ�
				oos.writeObject(dto);
//				count++; load���ٶ� ��� ����Ǿ��ִ��� Ȯ���ϱ� ���� �ʿ� ��� 1
				
			}
			oos.close();
		}  catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void search(DefaultTableModel model) {
		//showInputDialog�� �̿��ؼ� �й��� �Է¹޴´�.
		  //���� ��Ҹ� �����ų� �й��� �Է����� ������ �׳� �޼ҵ带 ������.
		  
		  //���ϴ� �й��� ������ JTable�� ������ָ� �ȴ�.
		  
		  //���ϴ� �й��� ������ showMessageDialog�� �̿��ؼ� "ã���� �ϴ� �й��� �����ϴ�" ��� ����Ѵ�. 
		
		
		String hak = JOptionPane.showInputDialog("�й��� �Է����ּ���");
		if(hak == null || hak.equals("")) return;
		
		int sw = 0 ;
		for(ScoreDTO s : list) {
			if(s.getHak().equals(hak)) {
				if(sw == 0 ) model.setRowCount(0);
				Vector<String> v = new Vector<String>();
				v.add(s.getHak());
				v.add(s.getName());
				v.add(s.getKor()+"");
				v.add(s.getEng()+"");
				v.add(s.getMath()+"");
				v.add(s.getTot()+"");
				v.add(s.getAvg()+"");
				model.addRow(v);
				sw = 1;
			}//if
		}//for
		if(sw==0)
			JOptionPane.showInternalMessageDialog(null, "ã���� �ϴ� �й��� �����ϴ�");
		
	}//search

	@Override
	public void tot_desc() {
//		Comparator<ScoreDTO> com = new Comparator<ScoreDTO>() {
//			public int compare(ScoreDTO s1, ScoreDTO s2) {
//				//���ǿ����� ? �� : ����;
//				
//				return s1.getTot() < s2.getTot() ? -1 : 1; // ���� ����
//						
//			
//			}
//		};
//		Collections.sort(list, com);
		
		Collections.sort(list); // ScoreDTO�� implements Comparable<ScoreDTO> ���ְ� �� ��� ���� �̹�� �����ϳ� �����
		
		
	}

	@Override
	public void load() {
		JFileChooser chooser = new JFileChooser();
		File file = null;
		int result = chooser.showOpenDialog(null);
		
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
		if(file == null) return;
		
		
		list.clear();
		ObjectInputStream ois;
		
		try {
			
			ois = new ObjectInputStream(new FileInputStream(file));
			
			while(true) {	
				try {
					ScoreDTO s = (ScoreDTO)ois.readObject();
					list.add(s);
				
				}catch (EOFException e) {//EOFException ���Ͽ� ���� �����ϸ� �߻��ϴ� ����
					
					break;
				
				} 	
			
				
				
			}//while
			ois.close();
		} catch (FileNotFoundException e) {
		
		e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
}