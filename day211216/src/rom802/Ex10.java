package rom802;

class Lec10{
	public static int su1=1111;
	static int su2=2222;				// �� ���������� default��� ��
	private static int su3=3333;		// �ش� Ŭ���� ���ο����� ��� ����
	protected static int su4=4444;		// ���� ��Ű�� ���, �ٸ� ��Ű�� �Ұ�
	
	// ���������� (�̱��� ����)
	private static Lec10 me=new Lec10();
	
	private Lec10(){
		
	}
	
	public static Lec10 newInstance(){		// ���� �޼��尡 �����ڸ� ȣ���ؼ� ȣ�� // ���������� ������ ������ �ȵǴϱ� static
		return me;
	}
	
	public static void func(){
		System.out.println(su3);
	}
}
public class Ex10 extends com.test.Ex10{

	public static void main(String[] args) {
		
		Ex10 me=new Ex10();
		System.out.println(me.su1);
//		System.out.println(me.su2);
//		System.out.println(me.su3);
		System.out.println(me.su4);
		System.out.println("---------------------------");
		System.out.println(Lec10.su1);
		System.out.println(Lec10.su2);
//		System.out.println(Lec10.su3);
		
		System.out.println(Lec10.su4);
		
		Lec10.func();
		
		System.out.println("-----------------------");
		System.out.println(com.test.Ex10.su1);
//		System.out.println(com.test.Ex10.su2);
//		System.out.println(com.test.Ex10.su3);
		
//		com.test.Ex10 you = new com.test.Ex10();	// com.test.Ex10 �� �����ڰ� default�� �캯�� ����
		
//		Lec10 you2=new Lec10();		// �����ڰ� private�̱� ������ ����

		Lec10 you2=Lec10.newInstance();
		System.out.println(you2);
		you2=Lec10.newInstance();
		System.out.println(you2);
	}
	

}