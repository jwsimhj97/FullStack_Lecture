package com.rom802;

public class Ex06 {

	public static void main(String[] args) {
		// 1 user1 1 2 3		// �̷��� 2�� �й��� ã�� �� 1�� �л��� 2���� ã�� �� �ִ�
		// 2 user2 44 55 66		
		// 3 user3 77 88 99
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("�л������������α׷�(ver 0.6.0)");
		String data="";
		String input=null;
		while (true){
			System.out.print("1.���� 2.�Է� 3.���� (4.����) 0.���� >");
			input=sc.nextLine();
			if(input.equals("0")){
				return;
			}
			if(input.equals("1")){
				System.out.println("------------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����");
				System.out.print("------------------------------------------------");
				System.out.println(data);
			}else if(input.equals("2")){
				System.out.print("�й�>");
				data+="\n"+sc.nextLine()+"\t|";
				System.out.print("�̸�>");
				data+=sc.nextLine()+"\t|";
				System.out.print("����>");
				data+=sc.nextLine()+"\t|";
				System.out.print("����>");
				data+=sc.nextLine()+"\t|";
				System.out.print("����>");
				data+=sc.nextLine()+"\t|";
			}else if(input.equals("3")){
				
				// ��� 1
//				System.out.print("������ �й�>");
//				input="\n"+sc.nextLine();
//				int startIdx=data.indexOf(input+"\t");
//				int endIdx=data.indexOf("\n",startIdx+1);
//				String target;
//				if (endIdx==-1){
//					target=data.substring(startIdx);
//				}else{					
//					target=data.substring(startIdx, endIdx);
//				}
//				
//				data=data.replace(target, "");
				
				
				// ���2
				System.out.print("����>");
				input=sc.nextLine();
				String[] arr=data.split("\n");
				
				data="";
				for(int i=0; i<arr.length; i++){
					if(!arr[i].startsWith(input+"\t")){
						data+=arr[i]+"\n";
					}
				}
				
			}else if(input.equals("4")){
				//���1
//				System.out.print("������ �й�>");
//				input="\n"+sc.nextLine()+"\t";				// �й�
//				int startIdx=data.indexOf(input);		// ����� �����ϸ� ���� ���� ������� ���ٵ�...
//				int endIdx=data.indexOf("\n",startIdx+1);	// startIdx�� �ƴ϶� startIdx+1�� ������ startIdx�ڸ��� '\n'�� �����ϱ�
//				// �� �ΰ��� �ε����� Ȱ���ؼ� ������ �ϸ� ������ �Ǵ°Ű�, ""�� �����ϸ� ������ �Ǵ� ����
//				String target;
//				if (endIdx==-1){
//					target=data.substring(startIdx);
//				}else{					
//					target=data.substring(startIdx, endIdx);	// ������ �й��� �Է��ϸ� ������ ������ endIdx�� -1�� �ǰ� ������
//				}
//				// endIdx�� -1�� ���� substring�� ���ڸ� �ϳ��� �Ѱ���
//				System.out.println("�̸�");
//				input+=sc.nextLine()+"\t|";
//				System.out.println("����");
//				input+=sc.nextLine()+"\t|";
//				System.out.println("����");
//				input+=sc.nextLine()+"\t|";
//				System.out.println("����");
//				input+=sc.nextLine()+"\t|";
//				
//				data=data.replace(target, input);
				
				
				
				// ���2
				System.out.print("����>");
				input=sc.nextLine();
				String[] arr=data.split("\n");
				
				data="";
				for(int i=0; i<arr.length; i++){		// �������� �������� �Է��� �ޱ� ������ ���ڿ��� �ִ� �׷���-1����
														// �� �� ������ �ڹٿ����� �������� ������ ���ڿ��� ���� ���� �ȳ���
														// �׷��� for�� ���ǿ��� length-1�� �ϸ� �ȵȴ�
					if(!arr[i].startsWith(input+"\t")){
						data+=arr[i]+"\n";
					}else{
						System.out.println("�̸�");
						input+=sc.nextLine()+"\t|";
						System.out.println("����");
						input+=sc.nextLine()+"\t|";
						System.out.println("����");
						input+=sc.nextLine()+"\t|";
						System.out.println("����");
						input+=sc.nextLine()+"\t|";
						data+=arr[i]+"\n";
					}
				}
				
			}
		}
	}
	
}