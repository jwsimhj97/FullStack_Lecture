package com.rom802;

public class Ex04 {

	public static void main(String[] args) {
		String msg="java  |   web  |db   |framework  |  app";
		String[] arr=msg.split(" ");		// �����ͳ� �ֱ� ���ڿ� ó������ ���� ���
		// �Ű������� '|' �� ���� ���ؼ��� '\\|'�� ����ؾ� ��
		// ���Ⱑ �������� " "�� ������ �� ���ڿ� �迭�� ���̰� �����
		
		for(int i=0; i<arr.length; i++){
//			System.out.println(arr[i]);
		}
		
		String msg1="abf";
		String msg2="abc";
		System.out.println(msg1.compareTo(msg2));	// �����ϳ��ϳ��� ���� 0�̸� �Ѿ�� �ٸ��� ���� // �޶����� �����ϴ� ������ ���̰��� ���� (�󸶳� �ٸ� �� ����)
		// ������ �ٸ���, �󸶳� �ٸ��� �� �� �ִ� (���ڿ� �񱳿��� �����ڵ��� ��ȣ��)
		System.out.println(func(msg1,msg2));
		
	}
	
	public static int func(String a, String b){
		if(a.length()==b.length()){
			char[] arr1=a.toCharArray();
			char[] arr2=b.toCharArray();
			for(int i=0; i<a.length(); i++){
				if(arr1[i]-arr2[i]!=0){
					return arr1[i]-arr2[i];
				}
			}
			return 0;
		}else{
			return a.length()-b.length();
		}
	}
	
}