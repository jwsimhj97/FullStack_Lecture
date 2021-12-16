package rom802;

// final
class Lec08{
	
	public final void func2(){		// 메서드의 final
		
	}
}

public class Ex08 extends Lec08{
	public final static int su=1111;
	public final int su2;
	
	public Ex08(int su){
		su2=su;
	}
	
//	public void func2(){		// 오버라이드 불가 (final이니까)
//		int a=2;
//	}
	
	public static void func(final int a){ // 여기서 final int a를 새로 선언하는 것이니까 final이 아닌 그냥 int로 보내도 상관없음
//		a++;	// final이니까 안됨
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Lec08 tou=new Lec08();
		tou.func2();
		
		Ex08 me=new Ex08(1111);
		me.func2();
		
		
		
		// final
		final int a;
		a=1111;
//		a=2222;
//		su1=2222;
		
		Ex08 me1=new Ex08(1111);
		System.out.print(me1.su2);
		Ex08 me2=new Ex08(2222);
		System.out.println(me2.su2);
		
//		객체마다 다른 상수 값을 멤버 필드로 가질 수 있게됨
//		단, 더 이상 수정 불가
//		final의 제약 범위가 조금 달라진다
		
		func(1111);
		func(2222);
		int c=3;
		func(c);
	}

}
