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
		System.out.println("�л������������α׷� (ver 0.5.0)");
		
		int tot;
		
		System.out.print("�ѿ�>");
		tot = inputNum();
		
		int		subjectNum = 3;
		int		menu;
		int		cnt = 0;
		boolean boo = true;
		
		String[]	subject = new String[]{"����","����","����"};
		int[][]		score = new int[tot][subjectNum];
		
		while (boo){
			System.out.print("1.�Է� 2.���� 0.����>");
			menu=inputNum();
			if (menu==0){
				boo=false;
			}else if(menu==1){
				if (cnt>=tot){
					System.out.println("�Է��� �������ϴ�");
					continue;
				}
				for(int i=0; i<subjectNum; i++){
					System.out.print((i+1)+"�� "+subject[i]);
					score[cnt][i]=inputNum();
				}
				cnt++;
			}else if(menu==2){
				System.out.println("------------------------------------");
				System.out.print("��ȣ\t");
				
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
				System.out.println("�Է��� �߸��Ǿ����ϴ�");
			}
		}
		System.out.println("\n���α׷� ����");
		
		
		
		
		
	}
}



// �л������������α׷�(ver 0.5.0)
// �ѿ�>3
// 1.�Է� 2.���� 0.����>1
// �й�>
// �̸�>
// ����>
// ����>
// ����>
// 1.�Է� 2.���� 0.����>1