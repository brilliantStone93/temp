package day0915;
//����: Car Ŭ������ ���� �� Ŭ���� ��ü�� Ȱ���ϴ� ���α׷��� �ۼ��غ�����.
//Car  Ŭ������ �ʵ�: ������ȣ, ���� ����, ����, ����, ����
//�޼ҵ�: ���� ������ ������ ���ڰ� ����ϴ� �޼ҵ�, ������ ���� �Ķ���Ͱ� �ִ� �����ڿ� �Ķ���Ͱ� ���� ������, ĸ��ȭ
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
		
		//privat�Ǿ� �ִ� �ʵ� ������ ���� Ŭ���� �ȿ� �ִ� ���θżҵ� ������ ��� ����ü� �ִ°� ? this.setCarNumber(10);
		
	}
	








}
