package day0916;
//사용자로부터 차량 정보를 입력받고 출력하는 프로그램을 작성하세요
//조건 1. 만약 아무런 정보가 없다면 출력이 되지 않게 하시오
//조건 2. 무한루프를 통해서 입력과 출력을 사용자가 선택하는 만큼 반복하게 만드세요

//예시:
//1. 입력 2. 출력 3. 종료 : 1
//차량 번호는? (00가 0000)
//차량 종류는 .....
//차량 색상은? (빨간색)
//입력완료
//1. 입력 2. 출력 3. 종료 : 2 
//(차량의 정보가 출력됨)

//20분까지
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarEx02 {
	
	static void showMeue() {
		System.out.println("==================");
		System.out.println(" 1.입력\t2.출력\t3.종료");
		System.out.print("> ");
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Car c1 = new Car();
		//차량 번호
		 String number = "";
		//차량 종류
		 String type = "";
		//연식
		 int year = 0;
		//가격
		 int price = 0;
		//색깔
		 String color = "";
		
		while(true) {
			showMeue();
			int choice = Integer.parseInt(br.readLine());
			if(choice == 1) {//
				
				System.out.print("차량 번호 : ");
				number = br.readLine();
				c1.setNumber(number);
				System.out.print("차량 종류 : ");
				type = br.readLine();
				c1.setNumber(type);
				System.out.print("차량 색상 : ");
				color = br.readLine();
				c1.setColor(color);
				System.out.print("차량 가격 : ");
				price = Integer.parseInt(br.readLine());
				c1.setPrice(price);
				System.out.print("차량 연식 : ");
				year = Integer.parseInt(br.readLine());
				c1.setYear(year);
				System.out.println("입력완료");
			}else if(choice == 2) {
				if(c1.getNumber().equals ("")) {
					System.out.println("정보가 없습니다");
				}else c1.printInfo();
				
				
			}else if(choice == 3) {
				System.out.println("프로그램 종료"); break;
			}else System.out.println("잘못입력하셨습니다.");
		}
		
		
	}
}

//package day0916;
////사용자로부터 차량 정보를 입력받고 출력하는 프로그램을 작성하세요
////조건 1. 만약 아무런 정보가 없다면 출력이 되지 않게 하시오
////조건 2. 무한루프를 통해서 입력과 출력을 사용자가 선택하는 만큼 반복하게 만드세요
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
////예시:
////1. 입력 2. 출력 3. 종료 : 1
////차량 번호는? (00가 0000)
////차량 종류는 .....
////차량 색상은? (빨간색)
////입력완료
////1. 입력 2. 출력 3. 종료 : 2 
////(차량의 정보가 출력됨)
//
////20분까지
//public class CarEx02 {
// public static void main(String[] args) throws NumberFormatException, IOException {
//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//    Car c = new Car();
//    while(true) {
//       System.out.println("비트 차량 관리 프로그램");
//       System.out.println("1. 입력 2. 출력 3. 종료");
//       int choice = Integer.parseInt(bufferedReader.readLine());
//       if(choice == 1) {
//          // 차량 정보 입력
//          // 차량 번호 입력 해보자
//          System.out.print("번호: ");
//          c.setNumber(bufferedReader.readLine());
//          System.out.print("차종: ");
//          c.setType(bufferedReader.readLine());
//          System.out.print("연식: ");
//          c.setYear(Integer.parseInt(bufferedReader.readLine()));
//          System.out.print("가격: ");
//          c.setPrice(Integer.parseInt(bufferedReader.readLine()));
//          System.out.print("색상: ");
//          c.setColor(bufferedReader.readLine());
//       }else if(choice == 2) {
//          // 차량 정보 출력
//          // 만약 c의 필드값이 0이거나 ""이면 아무런 정보가 입력되지 않았다는 뜻이므로
//          // 경고메시지만 출력한다.
//          if(c.getYear() == 0) {
//             System.out.println("아직 입력된 정보가 없습니다.");
//          }else {
//             c.printInfo();
//          }
//          
//       }else if(choice == 3) {
//          System.out.println("사용해주셔서 감사합니다.");
//          break;
//       }else {
//          System.out.println("잘못입력하셨습니다.");
//       }
//    }
// }
//}

