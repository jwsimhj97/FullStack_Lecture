package com.rom802;

abstract class Lec01{
	
	int su=1111;
	
	abstract void func01();
	void func03(){
		System.out.println("func03 run...");
	}
	
}

public class Ex01 extends Lec01{

	void func01() {
		System.out.println("abcd");
	}
	public static void main(String[] args) {
//		Lec01 lec=new Lec01();	//추상 클래스 객체는 생성할 수 없다
//		lec.func01();
		
		Ex01 me=new Ex01();
		me.func01();
		me.func03();
		
		Lec01 lec01=new Ex01();
		lec01.func01();		// 추상 메서드가 없으면 다형성에서 문제가 생긴다
		lec01.func03();
		
	}

}
