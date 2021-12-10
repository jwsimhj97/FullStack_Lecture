package com.rom802;

public class Ex01 {
	
	public static void main(String[] args) {
		// 학생성적관리프로그램 (ver 0.2.1)		// 메이저 버전 업은 웹으로 넘어간다든지... 그런걸 하면 넘어감
		// 총원>3
		// 1.입력 2.보기 0.종료>
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("학생성적관리프로그램 (ver 0.2.1)");
		
		String		input="";
		int			studentNum;
		int			menu;
		int			cnt=0;
		boolean		boo=true;
		
		System.out.print("총원>");
		studentNum = Integer.parseInt(sc.nextLine());
		
		int[]		kor = new int[studentNum];
		int[]		eng = new int[studentNum];
		int[]		math = new int[studentNum];
		
		
		while (boo) {
			System.out.print("1.입력 2.보기 0.종료 >");
			input = sc.nextLine();
			menu = Integer.parseInt(input);
			
			if (menu==0) {
				boo=false;
			} else if (menu==1) {
				if (cnt < studentNum) {
					System.out.print((cnt+1) + "번 학생 국어>");
					kor[cnt] = Integer.parseInt(sc.nextLine());
					System.out.print((cnt+1) + "번 학생 영어>");
					eng[cnt] = Integer.parseInt(sc.nextLine());
					System.out.print((cnt+1) + "번 학생 수학>");
					math[cnt] = Integer.parseInt(sc.nextLine());
					cnt++;
				} else {
					System.out.println("입력이 끝났습니다");
				}
			} else if (menu==2) {
				System.out.println();
				System.out.println("입력된 인원 "+cnt+"명");
				System.out.println("------------------------------");
				System.out.println("번호\t국어\t영어\t수학");
				for (int i=0; i<studentNum; i++) {
					System.out.println(i+1+"\t"+kor[i]+"\t" +eng[i] +"\t" + math[i]+"\t");
				}
				System.out.println("------------------------------");
			} else {
				System.out.println("입력이 잘못되었습니다");
			}
		}
		System.out.println("프로그램 종료");
		
	}
}
