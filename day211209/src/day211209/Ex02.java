package day211209;

public class Ex02 {

	public static void func01() {
		System.out.println("static method func01...");
		
	}
	
	public void func02() {		// static Ű���带 ���µ��� ������ ����
		System.out.println("non-static method func02..");
	}
	
	public void func03(){
		System.out.println("non-static method func03...");
		func01();
	}
	
	public static void main(String[] args) {
		func01();
		
		System.out.println("\n\n");
		// func02();		// non static method�� �ٷ� �����ϸ� ������ �����
		Ex02 me=new Ex02();		// ���������� ����� ���� ����
		me.func02();			// ��������.�޼����() ȣ��
		
		Ex02 me2=new Ex02();
		me2.func03();
		me2.func02();
		
		System.out.println("\n\n");
		func01();
		
		System.out.println(me);
		System.out.println(me2);
	}
}