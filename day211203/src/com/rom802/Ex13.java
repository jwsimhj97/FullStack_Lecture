package com.rom802;

public class Ex13 {

	public static void main(String[] args) {
		// 학생성적관리 프로그램(ver 0.0.1)
		// kor96, eng=69, math=73
		// 합계 평균 학점
		// 학점은 평균값	90이상 A학점
		//					80이상 B
		//					70이상 C
		//					60미만 F ("재수강하세요" 출력)
		
		// ---------------------------------------------
		// 국어:96		| 영어:69		| 수학:73
		// ---------------------------------------------
		// 합계:0000
		// 평균:00.00		(소수둘째짜리까지 출력)
		// ---------------------------------------------
		// 학점:F
		//		재수강하세요
		
		int			kor, eng, math;
		char		score;
		boolean		retake;
		
		kor = 96;
		eng = 69;
		math = 73;
		retake = false;
		
		int		sum = kor+eng+math;
		double	avg = sum/3.0;
		avg = (int)(avg * 100) / 100.0;
		
		
//if-else 구문
		
//		if (avg >= 90) {
//			score = 'A'; 
//		} else if (avg >= 80) {
//			score = 'B';
//		} else if (avg >= 70) {
//			score = 'C';
//		} else {
//			score = 'F';
//			retake = true;
//		}
		
		
//switch-case 구문
		
		switch((int)(avg/10)) {
		case 10:
		case 9:
			score = 'A';
			break;
		case 8:
			score = 'B';
			break;
		case 7:
			score = 'C';
			break;
		default:
			score = 'F';
			retake = true;
		}
		
		
		System.out.println("--------------------------------------------------------");
		System.out.println("국어:"+kor+"\t\t| 영어:"+eng+"\t\t| 수학:"+math);
		System.out.println("--------------------------------------------------------");
		System.out.println("합계:"+sum);
		System.out.println("평균:"+avg);
		System.out.println("--------------------------------------------------------");
		System.out.println("학점:"+score);
		if (retake) {
			System.out.println("재수강하세요");			
		}
	}

}
