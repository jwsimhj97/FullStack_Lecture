package com.rom802;

public class Ex11 {

	public static void main(String[] args) {
		String mgs1="java";
//		StringBuffer msg2="java";	// �̰� ���� "java"�� StringBuffer�� �ƴ϶� String Ŭ�����ݾ�

		StringBuffer msg2=new StringBuffer("java");
		System.out.println(msg2);
//		StringBuffer msg3=msg2+"Web";	// StringBuffer + String Ÿ���̱� ������ ����
		StringBuffer msg3=msg2.append("Web");
		System.out.println(msg3);
		
		System.out.println(msg2);
		
		System.out.println("---------------");
		// ����ִ� ������ 16�̴ϱ�
		
		StringBuffer msg6=new StringBuffer(5);
		for(int i=0; i<27; i++){
			msg6.append("a");
			System.out.println(msg6.capacity());
		}
		
	}

}