package collection;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>(); // ���⿡ ArrayList �޸𸮸� ������ �Ÿ� �����ڿ� ����ָ��
	private Scanner s = new Scanner(System.in);
	private DecimalFormat df = new DecimalFormat("##.###");
	
	public void menu() {
		int num;
		while(true) {
		System.out.println("*****************");
		System.out.println("   1. �Է�");
		System.out.println("   2. ���");
		System.out.println("   3. �˻�");
		System.out.println("   4. ����");
		System.out.println("   5. ����");
		System.out.println("   6. ��");
		System.out.println("**********************");
		System.out.print("��ȣ(1��~6�� �߿� �����ϼ���) :");
		num = s.nextInt();
		
		if(num == 6) break;
		if(num == 1) list.add(insertArticle());
		else if(num == 2) printArticle();
		else if(num == 3) searchArticle();
		else if(num == 4) deleteArticle();
		else if(num == 5) sortArticle();
		else System.out.println("1~6�߿� �����ϼ���");
		
		
		}
	}//menu
	
	
	
	



	//insertArticle()
	private SungJukDTO insertArticle() {
		SungJukDTO sjd = new SungJukDTO();
		
		System.out.print("��ȣ �Է� : ");
		sjd.setRank(validateNumber(0,1000));
		System.out.print("�̸� �Է� : ");
		sjd.setName(s.next());
		System.out.print("���� �Է� : ");
		int k = validateNumber(0,100);
				sjd.setKorean(k);
		System.out.print("���� �Է� : ");
		int e = validateNumber(0,100);
				sjd.setEnglish(e);
		System.out.print("���� �Է� : ");
		int m = validateNumber(0,100);
				sjd.setMath(m);
		int tot = k + e+ m;
		double avg = (double)tot/3;//3��ſ� 3.���� ����ϰ� double�� ���� ����
		sjd.setTot(tot);
		sjd.setAvg(avg);
		return sjd;
	}//insertArticle()
	
	
	
	//printArticle
	private void printArticle() {
		
		
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO dto = it.next();
			System.out.println(dto.getRank()+"\t"+dto.getName()+"\t"+dto.getKorean()+"\t"+dto.getEnglish()+
								"\t"+dto.getMath()+"\t"+dto.getTot()+"\t"+df.format(dto.getAvg()));
			//���⼭ ����ִ� �ͺ��� DTO���� toString Override���ؼ� ���ִ� ���� �� �����ϴ�
		}//while
	}//printArticle
	
	
	
	
	//searchArticle
	public void searchArticle() {
		System.out.print("�˻��� �̸� �Է� : ");
		String name = s.next();
		
		
		for(SungJukDTO sj : list) {
			int count = 0;
			if(sj.getName().equals(name)) {
				
				if(count == 0 ) System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
				System.out.println(sj.getRank()+"\t"+sj.getName()+"\t"+sj.getKorean()+"\t"+sj.getEnglish()+
						"\t"+sj.getMath()+"\t"+sj.getTot()+"\t"+df.format(sj.getAvg()));
				count = 1;
			}//if
			
			if(count == 0) System.out.println("ã���� �ϴ� �̸��� �����ϴ�.");
			
		}//for
		
		
	}//searchArticle
	
	
//	deleteArticle() - �Ȱ��� �̸��� ������ ��� ����
//	���� �� �̸� �Է� : ȫ�浿
//	�����͸� �����Ͽ����ϴ�
	
	//deleteArticle
	public void deleteArticle() {
		System.out.print("������ �̸� �Է�: ");
		String name = s.next();
		int sw = 0;
//		for(SungJukDTO sj : list) {
//			int count = 0;
//			if(sj.getName().equals(name)) {
//				list.remove(count);
//				
//			}//if
//			count ++;
//		}//for 
		
//		Iterator<SungJukDTO> it = list.iterator();
//		int count = 0;
//		while(it.hasNext()) {
//			
//			SungJukDTO dto = it.next();
//			if(dto.getName().equals(name))
//				list.remove(count); list���� ���� �����ָ� �ؿ� ������ �߻��Ѵ�.
//			else count ++;
//		}//Iterator ���
		
//		for(SungJukDTO sj : list) {
//			
//			if(sj.getName().equals(name)) {
//				list.remove(sj);
//				
//				
//			}//if
		
		
		//java.util.ConcurrentModificationException �� ������ �δ콺�� �� �ο��ʿ� ���� �� ���� �Ҿ���� �߻��ϴ� �����̴�
		//�ֳ��ϸ� ArrayList�� �ش� �ε����� �����Ǹ� �ڵ����� �� �������ֱ⶧��
		//���� �̸� �����ϱ� ���� Iterator�� ������־�� �Ѵ�.
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO dto = it.next();
			if(dto.getName().equals(name)) {
				it.remove();
				sw = 1;
				
			}
			
		}//while
		if(sw == 0 )System.out.println("ã���� �ϴ� �̸��� �����ϴ�.");
		else System.out.println("�����͸� �����Ͽ����ϴ�");
		
	}//deleteArticle
	
	
//	sortArticle()
//	1. �̸����� ��������
//	2. �������� ��������
//	3. �����޴�
//	 ��ȣ �Է� :
	//sortArticle()
	private void sortArticle() {
		while(true) {
			System.out.println("1. �̸����� ��������");
			System.out.println("2. �������� ��������");
			System.out.println("3. ���� �޴�");
			System.out.print("��ȣ �Է� : ");
			int userChoice = validateNumber(1,3);
			
			if(userChoice == 1) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						return s1.getName().compareTo(s2.getName()); //�������� , �������� ������ -1�� �����ָ�ȴ� 
															    //�ֳ��ϸ� �񱳰��� ���� 1, 0, -1�� ���� return���ִµ� �̰��� -1�� �����־� �����Ű���
						}
				};
				Collections.sort(list, com);
				printArticle();
			}else if(userChoice == 2) {
				Collections.sort(list);
				printArticle();
				/*Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						//���ǿ����� ? �� : ����;
						
						return s1.getTot() < s2.getTot() ? -1 : 1; // ���� ����
								s1.getTot() < s2.getTot() ? 1 : -1;// ��������
					
					}
				 * ����� ���
				 */
				
			}else if(userChoice == 3) {
				System.out.println("���� �޴��� ���ư��ϴ�");
				break;
			}
			
		}//while
		
		
	}//sortArticle()
	
	
	
	
	
	
	//varlidateNumber
	public int validateNumber(int min, int max) {
		
		int number = s.nextInt();
		while(true) {
		if(number < min || number > max	) {
			System.out.println("�߸��Է��ϼ̽��ϴ�");
			System.out.print("�ٽ� �Է����ּ��� : ");
			number = s.nextInt();
		}else break;
		}
		return number; 	
	}//varlidateNumber

}


