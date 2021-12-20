package com.rom802;

public class Ex07 {

	public static void func01(int a) throws ArrayIndexOutOfBoundsException, NumberFormatException, ClassNotFoundException{
		String[] arr={"a", "ab", "abc", "abcd"};
		Exception ex=new Exception();
		try{
			if(a>3){throw ex;}	// 진짜 에러 객체를 만들어서 던진다
			System.out.println(arr[a]);
		}catch(Exception e){
			System.out.println("zz");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		try {
			func01(4);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main end");
	}

}
