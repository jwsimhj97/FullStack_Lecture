package rom802;


// 5. 부모 클래스를 하나 만들어
class Machine{
	public void on(){
		System.out.println("켜다");
	}
	public void off(){
		System.out.println("끄다");
	}
	public void work(){
		System.out.println("어ㅏㄴ녕");
	}
}

class Audio extends Machine{
	public void work(){
		System.out.println("음악을 들려준다");
	}
}

class Tv extends Machine{
//	public void on(){					// 6. 상속 받았으니까 tv랑 radio에서 있을 필요가 없음
//		System.out.println("켜다");
//	}
//	public void off(){
//		System.out.println("끄다");
//	}
	public void work(){					/// 7. 다만 라디오랑 tv는 work가 다르니까 오버라이딩
		System.out.println("영상을 보여준다");
	}
}


class Radio extends Machine{
	public void work(){
		System.out.println("주파수를 잡아서 소리를 들려준다");
	}
}


public class Ex05 {

	public static void main(String[] args) {
		
		

		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("1.tv리모콘 2.radio리모콘 3.audio리모콘 >");
		String input=sc.nextLine();
		
		Machine remote=null;		// 2. 밖에서 선언하면 되는데 문제는 타입이 다르다 
							// 3. 만약 Object 타입으로 선언하면 이 부분이 해결됨
		if(input.equals("1")){
			remote=new Tv();
		}else if(input.equals("2")){	// 1. 켜고 일하고 끄는 동작이 동시에 있으니까 밖으로 빼고 싶은데
			remote=new Radio();
		}else {
			remote=new Audio();
		}
		remote.on();		// 4. 그런데 Object 클래스에는 이 메서드들이 없다 / 그러면 그 클래스를 만들면 되겠지
		remote.work();
		remote.off();
							// 8. 이렇게 하면 tv, 라디오에서 모두 사용 가능 (이게 다형성)
	}

}
