package com.rom802;

public class Ex11 {

	public static void main(String[] args) { 
		int[] lotto=new int[45];	// �迭�� ��ü�ϱ� ��ü�� �ٷ�� �ְ�
		int ran;
		int temp;
		
		for(int i=0; i<lotto.length; i++){
			lotto[i]=i+1;
		}
		
		for(int i=0; i<10000; i++){
			ran=(int)(Math.random()*45);
			temp=lotto[0];			// �� 0�̶�� ���ڴ� ����� ����
			lotto[0]=lotto[ran];	// ������ �ε����� �̾Ƽ� �ٲ���
			lotto[ran]=temp;
		}
		
		for(int i=0; i<6; i++){		// ���ʽ� �̱⵵ ���� ���ڸ� 7�� �ٲٰ�
			System.out.print(lotto[i]+" ");
		}
		
		// ���ʽ��� ������ ���� ó���� �� ������ �ϳ� ���� �����ϸ� ���ʽ� ó����
		
		// �ļ� ���� �ѵ� �̰� ���� �ζǶ� �� �����
	}

}