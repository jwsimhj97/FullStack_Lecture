package com.rom802;

public class Ex07 {

	public static void func01(int[] arr2) { // 복사가 되긴 했는데
		arr2[1] = 10;						// 일을 하다가 나가면 값이 바뀐 상태 (여긴 얕은 복사)
		
		arr2 = new int[]{1,2,3};
		arr2[1]=100;
	}
	
	public static void main(String[] args) {
		// 얕은 복사
		int[] arr1 = {2,4,6,8};				// 지역변수인데도... 값이 변경된다???
		
		func01(arr1);	// 이 함수에서 배열을 전달했는데 옅은 복사가 이루어지고 있다
		
		for (int i=0; i<arr1.length; i++) {		// func01을 끝내고 다시 돌아오니까 값이 변해있다
			System.out.println(arr1[i]);
		}

	}

}
