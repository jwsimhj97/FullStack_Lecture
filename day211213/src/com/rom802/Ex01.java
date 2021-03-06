package com.rom802;

public class Ex01 {

	public static int isNum(String str) {		// 아직 사용 안해봄
		if (str.length() == 0) {
			return -1;
		}
		char[] check = str.toCharArray();
		for (int i=0; i<str.length(); i++) {
			if (!(check[i] >= '0' && check[i] <= '9')) {
				return -1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// 학생성적관리프로그램 (ver 0.4.1)
		// 총원:3
		// 1. 입력 2. 보기 0. 종료 >
		////
		// 1. 입력 2. 보기 0. 종료 >a  // 1, 2, 0이 아닌 다른 문자열을 입력했을 때 (입력 받은 것을 먼저 검사하고)
		// 메뉴를 보시고 다시 선택해주세요
		/// 
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String	input=null;
		int		num;
		int		menu;
		int		cnt = 0;
		
		boolean boo = true;
		boolean	inputCheck = false;
		
		while (inputCheck == false) {		
			System.out.print("총원 > ");
			input = sc.nextLine();
			check = input.toCharArray();
			inputCheck = true;
			if (isNum(input)== -1) {
				System.out.println("숫자만 입력해주세요");
				inputCheck = false;
				continue;
			}
		}
		num = Integer.parseInt(input);
		
		int[] kor = new int[num];
		int[] eng = new int[num];
		int[] math = new int[num];
		
		
		while (boo) {
			inputCheck = true;
			System.out.print("1.입력 2.보기 0.종료 >");
			input = sc.nextLine();
			if (isNum(input) == -1) {
				System.out.println("메뉴를 보고 다시 선택해주세요");
				continue;
			}
			menu = Integer.parseInt(input);
			if (menu == 0) {
				boo = false;
			} else if (menu == 1) {
				if (cnt < num) {
					System.out.print("국어 >");
					input = sc.nextLine();
					kor[cnt] = Integer.parseInt(input);
					System.out.print("영어 >");
					input = sc.nextLine();
					eng[cnt] = Integer.parseInt(input);
					System.out.print("수학 >");
					input = sc.nextLine();
					math[cnt] = Integer.parseInt(input);
					cnt++;
				} else {
					System.out.println("입력이 끝났습니다 (입력 인원 초과)");
				}
			} else if (menu == 2) {
				System.out.println("--------------------------------------");
				System.out.println("번호\t|국어\t|영어\t|수학");
				for (int i=0; i<num; i++) {					
					System.out.print((i+1) + "\t" + kor[i] + "\t" + eng[i] + "\t" + math[i] + "\n");
				}
				System.out.println("--------------------------------------");
			} else {
				System.out.println("입력이 잘못되었습니다");
			}
		}
		System.out.println("프로그램 종료");
	}
}
