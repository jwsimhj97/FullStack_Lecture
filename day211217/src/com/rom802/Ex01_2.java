package com.rom802;

public class Ex01_2 {

	public static void main(String[] args) {
		
//		구조
//		(중복 검사 할 거야){
//			(6개 전부 뽑아 놓고){
//				
//			}
//		}

		final int		DRAW_NUM=6;		// DRAW_NUM이 30이 넘어가면 오래 걸린다
		int[]			lotto=new int[DRAW_NUM];
		
		boolean		isError=true;
		while(isError){
			isError=false;
			
			for(int i=0; i<DRAW_NUM; i++){		// 1. 일단 6개 넣어
				lotto[i]=(int)(Math.random()*45)+1;
			}
			
			for(int i=0; i<DRAW_NUM; i++){							// 2. 중복 검사 해
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
		
		// 출력
		for(int i=0; i<DRAW_NUM; i++){
			System.out.print(lotto[i]+" ");
		}
		
	}

}
