package day0916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//
public class CarEx04Array02 {
   private static int SIZE = 3;
   public static void main(String[] args) throws NumberFormatException, IOException {
      //사용자가 입력한 값으로 Car 객체를 만들어서
      //Car배열에 비어있는 칸에 넣고
      //비어있는 칸이 없으면 "빈 칸이 없습니다" 라고 나오는 프로그램을 만들어보자
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Car[] carArray = new Car[SIZE];
      
      while(true) {
    	 
         showMenu();
         int userChoice = Integer.parseInt(br.readLine());
         //만약 입력을 눌렀을 때
         //빈칸인지 아닌지는 어떻게 알 수 있을까?
         if(userChoice == 1) {
            
            
            if(index(carArray) == -1) {
               System.out.println("빈칸이 없습니다.");
            }else {
            	
            	carArray[index(carArray)] = array(br);
            	
            }//if~else
         }else if(userChoice == 2) {
        	 //출력을 하되 해당칸이 null 이면 출력하지 않는다.
        	 printInfo(carArray);
//        	 for(int i = 0; i < carArray.length; i++) {
//        		 if(carArray[i] != null) {
//        			 System.out.println(carArray[i]);
//        		 }
////        		System.out.printf("차량 번호 : %s 차량 종류 : %s\n",  carArray[i].getNumber(),   carArray[i].getType());
////        		System.out.printf("연식: %d년 가격 : %d원\n",  carArray[i].getYear(),  carArray[i].getPrice());
////        		System.out.printf("색상 : %s\n",  carArray[i].getColor());
//    			
//        	 }
         }else if(userChoice == 3){
        	 System.out.println("프로그램 종료");break;
        	 
         }else System.out.println("잘 못 입력하셨습니다");//else
      }//while
   }
// 메소드 1: 입력할 index를 찾는 메소드, 강사님이랑 나랑 같음
   private static int index(Car [] carArray) {
	   
       for(int i = 0; i < carArray.length; i++) {
          if(carArray[i] == null) {
             
             
             return i;
          }
       }//for
       return  -1;
   }
// 메소드 2: 배열에 해당위치에 Car 객체를 넣어서 배열을 다시 리턴해주는 메소드
   private static Car array(BufferedReader br) throws IOException {
	   Car c = new Car();
	   System.out.print("번호: ");
       c.setNumber(br.readLine());
       System.out.print("차종: ");
       c.setType(br.readLine());
       System.out.print("연식: ");
       c.setYear(Integer.parseInt(br.readLine()));
       System.out.print("가격: ");
       c.setPrice(Integer.parseInt(br.readLine()));
       System.out.print("색상: ");
       c.setColor(br.readLine());
       
       return c;
   }
//// 메소드 2: 배열에 해당위치에 Car 객체를 넣어서 배열을 다시 리턴해주는 메소드 , 강사님 답안
//   private static Car[] add(Car[] carArray, Car c) {
//	   int index = index(carArray);
//	   carArray[index] = c;
//	   return carArray;
//   }

//예제 2: 현재 출력 하는 코드들을 메소드로 분리하세요, 강사님이랑 나랑 같음
   
   private static void printInfo(Car[] carArray) {
	   for(int i = 0; i < carArray.length; i++) {
  		 if(carArray[i] != null) {
  			 System.out.println(carArray[i]);
  		 }
	   }
   }
//예제 3: 메뉴를 출력하는 코드들을 메소드로 분리하세요 , 강사님이랑 나랑 같음
   static void showMenu() {
	  System.out.println("===================");
	  System.out.println("  자동차 관리 프로그램  ");
	  System.out.println("1. 입력 2. 출력 3. 종료");
	  System.out.println(">");
   }
}

