package com.hi;

public class Ex05 {

	public static void func01() {
		System.out.println("Ex05.func01 start");
		func02();
		System.out.println("Ex05.func01 end");
		return ; // 생략되어 있음
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		
		
		func01();
		
		if (1+2>0) {
			return ;		// 종료가 된다
		}
		
		System.out.println("main end");
	}
	
	public static void func02() {
		System.out.println("func02()");
	}

}
