package rom802;

class Lec06{
	public int su=1111;
	
	public Lec06(){
		super();		// ����� ��� Object��ü�� default �����ڸ� ȣ���ϴ� ���� �����Ǿ� ����
		System.out.println("�θ����");
	}
	public void func(){
		System.out.println("�θ�Ŭ������ ���");
	}
}

public class Ex06 extends Lec06{
	public int su=2222;
	
	public Ex06(){
		super();
		System.out.println("�ڽ� ����");
	}
	
	public Ex06(int a){
		this("");
		System.out.println("�ڽ� ����2");
	}
	
	public Ex06(String a){
		super();
		System.out.println("�ڽ� ����3");
	}
	
	public void func(){
		super.func();
		System.out.println("�ڽ�Ŭ������ ��� "+super.su);
	}
	
	public static void main(String[] args) {
		Ex06 me = new Ex06();
		me.func();
		
		
	}

}