package com.rom802;

public class Ex04 {

	public static void main(String[] args) {
		
		boolean re=false;
		
		int kor, eng, math;
		kor = 96;
		eng = 69;
		math = 1;
		
		int sum = kor+eng+math;
		double avg = sum*100/3/100.0;
		
		char score;
		
		if (avg >= 90) {
			score = 'A';
		} else if (avg >= 80) {
			score = 'B';
		} else if (avg >= 70) {
			score = 'C';
		} else if (avg >= 60) {
			score = 'D';
		} else {
			score = 'F';
			re = true;
		}
		
		String result = "";
		String bar = "-----------------------------------------------------";
		
		result += bar+"\n";
		result += "����:"+kor+"\t\t"+"| ����:"+eng+"\t\t"+"| ����:"+math+"\n";
		result += bar+"\n";
		result += "�հ�:"+sum+"\n";
		result += "���:"+avg+"	(�Ҽ���°�ڸ����� ���)"+"\n";
		result += bar+"\n";
		result += "����:"+score+"\n";
		
		if (re) result += "\t������ϼ���\n";
		System.out.println(result);
	}
}