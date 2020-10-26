package day0917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0916.Car;
import util.ArrayUtil;

public class CarEx06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Car []  carArray = new Car[0];
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		while(true) {
			showMenu();
			int userChoice = Integer.parseInt(br.readLine());
			if(userChoice == 1) {
				//carArray 추가 메소드 실행
				carArray = add(carArray, br);
			}else if(userChoice == 2) {
				//carArray 출력 메소드 실행
				printArray(carArray);
			}else if(userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
			
		}
		
		
	}//main
	
	
	
	private static void showMenu() {
		System.out.println("1. 입력 2. 출력 3. 종료");
		System.out.print(">");
	}//showMenu
	
	

	private static Car[] add(Car[] carArray, BufferedReader br) throws IOException {
		carArray = ArrayUtil.add(carArray, setCarInfo(br));       //br을 여러번 선언안하고 한번만 하도록 파라미터로 왔다갔다할것임
		return carArray;
	}//add
	
	private static Car setCarInfo(BufferedReader br) throws IOException {
		Car c = new Car();
	
		System.out.println("차량 번호 : ");
		c.setNumber(br.readLine());
		
		System.out.println("차량 종류 : ");
		c.setType(br.readLine());
		
		System.out.println("차량 연식 : ");
		c.setYear(Integer.parseInt(br.readLine()));
		
		System.out.println("차량 가격 : ");
		c.setPrice(Integer.parseInt(br.readLine()));
		
		System.out.println("차량 색상 : ");
		c.setColor(br.readLine());
		
		
		return c;
	}
	
	private static void printArray(Car[] carArray) {
		for(int i = 0 ; i < carArray.length; i++) {
			System.out.println(carArray[i]);
		}
	}
	
}
