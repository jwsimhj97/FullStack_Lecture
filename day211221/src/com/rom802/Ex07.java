package com.rom802;

public class Ex07 { 
	
	public static char defineGender(String num){
		if(num.charAt(0)=='1' || num.charAt(0)=='3'){
			return '남';
		}
		return '여';
	}
	
	public static int defineAge(String[] num){
		int age=21-Integer.parseInt(num[0].substring(0,2))+1;
		if(num[1].charAt(0)=='1' || num[1].charAt(0)=='2'){
			age+=100;
		}
		return age;
	}
	
	public static String[] checkInputString(String input){
		if(input.length()!=14){
			System.out.println("글자 수가 맞지 않습니다");
			return null;
		}		
		if(input.charAt(6)!='-'){
			System.out.println("-을 확인해주세요");
			return null;
		}
		for(int i=0; i<input.length(); i++){
			if(i==6){
				continue;
			}
			if(Character.isDigit(input.charAt(i))==false){
				System.out.println("숫자만 입력해주세요");
				return null;
			}
		}
		String[] num=new String[2];
		num[0]=input.substring(0,6);
		num[1]=input.substring(7,14);
		return num;
	}
	
	public static boolean checkYYMMDD(String numOfSix){
		int month=Integer.parseInt(numOfSix.substring(2,4));
		if(!(month>=1 && month<=12)){
			System.out.println("태어난 달이 맞지 않습니다");
			return false;
		}
		int day=Integer.parseInt(numOfSix.substring(4,6));
		if(!(day>=1 && day<=31)){
			System.out.println("태어난 날짜가 맞지 않습니다");
			return false;
		}
		return true;
	}
	
	public static boolean checkGender(String numOfSeven){
		int gender=Integer.parseInt(numOfSeven.substring(0,1));
		
		if (gender>=1 && gender<=4){
			return true;
		}
		System.out.println("성별이 맞지 않습니다");
		return false;
	}
	
	public static void main(String[] args) {
		// 주민번호 체크기 (ver 0.3.0)
		
		System.out.println("주민번호 체크기 (ver 0.3.0)");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String input;
		String num[]=null;
		
		while(true){
			System.out.print("주민번호를 입력해주세요(000000-0000000) >");
			input=sc.nextLine();
			num=checkInputString(input);
			if(num!=null && checkYYMMDD(num[0]) && checkGender(num[1]))
			{
				break;
			}
		}
		
		char gender=defineGender(num[1]);
		int age=defineAge(num);
		
		System.out.println(age+"살 "+gender+"성입니다");
	}
	
}
