package util;

import day0916.Car;
import homeWork.Board01;
import day0915.Student;
import java.util.ArrayList;


// �迭 ���� �޼ҵ带 ��Ƶ� Ŭ����
public class ArrayUtil {
   //3�ñ���
   //���⿡ �츮�� �����Ҵ翡�� ����ߴ� �޼ҵ��(indexOf, contains ���)��
   //Student[]�� Car[]�� ���� �� �ְ� ���弼��.
// Car=========================================================================================

//	1. �ش� �迭�� ũ�⸦ Ȯ���ϴ� size()�޼ҵ�
	public static int siew(Car[] carArray) {
		return carArray.length;
	}//size�޼ҵ�

//	2. �迭�� ���ο� ��� �߰� �ϴ� �޼ҵ�
	public static Car[] add(Car[] carArray, Car c) {
		int size = carArray.length;
		
		//�ӽñ�� �ν��Ͻ� ����
		Car [] temp = new Car[size];
		
		//����
		for(int i = 0; i < size; i++) {
			temp[i] = carArray[i];
		}
		
		//carArray ũ�� ����
		carArray =new Car [size+1];
		
		//���빰 ���
		for(int i =0; i<size; i++) {
			carArray[i] = temp[i];
		}
		carArray[size] = c;
		return carArray;
		
	}//add�޼ҵ�
	
	
//	3. �迭�� �ش� ��Ұ� �����ϴ��� üũ�ϴ� contains�޼ҵ�	
	public static boolean contain(Car [] carArray, Car c) {
		for(int i = 0; i < carArray.length; i++) {
			if(carArray[i].equals(c)) {
				return true;
			}
		}
		return false;
	}//contain�޼ҵ�
	
//	4. �迭�� �ش� ��Ұ� ��� �ε����� �����ϴ��� üũ�ϴ� indexOf �޼ҵ�
	public static int indexOf(Car [] carArray, Car c) {
		for(int i = 0; i<carArray.length;i++) {
			if(carArray[i].equals(c)) {
				return i;
			}
		}
		return -1;
	}
	
	
//	5. �迭�� �ش� �ε����� �����ϴ� removeByIndex �޼ҵ�
	public static Car [] removeByIndex(Car [] carArray, int index) {
	
		//index�� ��ȿ�� ����
		if(index < 0 || index >= carArray.length) {
			return carArray;
		}
		//�ӽ� ���� �迭 �����
		Car [] temp = new Car[carArray.length];
		//����
		for(int i = 0; i < carArray.length; i++) {
			temp[i] = carArray[i];
		}
		
		//���� �迭 ���
		carArray = new Car[carArray.length-1];
		
		//���� �ٿ��ֱ� 3�ܰ�� ������
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
//	6. �迭���� �Ķ���ͷ� �Ѿ�� ��ü�� �����ϴ� removeByElement �޼ҵ�
	public static Car[] removeByElement(Car[] carArray, Car c) {
		return removeByIndex(carArray,indexOf(carArray,c));
	}
	
	
//student========================================================================
//	1. �ش� �迭�� ũ�⸦ Ȯ���ϴ� size()�޼ҵ�	

	public static int size(Student[] studentArray) {
		return studentArray.length;
	}
	
//	2. �迭�� ���ο� ��� �߰� �ϴ� �޼ҵ�
	public static Student[] add(Student[] studentArray, Student s) {
		int size = studentArray.length;
		
		//�ӽñ�� �ν��Ͻ� ����
		Student [] temp = new Student[size];
		
		//����
		for(int i = 0; i < size; i++) {
			temp[i] = studentArray[i];
		}
		
		//studentArray �迭 Ȯ��
		studentArray =new Student [size+1];
		
		//���빰 ���
		for(int i =0; i<size; i++) {
			studentArray[i] = temp[i];
		}
		studentArray[size] = s;
		return studentArray;
		
	}
//	3. �迭�� �ش� ��Ұ� �����ϴ��� üũ�ϴ� contains�޼ҵ�		
	public static boolean contain(Student [] studentArray, Student s) {
		for(int i = 0; i < studentArray.length; i++) {
			if(studentArray[i].equals(s)) {
				return true;
			}
		}
		return false;
	}
	
//	4. �迭�� �ش� ��Ұ� ��� �ε����� �����ϴ��� üũ�ϴ� indexOf �޼ҵ�
	public static int indexOf(Student [] studentArray, Student s) {
		for(int i = 0; i<studentArray.length;i++) {
			if(studentArray[i].equals(s)) {
				return i;
			}
		}
		return -1;
	}


//	5. �迭�� �ش� �ε����� �����ϴ� removeByIndex �޼ҵ�
	public static Student [] removeByIndex(Student [] studentArray, int index) {
		//index�� ���°�� ����
		if(index < 0 || index >= studentArray.length) {
			return studentArray;
		}
		//�ӽ� ���� �迭 �����
		Student [] temp = new Student[studentArray.length];
		//����
		for(int i = 0; i < studentArray.length; i++) {
			temp[i] = studentArray[i];
		}
		
		//Student�迭 Ȯ��
		studentArray = new Student[studentArray.length-1];
		
		//���� �ٿ��ֱ� 3�ܰ�� ������
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
	
//	6. �迭���� �Ķ���ͷ� �Ѿ�� ��ü�� �����ϴ� removeByElement �޼ҵ�
	public static Student[] removeByElement(Student[] studentArray, Student s) {
		return removeByIndex(studentArray,indexOf(studentArray,s));
	}
	
	
	
//	Board==============================================================================
	
	
//	1. �ش� �迭�� ũ�⸦ Ȯ���ϴ� size()�޼ҵ�	

	public static int size(Board01[] boardArray) {
		return boardArray.length;
	}
	
//	2. �迭�� ���ο� ��� �߰� �ϴ� �޼ҵ�
	public static Board01[] add(Board01[] boardArray, Board01 b) {
		int size = boardArray.length;
		
		//�ӽñ�� �ν��Ͻ� ����
		Board01 [] temp = new Board01[size];
		
		//����
		for(int i = 0; i < size; i++) {
			temp[i] = boardArray[i];
		}
		
		//boardArray �迭 Ȯ��
		boardArray =new Board01 [size+1];
		
		//���빰 ���
		for(int i =0; i<size; i++) {
			boardArray[i] = temp[i];
		}
		boardArray[size] = b;
		return boardArray;
		
	}
//	3. �迭�� �ش� ��Ұ� �����ϴ��� üũ�ϴ� contains�޼ҵ�		
	public static boolean contain(Board01 [] boardArray, Board01 b) {
		for(int i = 0; i < boardArray.length; i++) {
			if(boardArray[i].equals(b)) {
				return true;
			}
		}
		return false;
	}
	
//	4. �迭�� �ش� ��Ұ� ��� �ε����� �����ϴ��� üũ�ϴ� indexOf �޼ҵ�
	public static int indexOf(Board01 [] boardArray, Board01 b) {
		for(int i = 0; i<boardArray.length;i++) {
			if(boardArray[i].equals(b)) {
				return i;
			}
		}
		return -1;
	}


//	5. �迭�� �ش� �ε����� �����ϴ� removeByIndex �޼ҵ�
	public static Board01 [] removeByIndex(Board01 [] boardArray, int index) {
		//index�� ���°�� ����
		if(index < 0 || index >= boardArray.length) {
			return boardArray;
		}
		//�ӽ� ���� �迭 �����
		Board01 [] temp = new Board01[boardArray.length];
		//����
		for(int i = 0; i < boardArray.length; i++) {
			temp[i] = boardArray[i];
		}
		
		//Board01�迭 Ȯ��
		boardArray = new Board01[boardArray.length-1];
		
		//���� �ٿ��ֱ� 3�ܰ�� ������
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
	
//	6. �迭���� �Ķ���ͷ� �Ѿ�� ��ü�� �����ϴ� removeByElement �޼ҵ�
	public static Board01[] removeByElement(Board01[] boardArray, Board01 b) {
		return removeByIndex(boardArray,indexOf(boardArray,b));
	}
	
}
