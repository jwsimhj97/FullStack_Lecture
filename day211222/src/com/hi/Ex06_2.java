package com.hi;

//interface Interr{
//	void func02();
//}

abstract class Lec07{	// 추상클래스는 객체 생성이 안되지만 상속 받는 애는 객체 생성 가능
	public void func01(){}
	public abstract void func02();
}


//class Lecc05{		// 11. 그러면 이것도 굳이 필요없고
//	public static Inter func(){
		
//		new Local().func02();	// 1.이러면 참조변수를 만들 필요가 없죠
		
		// 2.생성자 호출 - 한 번 쓰고 호출하고 버리는데 굳이 클래스를 따로 정의
		
//		new (class Local implements Inter{
//			public void func02(){
//				System.out.println("로컬클래스 기능");
//			}
//		}).func02();	// 3.클래스명 Local 자리에 클래스 선언정의를 갖다 붙임
		

		// (이 자체가 하나의 명령문)
//		return (new Inter(){		// 9. 여기서 리턴을 해주면 되겠지 뒤에 func호출하는거도 지우고 new 앞에 괄호 빼도 됨 (
//			public void func02(){
//				System.out.println("로컬클래스 기능");
//			}
//		});	// 4. 그러면 이름이랑 class와 implements도 필요없겠지
		 				// 5. 그리고 new를 안으로 집어 넣고
		 				// 6. 그리고 생성자를 부르는 ()도 Inter 다음으로 넣음
		 				// 7. 이것이 바로 익명 클래스
//	}
//}

public class Ex06_2 {
	
	Inter inter=new Inter(){	// 인터페이스는 생성자도 없는데 인터페이스로 객체를 생성하고 있네
		public void func02(){
			System.out.println("익명클래스 사용 가능");
		}
	};	// Inter를 상속 받는 클래스인데 이름을 지워서 이름이 없잖아... 이게 바로 익명 클래스
	

	public static void main(String[] args) {
//		Inter inter=Lecc05.func();
		
		Inter inter=new Inter(){		// 10. 그러면 굳이 리턴하지 않고 new를 그냥 여기서 바로 줘버려도 되겠지 // 여기서 만약 Inter대신에 추상 메서드를 상속 받을 수도 있다 // 어쨌든 Inter나 추상 클래스가 나오니까 추상 클래스 객체(인터페이스)를 생성한 것처럼 보이지만 사실은 추상 클래스(인터페이스)를 상속받는 객체를 생성한 것임
			public void func02(){
				System.out.println("로컬클래스 기능");
			}
		};
		
		inter.func02();	// 8. 여기서 메서드를 호출하려면
	}

}
