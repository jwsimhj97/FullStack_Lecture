package com.hi;

class Outter04{
	public static int su1=1111;
	public int su2=2222;
	
	public Outter04(){
		
	}
	
	public static void func01(){
//		Inner04 inn=new Inner04();
		Outter04 outt=new Outter04();
		Inner04 inn=outt.new Inner04();	// ���⼭�� �� ���̴ϱ� outt.Inner04��� ������
		System.out.println(inn.su2);	// 4444
	}
	public void func02(){
		Inner04 inn=new Inner04();		// non static�̴ϱ� ���� ����
		System.out.println(inn.su2);	// 4444
	}
	
	//non-static
	class Inner04{
		public static final int su3=3333;
		public int su2=4444;
		
		public Inner04(){}
		
//		public static void func03(){}
		
		public void func04(){
			System.out.println(su1);	//Outter04 ��������
			System.out.println(su2);	// ��ӿ����� super������ ������ ���������� ���⼭�� outter�� ������ �Ұ����ϴ�
										// (���� ���� �װ� ���ο� ��ü��)
										// �׷��� ��ǻ� �ʵ嵵 �������̵� �Ǵ� �������� ���� ��(������ �׷� ���� �ƴ϶� �׷� ȿ��)
										// �ٵ� �ʵ���� ��ġ�� ������ ����� ����
//			Outter04 abc=new Outter04();
			// �̷��� ������ �ٱ��ʿ� �ִ� Outter04 Ŭ�����ʹ� �ٸ�
			
			// ���� Ŭ���� ��ü�� �����ϴ� ���� �̹� �� ���� OutterŬ������ ������ �ִ� ���´ϱ� �翬�� ����
			
			// outter�� �θ� Ŭ������� �����ϸ�
			// �θ�ü�� �ڵ����� �̸� super�� �����ϱ� �θ��� ��ü�� �ڵ����� ���ٰ���(����� �޾Ƶ� �Ⱥ������� �ִٰ� �ϴϱ� �ִ��� �˰� ���)
			// �� ���ó�� ����� �ƴѵ��� ����� ȿ���� �ް� �ִ�(�ٵ� ���⼭�� �ٱ��� ���̴ϱ� ���̴°� ��)
			// ��ü������ �ͼ����� ���� ���� ��ӹ��� �ʵ�� �޼��尡 �������� �ʴµ� ���ϱ� �󸶳� ����ϰھ�
			// �׷��� �ڹ� ��â�⿡�� ���������� ���� ���
			
			System.out.println(su2);
		}
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Outter04 outt=new Outter04();
		Outter04.Inner04 inn=outt.new Inner04();
		System.out.println();
	}

}