package com.rom802;

public class Ex05 {

	public static void main(String[] args) {
		String msg="";
		
		for (int backNum=1; backNum<=9; backNum++) {
			for (int frontNum=2; frontNum<=9; frontNum++) {
				msg+=frontNum + " * " + backNum + " = " + frontNum*backNum + "\t";
			}
			msg+="\n";
		}
		System.out.println(msg);
	}
}

// 이건 사실 구구단 문제가 아니다