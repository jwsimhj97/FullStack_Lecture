package com.rom802;

public class Ex02 {

	public static void main(String[] args) {
		String msg="abcdefg";
		
		char ch=msg.charAt(1);
		System.out.println(ch);
		
		String result=msg.concat("ABCD"); // msg+"ABCD"
		System.out.println(result);
		
		System.out.println(msg.indexOf("(123)"));
		System.out.println(msg.indexOf('a'));	// 인덱스 리턴해줌
		System.out.println(msg.indexOf('j'));	// 없으면 -1 리턴
		
		msg="abcdabcd";
		System.out.println(msg.indexOf('c'));	// 가장 처음 등장한 인덱스 번호를 반환
		System.out.println(msg.indexOf('c',3));	// 두번째 argument는 검색 시작 위치
		System.out.println(msg.indexOf("cd"));	// 얘도 두번째 argument로 검색 시작 위치를 지정 할 수 있음
		System.out.println(msg.indexOf("cd",2));
		
		for(int i=0; i<msg.length(); i++){
			System.out.print(msg.charAt(i));
		}
		System.out.println();
		
		String result3=msg.replace('d','D');
		System.out.println(result3);
		
		result3=msg.replace("ab","zz");
		System.out.println(result3);
		
		msg="cadjfkenaca";
		String result4=msg.replace("ca", "cABa");	// 이러면 사이에 삽입할 수는 있지만 ca가 여러개면...?
		System.out.println(result4);
		String result5=msg.replace("cABadjf", "cABa");	// 이렇게 하면 되겠지
		System.out.println(result5);
		String result6=msg.replace("cad", "cd");		// 이런 식으로 활용하면 지우는 것도 가능
		System.out.println(result6);
		// replace로도 많은 일을 할 수 있다
		// 이 정도만 하면 CRUD가 가능
		
		msg="abcdefg";
		String result7=msg.substring(2);
		System.out.println(result7);
		
		String result8=msg.substring(2,5);
		System.out.println(result8+" 8");
		
		System.out.println(msg.toString()+" toString");
		
		System.out.println(String.valueOf(new char[]{'a','b'}));
		
		String a="abcd";
		String b=a.toString();
		String c=a.toString();
		String d=new String("abcd");

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		b+="aa";
		System.out.println(b);
		System.out.println(b.hashCode());
		System.out.println(c);
		System.out.println(c.hashCode());
		System.out.println("abcd".hashCode());
		System.out.println(d.hashCode());
	}
	
}
