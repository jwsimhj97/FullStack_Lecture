package com.rom802;

class Ex33 {
	int a=1111;
//	public Ex33() {}	// �����ڸ� ������ ���� ����, �̷� default �����ڰ� ���� ���� (����� ��� �Ȼ���)
	
	public static void sum(int a, int b) {
		int c = a+b;
	}
}

class Ex333 {		// �����ڰ� ��� �ڵ����� �ִ� (default ������)
	int b=2222;
	
	public Ex333() {
		System.out.println("������ ȣ��");
	}
}

class Ex3333 {
	int c=3333;
	public Ex3333(int su) {		// ������
		c=su;
		System.out.println(c+"�� �Ű��� �޴� ������");
//		return ;
	}
}

public class Ex03 {
	public static void main(String[] args) {	// ���õ� ������ �Ϻθ� ���� �̴ϴ�
		java.io.InputStream is=System.in;		// ��� ���߿� ��d
		java.util.Scanner sc;
		sc=new java.util.Scanner(is);		// �굵 �츮�� ���� �־����� ����� �����ڿ���...!
		
		Ex33 ex33 = new Ex33();
		Ex33 ex34 = new Ex33();
		Ex33 ex35 = new Ex33();
		Ex33 ex36 = new Ex33();
		Ex33 ex37 = new Ex33();
		
//		Ex333 ex333 = new Ex333();		// ���� ������ ���� �� �̷� ������ �ߴµ�...
		Ex333 ex333;	// ���� ������ default ���� null
		ex333 = new Ex333();			// �� �� ���� ���� ���� // new�� ��ü�� ���� �ּҰ��� ��ȯ
					// ���⼭ new ���� Ex333()�� Ŭ������� �� ������ ��Ȯ�ϰԴ� Ŭ������ ��������
		
//		Ex3333 ex3333 = new Ex3333();
		Ex3333 ex3333 = new Ex3333(1234);
	}
}