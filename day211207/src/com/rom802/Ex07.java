package com.rom802;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println("while문");
		int i=0;
		while (++i<=9) {
			int j=1;
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
	}
}
