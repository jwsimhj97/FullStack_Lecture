package com.hi;

import java.io.FileNotFoundException;

public class Ex08 {

	public static void main(String[] args) throws FileNotFoundException{
		//
		java.util.Scanner sc=null;
//		sc=new java.util.Scanner(System.in);
		sc=new java.util.Scanner("11 11\n한글\n2222\n한글2");
//		System.out.println(sc.next());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine()+1);
//		System.out.println(sc.nextInt()+1);
	
		// 숫자와 문자를 받으려면
//		System.out.println(sc.nextInt());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextInt());
//		System.out.println(sc.nextLine());
		// 이렇게 하면 될 것 같지만 문제가 생긴다
		
//		while(sc.hasNext()){
//			System.out.print(sc.nextLine());
//		}
		
		System.out.println(args.length);
	}

}
