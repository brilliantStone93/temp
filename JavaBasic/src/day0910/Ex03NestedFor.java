package day0910;
//���� for ��
public class Ex03NestedFor {
	public static void main(String[] args) {
		for(int i = 0 ; i <=5; i++) {
			// i�� ���簪 :0
			// i<=5 :true
			//��Ʈ���� �ʱ�ȭ ���ִ� ���
			//
			
			for(int j = 10 ; j<=12; j++) {
				//j�� ���簪 : 10
				//j<=12:true
				
				System.out.println("i:" + i + ", j:" + j );
			}
			
			System.out.println("i for �� ����");
		}
	}
}
