package com.rom802;

public class Ex05 {

	public static void main(String[] args) {
		
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {	// 이런 2중 for문에서 무엇을 출력할 지 선택하는 것임
				if (j<2-i) {			// 줄이 바뀔 때마다 2, 1, 0으로 줄어야 하기 때문에 i를 빼주는 것이다 (줄을 제어하는 것은 i니까)
					System.out.print(' ');
				} else {
					System.out.print('*');		// 여기에 '*'대신 j+1을 출력하면 다른 문제 해결
				}
			}
			System.out.println();
		}

	}

}
