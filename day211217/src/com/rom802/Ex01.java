package com.rom802;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("�ζ� ��ȣ ������(ver 0.0.1)");
		
		final int	DRAW_NUM=6;
		int			lotto[]=new int[DRAW_NUM];
		int			num = 0;
		int			cnt = 0;
		
		// �ߺ� ���� �̱�
		for(int i=0; i<DRAW_NUM; i++){
			int j=0;
			num = (int)(Math.random()*45)+1;	// 1. ���� �ϳ��� �̾Ƽ�
			
			while(j<cnt){						// 2. �ߺ� �˻縦 �ϰ� 
				if(num==lotto[j]){
					num = (int)(Math.random()*45)+1;
					j=0;		
					continue;
				}
				j++;
			}

			lotto[i]=num;		// 3. �ζ� �迭�� �ִ´�
			cnt++;
		}
		
		// ���� ����
		int temp;
		for(int i=0; i<DRAW_NUM; i++){
			for(int j=0; j<DRAW_NUM-i-1; j++){
				if(lotto[j] > lotto[j+1]){
					temp=lotto[j];
					lotto[j]=lotto[j+1];
					lotto[j+1]=temp;
				}
			}
		}

		// ���
		for(int i=0; i<DRAW_NUM; i++){
			System.out.print(lotto[i]+" ");
		}
	}

}