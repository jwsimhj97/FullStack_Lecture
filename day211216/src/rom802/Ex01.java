package rom802;


class Lec01{						// �θ�Ŭ����(super class)
	public static int su1=1111;
	public int su2=2222;
	
	public static void func01(){
		System.out.println("Lec01 static func01()...");
	}
	public void func02(){
		System.out.println("Lec01 non-static func02()...");
	}
	
	
}




public class Ex01 extends Lec01{		// �ڽ�Ŭ����()

	public static void main(String[] args) {
		// ���
		Lec01 you=new Lec01();
		System.out.println(you.su2);
		you.func02();
//		you.func03();	// �θ�� �ڽ� �� �� �� (�ȵ�)
		Lec01.func01();
		
		Ex01 me=new Ex01();
		System.out.println(me.su2);
		me.func02();
		Lec01.func01();
		
		
	}
	
	public void func03(){
		System.out.println("Ex01 func03():"+su2);	// �ڽ��� ��� �����鼭 �θ��� su2(non-static) �޾����ϱ� ���� ����
	}
}