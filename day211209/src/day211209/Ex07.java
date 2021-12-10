package day211209;

public class Ex07 {

	public static int cnt = 0;

	public static int[][] inputScore(int[][] score, String[] subject) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for (int j=0; j<3; j++) {
			System.out.println("�л�"+(cnt+1)+"�� "+subject[j]+"����");
			score[cnt][j] = Integer.parseInt(sc.nextLine());
		}
		cnt++;
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
		String		input;
		int			menu;
		String[]	subject = new String[]{"����", "����", "����"};		
		String		bar = "----------------------------------\n";
		
		String		intro = bar+"��ȣ\t����\t����\t����\n"+bar;
		int[][]		score = new int[3][3];
		String		outro = ""+bar;
		
		System.out.println("�л������������α׷�(ver 0.2.0)\n");
		
		do {
			System.out.println("1.�Է�(3) 2.��� 0.����");
			input = sc.nextLine();
			menu = Integer.parseInt(input);
			if (!(menu==0 || menu==1 || menu==2)) {
				System.out.println("1,2,0 �� �ϳ��� �Է����ּ���");
			} else if (menu==1) {
				if (!(cnt < 3)) {
					System.out.println("�Է��� �������ϴ�");
					continue;
				}
				score = inputScore(score, subject);
			} else if (menu==2) {
				showScore(intro, score, outro);
			}
			System.out.println();
		} while (menu != 0);
		System.out.println("���α׷� ����");
	}
}