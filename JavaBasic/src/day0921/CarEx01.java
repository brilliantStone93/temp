package day0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

import day0916.Car;

//자동차 관리 프로그램을  ArrayList로 작성하세요(
public class CarEx01 {
	private static BufferedReader br;
	private static ArrayList<Car> list;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		 list = new ArrayList<>();
		 br = new BufferedReader(new InputStreamReader(System.in));
		 
		 showMenu();
	}//main
	
	private static void showMenu() throws NumberFormatException, IOException {
		while(true) {
			System.out.println("========자동차관리 프로그램==========");
			System.out.println("1. 입력\t2. 출력\t3. 종료");
			System.out.print("> ");
			int choice = validateNumber(1,3);
			if(choice==1) {
				add();
			}else if(choice == 2) {
				printArray();
			}else if(choice == 3) {
				System.out.println("프로그램 사용 종료");
				break;
			}
		}//while
	}//showMenu
	
	private static int validateNumber(int minimum, int maximum) throws NumberFormatException, IOException {
	      System.out.print("> ");
	      int value = Integer.parseInt(br.readLine());
	      while (value < minimum || value > maximum) {
	         System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
	         System.out.print("> ");
	         value = Integer.parseInt(br.readLine());
	      }

	      return value;
	   }//validateNumber
	
	private static void add() throws NumberFormatException, IOException {
		Car c = new Car();
		System.out.print("차량 번호 : ");
		c.setNumber(br.readLine());
		while(list.contains(c)) {
			System.out.println("이미 존재하는 차량번호입니다.");
			System.out.print("차량 번호 : ");
			c.setNumber(br.readLine());
		}
		System.out.print("차량 종류 : ");
		c.setType(br.readLine());
		System.out.print("차량 연식 : ");
		c.setYear(Integer.parseInt(br.readLine()));
		System.out.print("차량 색깔 : ");
		c.setColor(br.readLine());
		System.out.print("차량 가격 : ");
		c.setPrice(Integer.parseInt(br.readLine()));
		
		list.add(c);
	}
	
	private static void printArray() throws NumberFormatException, IOException {
		System.out.println("========목록========");
		for(int i = 0 ; i < list.size(); i ++) {
		System.out.println((i+1)+". "+list.get(i).getNumber()) ;
		}
		System.out.println();
		System.out.print("상세보기할 번호를 선택하세요(0번은 뒤로가기): ");
		int userChoice = validateNumber(0, list.size())-1;
		if(userChoice == -1) {
			System.out.println("매뉴로 돌아갑니다");
		}else printOne(userChoice);
		
	
	}//printArray
	
	private static void printOne(int index) throws NumberFormatException, IOException {
		System.out.println("===========================");
		System.out.printf("\t%s 차량 정보\n", list.get(index).getNumber());
		System.out.printf("차량번호: %s | 차량 종류 : %s | 차량 색상 : %s\n", list.get(index).getNumber(), list.get(index).getType(),list.get(index).getColor());
		DecimalFormat format = new DecimalFormat("#,###");
		System.out.printf("차량 연식 : %d년 | 차량 가격 : %s원\n", list.get(index).getYear(), format.format(list.get(index).getPrice()));
		System.out.println("============================");
		System.out.println("1. 수정 2. 삭제 3. 목록으로");
		System.out.println(" > " );
		int userChoice = validateNumber(1, 3);
		if(userChoice == 1) {
			//수정 메소드 실행
			update(index);
		}else if(userChoice == 2) {
			//삭제 메소드 실행
			delete(index);
		}else if(userChoice == 3) {
			//메인 메뉴로 돌아가도록printAll()실행
			printArray();
		}
	}//printOne
	
	private static void update(int index) throws NumberFormatException, IOException {
		System.out.print("차량 색상 : ");
		list.get(index).setColor(br.readLine());
		
		System.out.print("차량 연식 : ");
		list.get(index).setYear(Integer.parseInt(br.readLine()));
		
		System.out.print("차량 가격 : ");
		list.get(index).setPrice(Integer.parseInt(br.readLine()));
		
		printOne(index);
		
	}//update
	
	
	private static void delete(int index) throws IOException{
		System.out.println("해당 차량을 정말 삭제하시겠습니까? (y/n)");
		System.out.print("> ");
		String yn = br.readLine();
		if(yn.equals("y")) {
			list.remove(index);
			printArray();
		}else if(yn.equals("n")) {
			printOne(index);
		}
	}//delete
	
}
