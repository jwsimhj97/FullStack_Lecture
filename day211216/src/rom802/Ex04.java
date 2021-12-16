package rom802;

class Lec04{
	public int su1=1111;
	public int su2=1112;
	
	public void func01(){
		System.out.println("부모클래스의 기능1");
	}
	public void func03(){
		System.out.println("부모클래스의 기능3");
	}
}
public class Ex04 extends Lec04 {
	public int su1=2222;
//	public int su2=3333;
	
	public void func01(){
		System.out.println("자식클래스의 기능1");
	}
	public void func02(){
		System.out.println("자식클래스의 기능2");
	}
	
	public static void main(String[] args) {
		// 다형성
		Lec04 var1=new Lec04();
		System.out.println(var1.su1);
		var1.func01();

		Ex04 var2=new Ex04();
		System.out.println(var2.su1);
		System.out.println(var2.su2);
		var2.func01();
		var2.func02();
		var2.func03();		// 여기까진 알고 있는 내용
		
		Lec04 var3=new Ex04();		// 타입은 부모의 타입인데 객체는 자식의 객체로 생성
		var3=new Lec04();
		var3=new Ex04();
//		Ex04 me=new Lec04();	// 자식은 부모를 못받음
		
		System.out.println("--------------------------");
		System.out.println(var3.su1);	// 얘는 부모의 타입의 변수로 나온다 (왜냐면 타입이 Lec04니까)
										// 오버라이드의 대상은 메서드기 때문에 (얘는 변수, 필드임) 얘는 오버라이드의 대상이 아니다
		var3.func01();
//		var3.func02();	// 현재 부모클래스인 Lec04 자료형에 담겨 있기 때문에 호출 불가
		var3.func03();
		// 주입된 객체는 Ex04니까 덮어쓴(오버라이드) 기능은 수행 된다
		// 부모 클래스에 덮어쓴 효과
	}

}
