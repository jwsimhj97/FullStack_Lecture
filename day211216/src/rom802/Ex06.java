package rom802;

class Lec06{
	public int su=1111;
	
	public Lec06(){
		super();		// 여기는 사실 Object객체의 default 생성자를 호출하는 것이 생략되어 있음
		System.out.println("부모생성");
	}
	public void func(){
		System.out.println("부모클래스의 기능");
	}
}

public class Ex06 extends Lec06{
	public int su=2222;
	
	public Ex06(){
		super();
		System.out.println("자식 생성");
	}
	
	public Ex06(int a){
		this("");
		System.out.println("자식 생성2");
	}
	
	public Ex06(String a){
		super();
		System.out.println("자식 생성3");
	}
	
	public void func(){
		super.func();
		System.out.println("자식클래스의 기능 "+super.su);
	}
	
	public static void main(String[] args) {
		Ex06 me = new Ex06();
		me.func();
		
		
	}

}
