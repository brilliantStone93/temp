package day0911;

//���� ���α׷�
//����ڰ� ù���� ������ �Է��ϰ�
//+ - * / % �� �����ϰ�
//�ι�° ������ �Է��ϸ�
//�ش� ��ɿ� ���� �޼ҵ尡 ����Ǽ� 
//������� ȭ�鿡
//����ϰ� ��������

//����
//ù��° ���� �Է����ּ���: (1�Է�)
//�����ڸ� �������ּ���: +
//�ι�° ���� �Է����ּ���: (100�Է�)
//�����: 101


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04Calcultor {
	
	//main  �޼ҵ忡�� ������ �޼ҵ带 ȣ���� �� �ְ� ���������
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ù��° ���� �Է����ּ��� :");
		int a = Integer.parseInt(br.readLine());
		System.out.println("�����ڸ� �������ּ���");
		String operator = br.readLine();
		while(true) {
			if(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")) {
				break;
			}else {System.out.println("�߸��� ������ �Դϴ�"); 		
					System.out.println("�����ڸ� �������ּ���");
					operator = br.readLine();}
			}
		System.out.println("�ι�° ���� �Է����ּ��� :");
		int b = Integer.parseInt(br.readLine());
		if(operator.equals("+")) {
			System.out.println("�����"+add(a, b));
		}else if(operator.equals("-")) {
			System.out.println("�����"+sub(a, b));
		}else if(operator.equals("*")) {
			System.out.println("�����"+ mul(a, b));
		}else if(operator.equals("/")) {
			System.out.println("�����"+String.format("%.2f", div(a, b)));
		}
		
		
	}
	
	static int add(int a, int b) {
		return a + b ;
	}
	static int sub(int a, int b) {
		return a - b ;
	}
	static int mul(int a, int b) {
		return a * b;
	}
	static double div(int a, int b) {
		return (double)a/b;
	}
}

//���翬����� ��
//package day0911;
////���� ���α׷�
//
////����ڰ� ù���� ������ �Է��ϰ�
////+ - * / % �� �����ϰ�
////�ι�° ������ �Է��ϸ�
////�ش� ��ɿ� ���� �޼ҵ尡 ����Ǽ� 
////������� ȭ�鿡
////����ϰ� ��������
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
////����
////ù��° ���� �Է����ּ���: (1�Է�)
////�����ڸ� �������ּ���: +
////�ι�° ���� �Է����ּ���: (100�Է�)
////�����: 101
////50�б���
//public class Ex04Calculator {
//// �ΰ��� ���ڸ� ���ϴ� �޼ҵ�
//static int add(int a, int b) {
//   return a + b;
//}
//
//static int minus(int a, int b) {
//   return a - b;
//}
//
//static int multiply(int a, int b) {
//   return a * b;
//}
//
//static double divide(int a, int b) {
//   return (double) a / b;
//}
//
//static int remainder(int a, int b) {
//   return a % b;
//}
//
//// main �޼ҵ忡�� ������ �޼ҵ带 ȣ���� �� �ְ� ���������
//public static void main(String[] args) throws NumberFormatException, IOException {
//   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//   System.out.print("ù��° ����: ");
//   int number1 = Integer.parseInt(bufferedReader.readLine());
//
//   System.out.print("������: ");
//   String operator = bufferedReader.readLine();
//
//   System.out.print("�ι�° ����: ");
//   int number2 = Integer.parseInt(bufferedReader.readLine());
//
//   switch (operator) {
//   case "+":
//      System.out.println(add(number1, number2));
//      break;
//   case "-":
//      System.out.println(minus(number1, number2));
//      break;
//   case "*":
//      System.out.println(multiply(number1, number2));
//      break;
//   case "/":
//      System.out.printf("%.2f\n", divide(number1, number2));
//      break;
//   case "%":
//      System.out.println(remainder(number1, number2));
//      break;
//   default:
//      System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//      break;
//   }
//}
//}
