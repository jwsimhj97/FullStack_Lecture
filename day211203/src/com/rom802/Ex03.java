package com.rom802;

public class Ex03 {

	public static void main(String[] args) {
		// 사칙연산(+-*%)
		int a;
		char b;
		a=5;
		b='a';
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		// 연산 순서는 곱하기 나누기가 먼저 일어남
		// 동일한 상황에서는 왼쪽이 먼저 연산됨

		// 동일 자료형의 연산은 동일 자료형을 반환한다
		// 5/2가 2가 된다는 것은 몫이 반환된다는 것
		
		double c;
		c = 2.0;
		
		System.out.println(a/c);
		System.out.println(a%b);
		
		System.out.println(1+2+3*2-1);
//		System.out.println(1+2+6-1);
//		System.out.println(3+6-1);
//		System.out.println(9-1);
//		System.out.println(8);
	}
}