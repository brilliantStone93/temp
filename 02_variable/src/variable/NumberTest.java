package variable;

public class NumberTest {

	public static void main(String[] args) {
		System.out.print("�ȳ��ϼ���\n");
		System.out.println(25+36);
		System.out.println("25+36");
		System.out.println("25+36 = "+25+36);
		System.out.println("25+36 = "+(25+36));
		System.out.println("25/36 = "+(25/36));
		System.out.println("25/36 = "+(25.0/36));
		System.out.printf("25/36 = %.2f\n",(25.0/36));
		System.out.printf("25/36 = %.1f\n",(25.0/36));
		System.out.println("25/36 = "+ String.format("%.2f", (25.0/36)));
	//�߼��� ���� ���Ѵ� %d
	//�Ǽ���                 %f
    //����                    %c
	//���ڿ�                 %s
	
	//%��ü�ڸ���. �Ҽ� ���� �ڸ��� f
	// |2|5|.|3| �̷��� �� 4�ڸ��� ����-> %4.1f
		
    //Overload
		
		System.out.println();
		
		System.out.println('A'+3);
		System.out.println('A'+32);
		System.out.println((char)('A'+32));//����ȯ�� ��Ű�ڴ�-char
		System.out.println();
		
		System.out.println(2+5);
		System.out.println('2'+'5'); //103
		System.out.println('2'-48+'5'-48); //���ڸ� ���ڷ� ��ȯ
		System.out.println("2"+"5"); 		
		System.out.println(Integer.parseInt("2")+Integer.parseInt("5"));//���ڿ��� ���ڷ� ��ȯ, 7
		System.out.println("25.3"+"45.6");
		System.out.println(Double.parseDouble("25.3")+Double.parseDouble("45.6"));//���ڿ��� �Ǽ��� ��ȯ
		
		
		
	}
	

}
