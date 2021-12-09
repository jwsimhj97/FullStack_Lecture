package day211209;

public class Ex07 {

	public static int cnt = 0;

	public static int[][] inputScore(String[] score, String[] subject) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		for (int j=0; j<3; j++) {
			System.out.println("학생"+(cnt+1)+"의 "+subject[j]+"점수");
			score[cnt][j] = Integer.parseInt(sc.nextLine());
		}
		return score;
	}
	
	public static void showScore(String intro, int[][] score, String bar) {
		System.out.print(intro);
		for (int i=0; i<3; i++) {
			System.out.print(i+1);
			for (int j=0; j<3; j++) {
				System.out.print("\t"+score[i][j]);
			}
			System.out.println();
		}
		System.out.println(bar);
	}
	
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// 잘못 짠 프로그램 ... (한 명씩 3번 카운팅 해야 함)
		String		input;
		int			menu;
		String[]	subject = new String[]{"국어", "영어", "수학"};		
		int[][]		score = new int[3][3];
		String		bar = "----------------------------------\n";
		String		intro = bar+"번호\t국어\t영어\t수학\n"+bar;
		
		System.out.println("학생성적관리프로그램(ver 0.2.0)\n");
		
		do {
			System.out.println("1.입력(3) 2.출력 0.종료");
			input = sc.nextLine();
			menu = Integer.parseInt(input);
			if (!(menu==0 || menu==1 || menu==2)) {
				System.out.println("1,2,0 중 하나를 입력해주세요");
			} else if (menu==1) {
				if (cnt > 3) {
					System.out.println("over 3");
					continue;
				}
				score = inputScore(score, subject);
				System.out.println("입력이 끝났습니다");
			} else if (menu==2) {
				showScore(intro, score, bar);
			}
			System.out.println();
		} while (menu != 0);
		System.out.println("프로그램 종료");
	}
}
