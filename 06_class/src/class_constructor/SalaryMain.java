package class_constructor;
///*
//�������� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//��ü �迭�� �ۼ��Ͻÿ�
//
//Ŭ������ : SalaryDTO
//�ʵ�       : name, position, basePay, benefit, taxRate, tax, salary
//������    : �����͸� �Է�
//calc() - ���
//
//���� = (�⺻�� + ����) * ����;
//���� = �⺻�� + ���� - ����;
//
//������ 200���� ���� : 1%(0.01), 
//     400���� ���� : 2%(0.02), 
//     400���� �ʰ� : 3%(0.03)���� �����Ѵ�.
//
//[������]
//�̸�      ����      �⺻��      ����      ����      ����      ����
//ȫ�浿   ����      5000000      200000
//���缮   ����      3500000      150000
//�ڸ��   ���      1800000      100000
// */
//
//public class SalaryMain {
//	//�ʵ尪
//	private double taxRate;
//	private int salary, tax;
//	private SalaryDTO[] s = new SalaryDTO[3];
//	
//	private void input() {
//		s[0] = new SalaryDTO("ȫ�浿", "����", 5000000, 200000);
//		s[1] = new SalaryDTO("���缮", "����", 3500000, 150000);
//		s[2] = new SalaryDTO("ȫ�浿", "����", 1800000, 100000);
//	}
//	
//	//��� �޼ҵ�
//	private void calc(int base, int benefit) {
//		int tot = base + benefit;
//		taxRate = taxRate(base,benefit);
//		tax = (int)(tot*taxRate);
//		salary = tot - (int)tax;
//	
//	}//calc
//	
//	//�������ϴ� �޼ҵ�
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
////	[������]
////	�̸�      ����      �⺻��      ����      ����      ����      ����
////	ȫ�浿   ����      5000000      200000
////	���缮   ����      3500000      150000
////	�ڸ��   ���      1800000      100000
//
//	private void display() {
//		System.out.println("�̸�\t����\t�⺻��\t����\t����\t����\t����");
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
	      SalaryDTO[] ar = {new SalaryDTO("ȫ�浿","����",5000000,200000),
	                      new SalaryDTO("���缮","����",3500000,150000),
	                      new SalaryDTO("�ڸ��","���",1800000,100000)};
	      
	      System.out.println("�̸�\t����\t�⺻��\t����\t����\t����\t����");
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