package com.rom802;

public class Ex04 {

	public int su;
	public int suu;
	public final int su3=4321;
	public static final int su5=5555;
//	public static final int su6;	// 값을 못바꾸는데 field는 디폴트 값을 가지기 때문에 초기화를 안하면 오류남
	
	public Ex04(int su2) {
		su=su2;
		suu=su2;	//이건 오류남		// 6번줄도 초기화고 이것고 초기환데 어떤 초기화를? 생성자가 우선
		System.out.println(su);
	}
	
	public static void main(String[] args) {
		final int su4;	// 변수의 선언 (상수형 변수)
		su4=4444;		// 변수의 초기화
//		su4=5555;		// 값을 바꾸려고 하면 안바뀜 (final을 값을 바꾸지 못하는 변수를 만드는 키워드)
		
		Ex04 me=new Ex04(1234);
		System.out.println(me.su);
		System.out.println(me.su3);
		me.su3=54321;
//		su5=6666;
		
	}
}
