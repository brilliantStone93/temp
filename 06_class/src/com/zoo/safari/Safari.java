package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{
	
	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.tiger();//public패키지는 호출 가능
//		z.giraffe(); protected
//		z.elepahnt(); defalt
//		z.lion(); private
		
		Safari s = new Safari();
		s.tiger();
		s.giraffe();//자식으로 생성되어야 protected연결 가능
//		s.elephant();
//		s.lion();
	}

}
