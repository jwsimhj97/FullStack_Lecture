package com.rom802;

public class Ex11 {

	public static void main(String[] args) {
		// 조건문 - switch문
		//	switch(조건-값) { 	// boolean이 아니다
		//	case 값: 실행문;
		//	case 값: 실행문;
		//	case 값: 실행문;
		//	case 값: 실행문;
		//	...
		//	default : 실행문;
		//	}
		
		//	조건 - value 값
		// 각 case 값
		// 모두 값이 와야하지 데이터가 오면 안 된다 실질적인 값이 와야 함
		
		int su=2;
		switch(su) {
			case 2:
				System.out.println("2입니다");
				break;
			case 1:
				System.out.println("1입니다");
				break;
			case 0:
				System.out.println("0입니다");
				break;
			default :
				System.out.println("2~0의 값이 아닙니다");
		}
	}
}
