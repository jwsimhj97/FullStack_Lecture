package rom802;

class Student{
	public int num;
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	public int saySum(){
		return kor+eng+math;
	}
	
}

public class Ex11 {

	public static void main(String[] args) {
				// 객체 배열 사용
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("학생성적관리프로그램 (ver 0.5.1)");
		String input=null;
		System.out.print("총원");
		input=sc.nextLine();
		int tot=Integer.parseInt(input);		// 1.총원 입력받고
		Student[] data=new Student[tot];		// 2.객체 배열을 만들었음 (이 배열에는 객체가 담기는 것)
		int cnt=0;
		while(true){
			System.out.print("1.입력 2.출력 0.종료>");
			input=sc.nextLine();
			if(input.equals("0")){
				System.out.println("이용해주셔서 감사합니다");
				return ;
			}
			if(input.equals("1")&&cnt<tot){
				Student stu=new Student();		// 3.입력이 일어날 때마다 객체를 생성하고
				System.out.print("학번>");
				stu.num=Integer.parseInt(sc.nextLine());	// 이제 입력값을 바로 변환해서 집어넣기
				System.out.print("이름>");
				stu.name=sc.nextLine();
				System.out.print("국어>");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("영어>");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("수학>");
				stu.math=Integer.parseInt(sc.nextLine());
				data[cnt++]=stu;				// 4.만든 객체를 객체 배열에 담는다
			}else if(input.equals("1")){
				System.out.println("입력이 끝났습니다");
				
			}else if(input.equals("2")){
				System.out.println("-------------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|합계");
				System.out.println("-------------------------------------------------");
				for(int i=0; i<data.length; i++){
					Student stu=data[i];
					if(stu!=null){
						System.out.println(stu.num+"\t|"+stu.name+"\t|"+stu.kor+"\t|"+stu.eng+"\t|"+stu.math+"\t|"+stu.saySum());						
					}
				}
				System.out.println("-------------------------------------------------");
			}else{
				System.out.println("입력이 잘못되었습니다");
			}
		}

	}

}
