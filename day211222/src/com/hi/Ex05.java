package com.hi;

class Outter05{
	public static int su1=1111;
	public int su2=2222;

	public Outter05(){}
	
	public static void func01(){	// �޼��� �ȿ� Ŭ����
		int su5=5555;	// ��� final�̴�
		class Inner05{
			public static final int su3=3333;
			public int su4=4444;
			public Inner05(){}
			public void func03(){
				System.out.println(su5);
			}
		}
//		su5++;	// �̷��� �ϸ� final�� �ƴ� ������ �ִ� ���̴ϱ� ���� �޼����� ���
		System.out.println(Inner05.su3);	// 3333
		Inner05 inn=new Inner05();			// 4444
		System.out.println(inn.su4);
		inn.func03();
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Outter05.func01();
	}

}