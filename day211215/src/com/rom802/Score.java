package com.rom802;

public class Score {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String data="";
		String input=null;
		
		while (true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����");
			input=sc.nextLine();
			if(input.equals("0")){
				System.out.println("�̿����ּż� �����մϴ�");
				return;
			}
			if(input.equals("1")){	// ����
				System.out.print(data);
			}else if(input.equals("2")){	// �Է�
				System.out.print("�й�>");
				data+=sc.nextLine()+" ";
				System.out.print("�̸�>");
				data+=sc.nextLine()+" ";
				System.out.print("����>");
				data+=sc.nextLine()+" ";
				System.out.print("����>");
				data+=sc.nextLine()+" ";
				System.out.print("����>");
				data+=sc.nextLine()+" ";
				data+='\n';
			}else if(input.equals("3")){	// ����
				
			}else if(input.equals("4")){	// ����
				
			}else{
				System.out.println("�Է��� �߸��Ǿ����ϴ�");
			}
		}
	}

}