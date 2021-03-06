package com.rom802;

class ResidentNumException extends Exception{
	public ResidentNumException(String msg) {
		super(msg);
	}
}

public class Ex13 {
	
	public static void main(String[] args) {
		// 주민번호 확인(ver 0.2.0)
		//123456-1234567
		
		System.out.println("주민번호 확인(ver0.2.0)");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String[] 	genderString = {"남","여","남","여"};
		int 		gender;
		int 		year=1900;
		int 		month,day;
		int 		age=0;
		
		ResidentNumException ex=null;		
		
		boolean boo=true;
		while(boo){
			System.out.print("주민번호를 입력해주세요(123456-1234567) >");			
			boo=false;
			
			try{
				String 		input=sc.nextLine();
				String num1=input.substring(0,6);
				String num2=input.substring(7,14);			
				
				if(input.length()!=14){
					ex=new ResidentNumException("길이가 맞지 않습니다");
					throw ex;
				}
				
				if(input.charAt(6)!='-'){
					ex=new ResidentNumException("-이 없습니다");
					throw ex;
				}
				
				gender=Integer.parseInt(num2.substring(0,1));
				if(!(gender==1||gender==2||gender==3||gender==4)){
					ex=new ResidentNumException("성별을 확인해주세요");
					throw ex;
				}
				
				month=Integer.parseInt(num1.substring(2,4));
				if(!(month>=1 && month <=12)){
					ex=new ResidentNumException("태어난 달이 올바르지 않습니다");
					throw ex;
				}
				
				day=Integer.parseInt(num1.substring(4,6));
				if (!(day>=1 && day<=31)){
					ex=new ResidentNumException("태어난 날이 올바르지 않습니다");
					throw ex;
				}
				
				// 해석
				year+=Integer.parseInt(num1.substring(0,2));
				if(gender=='3' || gender=='4'){
					year+=100;
				}
				age=2021-year+1;
				
				// 출력
				System.out.println(age+"살 "+genderString[gender-1]+"성입니다");
			}catch(ResidentNumException aa){
				System.out.println(aa.getMessage());
				boo=true;
			}
			catch(java.lang.StringIndexOutOfBoundsException e){
				System.out.println("입력값을 다시 확인해주세요");
				boo=true;
			}
		}
		System.out.println("프로그램 종료");
	}
}
