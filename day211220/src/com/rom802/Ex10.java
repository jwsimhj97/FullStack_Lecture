package com.rom802;

public class Ex10 {

	public static void main(String[] args) {
		// 로또
		// 1. 랜덤 (1~45)
		// 2. 6개 - 중복 x -> 중복값검사	2번과 3번은 같은 것
		// 3. 오름차순 정렬
		
		int[] lotto={6,1,3,4,2,5};	// 정렬할 배열 예시
		int su;
		
		// 0,1 0,2 0,3 0,4 0,5 ... 비교해가면서 작은 값을 0인덱스에
		//     1,2 1,3 1,4 1,5 ... 비교해가면서 작은 값을 1인덱스에
		//         2,3 2,4 2,5 ... 비교해가면서 작은 값을 2인덱스에
		// 마치 별 찍기처럼
		
// 1. 랜덤
// 2. 6개 중복 없이 뽑기 (이것도 똑같이 별찍기 처럼 접근 가능)
		for(int i=0; i<lotto.length; i++){
			su=(int)(Math.random()*45)+1;	// 0~44.9999999999999999999 + 1
			lotto[i]=su;
			for(int j=0; j<i; j++){
				if(lotto[i]==lotto[j]){
					i--;
				}
			}
		}
		
// 3. 정렬		
		//정렬에 대한 로직은 여러 가지가 있다
		int temp;
		
		// 별 찍기 개념으로 접근한 것
		for(int i=0; i<lotto.length-1; i++){
			for(int j=i+1; j<lotto.length; j++){ // 항상 바로 다음 것과 검사하니까 j=i+1
				if(lotto[i]>lotto[j]){	// 자리를 바꿔야 하는 경우
					temp=lotto[i];
					lotto[i]=lotto[j];	//의미는 이렇지만 실제로 수행하면 둘다 lotto[j]값이 되어버린다
					lotto[j]=temp;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++){ 
			System.out.print(lotto[i]+" ");
		}
	}

}
