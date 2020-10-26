package com.apple;

import com.zoo.Zoo;

public class Apple {
	public static void main(String[] args) {
		System.out.println("빨간사과");
		
		//Zoo클래스의 홀랭이
		Zoo z = new Zoo();
		z.tiger();//public패키지는 호출 가능
//		z.giraffe(); protected
//		z.elepahnt(); defalt
//		z.lion(); private
		
	}
}
