package com.rom802;

public class Ex06 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String[] arr={"java","web","db","framework"};
		
		int su=0;
		
		String input=sc.nextLine();
//		try{
//			su=Integer.parseInt(input);	// 여기도 오류			
//				System.out.println(arr[su]); // 여기도 오류
//		}catch(java.lang.ArrayIndexOutOfBoundsException e){		
//				
//		}catch(java.lang.NumberFormatException e){
//		
//		}
		
		// 상위 클래스 catch로 한꺼번에 처리
		try{
			su=Integer.parseInt(input);		
				System.out.println(arr[su]);
		}catch(RuntimeException e){		
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.toString());		// 내용을 보니 toString이 오버라이딩 되어 있구나
			System.out.println(e.getMessage());
		}
	}

}
