package com.rom802;

public class Ex05 {

	public static void main(String[] args) {
		// �迭
		int[] arr1;				// [�迭]������ ����
		arr1 = new int[3];		// [�迭]������ �ʱ�ȭ (����Ʈ)
		arr1[0] = 2;			// �ʱ�ȭ����� ������ ����� ���� �ٲٴ� ����
		arr1[1] = 4;
		arr1[2] = 6;
		
		int[] arr2;
		arr2 = new int[]{2,4,6}; // ��� ��¥ �ʱ�ȭ (����� ���ÿ� �ʱ�ȭ)	// �׷��ϱ� [3]�� �Ⱦ��� []���� ��� �� ������ ���� ��Ⱑ ����
		
		int[] arr3;
		arr3 = new int[3];	// ����� �ε����� ���� ���� �ʾҴµ� 0���� ���� ������ �ִ�
		
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