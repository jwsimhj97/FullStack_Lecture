package com.rom802;

public class Ex01 {

	public static void main(String[] args) {
		// ���ڿ�
		String st1=null;	// st1�� ��ü�� �ϳ��� �� ������ (����Ű�� ��ü�� ���ٴ� ��)
//		st1.equals("");	//�̷��� ���� ������ NullPointerException
		st1="";	// ������ ���� ���ڿ��� ����. ���ʹ� �ǹ̰� ������ �ٸ���
		st1.equals("");
		String st2=new String("java");		// ��ü�� �����ؼ� ���� (�� ���ڿ�)
		
		
		char[] arr1=st2.toCharArray();	// ���� �迭�� �и��� ���� �迭�� ���� �������ָ� �װ� ���ڿ��� ����
		String st3=new String(arr1);	// ���絵 ��������
		
		byte[] arr2=st2.getBytes();
		String st4=new String(arr2);
	}
	
}