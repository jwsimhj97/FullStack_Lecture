package com.rom802;

public class Ex06 {

	public static void main(String[] args) {
		int age=20;
		char gender='��';
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("�ֹι�ȣ �˻��");
		System.out.print(">>>");
		String msg="024501-3123456"; //sc.nextLine(); // �������� �Է��� ���Դٴ� ���� ������ ����
		char[] arr=msg.toCharArray();
		//
		
		// �䱸���׿� ���� ���⿡�� �����ϸ� ���α׷� �ϼ� ������ �ȵȴ�
		     
		
		
		// üũ�ؼ� ������ ���⸦ ����
		int year=2000+(arr[0]-'0')*10+(arr[1]-'0');		// ���ǿ� ���� 2000���� �������� 1900���� ��������
		if(arr[7]=='1'||arr[7]=='2'){
			year-=100;
		}
		age=2021-year+1;
//		age-=year-1;	// �ʱⰪ�� 2021���� �ְ� �̷��� �ص� ��
		
		if(arr[7]=='1' || arr [7]=='3'){		// ���� ����ϱ� ��������
			gender='��';
		}else{
			gender='��';
		}
		
		System.out.println("����� "+age+"�� "+gender+"���Դϴ�");
	}

}