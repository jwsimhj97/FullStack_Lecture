package com.rom802;

interface Inter01{
	int su1=1111;	// static이 생략되어 있다
//	static int su1=1111;	// 이것과 동일함
//	public static int su1=1111;
//	public final static int su1=1111;	// 사실 final 도 생략되어 있다 (클래스 변수도 가질수 없다보니까)
	
	public abstract void func01();
	public void func02();	// 추상이 아닌게 아니라 abstract가 생략되어 있는 것임 // 굳이 매 번 명시하는게 귀찮으니까
	void func03();
}

public class Ex04 {

	public static void main(String[] args) {
		System.out.println(Inter01.su1);
	}

}
