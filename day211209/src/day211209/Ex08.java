package day211209;

public class Ex08 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		boolean boo = true;		// 반복문 탈출 제어
		String temp;
		int input=1;
		int cnt=0;
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math= new int[3];
		
		while (boo) {
			System.out.print("1.입력 2.출력 0.종료>");
			temp = sc.nextLine();
			input = Integer.parseInt(temp);
			if (input==1) {
				cnt++;
				if (cnt <4) {
					System.out.print("국어>");
					temp=sc.nextLine();
					kor[cnt-1]=Integer.parseInt(temp);
					System.out.print("영어>");
					temp=sc.nextLine();
					eng[cnt-1]=Integer.parseInt(temp);
					System.out.print("수학>");
					temp=sc.nextLine();
					math[cnt-1]=Integer.parseInt(temp);
				} else {
					System.out.println("입력이 끝났습니다");
				}
			} else if (input == 2) {
				System.out.println("---------------------------------------------------------------");
				System.out.println("국어	|영어	|수학");
				System.out.println("---------------------------------------------------------------");
				for(int i=0; i<3; i++) {					
					System.out.println(kor[i]+"	|"+eng[i]+"	|"+math[i]);
				}
				System.out.println("---------------------------------------------------------------");
			} else if (input == 0) {
				boo=false;
			}
		}		// 이렇게까지만 하면 ui 완성
	}			// 이걸 db에 저장하면 db프로그램
}				// 그리고 이걸 서버에 올리고 통신하도록 하면 그게 웹