package rom802;

class Lec04{
	public int su1=1111;
	public int su2=1112;
	
	public void func01(){
		System.out.println("�θ�Ŭ������ ���1");
	}
	public void func03(){
		System.out.println("�θ�Ŭ������ ���3");
	}
}
public class Ex04 extends Lec04 {
	public int su1=2222;
//	public int su2=3333;
	
	public void func01(){
		System.out.println("�ڽ�Ŭ������ ���1");
	}
	public void func02(){
		System.out.println("�ڽ�Ŭ������ ���2");
	}
	
	public static void main(String[] args) {
		// ������
		Lec04 var1=new Lec04();
		System.out.println(var1.su1);
		var1.func01();

		Ex04 var2=new Ex04();
		System.out.println(var2.su1);
		System.out.println(var2.su2);
		var2.func01();
		var2.func02();
		var2.func03();		// ������� �˰� �ִ� ����
		
		Lec04 var3=new Ex04();		// Ÿ���� �θ��� Ÿ���ε� ��ü�� �ڽ��� ��ü�� ����
		var3=new Lec04();
		var3=new Ex04();
//		Ex04 me=new Lec04();	// �ڽ��� �θ� ������
		
		System.out.println("--------------------------");
		System.out.println(var3.su1);	// ��� �θ��� Ÿ���� ������ ���´� (�ֳĸ� Ÿ���� Lec04�ϱ�)
										// �������̵��� ����� �޼���� ������ (��� ����, �ʵ���) ��� �������̵��� ����� �ƴϴ�
		var3.func01();
//		var3.func02();	// ���� �θ�Ŭ������ Lec04 �ڷ����� ��� �ֱ� ������ ȣ�� �Ұ�
		var3.func03();
		// ���Ե� ��ü�� Ex04�ϱ� ���(�������̵�) ����� ���� �ȴ�
		// �θ� Ŭ������ ��� ȿ��
	}

}