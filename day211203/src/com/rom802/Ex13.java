package com.rom802;

public class Ex13 {

	public static void main(String[] args) {
		// �л��������� ���α׷�(ver 0.0.1)
		// kor96, eng=69, math=73
		// �հ� ��� ����
		// ������ ��հ�	90�̻� A����
		//					80�̻� B
		//					70�̻� C
		//					60�̸� F ("������ϼ���" ���)
		
		// ---------------------------------------------
		// ����:96		| ����:69		| ����:73
		// ---------------------------------------------
		// �հ�:0000
		// ���:00.00		(�Ҽ���°¥������ ���)
		// ---------------------------------------------
		// ����:F
		//		������ϼ���
		
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
		
		
//if-else ����
		
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
		
		
//switch-case ����
		
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
		System.out.println("����:"+kor+"\t\t| ����:"+eng+"\t\t| ����:"+math);
		System.out.println("--------------------------------------------------------");
		System.out.println("�հ�:"+sum);
		System.out.println("���:"+avg);
		System.out.println("--------------------------------------------------------");
		System.out.println("����:"+score);
		if (retake) {
			System.out.println("������ϼ���");			
		}
	}

}