package com.rom802;

public class Ex10 {

	public static void main(String[] args) {
		// 사용자 입력
		java.util.Scanner sc=new java.util.Scanner(System.in);		// 입력받기 위한 장치 준비
		
		
		for (int i=0; i<3; i++) {
			System.out.print("첫 번째 입력> ");
			String msg=sc.nextLine();		// 이렇게 하게 되면 입력받기 가능	// 입력을 해주기 전 까지는 대기하고 있다
			System.out.println(msg);
		}
		
	}
}
