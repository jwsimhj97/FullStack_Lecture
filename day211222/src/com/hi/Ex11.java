package com.hi;

import java.util.Arrays;

public class Ex11 {

	public static void main(String[] args) {
		int[] arr1={4,2,1,5,1,7,3};
		System.out.println(Arrays.toString(arr1));
		
//		Arrays.sort(arr1);
		

		System.out.println(Arrays.toString(arr1));
		System.out.println("-------------------------------");
		int[] arr2=new int[5];
		Arrays.fill(arr2, 1234);
		System.out.println(Arrays.toString(arr2));
		System.out.println("-------------------------------");
		
		System.out.println(Arrays.binarySearch(arr1, 3));
	}

}
