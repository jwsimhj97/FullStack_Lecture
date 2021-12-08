package com.hi;

public class Ex04 {
	
	public static int func01(int a, int b) {
		System.out.println("새롭게 만든 func01");
		int c=a+b;
		return c;
	}
	// 변수의 라이프사이클
	// 변수가 선언된 곳의 중괄호를 찾아라, 그 변수는 그 중괄호 안에서만 유호하다

	public static void main(String[] args) {		// main 또한 메소드임
		// 메서드
		// public static void(return의 자료형) 메서드명([매개변수들...]) { 구현코드; }
		// 메서드명 - 영문 소문자로 시작
		// 호출을 받아야지만 실행 (해당 메서드로 가서 일을 하고 돌아온다)
		// 호출한 측의 매개변수와 받는 측의 변수선언이 일채해야 함(유무, 갯수, 타입, 순서)
		// 메서드명(); // 으로 호출
		
		System.out.println("기존 main");
		int c = func01(1, 2);		// func01 내부에서 선언된 c와는 이름은 같지만 다른 변수
		System.out.println("c="+c);
		
		for (int i=0;i<5;i++) {
			System.out.println("새롭게 만든 func01");
		}
		
		
	}
	
	public static void func02(int a, String msg) {		// 매개변수는 얼마든지 전달 가능
		System.out.println("새롭게 만든 func02 "+(a+msg));
	}
}
