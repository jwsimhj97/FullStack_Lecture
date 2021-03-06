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
		
		int			kor, eng, math, sum;
		char		score;
		boolean		retake;
		double		avg;
		
		kor = 96;
		eng = 69;
		math = 73;
		retake = false;
		
		sum = kor+eng+math;
	
//		avg = sum/3.0;
//		avg = (int)(avg * 100) / 100.0;
		avg = sum * 100 / 3 / 100.0; // 이렇게 하면 바로 됨 // 100을 먼저 곱하는 것은 중요함 (소수점 두 자리를 살리기 위해 그런 것이니까)
		
		
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
		
		//	만약 분리한다면
		//		if (avg >= 90) {
		//			;
		//		}
		//		if (avg <90 && avg >= 80) {
		//			;		
		//		}
		//		if (avg <80 && avg ?= 70) {
		//			;
		//		}
		//		if (avg < 70) {
		//			;
		//		}
		
		
//switch-case 구문
		
		switch((int)(avg/10)) {		// int가 나와야 하니까 sum을 이용 sum 300~270 A 269~240 B... 이렇게
		case 10:					// 근데 case:300 case:299 case:298 ... 이렇게 하는 건 무식하잖아
		case 9:						// 100~90.0
			score = 'A';			// 89.99~80.0
			break;					// 79.99~70.0
		case 8:						// 69.99~60.0
			score = 'B';
			break;					// 원칙적으로 스위치 문은 할 수 없는 일이지만 이런 식으로 할 수 있음
		case 7:
			score = 'C';
			break;
		default:
			score = 'F';
			retake = true;
		}
		
		
		System.out.println("--------------------------------------------------------");
		System.out.println("국어:"+kor+"\t\t| 영어:"+eng+"\t| 수학:"+math);
		System.out.println("--------------------------------------------------------");
		System.out.println("합계:"+sum); // println("합계:"+(kor+eng+math)); 으로 해도 됨
		System.out.println("평균:"+avg); // println("평균:"+(kor+eng+math)/3.0);
		System.out.println("--------------------------------------------------------");
		System.out.println("학점:"+score);
		if (retake) {
			System.out.println("재수강하세요");
		}
	}
}
