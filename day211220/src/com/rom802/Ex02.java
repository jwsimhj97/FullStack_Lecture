package com.rom802;

abstract class Machine{
	void on(){
		System.out.println("�Ѵ�");
	}
	void off(){
		System.out.println("����");
	}
	abstract void work();
}

class Tv extends Machine{
	void work(){
		System.out.println("����� �����ִ�");
	}
}

class Radio extends Machine{
	void work(){
		System.out.println("����� ����ִ�");
	}
}

class Audio extends Machine{
	void work(){
		System.out.println("������ ����ִ�");
	}
}


public class Ex02 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		Machine remote=null;	// ���̼ҿ��� �Ĵ� ���� �������� ��ǥ
		while(true){
			System.out.print("1.tv 2.radio 3.audio 0.���� >");
			String input=sc.nextLine();
			if(input.equals("1")){
				remote=new Tv();
			}else if(input.equals("2")){
				remote=new Radio();
			}else if(input.equals("3")){
				remote=new Audio();		// �� �κ��� remote=new Machine();�� �� ���� ���� �� �Ƴ�. ������ Machine�� ����� ���� ����� ���� Ŭ�����ΰ�? �� �� �߻� Ű���� ���
										// �׷��� Machine�� �߻� Ŭ������ ������µ�
										// audio���� �Ǽ��� work �޼��带 �������̵� ���ϰ� ������ ���� ���ݾ�
										// �׷� �� �������̵��� �������� �ο��ϴ� ���� �߻� �޼���
			}else if(input.equals("0")){
				break;
			}
			remote.on();
			remote.work();
			remote.off();
		}

	}

}