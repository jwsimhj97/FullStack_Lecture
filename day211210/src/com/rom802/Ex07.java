package com.rom802;

public class Ex07 {

	public static void func01(int[] arr2) { // ���簡 �Ǳ� �ߴµ�
		arr2[1] = 10;						// ���� �ϴٰ� ������ ���� �ٲ� ���� (���� ���� ����)
		
		arr2 = new int[]{1,2,3};
		arr2[1]=100;
	}
	
	public static void main(String[] args) {
		// ���� ����
		int[] arr1 = {2,4,6,8};				// ���������ε���... ���� ����ȴ�???
		
		func01(arr1);	// �� �Լ����� �迭�� �����ߴµ� ���� ���簡 �̷������ �ִ�
		
		for (int i=0; i<arr1.length; i++) {		// func01�� ������ �ٽ� ���ƿ��ϱ� ���� �����ִ�
			System.out.println(arr1[i]);
		}

	}

}
