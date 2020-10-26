package collection;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>(); // 여기에 ArrayList 메모리를 안잡을 거면 생성자에 잡아주면됨
	private Scanner s = new Scanner(System.in);
	private DecimalFormat df = new DecimalFormat("##.###");
	
	public void menu() {
		int num;
		while(true) {
		System.out.println("*****************");
		System.out.println("   1. 입력");
		System.out.println("   2. 출력");
		System.out.println("   3. 검색");
		System.out.println("   4. 삭제");
		System.out.println("   5. 정렬");
		System.out.println("   6. 끝");
		System.out.println("**********************");
		System.out.print("번호(1번~6번 중에 선택하세요) :");
		num = s.nextInt();
		
		if(num == 6) break;
		if(num == 1) list.add(insertArticle());
		else if(num == 2) printArticle();
		else if(num == 3) searchArticle();
		else if(num == 4) deleteArticle();
		else if(num == 5) sortArticle();
		else System.out.println("1~6중에 선택하세요");
		
		
		}
	}//menu
	
	
	
	



	//insertArticle()
	private SungJukDTO insertArticle() {
		SungJukDTO sjd = new SungJukDTO();
		
		System.out.print("번호 입력 : ");
		sjd.setRank(validateNumber(0,1000));
		System.out.print("이름 입력 : ");
		sjd.setName(s.next());
		System.out.print("국어 입력 : ");
		int k = validateNumber(0,100);
				sjd.setKorean(k);
		System.out.print("영어 입력 : ");
		int e = validateNumber(0,100);
				sjd.setEnglish(e);
		System.out.print("수학 입력 : ");
		int m = validateNumber(0,100);
				sjd.setMath(m);
		int tot = k + e+ m;
		double avg = (double)tot/3;//3대신에 3.으로 사용하고 double을 빼도 좋다
		sjd.setTot(tot);
		sjd.setAvg(avg);
		return sjd;
	}//insertArticle()
	
	
	
	//printArticle
	private void printArticle() {
		
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO dto = it.next();
			System.out.println(dto.getRank()+"\t"+dto.getName()+"\t"+dto.getKorean()+"\t"+dto.getEnglish()+
								"\t"+dto.getMath()+"\t"+dto.getTot()+"\t"+df.format(dto.getAvg()));
			//여기서 잡아주는 것보다 DTO에서 toString Override통해서 해주는 것이 더 간단하다
		}//while
	}//printArticle
	
	
	
	
	//searchArticle
	public void searchArticle() {
		System.out.print("검색할 이름 입력 : ");
		String name = s.next();
		
		
		for(SungJukDTO sj : list) {
			int count = 0;
			if(sj.getName().equals(name)) {
				
				if(count == 0 ) System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(sj.getRank()+"\t"+sj.getName()+"\t"+sj.getKorean()+"\t"+sj.getEnglish()+
						"\t"+sj.getMath()+"\t"+sj.getTot()+"\t"+df.format(sj.getAvg()));
				count = 1;
			}//if
			
			if(count == 0) System.out.println("찾고자 하는 이름이 없습니다.");
			
		}//for
		
		
	}//searchArticle
	
	
//	deleteArticle() - 똑같은 이름이 있으면 모두 삭제
//	삭제 할 이름 입력 : 홍길동
//	데이터를 삭제하였습니다
	
	//deleteArticle
	public void deleteArticle() {
		System.out.print("삭제할 이름 입력: ");
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
//				list.remove(count); list값을 직접 지워주면 밑에 에러가 발생한다.
//			else count ++;
//		}//Iterator 사용
		
//		for(SungJukDTO sj : list) {
//			
//			if(sj.getName().equals(name)) {
//				list.remove(sj);
//				
//				
//			}//if
		
		
		//java.util.ConcurrentModificationException 이 에러는 인댁스가 재 부여됨에 따라 갈 곳을 잃어버려 발생하는 오류이다
		//왜냐하면 ArrayList는 해당 인덱스가 삭제되면 자동으로 재 정립해주기때문
		//따라서 이를 방지하기 위해 Iterator을 사용해주어야 한다.
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO dto = it.next();
			if(dto.getName().equals(name)) {
				it.remove();
				sw = 1;
				
			}
			
		}//while
		if(sw == 0 )System.out.println("찾고자 하는 이름이 없습니다.");
		else System.out.println("데이터를 삭제하였습니다");
		
	}//deleteArticle
	
	
//	sortArticle()
//	1. 이름으로 오름차순
//	2. 총점으로 내림차순
//	3. 이전메뉴
//	 번호 입력 :
	//sortArticle()
	private void sortArticle() {
		while(true) {
			System.out.println("1. 이름으로 오름차순");
			System.out.println("2. 총점으로 내림차순");
			System.out.println("3. 이전 메뉴");
			System.out.print("번호 입력 : ");
			int userChoice = validateNumber(1,3);
			
			if(userChoice == 1) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						return s1.getName().compareTo(s2.getName()); //오름차순 , 내림차순 변경은 -1을 곱해주면된다 
															    //왜냐하면 비교값은 값은 1, 0, -1로 나와 return해주는데 이값을 -1을 곱해주어 역행시키면됨
						}
				};
				Collections.sort(list, com);
				printArticle();
			}else if(userChoice == 2) {
				Collections.sort(list);
				printArticle();
				/*Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						//조건연산자 ? 참 : 거짓;
						
						return s1.getTot() < s2.getTot() ? -1 : 1; // 오름 차순
								s1.getTot() < s2.getTot() ? 1 : -1;// 내림차순
					
					}
				 * 강사님 답안
				 */
				
			}else if(userChoice == 3) {
				System.out.println("이전 메뉴로 돌아갑니다");
				break;
			}
			
		}//while
		
		
	}//sortArticle()
	
	
	
	
	
	
	//varlidateNumber
	public int validateNumber(int min, int max) {
		
		int number = s.nextInt();
		while(true) {
		if(number < min || number > max	) {
			System.out.println("잘못입력하셨습니다");
			System.out.print("다시 입력해주세요 : ");
			number = s.nextInt();
		}else break;
		}
		return number; 	
	}//varlidateNumber

}


