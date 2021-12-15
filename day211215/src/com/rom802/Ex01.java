package com.rom802;

public class Ex01 {

	public static void main(String[] args) {
		// 문자열
		String st1=null;	// st1에 객체가 하나도 안 들어가있음 (가리키는 객체가 없다는 뜻)
//		st1.equals("");	//이렇게 쓰면 오류임 NullPointerException
		st1="";	// 내용이 없는 문자열이 존재. 위와는 의미가 완전히 다르다
		st1.equals("");
		String st2=new String("java");		// 객체를 생성해서 대입 (빈 문자열)
		
		
		char[] arr1=st2.toCharArray();	// 문자 배열로 분리한 다음 배열의 수를 리턴해주면 그게 문자열의 길이
		String st3=new String(arr1);	// 복사도 마찬가지
		
		byte[] arr2=st2.getBytes();
		String st4=new String(arr2);
	}
	
}