package com.rom802;

public class Ex09 {

	public static void main(String[] args) {
		// 문자열을 숫자로 변환
		String msg="1234";
		
		System.out.println(msg+1);		// 문자열 + 1 = "문자열1"
		// 하지만 상황에 따라 숫자로 바꿔야 할 경우도 있다
		
		int su=Integer.parseInt(msg);		// 숫자(정수형)로만 구성되어 있어야 한다
		System.out.println(su+1);

		
		
	}

}
