package com.hi;

//interface Interr{
//	void func02();
//}

abstract class Lec07{	// �߻�Ŭ������ ��ü ������ �ȵ����� ��� �޴� �ִ� ��ü ���� ����
	public void func01(){}
	public abstract void func02();
}


//class Lecc05{		// 11. �׷��� �̰͵� ���� �ʿ����
//	public static Inter func(){
		
//		new Local().func02();	// 1.�̷��� ���������� ���� �ʿ䰡 ����
		
		// 2.������ ȣ�� - �� �� ���� ȣ���ϰ� �����µ� ���� Ŭ������ ���� ����
		
//		new (class Local implements Inter{
//			public void func02(){
//				System.out.println("����Ŭ���� ���");
//			}
//		}).func02();	// 3.Ŭ������ Local �ڸ��� Ŭ���� �������Ǹ� ���� ����
		

		// (�� ��ü�� �ϳ��� ���ɹ�)
//		return (new Inter(){		// 9. ���⼭ ������ ���ָ� �ǰ��� �ڿ� funcȣ���ϴ°ŵ� ����� new �տ� ��ȣ ���� �� (
//			public void func02(){
//				System.out.println("����Ŭ���� ���");
//			}
//		});	// 4. �׷��� �̸��̶� class�� implements�� �ʿ������
		 				// 5. �׸��� new�� ������ ���� �ְ�
		 				// 6. �׸��� �����ڸ� �θ��� ()�� Inter �������� ����
		 				// 7. �̰��� �ٷ� �͸� Ŭ����
//	}
//}

public class Ex06_2 {
	
	Inter inter=new Inter(){	// �������̽��� �����ڵ� ���µ� �������̽��� ��ü�� �����ϰ� �ֳ�
		public void func02(){
			System.out.println("�͸�Ŭ���� ��� ����");
		}
	};	// Inter�� ��� �޴� Ŭ�����ε� �̸��� ������ �̸��� ���ݾ�... �̰� �ٷ� �͸� Ŭ����
	

	public static void main(String[] args) {
//		Inter inter=Lecc05.func();
		
		Inter inter=new Inter(){		// 10. �׷��� ���� �������� �ʰ� new�� �׳� ���⼭ �ٷ� ������� �ǰ��� // ���⼭ ���� Inter��ſ� �߻� �޼��带 ��� ���� ���� �ִ� // ��·�� Inter�� �߻� Ŭ������ �����ϱ� �߻� Ŭ���� ��ü(�������̽�)�� ������ ��ó�� �������� ����� �߻� Ŭ����(�������̽�)�� ��ӹ޴� ��ü�� ������ ����
			public void func02(){
				System.out.println("����Ŭ���� ���");
			}
		};
		
		inter.func02();	// 8. ���⼭ �޼��带 ȣ���Ϸ���
	}

}