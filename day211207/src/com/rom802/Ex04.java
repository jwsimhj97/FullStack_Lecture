package com.rom802;

public class Ex04 {

	public static void main(String[] args) {
		
		// ���� ������ �ݴ�� 3�� 2�� 1�� ... �پ���
		for (int i=3; i>0; i--) {		// �� ���� 3�� ���ڴٴ� �͸� ������
			for (int j=0; j<i; j++) {
				System.out.print('*');
			}
			System.out.println();		// ���� for���� 3-i�� �ϴ� �ͺ��ٴ�
										// �ٱ��� for���� �����ϴ� ������ �ָ� ����� ���ϴ�
										// Ȯ�强�� �̰� �� ���� �� ����
										// ���࿡ 3�� �ٸ� ���� �ٲ�� �ϸ� ���� �ϳ��� �ٲٸ� �Ǵµ�...
		}

		// Ȥ��
		
		int cnt = 3;
		
		for (int i=0; i<cnt; i++) {
//			int su=1;
			for (int j=0; j<cnt-i; j++) {		// �����ϴ� ���� 3-i�� ǥ��
				System.out.print('*');		// ����Ʈ�� '*'���� j+1�� �ٲٸ� �ٸ� ���� �ذ�
			}								// ��� ���� �ϳ��� ���� �༭ Ǯ�� �ٸ� ������ �ذ�
			System.out.println();
		}
	}

}