package com.hi;

interface Inter{	// 10.���ǰ� �Ǿ� �־�� ȣ���� �������״ϱ�
	void func02();
}

class Lec05{
	public static Inter func01(){ // ���ǻ� static����	 // 5. void �ڸ��� Local�� �Ǿ�� �ڰ�
		// 1. ȣ��Ǹ� ���⸦ ������������
		class Local implements Inter{	// 11. �׷��� �������̽��� ��� �ް�
			public void func02(){
				System.out.println("����Ŭ���� ���");
			}
		}
//		Local local=new Local();
//		local.func02();
//		new Local().func02();	// �� 2���� �̷��Ե� ǥ�� ����
		
		return new Local(); // 4. ������ ���ַ���
		
	}
}

public class Ex06 {

	public static void main(String[] args) {
//		Local local=Lec05.func01(); // 7. �ٵ� Local�� ������ func01�� ȣ���� ���� ���ε� ���⼭�� ���������� �ʴ´�
		Inter local=Lec05.func01();	// 8. �̷��� �ϸ� �������� ���� �޴� ���� �ذ� �Ǵµ� �ٵ� Object���� func01�� ����(ȣ�� �Ұ�)
		// 9. �׷��� �װ� �ذ��ϱ� ���ؼ��� ���, �������̽�. �� ���� ������� �ذ� �����ߴµ�
		local.func02(); // 2. ���⸦ �ҰԿ�
//		.func02();	// 3.�̷��� ȣ���� �ؾ��ϴµ� �̷��� �ϱ� ���ؼ���
		local.func02();	// 6. �̷��� �ϸ� �ǰ���
		// 12. �̰� �Լ��� ���� ���ϴ� Ŭ����
	}

}