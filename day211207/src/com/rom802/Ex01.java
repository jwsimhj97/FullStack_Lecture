package com.rom802;

public class Ex01 {

	public static void main(String[] args) {
//		for (int i=1; i<=3; i++) {
//			for (int j=0+i; j<3+i; j++) {
//				System.out.print(j);		// ���� �ȿ��� ������ �ʰ� ����Ʈ �ϴ� ������ ���ص� ��
//			}
//			System.out.println();
//		}
		
//		int su=1;
//		for (int i=0; i<3; i++) {
//			for (int j=0; j<3; j++) {
//				System.out.print(su);
//				su++;
//			}
//			System.out.println();
//			su-=2;
//		}
//		
//		for (int i=1; i<10; i++) {
//			System.out.print(i);
//			if (i%3==0) {
//				System.out.println();
//			}
//		}
		
		
//		System.out.print("--------------------------------------");
//		int su=1;
//		for (int i=0; i<12; i++) {		// i�� �ݺ� Ƚ���� ���� ���� (11��)
//			if (i%4==0) {				// su�� ����ϴ� ���ڸ� ���� ����
//				System.out.print('\n');
//			} else {
////				System.out.print(su);
////				su++;
//				System.out.print(su++);
//			}
//		}
		
		char ch='A';					// ǥ�⸸ �޶����� 1�� ������ ���� 
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
		// 65 66 67
		// 68 69 70
		// 71 72 73
		// �̷��� ����ϴ� �Ͱ� ��������
		
	}

}

// 3 ���� ��µ� �� �� �� ���ٿ����� ���� �� �� �ݺ��̴�
// �� ���� �� �� ��� �ߴµ�
// �� �� ���� �����ϴϱ� �ݺ�������

// 1 2 3
// 4 5 6
// 7 8 9

// 1 2 3 \n 2 3 4 \n 3 4 5
// �̷��Ե� �� �� �ִ�
// �̷��� �ϸ� �ݺ����� 11�� ���� �� (9 + 2(����))
// ��Ģ��) �ϳ� �����ϰų� ���ڸ� ����ϰų�

// ���� �ݺ����� �ᵵ ������ ���� �ݺ����� �� ����