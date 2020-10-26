package day0915;
//숙제: Car 클래스를 만들어서 그 클래스 객체를 활용하는 프로그램을 작성해보세요.
//Car  클래스의 필드: 차량번호, 차량 종류, 연식, 가격, 색깔
//메소드: 현재 차량의 정보를 예쁘게 출력하는 메소드, 차량에 대한 파라미터가 있는 생성자와 파라미터가 없는 생성자, 캡슐화
public class CarExHomeWork {
	private int carNumber;
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public int getCarNumber() {
		return carNumber;
	}
	private String model;
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	private int year;
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	private int price;
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}

	
	public CarExHomeWork(String model, String color, int carNumber, int year, int price) {
		
		this.model = model;
		this.color = color;
		this.carNumber = carNumber;
		this.year = year;
		this.price = price;
		
		
		
	}
	
	public CarExHomeWork() {
		
	}
	
	public static void main(String[] args) {
		
		//privat되어 있는 필드 변수에 같은 클래스 안에 있는 매인매소드 내에서 어떻게 끌어올수 있는가 ? this.setCarNumber(10);
		
	}
	








}
