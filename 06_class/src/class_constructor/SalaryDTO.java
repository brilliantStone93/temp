package class_constructor;
//
//public class SalaryDTO {
//	private String name, position;
//	private int basePay, benefit;
//
//	
//	//持失切
//	public SalaryDTO(String name, String position, int basePay, int benefit) {
//		this.name = name;
//		this.position = position;
//		this.basePay = basePay;
//		this.benefit = benefit;
//		
//	}//持失切
//	
//	
//	//為斗
//	public String getName() {
//		return name;
//		
//	}
//	
//	public String getPosition() {
//		return position;
//	}
//	
//	public int getBasePay() {
//		return basePay;
//	}
//	
//	public int getBenefit() {
//		return benefit;
//	}
//	
//	
//}
import java.text.DecimalFormat;

public class SalaryDTO {
   private String name;
   private String position;
   private int basePay;
   private int benefit;
   private double taxRate;
   private int tax;
   private int salary;
   
   public SalaryDTO(String name, String position, int basePay, int benefit){
      this.name = name;
      this.position = position;
      this.basePay = basePay;
      this.benefit = benefit;
   }
   
   public void calc(){
      int total = this.basePay + this.benefit;

      if(total <= 2000000) taxRate = 0.01;
      else if(total <= 4000000) taxRate = 0.02;
      else taxRate = 0.03;

      tax = (int)(total*taxRate);
      salary = total - tax;
   }
   
   public String getName(){
      return name;
   }
   public String getPosition(){
      return position;
   }
   public int getBasePay(){
      return basePay;
   }
   public int getBenefit(){
      return benefit;
   }
   public double getTaxRate(){
      return taxRate;
   }
   public int getTax(){
      return tax;
   }
   public int getSalary(){
      return salary;
   }
   
   @Override
   public String toString() {
      DecimalFormat df = new DecimalFormat();
      return name + "\t"
          + position + "\t"
          + df.format(basePay) + "\t"
          + df.format(benefit) + "\t"
          + taxRate + "\t"
          + df.format(tax) + "\t"
          + df.format(salary);
   }
}