package com.rom802;

abstract class Lec03{
	public Lec03(int a){
		super();
	}
}

public class Ex03 extends Lec03{

	
	public Ex03(){		// default 생성자의 접근제한자는 public이다 (경험상 다른 패키지에도 됐으니까)
		super(1111);	// 이것도 생략되어 있음
	}
	
	public static void main(String[] args) {
		
	}

}
