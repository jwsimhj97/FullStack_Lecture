package com.rom802;

// ��ȣ�� �̴� ���ÿ� ����

public class Lotto {

	public static void main(String[] args) {
		final int	DRAW_NUM=6;
		final int	POOL=45+1;
		int[] 		lotto=new int[POOL];
		int			ran;
		
		System.out.println("�ζ� ��ȣ ������(ver 0.1.0)");
		int i=0;
		while(i<DRAW_NUM){
			ran=(int)(Math.random()*45)+1;
			if(lotto[ran]==0){
				lotto[ran]=ran;
			}else{
				continue;
			}
			i++;
		}
		
		for(i=0; i<POOL; i++){
			if(lotto[i]!=0){
				System.out.print(lotto[i]+" ");				
			}
		}
	}

}