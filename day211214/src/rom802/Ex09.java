package rom802;

public class Ex09 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.4.1)	// 문자열 처리까지
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		System.out.println("학생성적관리프로그램(ver 0.4.1)");
		System.out.print("총원");
		input=sc.nextLine();
		int tot=Integer.parseInt(input);
		String[] kor=new String[tot];
		String[] eng=new String[tot];
		String[] math=new String[tot];
		
		for(int i=0; i<tot; i++){
			kor[i]="-";		// "0"으로 써도 되고
			eng[i]="-";
			math[i]="-";
		}
		while(true){
			System.out.print("1.입력 2.보기 0.종료>");
			input=sc.nextLine();
			if (input.equals("0")){
				System.out.println("이용해주셔서 감사합니다");
				return;
			}else if(input.equals("1")){
				// 입력
				System.out.print("학번>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				
				if(num<=tot){
					System.out.print("국어>");
					input=sc.nextLine();
					kor[num-1]=input;
					System.out.print("영어>");
					input=sc.nextLine();
					eng[num-1]=input;
					System.out.print("수학>");
					input=sc.nextLine();
					math[num-1]=input;						
				}else{
					System.out.println("학번을 확인해주세요");
				}
			}else if(input.equals("2")){
				System.out.println("-------------------------------");
				System.out.println("국어\t|영어\t|수학\t|합계");
				System.out.println("-------------------------------");
				for(int i=0; i<tot; i++){
					System.out.println(kor[i]+"\t|"+eng[i]+"\t|"+math[i]+"\t|");
				}
				System.out.println("-------------------------------");
				
			}			
		}
	}

}
