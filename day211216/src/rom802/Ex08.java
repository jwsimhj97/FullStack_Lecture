package rom802;

// final
class Lec08{
	
	public final void func2(){		// �޼����� final
		
	}
}

public class Ex08 extends Lec08{
	public final static int su=1111;
	public final int su2;
	
	public Ex08(int su){
		su2=su;
	}
	
//	public void func2(){		// �������̵� �Ұ� (final�̴ϱ�)
//		int a=2;
//	}
	
	public static void func(final int a){ // ���⼭ final int a�� ���� �����ϴ� ���̴ϱ� final�� �ƴ� �׳� int�� ������ �������
//		a++;	// final�̴ϱ� �ȵ�
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Lec08 tou=new Lec08();
		tou.func2();
		
		Ex08 me=new Ex08(1111);
		me.func2();
		
		
		
		// final
		final int a;
		a=1111;
//		a=2222;
//		su1=2222;
		
		Ex08 me1=new Ex08(1111);
		System.out.print(me1.su2);
		Ex08 me2=new Ex08(2222);
		System.out.println(me2.su2);
		
//		��ü���� �ٸ� ��� ���� ��� �ʵ�� ���� �� �ְԵ�
//		��, �� �̻� ���� �Ұ�
//		final�� ���� ������ ���� �޶�����
		
		func(1111);
		func(2222);
		int c=3;
		func(c);
	}

}