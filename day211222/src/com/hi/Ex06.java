package com.hi;

interface Inter{	// 10.정의가 되어 있어야 호출이 가능할테니까
	void func02();
}

class Lec05{
	public static Inter func01(){ // 편의상 static으로	 // 5. void 자리가 Local이 되어야 겠고
		// 1. 호출되면 여기를 실행하지말고
		class Local implements Inter{	// 11. 그러면 인터페이스를 상속 받고
			public void func02(){
				System.out.println("로컬클래스 기능");
			}
		}
//		Local local=new Local();
//		local.func02();
//		new Local().func02();	// 위 2줄은 이렇게도 표현 가능
		
		return new Local(); // 4. 리턴을 해주려면
		
	}
}

public class Ex06 {

	public static void main(String[] args) {
//		Local local=Lec05.func01(); // 7. 근데 Local의 범위는 func01을 호출한 범위 안인데 여기서는 존재하지가 않는다
		Inter local=Lec05.func01();	// 8. 이렇게 하면 다형성에 의해 받는 것은 해결 되는데 근데 Object에는 func01이 없다(호출 불가)
		// 9. 그러면 그걸 해결하기 위해서는 상속, 인터페이스. 두 가지 방법으로 해결 가능했는데
		local.func02(); // 2. 여기를 할게요
//		.func02();	// 3.이렇게 호출을 해야하는데 이렇게 하기 위해서는
		local.func02();	// 6. 이렇게 하면 되겠죠
		// 12. 이게 함수형 언어에서 말하는 클로저
	}

}
