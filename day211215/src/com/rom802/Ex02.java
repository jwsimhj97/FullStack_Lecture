package com.rom802;

public class Ex02 {

	public static void main(String[] args) {
		String msg="abcdefg";
		
		char ch=msg.charAt(1);
		System.out.println(ch);
		
		String result=msg.concat("ABCD"); // msg+"ABCD"
		System.out.println(result);
		
		System.out.println(msg.indexOf('c'));
		System.out.println(msg.indexOf('a'));	// �ε��� ��������
		System.out.println(msg.indexOf('j'));	// ������ -1 ����
		
		msg="abcdabcd";
		System.out.println(msg.indexOf('c'));	// ���� ó�� ������ �ε��� ��ȣ�� ��ȯ
		System.out.println(msg.indexOf('c',3));	// �ι�° argument�� �˻� ���� ��ġ
		System.out.println(msg.indexOf("cd"));	// �굵 �ι�° argument�� �˻� ���� ��ġ�� ���� �� �� ����
		System.out.println(msg.indexOf("cd",2));
		
		for(int i=0; i<msg.length(); i++){
			System.out.print(msg.charAt(i));
		}
		System.out.println();
		
		String result3=msg.replace('d','D');
		System.out.println(result3);
		
		result3=msg.replace("ab","zz");
		System.out.println(result3);
		
		msg="cadjfkenaca";
		String result4=msg.replace("ca", "cABa");	// �̷��� ���̿� ������ ���� ������ ca�� ��������...?
		System.out.println(result4);
		String result5=msg.replace("cABadjf", "cABa");	// �̷��� �ϸ� �ǰ���
		System.out.println(result5);
		String result6=msg.replace("cad", "cd");		// �̷� ������ Ȱ���ϸ� ����� �͵� ����
		System.out.println(result6);
		// replace�ε� ���� ���� �� �� �ִ�
		// �� ������ �ϸ� CRUD�� ����
		
		msg="abcdefg";
		String result7=msg.substring(2);
		System.out.println(result7);
		
		String result8=msg.substring(2,5);
		System.out.println(result8+" 8");
		
		System.out.println(msg.toString()+" toString");
		
		System.out.println(String.valueOf(new char[]{'a','b'}));
	}

}