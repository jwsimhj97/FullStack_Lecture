package com.rom802;

public class Ex13 {
	int su=1234;
	
	public static void main(String[] args) {
		// �ڹ� ���÷���
		Ex13 me=new Ex13();
		System.out.println(me.su);
		// ���÷����� �̿��ؼ� ��ü�� ���Կ�. ������ ����
		
		// Ŭ������ ���� ���� �ʿ�
		String info="com.rom802.Ex13";		// �ٵ� �̰� �׳� ���ڿ��ε� �̰� �̿��ؼ�
		try {
			Class cls=Class.forName(info);	// �ͼ����� Ʈ����ĳġ �ҰԿ�
			Object obj=cls.newInstance();
			Ex13 me2=(Ex13)obj;
			System.out.println(cls.newInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}