package com.rom802;

public class Ex03 {

	public static void main(String[] args) {
		Byte su1=new Byte("127");
		byte su3=127;
		Byte su2=new Byte(su3);
		
		short su4=12;
		Short su5=new Short(su4);
		Short su6=new Short("12");
		
		long su7=1111;	// ����ĳ����
		Long su8=new Long(1111);
		Long su9=new Long(su7);
		Long su10=new Long("1111");	// �����϶��� 1234L �ϸ� ���� ����
		
		
		
		
		Integer.compare(1,2);
		
		Integer a=new Integer(1);	
		a.compareTo(2);
	}

}