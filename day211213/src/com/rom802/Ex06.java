package com.rom802;

public class Ex06 {

	public static void main(String[] args) {
		int age=20;
		char gender='여';
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("주민번호 검사기");
		System.out.print(">>>");
		String msg="024501-3123456"; //sc.nextLine(); // 정상적인 입력이 들어왔다는 것을 전제로 진행
		char[] arr=msg.toCharArray();
		//
		
		// 요구사항에 맞춰 여기에만 집중하면 프로그램 완성 진행이 안된다
		     
		
		
		// 체크해서 맞으면 여기를 실행
		int year=2000+(arr[0]-'0')*10+(arr[1]-'0');		// 조건에 따라 2000으로 시작할지 1900으로 시작할지
		if(arr[7]=='1'||arr[7]=='2'){
			year-=100;
		}
		age=2021-year+1;
//		age-=year-1;	// 초기값을 2021으로 주고 이렇게 해도 됨
		
		if(arr[7]=='1' || arr [7]=='3'){		// 성별 쉬우니까 성별부터
			gender='남';
		}else{
			gender='여';
		}
		
		System.out.println("당신은 "+age+"세 "+gender+"성입니다");
	}

}
