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
		result += "국어:"+kor+"\t\t"+"| 영어:"+eng+"\t\t"+"| 수학:"+math+"\n";
		result += bar+"\n";
		result += "합계:"+sum+"\n";
		result += "평균:"+avg+"	(소수둘째자리까지 출력)"+"\n";
		result += bar+"\n";
		result += "학점:"+score+"\n";
		
		if (re) result += "\t재수강하세요\n";
		System.out.println(result);
	}
}
