package com.rom802;

public class Ex05 {

	public static void main(String[] args) {
		// 1. 일단 그냥 해보고
		// 2. 자료형을 살리면 학번이 중복인지 아닌지 알수 있음
		// 3. 수정과 삭제까지
		//입력을 하면 누적
		//출력을 하면 출력
		
		// 학생성적관리프로그램(ver 0.6.0)
		// 1.보기 2.입력 3.삭제 4.수정 0.종료
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		final String showScore="1";
		final String inputScore="2";
		final String delScore="3";
		final String reScore="4";
		
		String[] dataName={"학번","이름","국어","영어","수학"};
		String	data="";
		String	input="";
		String	menu;
		
		while(true){
			System.out.print("1.보기 2.입력 3.삭제 4.수정 0.종료>");
			menu=sc.nextLine();
			if(menu.equals("0")){
				System.out.println("이용해주셔서 감사합니다");
				return ;
			}else if(menu.equals(showScore)){
				System.out.println("----------------------------------------");
				System.out.println("|학번\t|이름\t|국어\t|영어\t|수학");
				System.out.println("----------------------------------------");
				System.out.print(data);
				System.out.println("----------------------------------------");
			}else if(menu.equals(inputScore)){
				for(int i=0; i<dataName.length; i++){
					System.out.print(dataName[i]+">");
					input+="|"+sc.nextLine()+"\t";
				}
				input+="\n";
				data+=input;
			}else if(menu.equals(delScore)){
				System.out.print("삭제할 학번>");		// 되는데 하고나면 출력 이상해짐
				input=sc.nextLine();
				data=data.substring(data.indexOf("\n"));
			}else if(menu.equals(reScore)){
				System.out.print("수정할 학번>");		// 반만 됨
				input+=sc.nextLine();
				data=data.substring(data.indexOf("\n"));
				input+="|"+input+"\t";
				for(int i=1; i<dataName.length; i++){
					System.out.print(dataName[i]+">");
					input+="|"+sc.nextLine()+"\t";
				}
				input+="\n";
				data+=input;
			}else{
				System.out.println("입력이 잘못되었습니다");
			}
		}
	}

}
