package com.rom802;

interface Inter02{
	void func01();
}

interface Inter03 extends Inter02,Inter04{	
	void func02();
}

interface Inter04 {}

public class Ex05 implements Inter04{
	
	public void func01() {}
	public void func02(Inter04 abc) {}
	
	public static void main(String[] args) {
		Ex05 me=new Ex05();
		me.func01();
		me.func02(me);
		
		
//		Inter02 you=new Ex05();
//		you.func01();
	}

}
