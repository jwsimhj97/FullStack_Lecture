package com.rom802;

public class Ex02 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("�л������������α׷� (ver0.3.0)");
		System.out.print("�ѿ� >");
		String input = sc.nextLine();
		int tot=changeSu(input);		//	 �ѿ��� ���� �޴´� (���ڱ� �ٲ��� �����ϱ�)
		int[] kor = new int[tot]; int[] eng = new int[tot]; int[] math =new int[tot];
		boolean boo = true;
		int cnt=0;
		while (boo) {
			System.out.print("1.�Է� 2.���� 0.���� >");
			input=sc.nextLine();
			int su = changeSu(input);
			if (su==0) {
				boo=false;
			} else if (su==1 && cnt != tot) { // �Է�
				kor[cnt] = inputSu("���� >");
				eng[cnt] = inputSu("���� >");
				math[cnt] = inputSu("���� >");
				cnt++;		// �̰Ͱ� ����
			} else if (su==1) {	// (su==1 && cnt==tot) �� ����  // ������ �̹� �� �� �ڿ������� �ɷ������ϱ� (������)
				// 31�� ������ 20�� ���ΰ� ������ �ٲ�� �ȵ�
				System.out.println("�� �̻� �Է��� �л��� �����ϴ�");
			} else if (su==2) { // ���
				System.out.println("-------------------------------------------");
				System.out.println("����\t����\t����");
				System.out.println("-------------------------------------------");
				for (int i=0; i<tot; i++) {					
					System.out.println(kor[i]+"\t|"+eng[i]+"\t|"+math[i]);
				}
				System.out.println("-------------------------------------------");
			} else {
				System.out.println("�Է��� �߸��Ǿ����ϴ�");
			}
		}
	}
	
	public static int changeSu(String msg) { // ���ڿ��� ���ڷ� �ٲ��ִ� ���
		int su=Integer.parseInt(msg);
		return su;
	}
	
	// ���ȭ
	public static int inputSu(String title) {	// ���� ���ڿ��� ���ڷ� �ٲ��ִ� ���
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print(title);
		String msg=sc.nextLine();
		int su=changeSu(msg);
		boolean boo=true;
		
		// ������ ������ 0 ~ 100 ������ ���� ����
		while (boo) {
			if (su<0 || su>100) {
				System.out.print("�Է��� ���� " + su +", 0~100 ������ ���� �Է����ּ���\n ���Է� >");
				msg=sc.nextLine();
				su=changeSu(msg);
			} else {
				boo=false;
			}
		}
		return su;
	}
}