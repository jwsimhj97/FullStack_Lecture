package com.rom802;

interface Remote{
	void on();
	void off();
	void work();
}

class Tv implements Remote{
	public void on(){
		System.out.println("tv�� �Ѵ�");
	}
	public void off(){
		System.out.println("tv�� ����");
	}
	public void work(){
		System.out.println("���ȭ���� �����ִ�");
	}
}

class Radio implements Remote{
	public void on(){
		System.out.println("������ �Ѵ�");
	}
	public void off(){
		System.out.println("������ ����");
	}
	public void work(){
		System.out.println("����� ����ִ�");
	}
}





public class Ex14 {

	public static void main(String[] args) throws Exception{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		Remote remote=null;
		while(true){
			System.out.print("����:exit >");
			input=sc.nextLine();
			if(input.equals("exit")){
				break;
			}
			
//				remote=new Tv();		// ������ �̷� ������ ��ü�� ������µ�...
			Class cls=Class.forName(input);
			remote=(Remote)(cls.newInstance()); // �� method���� throw�� �ϰ� �����ϱ� �ͼ����� �޴� ��
													// �׷��� ȣ�� �� ��(main)���� ĳġ�� �ϵ� �ƴϸ�
													// ������ ��������
													// ���⼭�� ��ü �����̳� ��ü�� ��ã���� �׷� �ͼ��� ������
													// ������ �ȿ��� catch�� �ϴ� ���� �´°� ������ ������ ������
			remote.on();
			remote.work();
			remote.off();
		}
	}
}