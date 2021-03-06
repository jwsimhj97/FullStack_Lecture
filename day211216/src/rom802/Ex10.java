package rom802;

class Lec10{
	public static int su1=1111;
	static int su2=2222;				// 안 붙으있으면 default라고 함
	private static int su3=3333;		// 해당 클래스 내부에서만 사용 가능
	protected static int su4=4444;		// 동일 패키지 허용, 다른 패키지 불가
	
	// 디자인패턴 (싱글톤 패턴)
	private static Lec10 me=new Lec10();
	
	private Lec10(){
		
	}
	
	public static Lec10 newInstance(){		// 내부 메서드가 생성자를 호출해서 호출 // 참조변수가 없으면 접근이 안되니까 static
		return me;
	}
	
	public static void func(){
		System.out.println(su3);
	}
}
public class Ex10 extends com.test.Ex10{

	public static void main(String[] args) {
		
		Ex10 me=new Ex10();
		System.out.println(me.su1);
//		System.out.println(me.su2);
//		System.out.println(me.su3);
		System.out.println(me.su4);
		System.out.println("---------------------------");
		System.out.println(Lec10.su1);
		System.out.println(Lec10.su2);
//		System.out.println(Lec10.su3);
		
		System.out.println(Lec10.su4);
		
		Lec10.func();
		
		System.out.println("-----------------------");
		System.out.println(com.test.Ex10.su1);
//		System.out.println(com.test.Ex10.su2);
//		System.out.println(com.test.Ex10.su3);
		
//		com.test.Ex10 you = new com.test.Ex10();	// com.test.Ex10 의 생성자가 default면 우변만 에러
		
//		Lec10 you2=new Lec10();		// 생성자가 private이기 때문에 오류

		Lec10 you2=Lec10.newInstance();
		System.out.println(you2);
		you2=Lec10.newInstance();
		System.out.println(you2);
	}
	

}
