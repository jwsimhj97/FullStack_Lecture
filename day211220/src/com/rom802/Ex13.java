package com.rom802;

class NumException extends Exception{
	NumException(String msg){
		super(msg);
	}
	
	
}

public class Ex13 {

	
	
	public static void main(String[] args) {
		// �ֹι�ȣ Ȯ��(ver 0.2.0)
		//123456-1234567
		System.out.println("�ֹι�ȣ Ȯ��(ver0.2.0)");
		System.out.print("�ֹι�ȣ�� �Է����ּ���(123456-1234567) >");
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String[] 	genderString = {"��","��","��","��"};
		int 		gender;
		int 		year=1900;
		int 		month,day;
		int 		age=0;

		NumException ex=null;
		
		try{
			String 		input=sc.nextLine();
			String num1=input.substring(0,6);
			String num2=input.substring(7,14);
			
			
			// ���� ó��
			
			
			if(input.length()!=14){
				ex=new NumException("���� �ͼ���");
				throw ex;
			}
			
			if(input.charAt(6)!='-'){
				System.out.println("������ ����");
				throw ex;
			}
			
			gender=Integer.parseInt(num2.substring(0,1));
			if(!(gender==1||gender==2||gender==3||gender==4)){
				System.out.println("���� ����");
				throw ex;
			}
			
			month=Integer.parseInt(num1.substring(2,4));
			if(!(month>=1 && month <=12)){
				System.out.println("�� ����");
				throw ex;
			}
			
			day=Integer.parseInt(num1.substring(4,6));
			if (!(day>=1 && day<=31)){
				System.out.println("��¥ ����");
				throw ex;
			}
			
			
			// �ؼ�
			
			
			year+=Integer.parseInt(num1.substring(0,2));
			if(gender=='3' || gender=='4'){
				year+=100;
			}
			age=2021-year+1;
			
			// ���
			System.out.println(age+"�� "+genderString[gender-1]+"���Դϴ�");
		}catch(NumException aa){
			ex.printStackTrace();
		}
	}

	
}