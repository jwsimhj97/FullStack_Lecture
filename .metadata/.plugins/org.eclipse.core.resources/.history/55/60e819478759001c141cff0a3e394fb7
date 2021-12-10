package com.rom802;

public class Ex06 {

	public static void main(String[] args) {
		// 배열의 복사
		int[] arr1=new int[]{1,3,5,7,9};
		int[] arr2=new int[]{1,3,5,7,9};
		System.out.println(arr1==arr2);
		// 배열은 참조변수이고, 두 개의 객체를 비교하면 주소값으로 비교를 하기 때문에
		
		// 1. 배열의 얕은 복사
		int[] arr3=arr1;
		// arr1과 arr3 모두 7번 라인에서 new로 생성된 객체를 가리킴
		System.out.println(arr1==arr3);
		
		// 2. 배열의 깊은 복사
		int[] arr4=new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr4[i]=arr1[i];
		}
		for(int i=0; i<arr4.length; i++) {
			System.out.print(arr4[i]+",");
		}
	}

}
