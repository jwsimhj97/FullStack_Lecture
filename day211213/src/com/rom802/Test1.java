package com.rom802;

public class Test1 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
	
		System.out.println("학생 성적 관리 프로그램");

		String input;
		int tot;
		System.out.print("정원>");
		input=sc.nextLine();
		tot=Integer.parseInt(input);

		int[] kor=new int[tot];
		int[] eng=new int[tot];
		int[] math=new int[tot];

		int menu;
		int cnt=0;
		boolean boo=true;
		while (boo) {
			System.out.print("1.입력 2.보기 0.종료 >");
			input=sc.nextLine();
			menu=Integer.parseInt(input);
			if (menu==0){
				boo=false;
			}else if(menu==1){
				if (cnt<tot){
					System.out.print((cnt+1)+" 국어>");
					input=sc.nextLine();
					kor[cnt]=Integer.parseInt(input);
					System.out.print((cnt+1)+" 영어>");
					input=sc.nextLine();
					eng[cnt]=Integer.parseInt(input);
					System.out.print((cnt+1)+" 수학>");
					input=sc.nextLine();
					math[cnt]=Integer.parseInt(input);
					cnt++;
				}else{
					System.out.println("입력이 초과되었습니다.");
				}
			}else if(menu==2){
				System.out.println("--------------------------");
				System.out.println("국어\t|영어\t|수학");
				System.out.println("--------------------------");
				for(int i=0; i<tot; i++){
					System.out.print(math[i]+"\t|"+eng[i]+"\t|"+math[i]);
					System.out.println();
				}
			System.out.println("--------------------------");
			}else{
				System.out.println("0,1,2 중에서 입력해주세요");
			}
		}
		System.out.println("--------------------------");
	}

}
