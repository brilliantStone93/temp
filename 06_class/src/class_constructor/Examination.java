package class_constructor;
//5������ ������ ä���ϴ� ���α׷�
//1������ 5������ ��� ���� ���� 1�̴�
//1������ 20���� ����Ѵ�
//
//�̸� �Է� : ȫ�浿
//��   �Է� : 12311
//
//�̸�      1 2 3 4 5   ����
//ȫ�浿   O X X O O   60
//----------------
//��ü �迭
//�ο��� �Է� : 3
//
//�̸� �Է� : ȫ�浿
//�� �Է�    : 13211
//
//�̸� �Է� : �ڳ�
//�� �Է�    : 11111
//
//�̸� �Է� : ��ġ
//�� �Է�    : 13242
//
//�̸�      1 2 3 4 5   ����
//ȫ�浿     O X X O O   60
//�ڳ�      O O O O O   100
//��ġ      O X X X X   20
public class Examination {
	private String name;
	private String dap; // "12311"
	private char[] ox = new char[JUNG.length()];
	private int score;
	public static final String JUNG = "11111"; //����
	
	public Examination(String name, String dap) {
		this.name = name;
		this.dap = dap;
	}
	
	public  String getName() {
		return name;
		
	}
	

	
	public void compare() {
		for(int i = 0; i < JUNG.length(); i++) {
		if(dap.charAt(i) == JUNG.charAt(i)) {
			ox[i] = 'o';
			score += 20;
		}else ox[i] = 'x';
		
		}
	}//compare
	
	//�̸�      1 2 3 4 5   ����
	//ȫ�浿     O X X O O   60
	//�ڳ�      O O O O O   100
	//��ġ      O X X X X   20
	public void display() {
		
		System.out.println(name+"\t"+ox[0]+"\t"+ox[1]+"\t"+ox[2]+"\t"+ox[3]+"\t"+ox[4]+"\t"+score);
		
	}
	

	
	
}//
