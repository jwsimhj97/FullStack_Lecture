package day211209;

public class Ex04 {
	// 클래스의 구성요소
	// 1. 메서드
	// 2. 변수

	public static int b=2222;	// static인 전역변수를 클래스변수 혹은 전역변수라고 부름
	public int c=3333;			// 메서드의 밖에서 선언된 변수는 전역적인 특징이 있다. 멤버필드, 혹은 인스턴스 변수라고 부름
	
	public void func01() {
//		System.out.println(a);		// main에서 선언된 a는 여기서 못씀
		System.out.println(b);		// Ex04.b 인데 Ex04. 가 생략되어 있음
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// 지역변수
		int a=1234;
		System.out.println(a);

		
		System.out.println(a);
		System.out.println(b);
		
		Ex04 me;
		me = new Ex04();
		System.out.println(me.c);
		me.func01();
		System.out.println(Ex05.c);
		Ex05.c += 1;
		System.out.println(Ex05.c);
		
	}
}
