package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("가위 바위 보 게임 (ver 0.1.0)");
		System.out.println("게임을 시작합니다");
		
		String[] gbb = {"가위", "바위", "보"};
		int win, lose, draw;
		
		win=0;
		lose=0;
		draw=0;
		
		int input = -1;
		int com;
		
		do {
			System.out.print("1.가위 2.바위 3.보 0.종료 >");
			input = Integer.parseInt(sc.nextLine());
			if (input == 0) {
				break;
			}
			com = (int)(Math.random()*3 + 1);
			
			System.out.println("당신:"+ gbb[input-1] + " 컴:" + gbb[com-1]);
			
			if (input-com == 0) {
				System.out.println("비겼습니다");
				draw++;
			} else if (input-com == 1 || input-com == -2) {
				System.out.println("이겼습니다");
				win++;
			} else {
				System.out.println("졌습니다");
				lose++;
			}
		}
		while (input != 0); 
		
		System.out.println("\n전적 " + win + "승" + draw + "무" + lose + "패");
		System.out.println("\n이용해주셔서 감사합니다");
	}

}
