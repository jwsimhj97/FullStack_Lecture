package com.rom802;

public class Ex05 {

	public static void main(String[] args) {
		// 1. �ϴ� �׳� �غ���
		// 2. �ڷ����� �츮�� �й��� �ߺ����� �ƴ��� �˼� ����
		// 3. ������ ��������
		//�Է��� �ϸ� ����
		//����� �ϸ� ���
		
		// �л������������α׷�(ver 0.6.0)
		// 1.���� 2.�Է� 3.���� 4.���� 0.����
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		final String showScore="1";
		final String inputScore="2";
		final String delScore="3";
		final String reScore="4";
		
		String[] dataName={"�й�","�̸�","����","����","����"};
		String	data="";
		String	input="";
		String	menu;
		
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>");
			menu=sc.nextLine();
			if(menu.equals("0")){
				System.out.println("�̿����ּż� �����մϴ�");
				return ;
			}else if(menu.equals(showScore)){
				System.out.println("----------------------------------------");
				System.out.println("|�й�\t|�̸�\t|����\t|����\t|����");
				System.out.println("----------------------------------------");
				System.out.print(data);
				System.out.println("----------------------------------------");
			}else if(menu.equals(inputScore)){
				for(int i=0; i<dataName.length; i++){
					System.out.print(dataName[i]+">");
					input+="|"+sc.nextLine()+"\t";
				}
				input+="\n";
				data+=input;
			}else if(menu.equals(delScore)){
				System.out.print("������ �й�>");		// �Ǵµ� �ϰ����� ��� �̻�����
				input=sc.nextLine();
				data=data.substring(data.indexOf("\n"));
			}else if(menu.equals(reScore)){
				System.out.print("������ �й�>");		// �ݸ� ��
				input+=sc.nextLine();
				data=data.substring(data.indexOf("\n"));
				input+="|"+input+"\t";
				for(int i=1; i<dataName.length; i++){
					System.out.print(dataName[i]+">");
					input+="|"+sc.nextLine()+"\t";
				}
				input+="\n";
				data+=input;
			}else{
				System.out.println("�Է��� �߸��Ǿ����ϴ�");
			}
		}
	}

}