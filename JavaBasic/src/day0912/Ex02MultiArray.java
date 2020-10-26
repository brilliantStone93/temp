package day0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//������ �迭
//������ �迭�̶� ������ �迭�� ������ ��
//���� ���� ũ�⸸ �������ְ�
// �ű⿡ ���� �迭�� ũ��� ����� �� �����ִ� ����̴�.

//���� : 1�г� 1���� 30��, 2���� 29�� , 3���� 32���϶�
//�迭 ������ ��� �ؾ��Ұ�?
//int[][] scoreArray = int[3][];
//scoreArray[0] = new int[30];
//scoreArray[1] = new int[29];
//scoreArray[2] = new int[32];

public class Ex02MultiArray {
	final static int SIZE = 3;
	public static void main(String[] args) throws NumberFormatException, IOException {
		//1�г� ������ �л����� �Է� �ް�
		//�� �л����� �̸��� �ݸ��� �־��ִ� ���α׷�
		String[][] nameArray = new String[SIZE][];
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in));
		while(true) {
			System.out.println("��Ʈ����б� �̸� ���� ���α׷�");
			System.out.println(" 1. �Է� 2. ��� 3. ����");
			System.out.println(">");
			int choice = Integer.parseInt(br.readLine());
			if(choice ==1 ) {
				//�� �����ϴ� �޼ҵ� ����
				int classNumber = selectClass(br);
				
				//�̸��� �Է��ϴ� �޼ҵ� ����
				//�� �迭�� ũ�⸦ �����ؾ��ϹǷ�
				//�л� ���ڸ� �Է� �޵��� �Ѵ�.
				int studentSize = insertStudentSize(br);
				
				//�Է¹��� �ݰ� �л����ڷ� �ش� �迭�� �ʱ�ȭ ���ش�.
				nameArray[classNumber -1] = new String [ studentSize];
				
				//�л��� �̸��� �Է¹޴´�.
				for(int i = 0 ; i < nameArray[classNumber -1 ].length; i ++) {
					System.out.println(( i+1)+ "�� �л��� �̸� : ");
					nameArray[classNumber -1][i] = br.readLine();
				}
			}else if(choice == 2) {
				//�� �����ϴ� �޼ҵ� ����
				int classNumber = selectClass(br);
			
				//�̸��� ����ϴ� �޼ҵ� ����
				//�� ���⼭ �����ؾ��� ����
				// �ش� �迭�� �ʱ�ȭ�� �Ǿ��ִ��� üũ�� �ؾ��Ѵ�.
				//���� �ش� �迭�� �ʱ�ȭ�Ǿ����� �ʴٸ�
				//�� ������ ���� null�� �����̹Ƿ�
				//�츮�� ������ �� ����.
				//������ �� �迭�� null�������� üũ�ϰ�
				//null�� �ƴҶ����� ����ϴ� for���� �����Ѵ�.
				
				//���̶� ������ ������Ÿ���� �ʱ�ȭ��
				//���� �� �̷���� �ִ� ���¸�
				//���̶�� �Ѵ�.
				if(nameArray[classNumber -1] == null) {
					System.out.println("���� �ش� ���� �Էµ��� ���� �����Դϴ�.");
				}else {
				for(int i = 0; i < nameArray[classNumber -1].length; i++) {
					System.out.println(nameArray[classNumber - 1][i]);
				}
				}
				//�⺻�� ������Ÿ�԰� ������ ������Ÿ���� ������
				//�⺻�� : ���ÿ����� ���� ���� ���ִ� ������ Ÿ��.
				// byte short int long float double char boolean 8���� ������ �ְ�
				// �⺻������ 0���� �ʱ�ȭ �ȴ�.
				
				//������ : ���� �������� ���� �������� ���� �ּҰ��� �������ְ�
				// ���� ������ ���� �Ǵ� �޼ҵ�� �� ������ Ȯ���ؾ� � ��, � �޼ҵ尡 �ִ��� Ȯ�� ������ ������ Ÿ��
				// new�� ���ؼ� �ʱ�ȭ ���������� null�� �ʱ�ȭ �ȴ�.
				// null�̶� ���� ������ �ּҰ��� �ο��� �Ǿ� ������
				// �� �������� �ƹ��� ������ ���� ���¸� null�̶�� �Ѵ�.
				// null�� ���¿����� �ƹ��� �޼ҵ�, �ʵ� ������ �Ұ��� �ϴ�.
				// ������ �ҷ��� �ϸ� NullPointerException�� �߻��ϰ� �ȴ�!!!!

				
				}else if(choice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			}		
		
	}
	}
	static int selectClass(BufferedReader bufferedReader) throws NumberFormatException, IOException {
		System.out.print("���� �����ϼ��� : ");
		int classNumber = Integer.parseInt(bufferedReader.readLine());
		while(true) {
			if(classNumber>SIZE || classNumber<0) {
				System.out.println("�� �� �Է��ϼ̽��ϴ�");
				
				System.out.print("���� �����ϼ���(1����" +SIZE+"����) : ");
				System.out.println("> ");
				classNumber = Integer.parseInt(bufferedReader.readLine());
			}
			else break;
		}
		return classNumber;
	}
	
	//�л��� ���ڸ� �Է� �޴� �޼ҵ�
	static int insertStudentSize(BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("�л��� ���ڸ� �Է����ּ��� : ");
		int studentSize = Integer.parseInt(br.readLine());
		while(studentSize<0)	{
			System.out.println("�߸��Է��ϼ̽��ϴ�. 0���� ū ���� �Է����ּ���");
			System.out.println("�л��� ���ڸ� �Է����ּ��� : ");
			studentSize = Integer.parseInt(br.readLine());
		}
		return studentSize;
	}
	
}
