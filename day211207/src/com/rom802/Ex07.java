package com.rom802;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println("while��");
		int i=0;
		int j=1;
		while (++i<=9) {
			j=1;				// �ݺ��� �ȿ��� ���� �ϴ� ���� ���� �ʴ�
			while (++j<=9)
				System.out.print(j + " x " + i + " = " + i*j + "\t");
			System.out.println();
		}
		
		
		
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\nfor��");
		// ������ for��
		
		for (int m=1; m<=9; m++) {
			for (int n=2; n<=9; n++)
				System.out.print(n + " X " + m + " = " + m*n + '\t');
			System.out.println();
		}
		
		
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------------");
		
//		for (i=1; i<10; i++) {					// �ȵǸ� for���� while������ ��ȯ�ϸ� ��
//			for (int j=2; j<10; j++) {
//				System.out.print(j+"x"+i+"\t");
//			}
//			System.out.println();
//		}
	}
}