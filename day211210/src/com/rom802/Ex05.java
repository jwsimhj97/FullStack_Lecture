package com.rom802;

public class Ex05 {

	public static void main(String[] args) {
		// 배열
		int[] arr1;				// [배열]변수의 선언
		arr1 = new int[3];		// [배열]변수의 초기화 (디폴트)
		arr1[0] = 2;			// 초기화라고는 했지만 사실은 값을 바꾸는 것임
		arr1[1] = 4;
		arr1[2] = 6;
		
		int[] arr2;
		arr2 = new int[]{2,4,6}; // 얘는 진짜 초기화 (선언과 동시에 초기화)	// 그러니까 [3]을 안쓰고 []으로 몇개를 쓸 건지에 대한 얘기가 없다
		
		int[] arr3;
		arr3 = new int[3];	// 여기는 인덱스에 값을 주지 않았는데 0으로 값이 나오고 있다
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+",");
		}
		System.out.println();
		
		for(int i=0; i<arr3.length;i++) {
			System.out.print(arr3[i]+",");
		}
		//
		Ex05 ex05 = new Ex05();
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(ex05);
		
	}

}
