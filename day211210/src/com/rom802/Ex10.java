package com.rom802;

public class Ex10 {

	public static void main(String[] args) {
		// ���ڿ� String
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String msg1;
		msg1="java";					// msg1�� �ּҸ� �޴°ǵ� "java"��� ��ü�� �ּҸ� �޾Ҵ�
		System.out.println(msg1);
		msg1="���ڿ�";					// msh1�� "���ڿ�"�̶�� ��ü�� �ּҸ� �޾Ҵ�.
		System.out.println(msg1);
		msg1=new String("java");
		msg1 = new String("");
		System.out.println(msg1);  // null�� �ƴ϶� �� ���ڿ��� ���Դ�
		
		String msg2=new String("java");
		System.out.println(msg1==msg2);
		
		String msg3="java";
		String msg4="java";
		System.out.println(msg3==msg4);
		
//		String msg5=sc.nextLine();
//		System.out.println(msg3==msg5);
		
		System.out.println("aa");
		int a=1;
		System.out.println("java1"=="java"+a);	// ���� �Ұ�
		System.out.println("java1"=="java"+1);	// ��������� �̹� �ż� "java1" �� ����� ��������� �ö󰣴�
	}
}