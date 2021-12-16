package rom802;


class Lec01{						// 부모클래스(super class)
	public static int su1=1111;
	public int su2=2222;
	
	public static void func01(){
		System.out.println("Lec01 static func01()...");
	}
	public void func02(){
		System.out.println("Lec01 non-static func02()...");
	}
	
	
}




public class Ex01 extends Lec01{		// 자식클래스()

	public static void main(String[] args) {
		// 상속
		Lec01 you=new Lec01();
		System.out.println(you.su2);
		you.func02();
//		you.func03();	// 부모는 자식 꺼 못 씀 (안됨)
		Lec01.func01();
		
		Ex01 me=new Ex01();
		System.out.println(me.su2);
		me.func02();
		Lec01.func01();
		
		
	}
	
	public void func03(){
		System.out.println("Ex01 func03():"+su2);	// 자식이 상속 받으면서 부모의 su2(non-static) 받았으니까 접근 가능
	}
}
