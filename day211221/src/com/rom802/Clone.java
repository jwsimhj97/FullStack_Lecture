package com.rom802;

public class Clone{
	
	public static void main(String[] args){
		StringBuffer str=new StringBuffer(5);
		
		str.append("aa");
		System.out.println(str.capacity());
	}
}