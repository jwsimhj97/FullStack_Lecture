package com.hi;

public class Ex05 {

	public static void func01() {
		System.out.println("Ex05.func01 start");
		func02();
		System.out.println("Ex05.func01 end");
		return ; // �����Ǿ� ����
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		
		
		func01();
		
		if (1+2>0) {
			return ;		// ���ᰡ �ȴ�
		}
		
		System.out.println("main end");
	}
	
	public static void func02() {
		System.out.println("func02()");
	}

}