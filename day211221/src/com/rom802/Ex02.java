package com.rom802;

public class Ex02 {

	public static void main(String[] args) {
		// 10����Ÿ��
		int su1=1111;
		Integer su2=new Integer(2222);
		Integer su3=new Integer("2222");
		
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		// ���� ���� �ּ� �ִ� ������ ����� ��츦 ����ؼ� �̸� ���� ó�� �ϴ� ��쿡 ��� (����ó��)
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		int su4=Integer.parseInt("4444");
		Integer su5=Integer.valueOf("5555");
		Integer su6=128;	// �ڽ̰� ��ڽ��� ���÷� �Ǳ� ������ �̰͵� ����, ������ ��ǻ�Ϳ��� ���� �� ��Ű�� ����
		System.out.println(su6.byteValue());
		// ��ü Ÿ������ ��� ���� �ϰڴٰ� �����ϴ� ���� ��ȿ������ ���α׷��� �Ǿ� ����
		System.out.println(su2.equals(su3));
		System.out.println(su2==su3);	// integer ��ü�ϱ� �̷� ������ ���ϴ� �� ����
		
		int su7=1;
		System.out.println(Integer.toBinaryString(su7));
		System.out.println(su7+"�� 8����="+Integer.toOctalString(su7));
		System.out.println(su7+"�� 16����="+Integer.toHexString(su7));
		System.out.println(Integer.reverse(su7));
		System.out.println(Integer.compare(314,-123132));
	}

}