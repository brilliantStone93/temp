package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{
	
	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.tiger();//public��Ű���� ȣ�� ����
//		z.giraffe(); protected
//		z.elepahnt(); defalt
//		z.lion(); private
		
		Safari s = new Safari();
		s.tiger();
		s.giraffe();//�ڽ����� �����Ǿ�� protected���� ����
//		s.elephant();
//		s.lion();
	}

}
