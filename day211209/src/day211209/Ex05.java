package day211209;

public class Ex05 {

	public static int c=5;
	public static int d;
	public static String msg;
//	c=1111;						// 오류남 // 하고자 하는 일은 메서드(스택영역)에 적어야지 (이런 일을 하려면 스택에서 일을 수행해야 하는데...)
	
	public static void func01(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void func02() {
		int a=10;
		int b=5;
//		int[] arr = new int[]{a,b};		원래는 여러 개의 변수를 리턴 하려면 이런 식으로 했었는데...
//		return arr;
		
	}
	
	public static void main(String[] args) {
		int a,b;
		int c= 0;
		a=2;
		b=3;
		func01(a, b);
		c=a;
		d=b;
		func02();	// 매개변수를 전달하지 않았음에도 전달하는 효과를 낸다
		System.out.println(msg);
		System.out.println(c);
	}

}
