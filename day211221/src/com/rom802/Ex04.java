package com.rom802;

public class Ex04 {

	public static void main(String[] args) {
		// 10���� �Ǽ�Ÿ��
		
		double a=3.14;
		Double su2=new Double(3.14);
		Double su3=new Double("314");
		System.out.println(su3);
		System.out.println(Double.MAX_VALUE);
		
		Double su4=1.0/0.0;
		// ���ڰ� Ŀ���� ���ڰ� Ŀ����, �и� �۾����� ���ڰ� Ŀ����
		// �׷� 0���� ������??
		System.out.println(su4);
		System.out.println(su4.isInfinite());
		System.out.println(su4.isNaN());
		
		Float su5=new Float(3.14);
		Float su6=new Float(3.14F);
		Float su7=new Float("3.14");
		
		
		
	}

}