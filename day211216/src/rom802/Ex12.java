package rom802;

public class Ex12 {

	public static void main(String[] args) {
		String[] msg={"java","web","DB","framework"};
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.print("idx >");
		String input=sc.nextLine();
		int idx=0;
		try{
			idx=Integer.parseInt(input);
			System.out.println(msg[idx]);
		}catch(java.lang.NumberFormatException e){
			System.out.println("���ڸ�");
		}catch(java.lang.ArrayIndexOutOfBoundsException e){	// �̷��� �ߴµ� ���ڸ� ������ �ְ� ���ڸ� ���� ������? �ٸ� �ͼ��� ����
			System.out.println("�ε����� 0~3����");
		}
		
		// �ٵ� �ٸ� �ͼ��� ������ ������? �Ѵ� ���ڸ� �־��� �� ó���� �ȵ�
	}

}