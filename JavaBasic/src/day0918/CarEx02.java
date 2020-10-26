package day0918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0916.Car;
import util.ArrayUtil;

//차량관리 프로그램
//1. 입력
// 입력시에는 배열에 이미 똑같은 번호가 있을 시에는 차량 번호를 다시 입력받게 하세요
//2. 목록 출력
// 목록 출력시에는  
//         1. 차량번호
//         2. 차량번호
//         3. 차량번호
// 의 형식으로 목록이 출력되고 사용자가 번호를 선택하여 상세보기로 들어갈 수 있게 하세요
//3. 상세 보기
// 목록에서 선택한 번호의 차량 상세보기로 들어가면
// 차량 번호 차량 종류 차량 색상
// 차량 연식 차량 가격
//   예시) 차량번호: 00가 0000 차량종류: 벤츠 차량색상: 검은색
//        차량연식: 2020 년형  차량가격: 20000000원 
// 이 출력되고 
// 수정 삭제 목록돌아가기 가 출력되게 만드세요
// A) 수정
//    수정에는 색상, 연식, 가격을 수정할 수 있게 만드세요.
// B) 삭제
//    삭제 시에는 사용자가 동의하면 삭제하고 목록으로 이동하고 동의하지 않을 시에는 해당 차량의 개별보기 페이지로 이동하세요
// C) 목록보기
//    다시 목록으로 이동합니다.
public class CarEx02 {
	private static BufferedReader br;
	private static Car [] carArray;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		carArray = new Car[0];
		showMenu();
		
	}
	
	private static void showMenu() throws NumberFormatException, IOException {
		while(true) {
			System.out.println("=====================");
			System.out.println("1. 입력 2. 출력 3. 종료");
			System.out.print("> ");

			int choice = Integer.parseInt(br.readLine());
			if(choice == 1) {
				//입력 메소드
				carArray = add();
			}else if(choice == 2) {
				//출력 메소드
				if(carArray.equals(null)) {
					System.out.println("입력된 값이 없습니다");
				}else printInfo(carArray);
			}else if(choice == 3) {
				System.out.println("사용해주셔서 감사합니다");
				break;
			}else {System.out.println("잘못입력하셨습니다");
			}
		}//while
	}//showMenu
	
	//입력 메소드  add
	private static Car [] add() throws NumberFormatException, IOException {
		carArray = ArrayUtil.add(carArray, setCarInfo());
		return carArray;
	}
	
	private static Car setCarInfo() throws NumberFormatException, IOException {
		Car c = new Car();
		
		System.out.print("차량 번호 : ");
		c.setNumber(br.readLine());
		System.out.print("차량 종류 : ");
		c.setType(br.readLine());
		System.out.print("차량 연식 : ");
		c.setYear(Integer.parseInt(br.readLine()));
		System.out.print("차량 가격 : ");
		c.setPrice(Integer.parseInt(br.readLine()));
		System.out.print("차량 색상 : ");
		c.setColor(br.readLine());
		
		return c;
	}
	
	//출력 메소드 printInfo
	private static void printInfo(Car [] carArray) throws NumberFormatException, IOException	{
		
		while(true) {
			for(int i = 0 ; i < carArray.length; i++) {
				System.out.println((i+1)+". "+carArray[i].getNumber());
			}
			System.out.println("상세보기할 차량의 번호를 선택하세요");
			System.out.print("> ");
			int userChoice = Integer.parseInt(br.readLine())-1;
			
			
			if(userChoice < carArray.length && userChoice > -1 ) {
				while(true) {
					System.out.println(carArray[userChoice]);
					
					System.out.println("====================");
					System.out.println("1. 수정 2. 삭제 3. 목록보기");
					int choice = Integer.parseInt(br.readLine());
					if(choice == 1) {
						System.out.print("차량 연식 : ");
						carArray[userChoice].setYear(Integer.parseInt(br.readLine()));
						System.out.print("차량 가격 : ");
						carArray[userChoice].setPrice(Integer.parseInt(br.readLine()));
						System.out.print("차량 색상 : ");
						carArray[userChoice].setColor(br.readLine());
						
					}else if(choice == 2) {
						System.out.print("정말로 지우시겠습니까? (y/n): ");
						String yn = br.readLine();
						if(yn.equals("y")) {
							carArray = ArrayUtil.removeByIndex(carArray, userChoice);
							
						}else if(yn.equals("n")) {
							
						}else System.out.println("잘못입력하셨습니다");
						
					}else if(choice == 3) {
						System.out.println("목록으로 돌아갑니다");
						break;
					}
				}//while
			}else {System.out.println("잘 못 입력하셨습니다");
			}
			
		}//while
			
	}//printInfo
}

	

