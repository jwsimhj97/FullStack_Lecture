package com.rom802;

public class Ex08 {

	public static void main(String[] args) {
		int[] arr1={1,3,5,7};
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		
		arr1=new int[]{2,4,6,8};				// 위의 6번 줄의 객체로 돌아갈 수 있는 방법은 없다
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		
		arr1=new int[]{11,22,33,44,55,66};		// 여기서는 객체의 크기가 다르지만 주소의 규격은 동일하니까 받는 데는 상관이 없다
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.println();
	}	
}