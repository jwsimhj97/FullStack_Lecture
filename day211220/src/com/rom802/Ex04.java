package com.rom802;

interface Inter01{
	int su1=1111;	// static�� �����Ǿ� �ִ�
//	static int su1=1111;	// �̰Ͱ� ������
//	public static int su1=1111;
//	public final static int su1=1111;	// ��� final �� �����Ǿ� �ִ� (Ŭ���� ������ ������ ���ٺ��ϱ�)
	
	public abstract void func01();
	public void func02();	// �߻��� �ƴѰ� �ƴ϶� abstract�� �����Ǿ� �ִ� ���� // ���� �� �� �����ϴ°� �������ϱ�
	void func03();
}

public class Ex04 {

	public static void main(String[] args) {
		System.out.println(Inter01.su1);
	}

}