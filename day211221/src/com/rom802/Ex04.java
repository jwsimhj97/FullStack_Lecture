package com.rom802;

public class Ex04 {

	public static void main(String[] args) {
		// 10진수 실수타입
		
		double a=3.14;
		Double su2=new Double(3.14);
		Double su3=new Double("314");
		System.out.println(su3);
		System.out.println(Double.MAX_VALUE);
		
		Double su4=1.0/0.0;
		// 분자가 커지면 숫자가 커지고, 분모가 작아져도 숫자가 커진다
		// 그럼 0으로 나누면??
		System.out.println(su4);
		System.out.println(su4.isInfinite());
		System.out.println(su4.isNaN());
		
		Float su5=new Float(3.14);
		Float su6=new Float(3.14F);
		Float su7=new Float("3.14");
		
		
		
	}

}
