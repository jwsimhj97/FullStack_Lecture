package day211209;

public class Ex05 {

	public static int c=5;
	public static int d;
	public static String msg;
//	c=1111;						// ������ // �ϰ��� �ϴ� ���� �޼���(���ÿ���)�� ������� (�̷� ���� �Ϸ��� ���ÿ��� ���� �����ؾ� �ϴµ�...)
	
	public static void func01(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void func02() {
		int a=10;
		int b=5;
//		int[] arr = new int[]{a,b};		������ ���� ���� ������ ���� �Ϸ��� �̷� ������ �߾��µ�...
//		return arr;
		
	}
	
	public static void main(String[] args) {
		int a,b;
		int c= 0;
		a=2;
		b=3;
		func01(a, b);
		c=a;
		d=b;
		func02();	// �Ű������� �������� �ʾ������� �����ϴ� ȿ���� ����
		System.out.println(msg);
		System.out.println(c);
	}

}