package rom802;

public class Ex10 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("�л������������α׷�(ver 0.5.0)");
		String input=null;
		System.out.print("�ѿ�>");
		input=sc.nextLine();
		int tot=Integer.parseInt(input);
		String[][] data=new String[tot][];
		
		int cnt=0;
		while(true){
			System.out.print("1.�Է� 2.���� 0.����>");
			input=sc.nextLine();
			if(input.equals("0")){
				System.out.println("�̿����ּż� �����մϴ�");
				return ;
			}else if(input.equals("1")&&cnt<tot){
				// �Է��� �� String �迭�� �־� ��߰���?
				String[] stu=new String[5];
				System.out.print("�й�>");
				input=sc.nextLine();
				stu[0]=input;
				System.out.print("�̸�>");
				input=sc.nextLine();
				stu[1]=input;
				System.out.print("����>");
				input=sc.nextLine();
				stu[2]=input;
				System.out.print("����>");
				input=sc.nextLine();
				stu[3]=input;
				System.out.print("����>");
				input=sc.nextLine();
				stu[4]=input;
				data[cnt++]=stu;
			}else if(input.equals("2")){
				System.out.println("-------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����");
				System.out.println("-------------------------------------");
				for(int i=0; i<data.length; i++){
					String[] stu=data[i];	// �� �л��� ��� ���� ������ ����  // ���� ���ϰ� �ϱ� ���ؼ� ���� ���� ���
					if(stu!=null){
						System.out.println(stu[0]+"\t|"+stu[1]+"\t|"+stu[2]+"\t|"+stu[3]+"\t|"+stu[4]);
					}
				}
				System.out.println("-------------------------------------");
			}
		}
	}

}