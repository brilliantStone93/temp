package class_constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//SungJuk Ŭ���� �̿��Ͻÿ�
//��ü �迭
//
//[������]
//�ο��� �Է� : 2
//
//�̸� �Է� : ȫ�浿
//���� �Է� : 85
//���� �Է� : 93
//���� �Է� : 100
//
//�̸� �Է� : �ڳ�
//���� �Է� : 75
//���� �Է� : 86
//���� �Է� : 92
//
//----------------------------------------------------
//�̸�      ����      ����      ����      ����      ���      ����
//----------------------------------------------------
//ȫ�浿   85      93      100

//�ڳ�      75      86      92
public class SungJukMain2 {
	private static BufferedReader br;
	private static SungJuk [] sungJuk;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�ο����� �Է��Ͻÿ�:");
		int size = Integer.parseInt(br.readLine());
		sungJuk = new SungJuk[size];
		
		for(int i = 0 ; i < size ; i++) {
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
		
		for(int i = 0 ; i < sungJuk.length ; i++) {
			
		System.out.println(sungJuk[i].getName()+"\t"+sungJuk[i].getKorean()+
							"\t"+sungJuk[i].getEnglish()+"\t"+sungJuk[i].getMath()+
							"\t"+sungJuk[i].getTotal()+"\t"+String.format("%.2f",sungJuk[i].getAvg())+"\t"+sungJuk[i].getGrade());
		
		
		}//for
	
	
	}//printInfo
		
		
	
}//
