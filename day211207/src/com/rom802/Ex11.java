package com.rom802;

public class Ex11 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("�л������������α׷� (ver 0.1.0)");
		
		String[][] score = new String[3][3];
		String[] subject = {"����", "����", "����"};
		
		int n;
		while(true) {
			System.out.print("1.�Է� 2.����Ʈ >");
			n = Integer.parseInt(sc.nextLine());
			
			if (n == 1) {
				for (int i=0; i<3; i++) {
					for (int j=0; j<3; j++) {
						System.out.print(i+1+"�й� "+subject[j]);
						score[i][j]=sc.nextLine();
					}
				}
			} else if (n == 2) {
				System.out.println("--------------------------------");
				System.out.println("�й�\t|����\t|����\t|����");
				System.out.println("--------------------------------");
				
				for(int i=0; i<3; i++) {
					System.out.print(i+1 + "\t");
					for (int j=0; j<3; j++) {
						System.out.print(score[i][j] + '\t');
					}
					System.out.println();
				}
				System.out.println("--------------------------------");
			}
		}
	}
}