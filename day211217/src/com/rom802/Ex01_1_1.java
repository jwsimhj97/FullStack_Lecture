package com.rom802;

public class Ex01_1_1 {

	public static void main(String[] args) {
		System.out.println("로또 번호 생성기(ver 0.0.1)");
		
		final int	DRAW_NUM=6;
		int			lotto[]=new int[DRAW_NUM];
		int			num = 0;
		int			cnt = 0;
		
		// 중복 없이 뽑기
		for(int i=0; i<DRAW_NUM; i++){
			int j=0;
			num = (int)(Math.random()*45)+1;	// 1. 숫자 하나를 뽑아서
			
			while(j<cnt){						// 2. 중복 검사를 하고 
				if(num==lotto[j]){
					num = (int)(Math.random()*45)+1;
					j=0;		
					continue;
				}
				j++;
			}

			lotto[i]=num;		// 3. 로또 배열에 넣는다
			cnt++;
		}
		
		// 버블 정렬
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

		// 출력
		for(int i=0; i<DRAW_NUM; i++){
			System.out.print(lotto[i]+" ");
		}
	}

}
