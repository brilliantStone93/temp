package util;

import day0916.Car;
import homeWork.Board01;
import day0915.Student;
import java.util.ArrayList;


// 배열 관련 메소드를 모아둔 클래스
public class ArrayUtil {
   //3시까지
   //여기에 우리가 동적할당에서 사용했던 메소드들(indexOf, contains 등등)을
   //Student[]과 Car[]에 사용될 수 있게 만드세요.
// Car=========================================================================================

//	1. 해당 배열의 크기를 확인하는 size()메소드
	public static int siew(Car[] carArray) {
		return carArray.length;
	}//size메소드

//	2. 배열에 새로운 요소 추가 하는 메소드
	public static Car[] add(Car[] carArray, Car c) {
		int size = carArray.length;
		
		//임시기억 인스턴스 생성
		Car [] temp = new Car[size];
		
		//복사
		for(int i = 0; i < size; i++) {
			temp[i] = carArray[i];
		}
		
		//carArray 크기 증가
		carArray =new Car [size+1];
		
		//내용물 백업
		for(int i =0; i<size; i++) {
			carArray[i] = temp[i];
		}
		carArray[size] = c;
		return carArray;
		
	}//add메소드
	
	
//	3. 배열에 해당 요소가 존재하는지 체크하는 contains메소드	
	public static boolean contain(Car [] carArray, Car c) {
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i].equals(c)) {
				return true;
			}
		}
		return false;
	}//contain메소드
	
//	4. 배열에 해당 요소가 몇번 인덱스에 존재하는지 체크하는 indexOf 메소드
	public static int indexOf(Car [] carArray, Car c) {
		for(int i = 0; i<carArray.length;i++) {
			if(carArray[i].equals(c)) {
				return i;
			}
		}
		return -1;
	}
	
	
//	5. 배열에 해당 인덱스를 삭제하는 removeByIndex 메소드
	public static Car [] removeByIndex(Car [] carArray, int index) {
	
		//index의 유효성 검증
		if(index < 0 || index >= carArray.length) {
			return carArray;
		}
		//임시 저장 배열 만들기
		Car [] temp = new Car[carArray.length];
		//복사
		for(int i = 0; i < carArray.length; i++) {
			temp[i] = carArray[i];
		}
		
		//원본 배열 축소
		carArray = new Car[carArray.length-1];
		
		//내용 붙여넣기 3단계로 나눠서
		if(index==0) {
			for(int i = 1; i<temp.length; i++) {
				carArray[i-1] = temp[i];}
		}else if(index == temp.length-1) {
			for(int i = 0; i<temp.length-1; i++) {
				carArray[i] = temp[i];
				}
		}else {
			for(int i = 0 ; i < temp.length; i++) {
				if(i <index) {
					carArray[i] = temp[i];
				}else if(i > index) {
					carArray[i-1]=temp[i];
				}
			}
		
		}//else
		
		return carArray;
	}//removeByIndex
//	6. 배열에서 파라미터로 넘어온 객체를 삭제하는 removeByElement 메소드
	public static Car[] removeByElement(Car[] carArray, Car c) {
		return removeByIndex(carArray,indexOf(carArray,c));
	}
	
	
//student========================================================================
//	1. 해당 배열의 크기를 확인하는 size()메소드	

	public static int size(Student[] studentArray) {
		return studentArray.length;
	}
	
//	2. 배열에 새로운 요소 추가 하는 메소드
	public static Student[] add(Student[] studentArray, Student s) {
		int size = studentArray.length;
		
		//임시기억 인스턴스 생성
		Student [] temp = new Student[size];
		
		//복사
		for(int i = 0; i < size; i++) {
			temp[i] = studentArray[i];
		}
		
		//studentArray 배열 확장
		studentArray =new Student [size+1];
		
		//내용물 백업
		for(int i =0; i<size; i++) {
			studentArray[i] = temp[i];
		}
		studentArray[size] = s;
		return studentArray;
		
	}
//	3. 배열에 해당 요소가 존재하는지 체크하는 contains메소드		
	public static boolean contain(Student [] studentArray, Student s) {
		for(int i = 0; i < studentArray.length; i++) {
			if(studentArray[i].equals(s)) {
				return true;
			}
		}
		return false;
	}
	
//	4. 배열에 해당 요소가 몇번 인덱스에 존재하는지 체크하는 indexOf 메소드
	public static int indexOf(Student [] studentArray, Student s) {
		for(int i = 0; i<studentArray.length;i++) {
			if(studentArray[i].equals(s)) {
				return i;
			}
		}
		return -1;
	}


