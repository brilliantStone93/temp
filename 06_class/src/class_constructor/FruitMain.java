package class_constructor;
//static 문제
//BufferedReader 쓰지말고 데이터는 그대로 입력하기
//생성자 통해서 값 입력
// 합계를 구하는 메소드는 calcTot()
// 과일명 . 1월 2월 3월 찍어주는 곳 display()
// output() 1월의 합계 2월의 합계 3월의 합계를 출력하는 메소드
/*
 * 객체배열
과일 판매량 구하기
월별 매출합계도 구하시오

[실행결과]
-------------------------------------
PUM      JAN      FEB      MAR      TOT
-------------------------------------
사과       100       80       75        255
포도        30       25       10        xxx
딸기        25       30       90        xxx
------------------------------------
        xxx      xxx      xxx         
        
 */


class Fruit{
	private int apple;
	private int grape;
	private int strawberry;
	
//	public void setApple(int apple) {
//		this.apple = apple;
//		
//	}
	
	//생성자
	public Fruit(int apple, int grape, int strawberry) {
		this.apple = apple;
		this.grape = grape;
		this.strawberry = strawberry;
		
	}
	
	//getter
	public int getApple() {
		return apple;
	}
	
	public int getGrape() {
		return grape;
	}
	
	public int getStrawberry() {
		return strawberry;
	}
	
	
	
	
}

public class FruitMain {
	private final static int SIZE = 3;
	private Fruit[] fruit = new Fruit [SIZE];
	
	private int[] month = new int[SIZE];
	private int appleTot;
	private int grapeTot;
	private int strawberryTot;
	
	
	//계산
	private void calcTot() {
		for(int i = 0 ; i < SIZE ; i ++) {
			appleTot += fruit[i].getApple();
			grapeTot += fruit[i].getGrape();
			strawberryTot += fruit[i].getStrawberry();
			}
	}//calcTot
	
	//합계
	private void output() {
		for(int i = 0 ; i < SIZE; i ++) {
			month [i] = fruit[i].getApple()+fruit[i].getGrape()+fruit[i].getStrawberry();
			}
	}//output
	
	private void input() {
		fruit[0] = new Fruit(100,30,25);
		fruit[1] = new Fruit(80, 25, 30);
		fruit[2] = new Fruit(75, 10, 90);
		
	}//input
	
	//찍어주는 곳
	private void display() {
		System.out.println("-------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("-------------------------------------");
		System.out.println("사과\t"+fruit[0].getApple()+"\t"+fruit[1].getApple()+"\t"+fruit[2].getApple()+"\t"+appleTot);
		System.out.println("포도\t"+fruit[0].getGrape()+"\t"+fruit[1].getGrape()+"\t"+fruit[2].getGrape()+"\t"+grapeTot);
		System.out.println("딸기\t"+fruit[0].getStrawberry()+"\t"+fruit[1].getStrawberry()+"\t"+fruit[2].getStrawberry()+"\t"+strawberryTot);
		System.out.println("-------------------------------------");
		System.out.println("\t"+month[0]+"\t"+month[1]+"\t"+month[2]);
	}//display
	
	
	
	public static void main(String[] args) {
		FruitMain fm = new FruitMain();
		fm.input();
		fm.calcTot();
		fm.output();
		fm.display();
		
	}//main
//
//			[실행결과]
//			-------------------------------------
//			PUM      JAN      FEB      MAR      TOT
//			-------------------------------------
//			사과       100       80       75        255
//			포도        30       25       10        xxx
//			딸기        25       30       90        xxx
//			------------------------------------
//			        xxx      xxx      xxx         
//			        
	
}//


//class Fruit {
//	   private String pum;
//	   private int jan, feb, mar, tot;
//	   private static int sumJan, sumFeb, sumMar;
//	   
//	   public Fruit(String pum, int jan, int feb, int mar) {
//	      this.pum = pum;
//	      this.jan = jan;
//	      this.feb = feb;
//	      this.mar = mar;
//	   }
//	   
//	   public void calcTot() {
//	      this.tot = this.jan + this.feb + this.mar;
//	      
//	      sumJan += jan; // sumJan = sumJan + jan;
//	      sumFeb += feb;
//	      sumMar += mar;
//	   }
//	   
//	   public void display() {
//	      System.out.println(pum+"\t"+jan+"\t"+feb+"\t"+mar+"\t"+tot);
//	   }
//	   
//	   public static void output() {
//	      System.out.println("\t"+sumJan+"\t"+sumFeb+"\t"+sumMar);
//	   }
//	   
//	}
//
//	public class FruitMain {
//
//	   public static void main(String[] args) {
//	      Fruit[] ar = {new Fruit("사과",100,80,75), new Fruit("포도",30,25,10), new Fruit("딸기",25,30,90)};
//	      
//	      System.out.println("------------------------------------");
//	      System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
//	      System.out.println("------------------------------------");
//	      for(Fruit f : ar) {
//	         f.calcTot();
//	         f.display();
//	      }//for
//	      System.out.println("------------------------------------");
//	      Fruit.output();
//	   }
//
//	}