package day0915;

public class Car02 {
	public static void main(String[] args) {
		CarExHomeWork car = new CarExHomeWork("�ƿ��", "������", 1004, 2020, 1000);
		
		car.getCarNumber();
		car.getModel();
		car.getYear();
		car.getColor();
		car.getPrice();
		
		
		
		
		
		System.out.printf("���� ��ȣ : %d, ���� ����: %s, ����: %d, ���� : %d, ���� : %s\n", car.getCarNumber(), car.getModel(), car.getYear(), car.getPrice(), car.getColor());
	}
}