//	5. 배열에 해당 인덱스를 삭제하는 removeByIndex 메소드
	public static Student [] removeByIndex(Student [] studentArray, int index) {
		//index가 없는경우 리턴
		if(index < 0 || index >= studentArray.length) {
			return studentArray;
		}
		//임시 저장 배열 만들기
		Student [] temp = new Student[studentArray.length];
		//복사
		for(int i = 0; i < studentArray.length; i++) {
			temp[i] = studentArray[i];
		}
		
		//Student배열 확장
		studentArray = new Student[studentArray.length-1];
		
		//내용 붙여넣기 3단계로 나눠서
		if(index==0) {
			for(int i = 1; i<temp.length; i++) {
				studentArray[i-1] = temp[i];}
		}else if(index == temp.length-1) {
			for(int i = 0; i<temp.length-1; i++) {
				studentArray[i] = temp[i];
				}
		}else {
			for(int i = 0 ; i < temp.length; i++) {
				if(i <index) {
					studentArray[i] = temp[i];
				}else if(i > index) {
					studentArray[i-1]=temp[i];
				}
			}
		
		}//else
		
		return studentArray;
	}//removeByIndex
	
//	6. 배열에서 파라미터로 넘어온 객체를 삭제하는 removeByElement 메소드
	public static Student[] removeByElement(Student[] studentArray, Student s) {
		return removeByIndex(studentArray,indexOf(studentArray,s));
	}
	
	
	
//	Board==============================================================================
	
	
//	1. 해당 배열의 크기를 확인하는 size()메소드	

	public static int size(Board01[] boardArray) {
		return boardArray.length;
	}
	
//	2. 배열에 새로운 요소 추가 하는 메소드
	public static Board01[] add(Board01[] boardArray, Board01 b) {
		int size = boardArray.length;
		
		//임시기억 인스턴스 생성
		Board01 [] temp = new Board01[size];
		
		//복사
		for(int i = 0; i < size; i++) {
			temp[i] = boardArray[i];
		}
		
		//boardArray 배열 확장
		boardArray =new Board01 [size+1];
		
		//내용물 백업
		for(int i =0; i<size; i++) {
			boardArray[i] = temp[i];
		}
		boardArray[size] = b;
		return boardArray;
		
	}
//	3. 배열에 해당 요소가 존재하는지 체크하는 contains메소드		
	public static boolean contain(Board01 [] boardArray, Board01 b) {
		for(int i = 0; i < boardArray.length; i++) {
			if(boardArray[i].equals(b)) {
				return true;
			}
		}
		return false;
	}
	
//	4. 배열에 해당 요소가 몇번 인덱스에 존재하는지 체크하는 indexOf 메소드
	public static int indexOf(Board01 [] boardArray, Board01 b) {
		for(int i = 0; i<boardArray.length;i++) {
			if(boardArray[i].equals(b)) {
				return i;
			}
		}
		return -1;
	}


//	5. 배열에 해당 인덱스를 삭제하는 removeByIndex 메소드
	public static Board01 [] removeByIndex(Board01 [] boardArray, int index) {
		//index가 없는경우 리턴
		if(index < 0 || index >= boardArray.length) {
			return boardArray;
		}
		//임시 저장 배열 만들기
		Board01 [] temp = new Board01[boardArray.length];
		//복사
		for(int i = 0; i < boardArray.length; i++) {
			temp[i] = boardArray[i];
		}
		
		//Board01배열 확장
		boardArray = new Board01[boardArray.length-1];
		
		//내용 붙여넣기 3단계로 나눠서
		if(index==0) {
			for(int i = 1; i<temp.length; i++) {
				boardArray[i-1] = temp[i];}
		}else if(index == temp.length-1) {
			for(int i = 0; i<temp.length-1; i++) {
				boardArray[i] = temp[i];
				}
		}else {
			for(int i = 0 ; i < temp.length; i++) {
				if(i <index) {
					boardArray[i] = temp[i];
				}else if(i > index) {
					boardArray[i-1]=temp[i];
				}
			}
		
		}//else
		
		return boardArray;
	}//removeByIndex
	
//	6. 배열에서 파라미터로 넘어온 객체를 삭제하는 removeByElement 메소드
	public static Board01[] removeByElement(Board01[] boardArray, Board01 b) {
		return removeByIndex(boardArray,indexOf(boardArray,b));
	}
	
}
