package com.rom802;

public class Ex05 {

	public static void main(String[] args) {
		
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {	// �̷� 2�� for������ ������ ����� �� �����ϴ� ����
				if (j<2-i) {			// ���� �ٲ� ������ 2, 1, 0���� �پ�� �ϱ� ������ i�� ���ִ� ���̴� (���� �����ϴ� ���� i�ϱ�)
					System.out.print(' ');
				} else {
					System.out.print('*');		// ���⿡ '*'��� j+1�� ����ϸ� �ٸ� ���� �ذ�
				}
			}
			System.out.println();
		}

	}

}