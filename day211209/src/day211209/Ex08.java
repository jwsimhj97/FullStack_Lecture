package day211209;

public class Ex08 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		boolean boo = true;		// �ݺ��� Ż�� ����
		String temp;
		int input=1;
		int cnt=0;
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math= new int[3];
		
		while (boo) {
			System.out.print("1.�Է� 2.��� 0.����>");
			temp = sc.nextLine();
			input = Integer.parseInt(temp);
			if (input==1) {
				cnt++;
				if (cnt <4) {
					System.out.print("����>");
					temp=sc.nextLine();
					kor[cnt-1]=Integer.parseInt(temp);
					System.out.print("����>");
					temp=sc.nextLine();
					eng[cnt-1]=Integer.parseInt(temp);
					System.out.print("����>");
					temp=sc.nextLine();
					math[cnt-1]=Integer.parseInt(temp);
				} else {
					System.out.println("�Է��� �������ϴ�");
				}
			} else if (input == 2) {
				System.out.println("---------------------------------------------------------------");
				System.out.println("����	|����	|����");
				System.out.println("---------------------------------------------------------------");
				for(int i=0; i<3; i++) {					
					System.out.println(kor[i]+"	|"+eng[i]+"	|"+math[i]);
				}
				System.out.println("---------------------------------------------------------------");
			} else if (input == 0) {
				boo=false;
			}
		}		// �̷��Ա����� �ϸ� ui �ϼ�
	}			// �̰� db�� �����ϸ� db���α׷�
}				// �׸��� �̰� ������ �ø��� ����ϵ��� �ϸ� �װ� ��