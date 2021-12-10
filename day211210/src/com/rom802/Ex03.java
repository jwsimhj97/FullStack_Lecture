package com.rom802;

class Ex33 {
	int a=1111;
//	public Ex33() {}	// 생성자를 만들지 않을 때는, 이런 default 생성자가 숨어 있음 (만들면 얘는 안생김)
	
	public static void sum(int a, int b) {
		int c = a+b;
	}
}

class Ex333 {		// 생성자가 없어도 자동으로 있다 (default 생성자)
	int b=2222;
	
	public Ex333() {
		System.out.println("생성자 호출");
	}
}

class Ex3333 {
	int c=3333;
	public Ex3333(int su) {		// 생성자
		c=su;
		System.out.println(c+"를 매개로 받는 생성자");
//		return ;
	}
}

public class Ex03 {
	public static void main(String[] args) {	// 오늘도 생성자 일부만 나갈 겁니다
		java.io.InputStream is=System.in;		// 얘는 나중에 함d
		java.util.Scanner sc;
		sc=new java.util.Scanner(is);		// 얘도 우리가 쓰고 있었지만 사실은 생성자였다...!
		
		Ex33 ex33 = new Ex33();
		Ex33 ex34 = new Ex33();
		Ex33 ex35 = new Ex33();
		Ex33 ex36 = new Ex33();
		Ex33 ex37 = new Ex33();
		
//		Ex333 ex333 = new Ex333();		// 참조 변수를 만들 때 이런 식으로 했는데...
		Ex333 ex333;	// 참조 변수의 default 값은 null
		ex333 = new Ex333();			// 이 두 줄을 줄인 것임 // new는 객체를 찍어내고 주소값을 반환
					// 여기서 new 뒤의 Ex333()은 클래스라고 말 했지만 정확하게는 클래스의 생성자임
		
//		Ex3333 ex3333 = new Ex3333();
		Ex3333 ex3333 = new Ex3333(1234);
	}
}
