package com.rom802;

public class Ex03 {

	public static void main(String[] args) {
		String msg1="abcd";
		String msg2="abcdEab23cdef";
		String msg3="";
		
		System.out.println(msg1.contains("bc"));
		System.out.println(msg1.startsWith("ab"));
		System.out.println(msg1.endsWith("cde"));
		
		System.out.println(msg3.length()==0);
		System.out.println(msg3.isEmpty());
		
		System.out.println(msg2.lastIndexOf("dea",3));  // -1�� ���� ������ indexOf�� ��� ȣ���ϴ� ����
		
		System.out.println(msg2.toUpperCase());		// �� ���� ��
		System.out.println(msg2.toLowerCase());		// ���� ��� ���ۿ� "JAVA", "java" �˻��� ������ ��� ����
		
		String msg5="           java web framework          db     ";
		System.out.println(">>>"+msg5+"<<<");
		System.out.println(">>>"+msg5.trim()+"<<<");
		
		
		System.out.println(msg5.hashCode());	
		Ex03 me=new Ex03();
		System.out.println(me);		// ������ ���ڰ� me�� �ؽ��ڵ� ��
		// �ٵ� String ��ü�� ����ϸ� ������ �����ݾ�? �� �� ���� ���� ���� ����ϰ� ���� �� ���
	}

}
