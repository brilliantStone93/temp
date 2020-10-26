package day0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import homeWork.Board01;


public class BoardArrayList {
	private static ArrayList <Board01> boardList;
	private static BufferedReader br;
	private static Board01 b;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		boardList  = new ArrayList <>();
		br = new BufferedReader ( new InputStreamReader ( System.in));
		b = new Board01();
		
			showMenu();
		
		
				
	}//main
	
	
	
	private static void showMenu() throws NumberFormatException, IOException {
		while(true) {
			System.out.println("============================");
			System.out.println("1. �ۼ��ϱ� 2. ��Ϻ��� 3.�����ϱ�");
			System.out.print(">");
			int choice = Integer.parseInt(br.readLine());
			if(choice == 1) {
				boardList.add(add());
			}else if(choice == 2) {
				printArray();
			}else if(choice == 3){
				System.out.println("�ý����� �����մϴ�.");
				break;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
			}
		}//while
	}//showMenu
	
	
	private static Board01 add() throws IOException {
		b = new Board01();
		System.out.print("������ �Է��ϼ��� : ");
		b.setTitle(br.readLine());
		System.out.print("�ۼ��ڸ� �Է��ϼ��� : ");
		b.setName(br.readLine());
		System.out.println("������ �Է��ϼ��� : ");
		b.setContents(br.readLine());
		
		return  b;
	}//Board01
	
	private static void printArray() throws NumberFormatException, IOException {
		for(int i = 0; i < boardList.size(); i++ ) {
			System.out.println((i+1)+". "+boardList.get(i).getTitle());	
		}
		System.out.print("���������� ������ ��ȣ�� ������(0�� ������ ���ư���): ");
		int userChoice = Integer.parseInt(br.readLine())-1;
		if(userChoice < -1 || userChoice > boardList.size() ) {
			System.out.println("�� �� �Է��ϼ̽��ϴ�");
		}else if(userChoice == -1){
			System.out.println("�Ŵ��� ���ư��ϴ�");
		}else {
			printOne(userChoice);
		}
		
	}//printArray
	
	
	private static void printOne(int userChoice) throws IOException {
		System.out.println("============================");
		
		System.out.printf("���� : %s, �ۼ��� : %s\n", boardList.get(userChoice).getTitle(), boardList.get(userChoice).getName() );
		System.out.printf("���� : %s\n", boardList.get(userChoice).getContents());
		
		//���� �� ����
		System.out.println("============================");
		System.out.println("1.�����ϱ�  2.�����ϱ�  3.��Ϻ���");
		System.out.print("> ");
		int index = Integer.parseInt(br.readLine());
		if(index == 1) {
			System.out.println("������ �Է����ּ��� : ");
			boardList.get(userChoice).setTitle(br.readLine());
			
			System.out.println("�ۼ��ڸ� �Է����ּ��� : ");
			boardList.get(userChoice).setName(br.readLine());
			
			System.out.println("������ �Է����ּ��� : ");
			boardList.get(userChoice).setContents(br.readLine());
			
		}else if(index == 2) {
			System.out.print("������ �����Ͻðڽ��ϱ�? (y/n) :");
			String yn = br.readLine();
			if(yn.equals("y") || yn.equals("Y")) {
				boardList.remove(userChoice);
				printArray();
			}else if(yn.equals("n") || yn.equals("N")) {
				printOne(userChoice);
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				printOne(userChoice);
			}
		}else if(index == 3) {
			printArray();
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�");
			printOne(userChoice);
		}
		
		
	}
}
