 package class_constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ŭ������ : SungJuk
// �ʵ�      : name, kor, eng, math, tot, avg, grade
// �޼ҵ�   : ������ 
//         calc() - ����, ���, ���� ���
//         getName()
//       getKor()
//       getEng()
//       getMath()
//       getTot()
//       getAvg()
//       getGrade()
//       
// [������]
// ----------------------------------------------------
// �̸�      ����      ����      ����      ����      ���      ����
// ----------------------------------------------------
// ȫ�浿   90      95      100
// �ڳ�      100      89      75
// ��ġ      75      80      48

public class SungJukMain {
	private static BufferedReader br;
	private static SungJuk [] sungJuk;
	private final static int SIZE = 3;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		sungJuk = new SungJuk[SIZE];

		for(int i = 0 ; i < SIZE ; i++) {
			sungJuk[i] = add();
		}
		printInfo();
		
	}//main
	
	private static int validateScore(int minimum, int maximum) throws NumberFormatException, IOException {
		
		int score = Integer.parseInt(br.readLine());
		while(score < minimum || score > maximum) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			score = Integer.parseInt(br.readLine());
		}
		return score;
	}//validateScore
	
	private static SungJuk add() throws NumberFormatException, IOException {
				
		System.out.print("�̸� : ");
		String name = br.readLine();
		System.out.print("��������: ");
		int korean = validateScore(0, 100);
		System.out.print("��������: ");
		int english = validateScore(0, 100);
		System.out.print("��������: ");
		int math = validateScore(0, 100);
		
		SungJuk temp = new SungJuk( name, korean, english, math);
		return temp;
		
	}//add

	private static void printInfo() {
		System.out.println("----------------------------------------------------");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("----------------------------------------------------");
		
		for(int i = 0 ; i < SIZE ; i++) {
			
			System.out.println(sungJuk[i].getName()+"\t"+sungJuk[i].getKorean()+
								"\t"+sungJuk[i].getEnglish()+"\t"+sungJuk[i].getMath()+
								"\t"+sungJuk[i].getTotal()+"\t"+String.format("%.2f",sungJuk[i].getAvg())+"\t"+sungJuk[i].getGrade());
			
		
		}//for	
	}//printInfo
	
	
	
	
}//
