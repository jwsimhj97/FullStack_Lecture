package com.rom802;

public class Ex05 {

	public static void main(String[] args) {
		
		for (int backNum=1; backNum<=9; backNum++) {
			for (int frontNum=2; frontNum<=9; frontNum++) {
				System.out.print(frontNum + " * " + backNum + " = " + frontNum*backNum + "\t");
			}
			System.out.println();
		}
	}
}

// 이건 사실 구구단 문제가 아니다