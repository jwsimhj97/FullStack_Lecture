package rom802;

class Lec02{
	public int su1=1111;
	
	public Lec02(){
		System.out.println("부모객체 생성");
	}
	
	public void func01(){
		su1++;
		
		System.out.println("부모 "+su1);
	}
}

public class Ex02 extends Lec02{


	public int su1=2222;		// 부모 것을 상속 받아서 필요가 없는데 만약 나한테도 있다면??
	
	public Ex02(){
		System.out.println("자식 객체 생성");
	}
	
	public void func02(){
		System.out.println("자식");
		func01();
	}
	
	public static void main(String[] args) {
		Ex02 me=new Ex02();
		System.out.println(me.su1);
		me.func01();
		System.out.println(me.su1);	// 상속받은 메서드에 su1++이 되어 있는데 값이 증가하지 않았다
									// 수1이 상속되지 않았다는 뜻 (상속은 됐는데 상속의 효과를 100% 거두지는 못했다)
		
		me.func01();
		System.out.println(me.su1);
	}
	// 근데1112로 증가했다는 말은 있다는 뜻이고
	// 객체가 있다는 뜻
	
}
