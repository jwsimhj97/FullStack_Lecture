package com.rom802;

public class Ex03 {

	public static void main(String[] args) {
		
		// 코드를 하드코딩 하는 것처럼 바꾸어서 보면 조금씩 구조가 보인다
		
		for (int i=0; i<1; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i=0; i<2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i=0; i<3; i++) {  // 여기서 i<3 이 부분만 바꿔주면 되겠네
			System.out.print("*");
		}
		System.out.println();
		
		
		System.out.println("--------------------------------------------------------");
		
		
		System.out.println();
		
		for (int i=1; i<=1; i++) {  // 여기도 i<=1 얘만 1~3 범위로 반복문 만들어 주면 되네?
			System.out.print(i);
		}
		System.out.println();
		
		for (int i=1; i<=2; i++) {
			System.out.print(i);;
		}
		System.out.println();
		
		for (int i=1; i<=3; i++) {
			System.out.print(i);
		}
		
		

		System.out.println();
		System.out.println("--------------------------------------------------------");
		
//		int i=1;
//		for (int j=0; j<3; j++) {
//			int temp=i+j;				// i를 기억하기 위한 변수
//			for (; i<=temp; i++) {		// i가 누적되어야 함
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
//		int temp=1;
//		for (int y=0; y<3; y++) {
//			temp+=y;
//			// 1+0
//			for (int i=temp; i<=temp+y; i++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		// 이 방식으로 굳이 구현할 필요는 없고
		// 생각만 한 번 이렇게 해보면 된다
		
		// 다음 줄로 갈 때마다 0,1,2,3,4, ... 첫 숫자가 이런 식으로 증가함
		// 기존 값에다가 1더하고 2더하고 3더하고 4더하고 
		
		
		int su12=1;
		for (int i=1; i<4; i++) {		// 다중 반복문에서 가로 세로
			for (int j=0; j<i; j++) {
				System.out.print(su12++);		// 여기서 su12++대신 j+1을 출력하면 2번 문제가 된다
			}
			System.out.println();
		}
		// 출력하는 방식(횟수)를 결정하는 것과
		// 무엇을 출력할 지(변수 su12)를 따로따로 생각하는 방식
		
		
		
		
		
//		for (int i=1; i<=1; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		
//		for (int i=1+1; i<=1+1+1; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		
//		for (int i=1+1+2; i<=1+1+2+2; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		
//		for (int i=1+1+2+3; i<=1+1+2+2+3+3; i++) {
//			
//		}
		
		
	}

}