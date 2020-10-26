package day0915;

public class Car02 {
	public static void main(String[] args) {
		CarExHomeWork car = new CarExHomeWork("아우디", "빨간색", 1004, 2020, 1000);
		
		car.getCarNumber();
		car.getModel();
		car.getYear();
		car.getColor();
		car.getPrice();
		
		
		
		
		
		System.out.printf("차량 번호 : %d, 차량 종류: %s, 연식: %d, 가격 : %d, 색깔 : %s\n", car.getCarNumber(), car.getModel(), car.getYear(), car.getPrice(), car.getColor());
	}
}
