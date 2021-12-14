package rom802;

public class Ex10 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("학생성적관리프로그램(ver 0.5.0)");
		String input=null;
		System.out.print("총원>");
		input=sc.nextLine();
		int tot=Integer.parseInt(input);
		String[][] data=new String[tot][];
		
		int cnt=0;
		while(true){
			System.out.print("1.입력 2.보기 0.종료>");
			input=sc.nextLine();
			if(input.equals("0")){
				System.out.println("이용해주셔서 감사합니다");
				return ;
			}else if(input.equals("1")&&cnt<tot){
				// 입력할 때 String 배열을 넣어 줘야겠죠?
				String[] stu=new String[5];
				System.out.print("학번>");
				input=sc.nextLine();
				stu[0]=input;
				System.out.print("이름>");
				input=sc.nextLine();
				stu[1]=input;
				System.out.print("국어>");
				input=sc.nextLine();
				stu[2]=input;
				System.out.print("영어>");
				input=sc.nextLine();
				stu[3]=input;
				System.out.print("수학>");
				input=sc.nextLine();
				stu[4]=input;
				data[cnt++]=stu;
			}else if(input.equals("2")){
				System.out.println("-------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학");
				System.out.println("-------------------------------------");
				for(int i=0; i<data.length; i++){
					String[] stu=data[i];	// 한 학생의 모든 과목 성적이 있음  // 보기 편하게 하기 위해서 얕은 복사 사용
					if(stu!=null){
						System.out.println(stu[0]+"\t|"+stu[1]+"\t|"+stu[2]+"\t|"+stu[3]+"\t|"+stu[4]);
					}
				}
				System.out.println("-------------------------------------");
			}
		}
	}

}
