package com.rom802;

public class Ex06 {

	public static void main(String[] args) {
		// ���� ����(���ĺ�,�ѱ�,...) Ư������
		char ch1='��';
		Character ch2=new Character(ch1);
		Character ch3=new Character((char)65);

		System.out.println(ch1+"�� �����ڵ��"+Character.isDefined(ch1));
		System.out.println(ch1+"�� �����̳� "+Character.isAlphabetic(ch1));
		System.out.println(ch1+"�� �����̳� "+Character.isLetter(ch1));
		System.out.println(ch1+"�� ���ڳ� "+Character.isDigit(ch1));	// �������� �ƴ��� �˻��� �� �׳� �̰� ��
		System.out.println(ch1+"�� ����� "+Character.isSpace(ch1));
		System.out.println(ch1+"�� whitespace��"+Character.isWhitespace(ch1));
		System.out.println(ch1+"�� �빮�ڳ�"+Character.isUpperCase(ch1));
		System.out.println(ch1+"�� �ҹ��ڳ�"+Character.isLowerCase(ch1));
		
	}

}