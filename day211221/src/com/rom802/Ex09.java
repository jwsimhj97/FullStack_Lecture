package com.rom802;

public class Ex09 {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		
		for(int i=0; i<100000; i++){	
			Ex09 me1=new Ex09();
			Ex09 me2=new Ex09();
			Ex09 me3=new Ex09();
			Ex09 me4=new Ex09();
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		// ������ ������ ���� ���ݾ� ����. ��¥ �ð��� 1/1000 �� // �̰��� 1000���� ������ 1�� / ���⿡ �� 60���� ������ 1�� // �̰� �� 60���� ������ 1�ð� // �̰� �� 24�� ������ �Ϸ� // �̰� �� 365�� ������ 1�� //�� �Ǵ°���
		
		// �ð��� �����ϱ�� ����� ��ٷӴ� �׷��� �̷��� ������ �ٽ� ����� ��
		System.out.println(start);
		String newLine=System.lineSeparator();
		System.out.println(end);
		
		
		
		
	}

}