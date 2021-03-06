package com.rom802;

public class Ex04 {

	public static void main(String[] args) {
		
		// 앞의 문제와 반대로 3번 2번 1번 ... 줄어든다
		for (int i=3; i>0; i--) {		// 이 줄은 3번 돌겠다는 것만 결정함
			for (int j=0; j<i; j++) {
				System.out.print('*');
			}
			System.out.println();		// 안쪽 for문에 3-i로 하는 것보다는
										// 바깥쪽 for문을 감소하는 값으로 주면 계산이 편하다
										// 확장성은 이게 더 좋을 수 있음
										// 만약에 3을 다른 수로 바꿔야 하면 숫자 하나만 바꾸면 되는데...
		}

		// 혹은
		
		int cnt = 3;
		
		for (int i=0; i<cnt; i++) {
//			int su=1;
			for (int j=0; j<cnt-i; j++) {		// 감소하는 것을 3-i로 표현
				System.out.print('*');		// 프린트를 '*'에서 j+1로 바꾸면 다른 문제 해결
			}								// 출력 변수 하나를 따로 줘서 풀면 다른 문제도 해결
			System.out.println();
		}
	}

}
