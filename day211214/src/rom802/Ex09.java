package rom802;

public class Ex09 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.4.1)	// ���ڿ� ó������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		System.out.println("�л������������α׷�(ver 0.4.1)");
		System.out.print("�ѿ�");
		input=sc.nextLine();
		int tot=Integer.parseInt(input);
		String[] kor=new String[tot];
		String[] eng=new String[tot];
		String[] math=new String[tot];
		
		for(int i=0; i<tot; i++){
			kor[i]="-";		// "0"���� �ᵵ �ǰ�
			eng[i]="-";
			math[i]="-";
		}
		while(true){
			System.out.print("1.�Է� 2.���� 0.����>");
			input=sc.nextLine();
			if (input.equals("0")){
				System.out.println("�̿����ּż� �����մϴ�");
				return;
			}else if(input.equals("1")){
				// �Է�
				System.out.print("�й�>");
				input=sc.nextLine();
				int num=Integer.parseInt(input);
				
				if(num<=tot){
					System.out.print("����>");
					input=sc.nextLine();
					kor[num-1]=input;
					System.out.print("����>");
					input=sc.nextLine();
					eng[num-1]=input;
					System.out.print("����>");
					input=sc.nextLine();
					math[num-1]=input;						
				}else{
					System.out.println("�й��� Ȯ�����ּ���");
				}
			}else if(input.equals("2")){
				System.out.println("-------------------------------");
				System.out.println("����\t|����\t|����\t|�հ�");
				System.out.println("-------------------------------");
				for(int i=0; i<tot; i++){
					System.out.println(kor[i]+"\t|"+eng[i]+"\t|"+math[i]+"\t|");
				}
				System.out.println("-------------------------------");
				
			}			
		}
	}

}