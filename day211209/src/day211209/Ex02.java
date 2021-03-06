package day211209;

public class Ex02 {

	public static void func01() {
		System.out.println("static method func01...");
		
	}
	
	public void func02() {		// static 키워드를 뺐는데도 에러는 없음
		System.out.println("non-static method func02..");
	}
	
	public void func03(){
		System.out.println("non-static method func03...");
		func01();
	}
	
	public static void main(String[] args) {
		func01();
		
		System.out.println("\n\n");
		// func02();		// non static method는 바로 실행하면 오류가 생긴다
		Ex02 me=new Ex02();		// 참조변수를 만들어 내는 과정
		me.func02();			// 참조변수.메서드명() 호출
		
		Ex02 me2=new Ex02();
		me2.func03();
		me2.func02();
		
		System.out.println("\n\n");
		func01();
		
		System.out.println(me);
		System.out.println(me2);
	}
}
