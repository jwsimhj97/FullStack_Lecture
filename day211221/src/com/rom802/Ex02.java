package com.rom802;

public class Ex02 {

	public static void main(String[] args) {
		// 10정수타입
		int su1=1111;
		Integer su2=new Integer(2222);
		Integer su3=new Integer("2222");
		
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		// 받은 값이 최소 최대 범위를 벗어나는 경우를 대비해서 미리 조건 처리 하는 경우에 사용 (예외처리)
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		int su4=Integer.parseInt("4444");
		Integer su5=Integer.valueOf("5555");
		Integer su6=128;	// 박싱과 언박싱이 수시로 되기 때문에 이것도 가능, 하지만 컴퓨터에게 일을 더 시키는 셈임
		System.out.println(su6.byteValue());
		// 객체 타입으로 모든 것을 하겠다고 생각하는 순간 비효율적인 프로그램이 되어 버림
		System.out.println(su2.equals(su3));
		System.out.println(su2==su3);	// integer 객체니까 이런 식으로 비교하는 것 조심
		
		int su7=1;
		System.out.println(Integer.toBinaryString(su7));
		System.out.println(su7+"의 8진수="+Integer.toOctalString(su7));
		System.out.println(su7+"의 16진수="+Integer.toHexString(su7));
		System.out.println(Integer.reverse(su7));
		System.out.println(Integer.compare(314,-123132));
	}

}
