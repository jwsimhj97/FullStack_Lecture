package com.rom802;

public class Ex03 {

	public static void main(String[] args) {
		
		// �ڵ带 �ϵ��ڵ� �ϴ� ��ó�� �ٲپ ���� ���ݾ� ������ ���δ�
		
		for (int i=0; i<1; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i=0; i<2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i=0; i<3; i++) {  // ���⼭ i<3 �� �κи� �ٲ��ָ� �ǰڳ�
			System.out.print("*");
		}
		System.out.println();
		
		
		System.out.println("--------------------------------------------------------");
		
		
		System.out.println();
		
		for (int i=1; i<=1; i++) {  // ���⵵ i<=1 �길 1~3 ������ �ݺ��� ����� �ָ� �ǳ�?
			System.out.print(i);
		}
		System.out.println();
		
		for (int i=1; i<=2; i++) {
			System.out.print(i);;
		}
		System.out.println();
		
		for (int i=1; i<=3; i++) {
			System.out.print(i);
		}
		
		

		System.out.println();
		System.out.println("--------------------------------------------------------");
		
//		int i=1;
//		for (int j=0; j<3; j++) {
//			int temp=i+j;				// i�� ����ϱ� ���� ����
//			for (; i<=temp; i++) {		// i�� �����Ǿ�� ��
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
//		int temp=1;
//		for (int y=0; y<3; y++) {
//			temp+=y;
//			// 1+0
//			for (int i=temp; i<=temp+y; i++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		// �� ������� ���� ������ �ʿ�� ����
		// ������ �� �� �̷��� �غ��� �ȴ�
		
		// ���� �ٷ� �� ������ 0,1,2,3,4, ... ù ���ڰ� �̷� ������ ������
		// ���� �����ٰ� 1���ϰ� 2���ϰ� 3���ϰ� 4���ϰ� 
		
		
		int su12=1;
		for (int i=1; i<4; i++) {		// ���� �ݺ������� ���� ����
			for (int j=0; j<i; j++) {
				System.out.print(su12++);		// ���⼭ su12++��� j+1�� ����ϸ� 2�� ������ �ȴ�
			}
			System.out.println();
		}
		// ����ϴ� ���(Ƚ��)�� �����ϴ� �Ͱ�
		// ������ ����� ��(���� su12)�� ���ε��� �����ϴ� ���
		
		
		
		
		
//		for (int i=1; i<=1; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		
//		for (int i=1+1; i<=1+1+1; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		
//		for (int i=1+1+2; i<=1+1+2+2; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		
//		for (int i=1+1+2+3; i<=1+1+2+2+3+3; i++) {
//			
//		}
		
		
	}

}