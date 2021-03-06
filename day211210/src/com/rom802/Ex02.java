package com.rom802;

public class Ex02 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("학생성적관리프로그램 (ver0.3.0)");
		System.out.print("총원 >");
		String input = sc.nextLine();
		int tot=changeSu(input);		//	 총원을 먼저 받는다 (갑자기 바뀌지 않으니까)
		int[] kor = new int[tot]; int[] eng = new int[tot]; int[] math =new int[tot];
		boolean boo = true;
		int cnt=0;
		while (boo) {
			System.out.print("1.입력 2.보기 0.종료 >");
			input=sc.nextLine();
			int su = changeSu(input);
			if (su==0) {
				boo=false;
			} else if (su==1 && cnt != tot) { // 입력
				kor[cnt] = inputSu("국어 >");
				eng[cnt] = inputSu("영어 >");
				math[cnt] = inputSu("수학 >");
				cnt++;		// 이것과 같음
			} else if (su==1) {	// (su==1 && cnt==tot) 와 같음  // 위에서 이미 한 번 자연스럽게 걸려졌으니까 (전제됨)
				// 31번 라인은 20번 라인과 순서가 바뀌면 안됨
				System.out.println("더 이상 입력할 학생이 없습니다");
			} else if (su==2) { // 출력
				System.out.println("-------------------------------------------");
				System.out.println("국어\t영어\t수학");
				System.out.println("-------------------------------------------");
				for (int i=0; i<tot; i++) {					
					System.out.println(kor[i]+"\t|"+eng[i]+"\t|"+math[i]);
				}
				System.out.println("-------------------------------------------");
			} else {
				System.out.println("입력이 잘못되었습니다");
			}
		}
	}
	
	public static int changeSu(String msg) { // 문자열을 숫자로 바꿔주는 기능
		int su=Integer.parseInt(msg);
		return su;
	}
	
	// 모듈화
	public static int inputSu(String title) {	// 학점 문자열을 숫자로 바꿔주는 기능
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print(title);
		String msg=sc.nextLine();
		int su=changeSu(msg);
		boolean boo=true;
		
		// 점수의 범위는 0 ~ 100 사이의 값만 가능
		while (boo) {
			if (su<0 || su>100) {
				System.out.print("입력한 점수 " + su +", 0~100 사이의 값을 입력해주세요\n 재입력 >");
				msg=sc.nextLine();
				su=changeSu(msg);
			} else {
				boo=false;
			}
		}
		return su;
	}
}
