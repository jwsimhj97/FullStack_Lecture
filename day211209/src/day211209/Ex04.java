package day211209;

public class Ex04 {
	// Ŭ������ �������
	// 1. �޼���
	// 2. ����

	public static int b=2222;	// static�� ���������� Ŭ�������� Ȥ�� ����������� �θ�
	public int c=3333;			// �޼����� �ۿ��� ����� ������ �������� Ư¡�� �ִ�. ����ʵ�, Ȥ�� �ν��Ͻ� ������� �θ�
	
	public void func01() {
//		System.out.println(a);		// main���� ����� a�� ���⼭ ����
		System.out.println(b);		// Ex04.b �ε� Ex04. �� �����Ǿ� ����
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// ��������
		int a=1234;
		System.out.println(a);

		
		System.out.println(a);
		System.out.println(b);
		
		Ex04 me;
		me = new Ex04();
		System.out.println(me.c);
		me.func01();
		System.out.println(Ex05.c);
		Ex05.c += 1;
		System.out.println(Ex05.c);
		
	}
}