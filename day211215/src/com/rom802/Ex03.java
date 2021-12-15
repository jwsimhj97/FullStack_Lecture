package com.rom802;

public class Ex03 {

	public static void main(String[] args) {
		String msg1="abcd";
		String msg2="abcdEab23cdef";
		String msg3="";
		
		System.out.println(msg1.contains("bc"));
		System.out.println(msg1.startsWith("ab"));
		System.out.println(msg1.endsWith("cde"));
		
		System.out.println(msg3.length()==0);
		System.out.println(msg3.isEmpty());
		
		System.out.println(msg2.lastIndexOf("dea",3));  // -1이 나올 때까지 indexOf를 계속 호출하는 원리
		
		System.out.println(msg2.toUpperCase());		// 꽤 많이 씀
		System.out.println(msg2.toLowerCase());		// 예를 들어 구글에 "JAVA", "java" 검색시 동일한 결과 나옴
		
		String msg5="           java web framework          db     ";
		System.out.println(">>>"+msg5+"<<<");
		System.out.println(">>>"+msg5.trim()+"<<<");
		
		
		System.out.println(msg5.hashCode());	
		Ex03 me=new Ex03();
		System.out.println(me);		// 뒤쪽의 숫자가 me의 해시코드 값
		// 근데 String 객체를 출력하면 내용이 나오잖아? 그 때 위와 같은 값을 출력하고 싶을 때 사용
	}

}
