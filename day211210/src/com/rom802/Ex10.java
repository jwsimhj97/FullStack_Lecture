package com.rom802;

public class Ex10 {

	public static void main(String[] args) {
		// 문자열 String
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String msg1;
		msg1="java";					// msg1은 주소를 받는건데 "java"라는 객체의 주소를 받았다
		System.out.println(msg1);
		msg1="문자열";					// msh1은 "문자열"이라는 객체의 주소를 받았다.
		System.out.println(msg1);
		msg1=new String("java");
		msg1 = new String("");
		System.out.println(msg1);  // null이 아니라 빈 문자열이 나왔다
		
		String msg2=new String("java");
		System.out.println(msg1==msg2);
		
		String msg3="java";
		String msg4="java";
		System.out.println(msg3==msg4);
		
//		String msg5=sc.nextLine();
//		System.out.println(msg3==msg5);
		
		System.out.println("aa");
		int a=1;
		System.out.println("java1"=="java"+a);	// "java" + a 는 새로운 객체를 만든다
		System.out.println("java1"=="java"+1);	// 상수연산이 이미 돼서 "java1" 로 만들고 상수영역에 올라간다
	}
}
