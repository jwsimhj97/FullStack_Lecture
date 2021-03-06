package com.rom802;

abstract class Machine{
	void on(){
		System.out.println("켜다");
	}
	void off(){
		System.out.println("끄다");
	}
	abstract void work();
}

class Tv extends Machine{
	void work(){
		System.out.println("방송을 보여주다");
	}
}

class Radio extends Machine{
	void work(){
		System.out.println("방송을 들려주다");
	}
}

class Audio extends Machine{
	void work(){
		System.out.println("음악을 들려주다");
	}
}


public class Ex02 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		Machine remote=null;	// 다이소에서 파는 만능 리모컨이 목표
		while(true){
			System.out.print("1.tv 2.radio 3.audio 0.종료 >");
			String input=sc.nextLine();
			if(input.equals("1")){
				remote=new Tv();
			}else if(input.equals("2")){
				remote=new Radio();
			}else if(input.equals("3")){
				remote=new Audio();		// 이 부분을 remote=new Machine();로 쓸 수도 있을 거 아냐. 하지만 Machine은 상속을 통해 쓰라고 만든 클래스인걸? 그 때 추상 키워드 사용
										// 그래서 Machine을 추상 클래스로 만들었는데
										// audio에서 실수로 work 메서드를 오버라이딩 안하고 빼먹을 수도 있잖아
										// 그럴 때 오버라이딩의 강제성을 부여하는 것이 추상 메서드
			}else if(input.equals("0")){
				break;
			}
			remote.on();
			remote.work();
			remote.off();
		}

	}

}
