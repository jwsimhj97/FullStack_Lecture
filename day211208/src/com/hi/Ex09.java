package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("���� ���� �� ���� (ver 0.1.0)");
		System.out.println("������ �����մϴ�");
		
		String[] gbb = {"����", "����", "��"};	// new String[]{"����", "����", "��"}; ���� ���� (���� �Ҵ��ϴ� �� ����)
		int win, lose, draw;
		
		win=0;
		lose=0;
		draw=0;
		
		int input = -1;
		int com;
		
		do {
			System.out.print("1.���� 2.���� 3.�� 0.���� >");
			input = Integer.parseInt(sc.nextLine());
			if (input == 0) {
				break;
			}
			com = (int)(Math.random()*3 + 1);
			
			System.out.println("���:"+ gbb[input-1] + " ��:" + gbb[com-1]);
			
			if (input-com == 0) {
				System.out.println("�����ϴ�");
				draw++;
			} else if (input-com == 1 || input-com == -2) {
				System.out.println("�̰���ϴ�");
				win++;
			} else {
				System.out.println("�����ϴ�");
				lose++;
			}
		}
		while (input != 0); 
		
		System.out.println("\n���� " + win + "��" + draw + "��" + lose + "��");
		System.out.println("\n�̿����ּż� �����մϴ�");
	}

}