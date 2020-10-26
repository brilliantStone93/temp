package day0917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day0916.Car;

//만약 꽉 차면 
//가장 앞에 부터 제거하고
//한칸씩 땡겨서 맨 마지막에 덮어씌우는 형식으로
//배열을 관리하는 프로그램
public class CarEx05 {
	private static int SIZE=3;
	public static void main(String[] args) throws NumberFormatException, IOException {
		Car[] carArray = new Car[SIZE];
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		while(true) {
			showMenu();
			int userChoice = Integer.parseInt(br.readLine());
			if(userChoice == 1) {
				//입력 메소드 실행
				carArray = add(carArray);
				
			}else if( userChoice == 2) {
				//출력 메소드 실행
				printArray(carArray);
			}else if(userChoice == 3) {
				//메시지 출력 후 종료
				System.out.println("사용해주셔서 감사합니다");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
	//메뉴 메소드
	private static void showMenu() {
		System.out.println("비트 차량관리 프로그램 ver 2.0");
		System.out.println("1. 입력 2. 출력 3. 종료");
		System.out.println(">");
	}
	//입력 메소드/배열이 꽉찼으면 비워주고 새로운 정보 넣기
	private static Car [] add(Car[] carArray) throws NumberFormatException, IOException {
		int index = findEmptyIndex(carArray);
		if(index != -1) {
			//빈칸이 존재하므로 index 빈 칸에
			//Car 객체를 넣어준다.
			carArray[index] = setCarInfo();
			
		}else {
			//배열이 모두다 꽉찼으므로 배열을 한칸씩 땡겨서
			//맨마지막칸에 새로운 입력된 c를 넣게 만들어주자
			for(int i = 1; i<carArray.length; i++) {
				carArray[i-1] = carArray[i];
			}
			carArray[SIZE -1] = setCarInfo();
		}
		return carArray;
	}
	//입력 메소드
	private static Car setCarInfo() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		Car c = new Car();
		System.out.println("차량 번호 : " );
		c.setNumber(br.readLine());
		System.out.println("차량 종류: " );
		c.setType(br.readLine());
		System.out.println("차량 연식: " );
		c.setYear(Integer.parseInt(br.readLine()));
		System.out.println("차량 가격: " );
		c.setPrice(Integer.parseInt(br.readLine()));
		System.out.println("차량 색상 : " );
		c.setColor(br.readLine());
		
		return c;
	}
	//Car배열 안 빈칸을 찾는 메소드
	private static int findEmptyIndex(Car[] carArray) {
		for(int i = 0; i < carArray.length; i ++) {
			if(carArray[i] == null) {
				return i;
			}
		}
		return -1;
	}
	//출력 메소드
	private static void printArray(Car[] carArray) {
		for(int i = 0 ; i < carArray.length; i++) {
			System.out.println(carArray[i]);
		}
	}


}


