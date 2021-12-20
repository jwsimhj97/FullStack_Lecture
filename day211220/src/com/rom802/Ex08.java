package com.rom802;

class MyException extends Exception{
	public MyException(){
		super("1로 나눌 수 없음");
	}
}

public class Ex08 {

	static void func(int a, int b) throws MyException{	// 그런데 아무 클래스나 Exception클래스가 될 수 없어서 에러 (던지거나 받는)
		if(b==1){
			MyException ex=new MyException();
			throw ex;
		}
		int c=a/b;
		System.out.println(a+"/"+b+"="+c);
	}
	
	public static void main(String[] args) {
		// 근데 만약 우리한테는 1로 나누는 상황이 에러라면 그 때의 Exception 클래스가 필요
		try{
			func(6,1);			
		}catch(MyException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
