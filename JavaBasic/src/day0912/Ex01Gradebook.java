package day0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�ָ� ����
//�� ������ 
//1��: ����, ����, ���� ������ ���� �� �� �ְ� �����ϰ�
//2��: ���ѷ����� �̿��Ͽ� �޴��� ���ؼ� �Է°� ����� �� �� �ְ� �ٲ�
//3��: �޼ҵ带 �и��غ�����.

//��� ���� : 2�г� 1�б� �߰� ��� ��� 80���� �ԷµǾ����ϴ�.
public class Ex01Gradebook {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//����, ����, ���п� ���� 2���� �迭�� ����� �ش�.
		int[][] koreanArray = new int [3][4];
		int[][] englishArray = new int [3][4];
		int[][] mathArray = new int [3][4];
		BufferedReader bufferedReader = new BufferedReader ( new InputStreamReader ( System.in));
		
		while(true) {
			showMenu();
			int choice = Integer.parseInt(bufferedReader.readLine());
			if(choice == 1 ) {
				int year = selectYear(bufferedReader);
				int testNumber = selecetTest(bufferedReader);
			 
				koreanArray[year -1][testNumber-1] = validateScore(bufferedReader, 1 );
				englishArray[year -1][testNumber-1] = validateScore(bufferedReader, 2 );
				mathArray[year -1][testNumber-1] = validateScore(bufferedReader, 3 );
			
//				
//				System.out.println("�Է��� ������ ������ ������ �ּ��� : ");
//				
//				System.out.println("1. ���� 2. ���� 3. ����");
//				System.out.println(">");
//				int code = Integer.parseInt(bufferedReader.readLine());
			}else if(choice ==  2 ) {
				int year = selectYear(bufferedReader);
				int testNumber = selecetTest(bufferedReader);
				String message = new String();
				switch (testNumber) {
				case 1 : 
					message = " 1�б� �߰����";
					break ;
				case 2 : 
					message = " 1�б� �⸻���";
					break ;
				case 3 : 
					message = " 2�б� �߰����";
					break ;
				case 4 : 
					message = " 2�б� �⸻���";
					break ;
				}
				
				System.out.println(year+"�г� "+message);
	            printScore(koreanArray[year-1][testNumber-1], englishArray[year-1][testNumber-1], mathArray[year-1][testNumber-1]);

			}else if(choice == 3) {
				System.out.println("������ּż� �����մϴ�");
				break;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}	
		}
	static void printScore(int korean, int english, int math) {
		System.out.printf("���� : %03d�� ���� : %03d�� ����: %03d��\n", korean, english, math);
	}
	static int selectYear(BufferedReader bufferedReader)throws NumberFormatException, IOException {
		System.out.println("�г��� �������ּ��� : ");
		System.out.println("> ");
		int year = Integer.parseInt(bufferedReader. readLine());
		while(year < 1 || year > 3) {
			System.out.println("�߸��� �г��Դϴ�. ");
			System.out.println("�г��� �������ּ��� : ");
			year = Integer.parseInt(bufferedReader.readLine());
		}
		return year;	
	}
	
	static int selecetTest(BufferedReader bufferedReader) throws NumberFormatException, IOException {	
		System.out.println("������ �������ּ��� : " );
		System.out.println("1. 1�б� �߰� 2. 1�б� �⸻ 3. 2�б��߰� 4. 2�б� �⸻ " );
		System.out.println("> " );
		int testNumber = Integer.parseInt(bufferedReader.readLine());
		while(testNumber < 1 || testNumber > 4) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println("1. 1�б� �߰� 2. 1�б� �⸻ 3. 2�б��߰� 4. 2�б� �⸻ " );
			System.out.println("> " );
			testNumber = Integer.parseInt(bufferedReader.readLine());
		}
		return testNumber;
	}
	
	
	static void showMenu() {
		System.out.println("=============================");
		System.out.println("��Ʈ����б� ���� ���� ���α׷�");
		System.out.println("\t1. �Է�");
		System.out.println("\t2. ���");
		System.out.println("\t3. ����");	
		System.out.println(">");
	}
	
	// ������ �ùٸ��� üũ�ϰ� �ùٸ��� ������ �ùٸ� ������ �������� ��� �Է¹޴� �޼ҵ�
	static int validateScore(BufferedReader bufferedReader, int code) throws NumberFormatException, IOException {
		String  message = new String();
		switch(code) {
	    case 1:
	       message = "���� ������ �Է����ּ��� : ";
	       break;
	    case 2:
	    	message = "���� ������ �Է����ּ��� : ";
	       break;
	    case 3:
	    	message = "���� ������ �Է����ּ��� : ";
	       break;
	    
	    }
		
		System.out.print(message);
		int score = Integer.parseInt(bufferedReader.readLine());
		
		while (score < 0 || score > 100) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			System.out.println("������ �Է����ּ��� : ");
			score = Integer.parseInt(bufferedReader.readLine());
		}
		return score;
	}

}
