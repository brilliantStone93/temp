package com.zoo;

public class Zoo2 {
	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.tiger();//public패키지는 호출 가능
		z.giraffe(); 
		z.elephant(); 
//		z.lion(); private은 같은 패키지라 해도 못불러옴
	}
}
