package class_constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
ġȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�
String Ŭ������ �޼ҵ带 �̿��Ͻÿ�
��ҹ��� ������� ������ ����Ͻÿ�

[������]
���ڿ� �Է� : aabba
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : cc
ccbba
1�� ġȯ

���ڿ� �Է� : aAbbA
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : cc
ccbba
1�� ġȯ

���ڿ� �Է� : aabbaa
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : cc
ccbbcc
2�� ġȯ

���ڿ� �Է� : AAccaabbaaaaatt
���� ���ڿ� �Է� : aa
�ٲ� ���ڿ� �Է� : dd
ddccddbbddddatt
4�� ġȯ

���ڿ� �Է� : aabb
���� ���ڿ� �Է� : aaaaa
�ٲ� ���ڿ� �Է� : ddddd
�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�

indexOf()
replace(??, ??)
 */


public class StringTest2 {
	private static BufferedReader br;
	private static String line = null;
	
	
	//���ڿ� �Է�
	private void string() throws IOException {
		
		System.out.print("���ڿ� �Է�: ");
		line = br.readLine();
		
	}//string
	
	//���ڿ� ����
	private void replace() throws IOException {
		System.out.print("���� ���ڿ� �Է�:");
		String userChoice = br.readLine();
		line.indexOf(userChoice);
		
		if(line.indexOf(userChoice)==-1) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			System.out.print("���� ���ڿ� �Է�:");
			userChoice = br.readLine();
		}//if
		
		System.out.print("�ٲ� ���ڿ� �Է�:");
		String change  = br.readLine();
		
		if(change.length() > line.length() ) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			System.out.print("�ٲ� ���ڿ� �Է�:");
			change  = br.readLine();
		}//if
		
		System.out.println(line.replace(userChoice, change));
		indexOf(line, line.replace(userChoice, change), userChoice);
		
						

	}//replace

	
	// ġȯ Ƚ �� ī��Ʈ
	private void indexOf(String before, String after, String userChoice) {
		int count = 0;
		for(int i = 0 ; i < line.length(); i += userChoice.length()) {
			if(before.charAt(i) != after.charAt(i)) {
				count++;
			}
		}
		
		System.out.println(count+"�� ġȯ");
	}//indexOf
	
	//���α׷� ����
	public static void main(String[] args) throws IOException {
//		String str = "aabbaa";
//		System.out.println(str.replace("aa", "tt"));
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTest2 stringTest2 = new StringTest2();
		stringTest2.string();
	
		stringTest2.replace();
	
	
	}//main
}//


//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class StringTest2 {
//
//   public static void main(String[] args) throws IOException {
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      String str, target, replaceing;
//      int index, count;
//      
//      System.out.print("���ڿ� �Է� : ");
//      str = br.readLine();
//      
//      System.out.print("���� ���ڿ� �Է� : ");
//      target = br.readLine();
//      
//      System.out.print("�ٲ� ���ڿ� �Է� : ");
//      replaceing = br.readLine();
//      
//      if(str.length() < target.length())
//         System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�");
//      
//      else {
//         str = str.toLowerCase();//�ҹ��� ��ȯ
//         target = target.toLowerCase();
//         
//         index = count = 0;
//         while( (index=str.indexOf(target, index)) != -1 ) {
//            
//            index += target.length();
//            count++;
//            
//         }//while
//         
//         System.out.println(str.replace(target, replaceing));
//         System.out.println(count+"�� ġȯ");
//         
//      }//else
//   }
//
//}