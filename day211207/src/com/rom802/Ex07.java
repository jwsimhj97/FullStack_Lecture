package com.rom802;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println("while문");
		int i=0;
		int j=1;
		while (++i<=9) {
			j=1;				// 반복문 안에서 선언 하는 것은 좋지 않다
			while (++j<=9)
				System.out.print(j + " x " + i + " = " + i*j + "\t");
			System.out.println();
		}
		
		
		
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\nfor문");
		// 구구단 for문
		
		for (int m=1; m<=9; m++) {
			for (int n=2; n<=9; n++)
				System.out.print(n + " X " + m + " = " + m*n + '\t');
			System.out.println();
		}
		
		
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------------");
		
//		for (i=1; i<10; i++) {					// 안되면 for문을 while문으로 변환하면 됨
//			for (int j=2; j<10; j++) {
//				System.out.print(j+"x"+i+"\t");
//			}
//			System.out.println();
//		}
	}
}