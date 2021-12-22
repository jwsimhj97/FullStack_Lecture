package com.hi;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		// 이거 말고 java.util 패키지에 Random이라는 클래스가 따로 있다

		java.util.Random ran=new java.util.Random();
		System.out.println(ran.nextInt());
		System.out.println(ran.nextInt());
		System.out.println(ran.nextInt());
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextInt(3));
	}

}
