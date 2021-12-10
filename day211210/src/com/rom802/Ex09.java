package com.rom802;

public class Ex09 {

	public static void main(String[] args) {
		// 깊은 복사
		int[] arr1 = {1,3,5,7};
		int[] arr2;
												// 깊은 복사를 위해
		arr2=new int[arr1.length];				// 일단 사이즈를 동일하게 만들고
		
//		for (int i=0; i<arr2.length; i++) {		// 내부도 똑같게 만든다
//			arr2[i]=arr1[i];
//		}
		
		// 깊은 복사는 운영체제 측면에서도 제공을 한다
//		System.arraycopy(원본참조변수, 원본시작index, 대상변수, 대상시작, 몇개)
		System.arraycopy(arr1, 0, arr2, 0, arr2.length);
		
		arr1[1] = 10;
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
