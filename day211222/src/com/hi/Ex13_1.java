package com.hi;

import java.util.Scanner;

public class Ex13_1 {

	public static void showMemo(String[] contents){
		System.out.println("--------------------------------");
		System.out.println(" �� ��ȣ\t| ����\t");
		System.out.println("--------------------------------");
		for(int i=0; i<contents.length; i++){
			System.out.print((i+1)+"\t");
			System.out.println(contents[i]);
		}
		System.out.println("--------------------------------");
	}
	
	public static void main(String[] args) {
		final String WRITE="1";
		final String SHOW="2";
		final String DELETE="3";
		final String EXIT="0";
		
		
		Scanner	sc=new Scanner(System.in);
		String	input=null;
		int		cnt=0;
		int		num=0;
		
		String[] contents=new String[1];
		String[] temp=null;
		System.out.println("�޸��� �����(ver 0.1.0)");
		while(true){
			System.out.print("1.�ۼ� 2.���� 3.���� 0.���� >");
			input=sc.nextLine();
			if(input.equals(EXIT)){
				break;
			}
			
			if(input.equals(WRITE)){
				System.out.print(">>");
				input=sc.nextLine();
				temp=contents;
				contents=new String[contents.length+1];
				System.arraycopy(temp, 0, contents, 0, temp.length);
				contents[cnt++]=new String(input);
			}else if(input.equals(SHOW)){
				showMemo(contents);
			}else if(input.equals(DELETE)){
				System.out.print("������ �� ��ȣ >");
				num=Integer.parseInt(sc.nextLine());
				if(num>cnt || num<1){
					System.out.println("�� ��ȣ�� �߸� �Է��Ͽ����ϴ�");
					continue;
				}
				temp=contents;
				contents=new String[contents.length-1];
				int i=0;
				int j=0;
				while(i<cnt-1){
					if(i==num-1){
						j++;
					}
					contents[i]=new String(temp[j]);
					i++;
					j++;
				}
				cnt--;
			}else{
				System.out.println("�Է��� �߸��Ǿ����ϴ�");
			}
		}
		System.out.println("���α׷� ����");
	}

}