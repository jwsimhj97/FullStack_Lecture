package com.rom802;

public class Ex11 {

	public static void main(String[] args) {
		String mgs1="java";
//		StringBuffer msg2="java";	// 이건 오류 "java"는 StringBuffer가 아니라 String 클래스잖아

		StringBuffer msg2=new StringBuffer("java");
		System.out.println(msg2);
//		StringBuffer msg3=msg2+"Web";	// StringBuffer + String 타입이기 때문에 오류
		StringBuffer msg3=msg2.append("Web");
		System.out.println(msg3);
		
		System.out.println(msg2);
		
		System.out.println("---------------");
		// 비어있는 공간이 16이니까
		
		StringBuffer msg6=new StringBuffer(5);
		for(int i=0; i<27; i++){
			msg6.append("a");
			System.out.println(msg6.capacity());
		}
		
	}

}
