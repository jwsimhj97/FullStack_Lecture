package com.hi;

import java.util.Scanner;

public class Ex13answer {

	public static void main(String[] args) {
		System.out.println("�޸��� �����(ver 0.1.0)");
		Scanner sc=new Scanner(System.in);
		String		input=null;
		String[]	data=new String[0];
		HiList list=new HiList();
		while(true){
			System.out.println("1.�ۼ� 2.���� [3.����] 0.���� >");
			input=sc.nextLine();
			if(input.equals("1")){
				System.out.print(">>");
				input=sc.nextLine();
				list.add(input);
			}else if(input.equals("2")){
				for(int i=0; i<list.size(); i++){
					System.out.println(i+1+"\t"+list.get(i));
				}
			}
		}

	}

}