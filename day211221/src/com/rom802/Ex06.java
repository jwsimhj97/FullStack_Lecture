package com.rom802;

public class Ex06 {

	public static void main(String[] args) {
		// 숫자 글자(알파벳,한글,...) 특수문자
		char ch1='가';
		Character ch2=new Character(ch1);
		Character ch3=new Character((char)65);

		System.out.println(ch1+"은 유니코드냐"+Character.isDefined(ch1));
		System.out.println(ch1+"은 문자이냐 "+Character.isAlphabetic(ch1));
		System.out.println(ch1+"은 문자이냐 "+Character.isLetter(ch1));
		System.out.println(ch1+"은 숫자냐 "+Character.isDigit(ch1));	// 숫자인지 아닌지 검사할 때 그냥 이거 써
		System.out.println(ch1+"은 띄어쓰기냐 "+Character.isSpace(ch1));
		System.out.println(ch1+"은 whitespace냐"+Character.isWhitespace(ch1));
		System.out.println(ch1+"은 대문자냐"+Character.isUpperCase(ch1));
		System.out.println(ch1+"은 소문자냐"+Character.isLowerCase(ch1));
		
	}

}
