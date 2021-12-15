package com.rom802;

public class Ex06 {

	public static void main(String[] args) {
		// 1 user1 1 2 3		// 이러면 2번 학번을 찾을 때 1번 학생의 2점을 찾을 수 있다
		// 2 user2 44 55 66		
		// 3 user3 77 88 99
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("학생성적관리프로그램(ver 0.6.0)");
		String data="";
		String input=null;
		while (true){
			System.out.print("1.보기 2.입력 3.삭제 (4.수정) 0.종료 >");
			input=sc.nextLine();
			if(input.equals("0")){
				return;
			}
			if(input.equals("1")){
				System.out.println("------------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학");
				System.out.print("------------------------------------------------");
				System.out.println(data);
			}else if(input.equals("2")){
				System.out.print("학번>");
				data+="\n"+sc.nextLine()+"\t|";
				System.out.print("이름>");
				data+=sc.nextLine()+"\t|";
				System.out.print("국어>");
				data+=sc.nextLine()+"\t|";
				System.out.print("영어>");
				data+=sc.nextLine()+"\t|";
				System.out.print("수학>");
				data+=sc.nextLine()+"\t|";
			}else if(input.equals("3")){
				
				// 방법 1
//				System.out.print("삭제할 학번>");
//				input="\n"+sc.nextLine();
//				int startIdx=data.indexOf(input+"\t");
//				int endIdx=data.indexOf("\n",startIdx+1);
//				String target;
//				if (endIdx==-1){
//					target=data.substring(startIdx);
//				}else{					
//					target=data.substring(startIdx, endIdx);
//				}
//				
//				data=data.replace(target, "");
				
				
				// 방법2
				System.out.print("삭제>");
				input=sc.nextLine();
				String[] arr=data.split("\n");
				
				data="";
				for(int i=0; i<arr.length; i++){
					if(!arr[i].startsWith(input+"\t")){
						data+=arr[i]+"\n";
					}
				}
				
			}else if(input.equals("4")){
				//방법1
//				System.out.print("수정할 학번>");
//				input="\n"+sc.nextLine()+"\t";				// 학번
//				int startIdx=data.indexOf(input);		// 사이즈가 동일하면 글자 수로 끄집어내면 될텐데...
//				int endIdx=data.indexOf("\n",startIdx+1);	// startIdx가 아니라 startIdx+1인 이유는 startIdx자리에 '\n'이 있으니까
//				// 이 두가지 인덱스를 활용해서 수정을 하면 수정이 되는거고, ""를 대입하면 삭제가 되는 것임
//				String target;
//				if (endIdx==-1){
//					target=data.substring(startIdx);
//				}else{					
//					target=data.substring(startIdx, endIdx);	// 마지막 학번을 입력하면 개행이 없으면 endIdx가 -1이 되고 오류남
//				}
//				// endIdx가 -1일 때는 substring의 인자를 하나만 넘겨줌
//				System.out.println("이름");
//				input+=sc.nextLine()+"\t|";
//				System.out.println("국어");
//				input+=sc.nextLine()+"\t|";
//				System.out.println("영어");
//				input+=sc.nextLine()+"\t|";
//				System.out.println("수학");
//				input+=sc.nextLine()+"\t|";
//				
//				data=data.replace(target, input);
				
				
				
				// 방법2
				System.out.print("수정>");
				input=sc.nextLine();
				String[] arr=data.split("\n");
				
				data="";
				for(int i=0; i<arr.length; i++){		// 마지막에 개행으로 입력을 받기 때문에 빈문자열이 있다 그래서-1해줌
														// 인 언어도 있지만 자바에서는 마지막에 나누는 문자열이 오면 따로 안나옴
														// 그래서 for문 조건에서 length-1을 하면 안된다
					if(!arr[i].startsWith(input+"\t")){
						data+=arr[i]+"\n";
					}else{
						System.out.println("이름");
						input+=sc.nextLine()+"\t|";
						System.out.println("국어");
						input+=sc.nextLine()+"\t|";
						System.out.println("영어");
						input+=sc.nextLine()+"\t|";
						System.out.println("수학");
						input+=sc.nextLine()+"\t|";
						data+=arr[i]+"\n";
					}
				}
				
			}
		}
	}
	
}
