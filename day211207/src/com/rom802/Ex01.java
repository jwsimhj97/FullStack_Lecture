package com.rom802;

public class Ex01 {

	public static void main(String[] args) {
//		for (int i=1; i<=3; i++) {
//			for (int j=0+i; j<3+i; j++) {
//				System.out.print(j);		// 조건 안에서 더하지 않고 프린트 하는 곳에서 더해도 됨
//			}
//			System.out.println();
//		}
		
//		int su=1;
//		for (int i=0; i<3; i++) {
//			for (int j=0; j<3; j++) {
//				System.out.print(su);
//				su++;
//			}
//			System.out.println();
//			su-=2;
//		}
//		
//		for (int i=1; i<10; i++) {
//			System.out.print(i);
//			if (i%3==0) {
//				System.out.println();
//			}
//		}
		
		
//		System.out.print("--------------------------------------");
//		int su=1;
//		for (int i=0; i<12; i++) {		// i는 반복 횟수를 위한 변수 (11번)
//			if (i%4==0) {				// su는 출력하는 숫자를 위한 변수
//				System.out.print('\n');
//			} else {
////				System.out.print(su);
////				su++;
//				System.out.print(su++);
//			}
//		}
		
		char ch='A';					// 표기만 달라졌지 1번 문제와 동일 
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
		// 65 66 67
		// 68 69 70
		// 71 72 73
		// 이렇게 출력하는 것과 마찬가지
		
	}

}

// 3 줄을 찍는데 그 한 줄 한줄에서도 별이 세 번 반복이다
// 한 줄을 세 번 출력 했는데
// 그 한 줄이 동일하니까 반복문으로

// 1 2 3
// 4 5 6
// 7 8 9

// 1 2 3 \n 2 3 4 \n 3 4 5
// 이렇게도 볼 수 있다
// 이렇게 하면 반복문을 11번 도는 것 (9 + 2(개행))
// 규칙성) 하나 증가하거나 문자를 출력하거나

// 단일 반복문을 써도 되지만 이중 반복문이 더 쉽다