package com.rom802;

public class Ex01_3 {

	public static void main(String[] args) {
		final int	LOTTO_POOL=45;
		final int	DRAW_NUM=6;
		int[]		lotto=new int[LOTTO_POOL];
		int			temp;
		int			ran;
		
		for(int i=0; i<LOTTO_POOL; i++){
			lotto[i]=i+1;
		}
		
		for(int i=0; i<DRAW_NUM; i++){
			ran=(int)(Math.random()*45);
			temp=lotto[i];
			lotto[i]=lotto[ran];
			lotto[ran]=temp;
		}
		
		for(int i=0; i<DRAW_NUM; i++){			
			System.out.print(lotto[i]+" ");
		}
		
		// 아직 정렬 처리 안됨
	}

}
