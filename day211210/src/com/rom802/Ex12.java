package com.rom802;

public class Ex12 {

	public static void main(String[] args) {
		// ���ڿ� (������ ����) // �׸��� ���ڴ� char
		
		char[] arr1={'a','b','c','d'};		// �� ���ڵ��� ��� �����ε�...
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