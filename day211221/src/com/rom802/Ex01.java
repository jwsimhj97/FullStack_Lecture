package com.rom802;

public class Ex01 {

	public static void func01(Object a){}
	
	public static void main(String[] args) {
		// 래퍼 클래스
		int a=1111;
		Integer b=new Integer(2222);
		System.out.println(b+1);
		// Integer, Double, Byte,
		
		func01(3333); // int는 Object를 상속받지 않으니까 안돼야 하는데? Integer로 박싱하고 있는 것임
	}

}
