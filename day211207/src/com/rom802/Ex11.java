package com.rom802;

public class Ex11 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String title="학생성적관리프로그램 (ver 0.1.0)";
		String index = "학번\t|국어\t|영어\t|수학";
		String bar = "--------------------------------";
		
		System.out.println(title);
		
		String[][] score = new String[3][3];
		String[] subject = {"국어", "영어", "수학"};
		
		int n;
		while(true) {	// 종료 미구현
			System.out.print("1.입력 2.리스트 >");
			n = Integer.parseInt(sc.nextLine());
			
			if (n == 1) {
				for (int i=0; i<3; i++) {
					for (int j=0; j<3; j++) {
						System.out.print(i+1+"학번 "+subject[j]+">");
						score[i][j]=sc.nextLine();
					}
				}
			} else if (n == 2) {
				System.out.println(bar);
				System.out.println(index);
				System.out.println(bar);
				
				for(int i=0; i<3; i++) {
					System.out.print(i+1 + "\t");
					for (int j=0; j<3; j++) {
						System.out.print(score[i][j] + '\t');
					}
					System.out.println();
				}
				System.out.println(bar);
			}
		}
	}
}
