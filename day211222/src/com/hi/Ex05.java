package com.hi;

class Outter05{
	public static int su1=1111;
	public int su2=2222;

	public Outter05(){}
	
	public static void func01(){	// 메서드 안에 클래스
		int su5=5555;	// 얘는 final이다
		class Inner05{
			public static final int su3=3333;
			public int su4=4444;
			public Inner05(){}
			public void func03(){
				System.out.println(su5);
			}
		}
//		su5++;	// 이렇게 하면 final이 아닌 전제가 있는 것이니까 오류 메세지가 뜬다
		System.out.println(Inner05.su3);	// 3333
		Inner05 inn=new Inner05();			// 4444
		System.out.println(inn.su4);
		inn.func03();
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Outter05.func01();
	}

}
