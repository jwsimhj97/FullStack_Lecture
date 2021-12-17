package com.rom802;

public class Ex01_2_2 {
	
	final static int DUP_DETECTED=-1;
	final static int DRAW_NUM=6;		// DRAW_NUM이 30이 넘어가면 오래 걸린다
	
	public static int checkDup(int[] lotto){
		for(int i=0; i<DRAW_NUM; i++){
			for(int j=i+1; j<DRAW_NUM; j++){
				if(lotto[i]==lotto[j]){
					return DUP_DETECTED;
				}
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
//		메서드 활용
		
//		구조
//		(중복 검사 할 거야){
//			(6개 전부 뽑아 놓고){
//				
//			}
//		}

		int[]			lotto=new int[DRAW_NUM];
			
		do{
			for(int i=0; i<DRAW_NUM; i++){			// 1. 일단 6개 넣어
				lotto[i]=(int)(Math.random()*45)+1;
			}
		}while(checkDup(lotto)==DUP_DETECTED);		// 2. 중복 검사해
		
		// 출력
		for(int i=0; i<DRAW_NUM; i++){
			System.out.print(lotto[i]+" ");
		}
		
	}

}
