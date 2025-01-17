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
		//테이블 초기화, 안해줄시 기존에 것이 남아있어서 중복되어 나올 수 있음
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
		
		//JFileChooser chooser = new JFileChooser(); 다이얼러그를 화면에 띄워주는 친구!
		JFileChooser chooser = new JFileChooser(); 
		int result = chooser.showSaveDialog(null);
		File file = null;
		
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			
		}
		if(file == null )return;
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			//나중에 new FileOutputStream(file) 이부분에 네트워크를 연결하면 네트워크로 내보내줄 수 있다
			//형태는 그대로 가져가면됨
			for(ScoreDTO dto : list) {
				//저장해줄때 list를 통으로 저장해줘도 된다. 가능한 이유는 Arraylist에 Serializable이 걸려있기 때문에 가능하다
				oos.writeObject(dto);
//				count++; load해줄때 몇개가 저장되어있는지 확인하기 위해 필요 방법 1
				
			}
			oos.close();
		}  catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void search(DefaultTableModel model) {
		//showInputDialog를 이용해서 학번을 입력받는다.
		  //만약 취소를 누르거나 학번을 입력하지 않으면 그냥 메소드를 나간다.
		  
		  //원하는 학번이 있으면 JTable에 출력해주면 된다.
		  
		  //원하는 학번이 없으면 showMessageDialog를 이용해서 "찾고자 하는 학번이 없습니다" 라고 출력한다. 
		
		
		String hak = JOptionPane.showInputDialog("학번을 입력해주세요");
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
			JOptionPane.showInternalMessageDialog(null, "찾고자 하는 학번이 없습니다");
		
	}//search

	@Override
	public void tot_desc() {
//		Comparator<ScoreDTO> com = new Comparator<ScoreDTO>() {
//			public int compare(ScoreDTO s1, ScoreDTO s2) {
//				//조건연산자 ? 참 : 거짓;
//				
//				return s1.getTot() < s2.getTot() ? -1 : 1; // 오름 차순
//						
//			
//			}
//		};
//		Collections.sort(list, com);
		
		Collections.sort(list); // ScoreDTO에 implements Comparable<ScoreDTO> 해주고 한 방법 위와 이방법 둘중하나 쓰면됨
		
		
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
				
				}catch (EOFException e) {//EOFException 파일에 끝에 도달하면 발생하는 에러
					
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
