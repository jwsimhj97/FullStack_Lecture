package day211209;

public class Ex01 {
	
	public void func10() {
		Ex02.func01();
		Ex02 aa = new Ex02();
		aa.func02();
		aa.func03();
		
	}
	
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int me, com, win, draw, lose;
		
		me=1;
		com=1;
		win=0; draw=0; lose=0;
		
		String input;
		
		System.out.println("������ �����ϰڽ��ϴ�");
		
		boolean boo=true;
		String[] arr = {"����", "����", "��"};
		while (boo) {

			System.out.println("1.���� 2.���� 3.�� 0.����>");
			input = sc.nextLine();
			me = Integer.parseInt(input);
			
			if (me==0) {
				boo=false;
			} else if (me<1 || me>3) {		// ���� �� ��� ���� ���ڿ� ó��
				System.out.println("�޴��� �ٽ� �Է��ϼ���");
			} else {
				com=(int)(Math.random()*3)+1;
				
				System.out.println("me:"+arr[me-1]+", com:"+arr[com-1]);	// �ʱ�ȭ �ȴٴ� ������ ���� ������ ���� �߻� (else�� �ƴϰ� else if�ϱ�)
				
				if ((me==1 && com==3) || (me==2 && com==1) || (me==3 && com==2)) {
					System.out.println("�̰���");
					win++;
				} else if (me==com) {
					System.out.println("�����");
					draw++;
				} else if ((me==3 && com==1)|| (me==1 && com==2) || (me==2 && com==3)) {	// else�� ��� �Ǵµ�
					System.out.println("����");
					lose++;
				}
			}
		}

		System.out.println("\n"+win+"��"+draw+"��"+lose+"��");
		System.out.println("�̿����ּż� �����մϴ�");
	}

}