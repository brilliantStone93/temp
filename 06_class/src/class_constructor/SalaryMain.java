package class_constructor;
///*
//직원들의 월급을 계산하는 프로그램을 작성하시오
//객체 배열로 작성하시오
//
//클래스명 : SalaryDTO
//필드       : name, position, basePay, benefit, taxRate, tax, salary
//생성자    : 데이터를 입력
//calc() - 계산
//
//세금 = (기본급 + 수당) * 세율;
//월급 = 기본급 + 수당 - 세금;
//
//세율은 200만원 이하 : 1%(0.01), 
//     400만원 이하 : 2%(0.02), 
//     400만원 초과 : 3%(0.03)으로 설정한다.
//
//[실행결과]
//이름      직급      기본급      수당      세율      세금      월급
//홍길동   부장      5000000      200000
//유재석   과장      3500000      150000
//박명수   사원      1800000      100000
// */
//
//public class SalaryMain {
//	//필드값
//	private double taxRate;
//	private int salary, tax;
//	private SalaryDTO[] s = new SalaryDTO[3];
//	
//	private void input() {
//		s[0] = new SalaryDTO("홍길동", "부장", 5000000, 200000);
//		s[1] = new SalaryDTO("유재석", "과장", 3500000, 150000);
//		s[2] = new SalaryDTO("홍길동", "부장", 1800000, 100000);
//	}
//	
//	//계산 메소드
//	private void calc(int base, int benefit) {
//		int tot = base + benefit;
//		taxRate = taxRate(base,benefit);
//		tax = (int)(tot*taxRate);
//		salary = tot - (int)tax;
//	
//	}//calc
//	
//	//세율정하는 메소드
//	private double taxRate(int base, int benefit) {
//		double rate = 0;
//		int tot = base + benefit;
//		if(tot <= 2000000) {
//			rate = 0.01;
//		}else if(tot <= 4000000 && tot > 2000000) {
//			rate = 0.02;
//		}else if(tot > 4000000) {
//			rate = 0.03;
//		}
//		
//		return rate;
//	}//taxRate
//	
//	
////	[실행결과]
////	이름      직급      기본급      수당      세율      세금      월급
////	홍길동   부장      5000000      200000
////	유재석   과장      3500000      150000
////	박명수   사원      1800000      100000
//
//	private void display() {
//		System.out.println("이름\t직급\t기본급\t수당\t세율\t세금\t월급");
//		for(int i = 0 ; i <3; i++) {
//			calc(s[i].getBasePay(), s[i].getBenefit());
//			System.out.println(s[i].getName()+"\t"+s[i].getPosition()+
//					"\t"+s[i].getBasePay()+"\t"+s[i].getBenefit()+"\t"+
//					taxRate+"\t"+tax+"\t"+salary);
//			}
//		
//	
//	}
//	
//	public static void main(String[] args) {
//		SalaryMain sm = new SalaryMain();
//		sm.input();
//		sm.display();
//		
//		
//	}//main
//}//


public class SalaryMain {

	   public static void main(String[] args) {
	      SalaryDTO[] ar = {new SalaryDTO("홍길동","부장",5000000,200000),
	                      new SalaryDTO("유재석","과장",3500000,150000),
	                      new SalaryDTO("박명수","사원",1800000,100000)};
	      
	      System.out.println("이름\t직급\t기본급\t수당\t세율\t세금\t월급");
	      for(SalaryDTO dto : ar){
	         dto.calc();
	         System.out.println(dto.getName()+"\t"
	                      + dto.getPosition()+"\t"
	                      + dto.getBasePay()+"\t"
	                      + dto.getBenefit()+"\t"
	                      + dto.getTaxRate()+"\t"
	                      + dto.getTax()+"\t"
	                      + dto.getSalary());
	      }//for

	   }

	}