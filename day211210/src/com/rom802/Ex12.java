package com.rom802;

public class Ex12 {

	public static void main(String[] args) {
		// 문자열 (문자의 집합) // 그리고 문자는 char
		
		char[] arr1={'a','b','c','d'};		// 이 문자들은 사실 숫자인데...
		String msg1=new String(arr1);
		System.out.println(msg1);
		
		
		char[] arr3=msg1.toCharArray();
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		
		byte[] arr2 = {65,66,67,68};
		String msg2=new String(arr2);
		System.out.println(msg2);
		

		char[] arr4=msg2.toCharArray();
		byte[] arr5=msg2.getBytes();
		for (int i=0; i<arr5.length; i++) {
			System.out.println(arr5[i]);
		}
	}

}
