package com.rom802;

public class Ex06 {
	public static void main(String[] args) {
		
		// Q1.
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("* ");				
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i=1; i<=9; i++) {
			System.out.print("* ");
			if (i %3 == 0) {
				System.out.println();
			}
		}
	

		
		
		// Q2.
		System.out.println();
		for (int i=0; i<9; i+=3) {
			for (int j=1; j<=3; j++) {
				System.out.print(i+j+" ");
			}
			System.out.println();
		}
		

		System.out.println();
		for (int i=1; i<=9; i++) {
			System.out.print(i+" ");
			if (i%3 == 0) {
				System.out.println();
			}
		}
		
		
		

		// Q3.
		System.out.println();
		for (int i=1; i<=3; i++) {
			for (int j=0; j<=2; j++) {
				System.out.print(i+j+" ");
			}
			System.out.println();
		}
		
		// 3번 문제는 2번 문제의 변형이다
		
		
		// Q4.
		System.out.println();
		for (int i=(int)'A'; i<='G'; i+=3) {
			for (int j=0; j<3; j++) {
				System.out.print((char)(i+j) + " ");
			}
			System.out.println();
		}
	}
}
