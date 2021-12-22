package com.hi;

class Outter04{
	public static int su1=1111;
	public int su2=2222;
	
	public Outter04(){
		
	}
	
	public static void func01(){
//		Inner04 inn=new Inner04();
		Outter04 outt=new Outter04();
		Inner04 inn=outt.new Inner04();	// 여기서는 내 안이니까 outt.Inner04라고 안했음
		System.out.println();
	}
	public void func02(){
		Inner04 inn=new Inner04();	// non static이니까 접근 가능
	}
	
	//non-static
	class Inner04{
//		public static int su3=3333;
		public int su4=4444;
		
		public Inner04(){}
		
//		public static void func03(){}
		
		public void func04(){
			System.out.println(su1);	//Outter04 생략가능
//			Outter04 abc=new Outter04();
			// 이렇게 찍으면 바깥쪽에 있는 Outter04 클래스와는 다른
			
			// 내부 클래스 객체가 존재하는 순간 이미 그 전에 Outter클래스가 존재해 있는 상태니까 당연히 존재
			
			// outter를 부모 클래스라고 생각하면
			// 부모객체도 자동으로 미리 super로 찍히니까 부모의 객체에 자동으로 접근가능(상속을 받아도 안보이지만 있다고 하니까 있는줄 알고 썼다)
			// 이 경우처럼 상속이 아닌데도 상속의 효과를 받고 있다(근데 여기서는 바깥에 보이니까 보이는걸 씀)
			// 객체지향이 익숙하지 않을 때는 상속받은 필드와 메서드가 보이지도 않는데 쓰니까 얼마나 답답하겠어
			// 그래서 자바 초창기에는 국내에서도 많이 썼다
			
			System.out.println(su2);
		}
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Outter04 outt=new Outter04();
		Outter04.Inner04 inn=outt.new Inner04();
		System.out.println();
	}

}
