package com.rom802;

public class Ex10 {

	public static void main(String[] args) {
		int su=-3;	// 변수의 선언과 초기화를 동시에
		// su가 양수이면 "양수입니다"출력
		// su가 음수미녕 "음수입니다"출력
		if (su >= 0) {
			System.out.println("양수입니다");
		}
		if (su < 0) {
			System.out.println("음수입니다");
		}
		
		System.out.println("---------------------------");
		
		if (su > 0) {
			System.out.println("0보다 큽니다");
		} else {
			System.out.println("0보다 큽니다가 거짓입니다");
		}
		
		System.out.println("---------------------------");
		
		if (su>0) {
			System.out.println("0보다 큽니다");
		}
		if (su==0) {
			System.out.println("0입니다");
		}
		if (su<0) {
			System.out.println("0보다 작습니다");
		}
		
		System.out.println("---------------------------");
		
		if (su >0) {
			System.out.println("-보다 큽니다");
		} else if (su==0) {
			System.out.println("0입니다");
		} else if (su<0) {
			System.out.println("0보다 작습니다");
		}
		
		if (su>0) {
			;
		}
		if (!(su>0) && su>-1) {
			;
		}
		if (!(!(su>0) && su>-1)) {
			;
		}
	}
}