package com.rom802;

public class Test1 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
	
		System.out.println("�л� ���� ���� ���α׷�");

		String input;
		int tot;
		System.out.print("����>");
		input=sc.nextLine();
		tot=Integer.parseInt(input);

		int[] kor=new int[tot];
		int[] eng=new int[tot];
		int[] math=new int[tot];

		int menu;
		int cnt=0;
		boolean boo=true;
		while (boo) {
			System.out.print("1.�Է� 2.���� 0.���� >");
			input=sc.nextLine();
			menu=Integer.parseInt(input);
			if (menu==0){
				boo=false;
			}else if(menu==1){
				if (cnt<tot){
					System.out.print((cnt+1)+" ����>");
					input=sc.nextLine();
					kor[cnt]=Integer.parseInt(input);
					System.out.print((cnt+1)+" ����>");
					input=sc.nextLine();
					eng[cnt]=Integer.parseInt(input);
					System.out.print((cnt+1)+" ����>");
					input=sc.nextLine();
					math[cnt]=Integer.parseInt(input);
					cnt++;
				}else{
					System.out.println("�Է��� �ʰ��Ǿ����ϴ�.");
				}
			}else if(menu==2){
				System.out.println("--------------------------");
				System.out.println("����\t|����\t|����");
				System.out.println("--------------------------");
				for(int i=0; i<tot; i++){
					System.out.print(math[i]+"\t|"+eng[i]+"\t|"+math[i]);
					System.out.println();
				}
			System.out.println("--------------------------");
			}else{
				System.out.println("0,1,2 �߿��� �Է����ּ���");
			}
		}
		System.out.println("--------------------------");
	}

}
