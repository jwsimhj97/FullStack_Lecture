package com.rom802;

public class Ex01 {
	
	public static void main(String[] args) {
		// �л������������α׷� (ver 0.2.1)		// ������ ���� ���� ������ �Ѿ�ٵ���... �׷��� �ϸ� �Ѿ
		// �ѿ�>3
		// 1.�Է� 2.���� 0.����>
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("�л������������α׷� (ver 0.2.1)");
		
		String		input="";
		int			studentNum;
		int			menu;
		int			cnt=0;
		boolean		boo=true;
		
		System.out.print("�ѿ�>");
		studentNum = Integer.parseInt(sc.nextLine());
		
		int[]		kor = new int[studentNum];
		int[]		eng = new int[studentNum];
		int[]		math = new int[studentNum];
		
		
		while (boo) {
			System.out.print("1.�Է� 2.���� 0.���� >");
			input = sc.nextLine();
			menu = Integer.parseInt(input);
			
			if (menu==0) {
				boo=false;
			} else if (menu==1) {
				if (cnt < studentNum) {
					System.out.print((cnt+1) + "�� �л� ����>");
					kor[cnt] = Integer.parseInt(sc.nextLine());
					System.out.print((cnt+1) + "�� �л� ����>");
					eng[cnt] = Integer.parseInt(sc.nextLine());
					System.out.print((cnt+1) + "�� �л� ����>");
					math[cnt] = Integer.parseInt(sc.nextLine());
					cnt++;
				} else {
					System.out.println("�Է��� �������ϴ�");
				}
			} else if (menu==2) {
				System.out.println();
				System.out.println("�Էµ� �ο� "+cnt+"��");
				System.out.println("------------------------------");
				System.out.println("��ȣ\t����\t����\t����");
				for (int i=0; i<studentNum; i++) {
					System.out.println(i+1+"\t"+kor[i]+"\t" +eng[i] +"\t" + math[i]+"\t");
				}
				System.out.println("------------------------------");
			} else {
				System.out.println("�Է��� �߸��Ǿ����ϴ�");
			}
		}
		System.out.println("���α׷� ����");
		
	}
}