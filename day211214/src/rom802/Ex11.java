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
				// ��ü �迭 ���
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("�л������������α׷� (ver 0.5.1)");
		String input=null;
		System.out.print("�ѿ�");
		input=sc.nextLine();
		int tot=Integer.parseInt(input);		// 1.�ѿ� �Է¹ް�
		Student[] data=new Student[tot];		// 2.��ü �迭�� ������� (�� �迭���� ��ü�� ���� ��)
		int cnt=0;
		while(true){
			System.out.print("1.�Է� 2.��� 0.����>");
			input=sc.nextLine();
			if(input.equals("0")){
				System.out.println("�̿����ּż� �����մϴ�");
				return ;
			}
			if(input.equals("1")&&cnt<tot){
				Student stu=new Student();		// 3.�Է��� �Ͼ ������ ��ü�� �����ϰ�
				System.out.print("�й�>");
				stu.num=Integer.parseInt(sc.nextLine());	// ���� �Է°��� �ٷ� ��ȯ�ؼ� ����ֱ�
				System.out.print("�̸�>");
				stu.name=sc.nextLine();
				System.out.print("����>");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("����>");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("����>");
				stu.math=Integer.parseInt(sc.nextLine());
				data[cnt++]=stu;				// 4.���� ��ü�� ��ü �迭�� ��´�
			}else if(input.equals("1")){
				System.out.println("�Է��� �������ϴ�");
				
			}else if(input.equals("2")){
				System.out.println("-------------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|�հ�");
				System.out.println("-------------------------------------------------");
				for(int i=0; i<data.length; i++){
					Student stu=data[i];
					if(stu!=null){
						System.out.println(stu.num+"\t|"+stu.name+"\t|"+stu.kor+"\t|"+stu.eng+"\t|"+stu.math+"\t|"+stu.saySum());						
					}
				}
				System.out.println("-------------------------------------------------");
			}else{
				System.out.println("�Է��� �߸��Ǿ����ϴ�");
			}
		}

	}

}