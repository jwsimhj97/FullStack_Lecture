package com.hi;

public class Ex06 {

	public static void func01() {
		System.out.println("매개변수가 없는 func01 실행");
	}
	
	public static void func01(int a) {
		System.out.println("매개변수가 없는 또 다른 메서드");
	}
	
	public static void main(String[] args) {
		// 메서드 오버로드
		func01();
	}

}
