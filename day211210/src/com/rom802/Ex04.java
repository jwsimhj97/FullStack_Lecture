package com.rom802;

public class Ex04 {

	public int su;
	public int suu;
	public final int su3=4321;
	public static final int su5=5555;
//	public static final int su6;	// ���� ���ٲٴµ� field�� ����Ʈ ���� ������ ������ �ʱ�ȭ�� ���ϸ� ������
	
	public Ex04(int su2) {
		su=su2;
		suu=su2;	//�̰� ������		// 6���ٵ� �ʱ�ȭ�� �̰Ͱ� �ʱ�ȯ�� � �ʱ�ȭ��? �����ڰ� �켱
		System.out.println(su);
	}
	
	public static void main(String[] args) {
		final int su4;	// ������ ���� (����� ����)
		su4=4444;		// ������ �ʱ�ȭ
//		su4=5555;		// ���� �ٲٷ��� �ϸ� �ȹٲ� (final�� ���� �ٲ��� ���ϴ� ������ ����� Ű����)
		
		Ex04 me=new Ex04(1234);
		System.out.println(me.su);
		System.out.println(me.su3);
		me.su3=54321;
//		su5=6666;
		
	}
}