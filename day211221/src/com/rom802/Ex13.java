package com.rom802;

public class Ex13 {
	int su=1234;
	
	public static void main(String[] args) {
		// 자바 리플렉션
		Ex13 me=new Ex13();
		System.out.println(me.su);
		// 리플렉션을 이용해서 객체를 찍어볼게요. 생성자 말고
		
		// 클래스에 대한 정보 필요
		String info="com.rom802.Ex12";		// 근데 이건 그냥 문자열인데 이걸 이용해서
		try {
			Class cls=Class.forName(info);	// 익셉션은 트라이캐치 할게요
			Object obj=cls.newInstance();
			Ex13 me2=(Ex13)obj;
			System.out.println(cls.newInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
