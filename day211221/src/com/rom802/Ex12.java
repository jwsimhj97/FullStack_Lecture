package com.rom802;

public class Ex12 {

	public static void main(String[] args) {
		// crud (Create, Read, Update, Delete)
		
		StringBuffer msg=new StringBuffer("abcd");
		System.out.println(msg.append("efg"));
		System.out.println(msg.insert(3, "abc"));
		System.out.println(msg.replace(3, 6, "123"));
		System.out.println(msg.delete(3, 6));
		System.out.println(msg);
	}

}
