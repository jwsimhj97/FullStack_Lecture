package com.test;

public class Ex10 {		// 패키지 이름이 다르기 때문에 동일 클래스명 허용
	public static int su1=1000;
	static int su2=2000;				// 안 붙으있으면 default라고 함
	private static int su3=3000;		// 해당 클래스 내부에서만 사용 가능
	
	protected int su4=3000;
	
	
	
	public static void func(){
		System.out.println(su3);
	}
	static void func02(){
		
	}
	private static void func03(){
		
	}

	public static void main(String[] args) {
		

	}

}
