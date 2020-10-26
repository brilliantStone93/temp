package homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import util.ArrayUtil;

public class Board {
	private static BufferedReader br;
	private static Board01 [] boardArray;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader ( new InputStreamReader(System.in));
		boardArray = new Board01[0];
		
		while(true) {
			int choice = showMenu();
			if(choice == 1) {
				//�Է� �޼ҵ�
				add();
			}else if(choice == 2) {
				//��� �޼ҵ�
				if(ArrayUtil.size(boardArray) == 0) {
					System.out.println("�Խñ��� �����ϴ�.");
				}else printArray();
			}else if(choice == 3) {
				System.out.println("������ּż� �����մϴ�");
				break;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
			}
		}//while
	}//main

	private static int showMenu() throws NumberFormatException, IOException {
		
		while(true) {
			System.out.println("==========��Ʈ�Խ���==========");
			System.out.println("1. �ۼ��ϱ� 2. ��Ϻ��� 3. �����ϱ� ");
			System.out.print(" > ");
			int choice = Integer.parseInt(br.readLine());
			
			//�Խ��� �߸� �Է� ��
			if(choice == 1) {
				return 1;
				
			}else if(choice == 2) {
				return 2;
				
			}else if(choice == 3) {
				return 3;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
			}
		}//while
	}
	
	//�Է¸޼ҵ�
	private static void add() throws IOException {
		boardArray = ArrayUtil.add(boardArray, setboardInfo());
	}
	
	private static Board01 setboardInfo() throws IOException {
		Board01 b = new Board01();
		System.out.println("������ �Է����ּ��� : ");
		b.setTitle(br.readLine());
		
		System.out.println("�ۼ��ڸ� �Է����ּ��� : ");
		b.setName(br.readLine());
		
		System.out.println("������ �Է����ּ��� : ");
		b.setContents(br.readLine());
		
		return b;
	}
	
	private static void printArray() throws NumberFormatException, IOException {
		System.out.println("=========�Խ��� ���==========");
		for(int i = 0 ; i < boardArray.length; i++) {
			System.out.printf("%d\t%s\n",(i+1), boardArray[i].getTitle());
		}
		System.out.print("���������� ��ȣ�� �����ּ���(0�� �ڷα��): ");
		int userChoice = Integer.parseInt(br.readLine())-1;
		while(userChoice < -1 || userChoice > boardArray.length -1) {
			System.out.println("�߸��� ��ȣ�Դϴ�.");
			System.out.println("���������� ��ȣ�� �����ּ���(0�� �ڷα��): ");
			userChoice = Integer.parseInt(br.readLine())-1;
			
		}//
		if(userChoice == -1) {
			//�޽����� ���
			System.out.println("�޴��� ���ư��ϴ�.");
						
		}else {
			//�󼼺��� �޼ҵ� ȣ��
			printOne(userChoice);
			
		}
		
		
	}//printArray
	
	private static void printOne(int userChoice) throws NumberFormatException, IOException {
		System.out.println("============================");
		
		System.out.printf("���� : %s, �ۼ��� : %s\n", boardArray[userChoice].getTitle(), boardArray[userChoice].getName() );
		System.out.printf("���� : %s\n", boardArray[userChoice].getContents());
		
		//���� �� ����
		System.out.println("============================");
		System.out.println("1.�����ϱ�  2.�����ϱ�  3.��Ϻ���");
		System.out.print("> ");
		int index = Integer.parseInt(br.readLine());
		if(index == 1) {
			System.out.println("������ �Է����ּ��� : ");
			boardArray[userChoice].setTitle(br.readLine());
			
			System.out.println("�ۼ��ڸ� �Է����ּ��� : ");
			boardArray[userChoice].setName(br.readLine());
			
			System.out.println("������ �Է����ּ��� : ");
			boardArray[userChoice].setContents(br.readLine());
			
		}else if(index == 2) {
			System.out.print("������ �����Ͻðڽ��ϱ�? (y/n) :");
			String yn = br.readLine();
			if(yn.equals("y") || yn.equals("Y")) {
				boardArray = ArrayUtil.removeByIndex(boardArray, userChoice);
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
		
		
	}//printOne
	
}//
