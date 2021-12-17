package com.rom802;

public class Ex01_2_2 {
	
	final static int DUP_DETECTED=-1;
	final static int DRAW_NUM=6;		// DRAW_NUM�� 30�� �Ѿ�� ���� �ɸ���
	
	public static int checkDup(int[] lotto){
		for(int i=0; i<DRAW_NUM; i++){
			for(int j=i+1; j<DRAW_NUM; j++){
				if(lotto[i]==lotto[j]){
					return DUP_DETECTED;	// �ߺ��� ���� ���
				}
			}
		}
		return 0;	// �ߺ��� ������ 0����
	}
	
	public static void main(String[] args) {
		int[] lotto=new int[DRAW_NUM];
			
		do{
			for(int i=0; i<DRAW_NUM; i++){			// 1. �ϴ� 6�� �־�
				lotto[i]=(int)(Math.random()*45)+1;
			}
		}while(checkDup(lotto)==DUP_DETECTED);		// 2. �ߺ� �˻���
		
		for(int i=0; i<DRAW_NUM; i++){				// 3. ���
			System.out.print(lotto[i]+" ");
		}
		
	}

}