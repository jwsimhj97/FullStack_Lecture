package com.rom802;

public class Ex10 {

	public static void main(String[] args) {
		int su=-3;	// ������ ����� �ʱ�ȭ�� ���ÿ�
		// su�� ����̸� "����Դϴ�"���
		// su�� �����̳� "�����Դϴ�"���
		if (su >= 0) {
			System.out.println("����Դϴ�");
		}
		if (su < 0) {
			System.out.println("�����Դϴ�");
		}
		
		System.out.println("---------------------------");
		
		if (su > 0) {
			System.out.println("0���� Ů�ϴ�");
		} else {
			System.out.println("0���� Ů�ϴٰ� �����Դϴ�");
		}
		
		System.out.println("---------------------------");
		
		if (su>0) {
			System.out.println("0���� Ů�ϴ�");
		}
		if (su==0) {
			System.out.println("0�Դϴ�");
		}
		if (su<0) {
			System.out.println("0���� �۽��ϴ�");
		}
		
		System.out.println("---------------------------");
		
		if (su >0) {
			System.out.println("-���� Ů�ϴ�");
		} else if (su==0) {
			System.out.println("0�Դϴ�");
		} else if (su<0) {
			System.out.println("0���� �۽��ϴ�");
		}
		
		if (su>0) {
			;
		}
		if (!(su>0) && su>-1) {
			;
		}
		if (!(!(su>0) && su>-1)) {
			;
		}
	}
}