package com.rom802;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("로또 번호 생성기(ver 0.0.1)\n");
		
		final int ROTTO=45;
		int		result[]=new int[ROTTO];
		int		num = 0;
		int		cnt = 0;
		
		
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
		for(int i=0; i<ROTTO; i++){
			System.out.print(result[i]+" ");			
		}
		
		// 정렬 해야 함
	}

}
