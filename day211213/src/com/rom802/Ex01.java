package com.rom802;

public class Ex01 {

	public static int isNum(String str) {		// ���� ��� ���غ�
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
		// �л������������α׷� (ver 0.4.1)
		// �ѿ�:3
		// 1. �Է� 2. ���� 0. ���� >
		////
		// 1. �Է� 2. ���� 0. ���� >a  // 1, 2, 0�� �ƴ� �ٸ� ���ڿ��� �Է����� �� (�Է� ���� ���� ���� �˻��ϰ�)
		// �޴��� ���ð� �ٽ� �������ּ���
		/// 
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String	input=null;
		int		num;
		int		menu;
		int		cnt = 0;
		
		boolean boo = true;
		boolean	inputCheck = false;
		
		while (inputCheck == false) {		
			System.out.print("�ѿ� > ");
			input = sc.nextLine();
			check = input.toCharArray();
			inputCheck = true;
			if (isNum(input)== -1) {
				System.out.println("���ڸ� �Է����ּ���");
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
			System.out.print("1.�Է� 2.���� 0.���� >");
			input = sc.nextLine();
			if (isNum(input) == -1) {
				System.out.println("�޴��� ���� �ٽ� �������ּ���");
				continue;
			}
			menu = Integer.parseInt(input);
			if (menu == 0) {
				boo = false;
			} else if (menu == 1) {
				if (cnt < num) {
					System.out.print("���� >");
					input = sc.nextLine();
					kor[cnt] = Integer.parseInt(input);
					System.out.print("���� >");
					input = sc.nextLine();
					eng[cnt] = Integer.parseInt(input);
					System.out.print("���� >");
					input = sc.nextLine();
					math[cnt] = Integer.parseInt(input);
					cnt++;
				} else {
					System.out.println("�Է��� �������ϴ� (�Է� �ο� �ʰ�)");
				}
			} else if (menu == 2) {
				System.out.println("--------------------------------------");
				System.out.println("��ȣ\t|����\t|����\t|����");
				for (int i=0; i<num; i++) {					
					System.out.print((i+1) + "\t" + kor[i] + "\t" + eng[i] + "\t" + math[i] + "\n");
				}
				System.out.println("--------------------------------------");
			} else {
				System.out.println("�Է��� �߸��Ǿ����ϴ�");
			}
		}
		System.out.println("���α׷� ����");
	}
}