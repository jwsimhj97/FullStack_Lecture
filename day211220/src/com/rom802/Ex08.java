package com.rom802;

class MyException extends Exception{
	public MyException(){
		super("1�� ���� �� ����");
	}
}

public class Ex08 {

	static void func(int a, int b) throws MyException{	// �׷��� �ƹ� Ŭ������ ExceptionŬ������ �� �� ��� ���� (�����ų� �޴�)
		if(b==1){
			MyException ex=new MyException();
			throw ex;
		}
		int c=a/b;
		System.out.println(a+"/"+b+"="+c);
	}
	
	public static void main(String[] args) {
		// �ٵ� ���� �츮���״� 1�� ������ ��Ȳ�� ������� �� ���� Exception Ŭ������ �ʿ�
		try{
			func(6,1);			
		}catch(MyException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}