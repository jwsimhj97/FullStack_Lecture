package rom802;

public class Ex03 extends java.lang.Object {

	public static void main(String[] args) {
		Ex03 me = new Ex03();
		System.out.println(me); // �ڵ����� toString ȣ��
		System.out.println(me.toString());
		System.out.println(me.hashCode());
		
		// Ex03�� �ƹ� �޼��嵵 ���µ� �޼������ ��� �����ϴ�
		// java.lang.Object�� �ڵ����� ��ӹ���
		// �ڽ� Ŭ������ �ְ� �ű⼭ objectŬ������ ��ӹ��� �ʴ���
		// �θ� objectŬ������ ��ӹް��ִ�
	}
	
	public String toString(){
		return "������";
	}
}