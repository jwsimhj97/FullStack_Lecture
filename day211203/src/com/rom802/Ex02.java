package com.rom802;

public class Ex02 {

	public static void main(String[] args) {
		// 변수
		byte a;		// 1byte
		short b;	// 2byte
		int c;		// 4byte
		long d;		// 8byte
		a=1;
		b=2;
		c=3;
		d=21474836481L;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		float e;	// 4byte
		double f;	// 8byte
		e=3.14f;
		f=3.14;
		
		System.out.println(e);
		System.out.println(f);
		
		char g;
//		g='A';
		g='한';
		
		System.out.println(g);
		
		boolean boo;
		
		boo=true;
		System.out.println(boo);
		
//		d=c;
		c=b;
		b=a;
		f=e;
		// 이 방향으로는 자동 형 변환이 일어나서 가능하다
		
		//long <-> float
		e=d;
		System.out.println(e);
	}
}
