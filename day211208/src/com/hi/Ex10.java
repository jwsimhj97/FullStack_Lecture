package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		double su1=Math.random();
		
		int su2=(int)(su1 * 10);	// 0~9
		boolean boo=true;
		while (boo) {
			if (su2 < 1 || su2 > 3) {
				su1=Math.random();
				su2=(int)(su1*10);
			} else {
				boo=false;
			}
		}
		
		// 0 <= su1 < 1		�� ���´�
		// 0*3 <= su1 < 1*3  (3�� ����)
		// 0 <= su1 < 3			(����� 1�� ���ϸ�?)
		// 0+1 <= su1 < 3+1
		// 1 <= su1 < 4
		
		
		
	}

}