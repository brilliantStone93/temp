package if_switch;

/*
����(1), ����(2), ��(3) ����

[������]
����(1),����(2),��(3) �� ��ȣ �Է� : 3 (user)
��ǻ�� : ����   �� : ���ڱ�
You Win!!

����(1),����(2),��(3) �� ��ȣ �Է� : 3 (user)
��ǻ�� : ����   �� : ���ڱ�
You Lose!!

����(1),����(2),��(3) �� ��ȣ �Է� : 2 (user)
��ǻ�� : ����   �� : ����
You Draw!!

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RPSGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com, user;
		String comrps = null, userrps = null; //���� String �ʱ�ȭ�� �׻� null�� �������־���ϳ���? �� �׻� null�� ����������մϴ� class��ü�� ���
		int result = 0;                           //ó�� String comrps, userrps ;�̷��� �ߴµ� ������ �������
		//���� - ��ǻ�Ͱ� �������� �߻��ϴ� �� , 0 <= ���� <1
		// a~b������ ���� �߻� =>(int)(Math.random()*(b-a+1)+a);
		
		System.out.println("����(1), ����(2), ��(3) �� ��ȣ �Է� :");
		user = Integer.parseInt(br.readLine());
		
		com = (int)(Math.random()*3)+1;
		
		if(user == 1) userrps = "����";
		else if(user == 2) userrps = "����";
		else if(user == 3) userrps = "��";
		
		if(com == 1) comrps = "����";
		else if(com == 2) comrps = "����";
		else if(com == 3) comrps = "��";
		
		
		System.out.println("��ǻ�� : "+ comrps + " �� : "+ userrps);
		
		if(com == user) {
			System.out.println("You Draw!!");
		} else if(user>com) {
			if(user - com == 2) {
				System.out.println("You Lose!!");
			}else if(user - com == 1) {
				System.out.println("You Win");
			}
		} else if(com>user) {
			if(com - user == 2) {
				System.out.println("You Win!!");
			}else if(com - user == 1) {
				System.out.println("You Lose");
			}
		}
		
		
		/* ����� �ؼ�
		int com, user;
      
      com = (int)(Math.random()*3)+1; //1~3 ���� �߻�
      
      System.out.print("����(1),����(2),��(3) �� ��ȣ �Է� : ");
      //user = System.in.read()-48; //1�� ���� �Է�
      user = System.in.read()-'0';
      
      if(com==1) {//���� ������ ���
         if(user==1) {
            System.out.println("��ǻ�� : ����\t ����� : ����");
            System.out.println("Draw!!");
         }else if(user==2){
            System.out.println("��ǻ�� : ����\t ����� : ����");
            System.out.println("Win!!");
         }else if(user==3){
            System.out.println("��ǻ�� : ����\t ����� : ���ڱ�");
            System.out.println("Lose!!");
         }
         
      }else if(com==2) {//���� ������ ���
         if(user==1){
            System.out.println("��ǻ�� : ����\t ����� : ����");
            System.out.println("Lose!!");
         }
         else if(user==2){
            System.out.println("��ǻ�� : ����\t ����� : ����");
            System.out.println("Draw!!");
         }
         else if(user==3){
            System.out.println("��ǻ�� : ����\t ����� : ���ڱ�");
            System.out.println("Win!!");
         }
         
      }else if(com==3) {//���� ���ڱ��� ���
         if(user==1){
            System.out.println("��ǻ�� : ���ڱ�\t ����� : ����");
            System.out.println("Win!!");
         }
         else if(user==2){
            System.out.println("��ǻ�� : ���ڱ�\t ����� : ����");
            System.out.println("Lose!!");
         }
         else if(user==3){
            System.out.println("��ǻ�� : ���ڱ�\t ����� : ���ڱ�");
            System.out.println("Draw!!");
         }
      }
		 */
		
		
		
	}
}
