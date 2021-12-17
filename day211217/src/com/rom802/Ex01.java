package com.rom802;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("로또 번호 생성기(ver 0.0.1)\n");
		
		final int ROTTO=6;
		int		result[]=new int[ROTTO];
		int		num = 0;
		int		cnt = 0;
		
		
		// 중복 없이 뽑기
		for(int i=0; i<ROTTO; i++){
			int j=0;
			num = (int)(Math.random()*45)+1;
			while(j<cnt){
				if(num==result[j]){
					num = (int)(Math.random()*45)+1;
					j=0;
					continue;
				}
				j++;
			}
			result[i]=num;
			cnt++;
		}
		
		// 정렬
		int temp;
		for(int i=0; i<ROTTO; i++){
			for(int j=0; j<ROTTO-i-1; j++){
				if(result[j] > result[j+1]){
					temp=result[j];
					result[j]=result[j+1];
					result[j+1]=temp;
				}
			}
		}

		for(int i=0; i<ROTTO; i++){
			System.out.print(result[i]+" ");
		}
	}

}
