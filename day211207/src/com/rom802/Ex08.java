package com.rom802;

public class Ex08 {

	public static void main(String[] args) {
		// �迭
		
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=3;
		arr[2]=5;
		arr[3]=7;
		arr[4]=9;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
//		for(int i=0; i<5; i++) {
//			System.out.println(arr[i]);
//		}
		
		int[] arr1=new int[4];
		arr1[0]=2;
		arr1[1]=4;
		arr1[2]=6;
		arr1[3]=8;
		
		int[] arr2=new int[]{5,6,7,8}; 		//[4]{2,4,6,8} �� �ƴ�
		
		int[] arr3={1,3,5,7};		// ���� ������ �ƴϴ� // �̷� ǥ���� ���� ����� �� (������ ���� �ְ� �ƴ� ���� ����)
		
		for (int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		
		System.out.println(arr3.length);
	}

}