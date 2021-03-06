package com.rom802;

interface Remote{
	void on();
	void off();
	void work();
}

class Tv implements Remote{
	public void on(){
		System.out.println("tv를 켜다");
	}
	public void off(){
		System.out.println("tv를 끄다");
	}
	public void work(){
		System.out.println("방송화면을 보여주다");
	}
}

class Radio implements Remote{
	public void on(){
		System.out.println("라디오를 켜다");
	}
	public void off(){
		System.out.println("라디오를 끄다");
	}
	public void work(){
		System.out.println("방송을 들려주다");
	}
}





public class Ex14 {

	public static void main(String[] args) throws Exception{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		Remote remote=null;
		while(true){
			System.out.print("종료:exit >");
			input=sc.nextLine();
			if(input.equals("exit")){
				break;
			}
			
//				remote=new Tv();		// 원래는 이런 식으로 객체를 만들었는데...
			Class cls=Class.forName(input);
			remote=(Remote)(cls.newInstance()); // 이 method에서 throw를 하고 있으니까 익셉션을 받는 것
													// 그러면 호출 한 곳(main)에서 캐치를 하든 아니면
													// 밖으로 던지든지
													// 여기서는 객체 생성이나 객체를 못찾든지 그런 익셉션 때문임
													// 원래는 안에서 catch를 하는 것이 맞는게 가독성 때문에 안했음
			remote.on();
			remote.work();
			remote.off();
		}
	}
}
