package com.rom802;

public class Ex09 {

	public static void main(String[] args) {
		System.out.println("main start");
		String[] arr={"a","ab","abc"};
		
		try{
			System.out.println(arr[0]);
			return ;
//		}catch(Exception e){
//			
		}finally{
			System.out.println("main end");	// 만약 이 문장의 실행이 보장받아야 한다면??
		}
	}

}
