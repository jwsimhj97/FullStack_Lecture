package com.rom802;

// ����x

public class Ex01_2_1 {

	public static void main(String[] args) {
		final int		DRAW_NUM=6;					// DRAW_NUM�� 30�� �Ѿ�� ���� �ɸ���
		int[]			lotto=new int[DRAW_NUM];
		
		boolean		isError=true;
		while(isError){
			isError=false;
			
			for(int i=0; i<DRAW_NUM; i++){			// 1. �ϴ� 6�� �־�
				lotto[i]=(int)(Math.random()*45)+1;
			}
			
			for(int i=0; i<DRAW_NUM; i++){			// 2. �ߺ� �˻� ��
				if(isError){
					break;
				}
				for(int j=i+1; j<DRAW_NUM; j++){
					if(lotto[i]==lotto[j]){
						isError=true;
						break;
					}
				}
			}
		}
		
		for(int i=0; i<DRAW_NUM; i++){				// 3. ���
			System.out.print(lotto[i]+" ");
		}
		
	}

}