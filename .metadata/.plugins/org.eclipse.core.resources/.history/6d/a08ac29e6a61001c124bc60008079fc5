package com.rom802;

public class Ex11 {

	public static void main(String[] args) { 
		int[] lotto=new int[45];	// 배열은 객체니까 객체도 다루고 있고
		int ran;
		int temp;
		
		for(int i=0; i<lotto.length; i++){
			lotto[i]=i+1;
		}
		
		for(int i=0; i<10000; i++){
			ran=(int)(Math.random()*45);
			temp=lotto[0];			// 이 0이라는 숫자는 상관이 없음
			lotto[0]=lotto[ran];	// 랜덤한 인덱스를 뽑아서 바꿔줌
			lotto[ran]=temp;
		}
		
		for(int i=0; i<6; i++){		// 보너스 뽑기도 쉽다 숫자를 7로 바꾸고
			System.out.print(lotto[i]+" ");
		}
		
		// 보너스를 뽑으면 정렬 처리할 때 마지막 하나 빼고 정렬하면 보너스 처리됨
		
		// 꼼수 같긴 한데 이게 실제 로또랑 더 비슷함
	}

}
