package rom802;

public class Ex07 {

	public static int inputNum(){
		String input;
		int num;
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		input=sc.nextLine();
		num=Integer.parseInt(input);
		return num;
	}
	
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("학생성적관리프로그램 (ver 0.5.0)");
		
		int tot;
		
		System.out.print("총원>");
		tot = inputNum();
		
		int		subjectNum = 3;
		int		menu;
		int		cnt = 0;
		boolean boo = true;
		
		String[]	subject = new String[]{"국어","영어","수학"};
		int[][]		score = new int[tot][subjectNum];
		
		while (boo){
			System.out.print("1.입력 2.보기 0.종료>");
			menu=inputNum();
			if (menu==0){
				boo=false;
			}else if(menu==1){
				if (cnt>=tot){
					System.out.println("입력이 끝났습니다");
					continue;
				}
				for(int i=0; i<subjectNum; i++){
					System.out.print((i+1)+"번 "+subject[i]);
					score[cnt][i]=inputNum();
				}
				cnt++;
			}else if(menu==2){
				System.out.println("------------------------------------");
				System.out.print("번호\t");
				
				for (int i=0; i<subjectNum; i++){
					System.out.print("|"+subject[i]+"\t");
				}
				
				System.out.println();
				System.out.println("------------------------------------");
				
				for(int i=0; i<tot; i++){
					System.out.print(i+1+"\t");
					for(int j=0; j<subjectNum; j++){
						System.out.print("|"+score[i][j]+"\t");
					}
					System.out.println();
				}
				System.out.println("------------------------------------");
			}else{
				System.out.println("입력이 잘못되었습니다");
			}
		}
		System.out.println("\n프로그램 종료");
		
		
		
		
		
	}
}



// 학생성적관리프로그램(ver 0.5.0)
// 총원>3
// 1.입력 2.보기 0.종료>1
// 학번>
// 이름>
// 국어>
// 영어>
// 수학>
// 1.입력 2.보기 0.종료>1