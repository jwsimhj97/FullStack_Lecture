package com.rom802;

public class Ex04 {

	public static void main(String[] args) {
		String msg="java  |   web  |db   |framework  |  app";
		String[] arr=msg.split(" ");		// 빅데이터나 최근 문자열 처리에서 많이 사용
		// 매개변수로 '|' 를 쓰기 위해서는 '\\|'를 사용해야 함
		// 띄어쓰기가 여러개면 " "로 나눴을 때 문자열 배열의 길이가 길어짐
		
		for(int i=0; i<arr.length; i++){
//			System.out.println(arr[i]);
		}
		
		String msg1="abf";
		String msg2="abc";
		System.out.println(msg1.compareTo(msg2));	// 글자하나하나씩 빼서 0이면 넘어가고 다르면 리턴 // 달라지기 시작하는 시점의 차이값을 리턴 (얼마나 다른 지 리턴)
		// 같은지 다른지, 얼마나 다른지 알 수 있다 (문자열 비교에서 개발자들이 선호함)
		System.out.println(func(msg1,msg2));
		
		
		String[] abc = "\n\n\n\n.\n\n\n\n\n".split("\n");
		System.out.println("split "+abc.length);
		
		
	}
	
	public static int func(String a, String b){
		if(a.length()==b.length()){
			char[] arr1=a.toCharArray();
			char[] arr2=b.toCharArray();
			for(int i=0; i<a.length(); i++){
				if(arr1[i]-arr2[i]!=0){
					return arr1[i]-arr2[i];
				}
			}
			return 0;
		}else{
			return a.length()-b.length();
		}
	}
	
}
