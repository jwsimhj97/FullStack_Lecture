package com.hi;

class Outter03{
	static class Inner03{

		public static int su1=3333;
		public int su2=4444;
		
		public Inner03(){}
		
		public static void func03(){
			Outter03 outt=new Outter03();
			System.out.println(outt.su2);//2222 	//su2는 Outter03 객체가 있어야 하기 때문에 어쩔 수 없이
			System.out.println(su1);//3333	// 여기서 su1은 Inner03.su1 의 생략이다
			System.out.println(Outter03.su1);//1111		// 내부 클래스는 Outter 안에 있기 때문에 생략 가능
			Inner03 inn=new Inner03();
			System.out.println(inn.su2);//4444
		}
		public void func04(){
			Outter03 outt=new Outter03();
			System.out.println(outt.su2);	//2222 // 마찬가지
			System.out.println(su1);		//inner3.su1 3333 // 만약 1111을 보고 싶다면 Outter.su1로 써야
			System.out.println(su2);	// 여기서 su2는 this.su2임
		}
		
	}	
	
	public static int su1=1111;
	public int su2=2222;
	
	public Outter03(){}
	public static void func01(){	//outter에서 inner로 접근
		Outter03 outt=new Outter03();
		System.out.println(Outter03.su1);	//1111
		System.out.println(outt.su2);		//2222
		System.out.println(Inner03.su1+"a");//3333
		Inner03 inn=new Inner03();
		System.out.println(inn.su2);		//4444
	}
	public void func02(){
		System.out.println(Inner03.su1+"b");
		Inner03 inn=new Inner03();
		System.out.println(inn.su2);
	}
}

public class Ex03 {

	
	public static void main(String[] args) {
		System.out.println(Outter03.su1 );
		Outter03 outt=new Outter03();
		System.out.println(outt.su2);
		System.out.println("------------------------");
		//여기까진 원래 하던거랑 똑같고 이제 내부 클래스에 접근해봅시다
		System.out.println(Outter03.Inner03.su1); // su3은 static
		
		//su4는 참조변수가 있어야 하고... 그 생성자는 outter안에 있지
		// Inner03은 static 클래스
		Outter03.Inner03 inn=new Outter03.Inner03();
		System.out.println(inn.su2);
	}

}
