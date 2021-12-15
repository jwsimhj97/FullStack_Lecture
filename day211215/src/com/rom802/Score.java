package com.rom802;

public class Score {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String data="";
		String input=null;
		
		while (true){
			System.out.print("1.보기 2.입력 3.삭제 4.수정 0.종료");
			input=sc.nextLine();
			if(input.equals("0")){
				System.out.println("이용해주셔서 감사합니다");
				return;
			}
			if(input.equals("1")){	// 보기
				System.out.print(data);
			}else if(input.equals("2")){	// 입력
				System.out.print("학번>");
				data+=sc.nextLine()+" ";
				System.out.print("이름>");
				data+=sc.nextLine()+" ";
				System.out.print("국어>");
				data+=sc.nextLine()+" ";
				System.out.print("영어>");
				data+=sc.nextLine()+" ";
				System.out.print("수학>");
				data+=sc.nextLine()+" ";
				data+='\n';
			}else if(input.equals("3")){	// 삭제
				
			}else if(input.equals("4")){	// 수정
				
			}else{
				System.out.println("입력이 잘못되었습니다");
			}
		}
	}

}
