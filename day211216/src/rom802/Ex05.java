package rom802;


// 5. �θ� Ŭ������ �ϳ� �����
class Machine{
	public void on(){
		System.out.println("�Ѵ�");
	}
	public void off(){
		System.out.println("����");
	}
	public void work(){
	}
}


class Tv extends Machine{
//	public void on(){					// 6. ��� �޾����ϱ� tv�� radio���� ���� �ʿ䰡 ����
//		System.out.println("�Ѵ�");
//	}
//	public void off(){
//		System.out.println("����");
//	}
	public void work(){					/// 7. �ٸ� ������ tv�� work�� �ٸ��ϱ� �������̵�
		System.out.println("������ �����ش�");
	}
}


class Radio extends Machine{
	public void work(){
		System.out.println("���ļ��� ��Ƽ� �Ҹ��� ����ش�");
	}
}


public class Ex05 {

	public static void main(String[] args) {
		
		

		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("1.tv 2.radio >");
		String input=sc.nextLine();
		
		Machine remote;		// 2. �ۿ��� �����ϸ� �Ǵµ� ������ Ÿ���� �ٸ��� 
							// 3. ���� Object Ÿ������ �����ϸ� �� �κ��� �ذ��
		if(input.equals("1")){
			remote=new Tv();
		}else{	// 1. �Ѱ� ���ϰ� ���� ������ ���ÿ� �����ϱ� ������ ���� ������
			remote=new Radio();
		}
		remote.on();		// 4. �׷��� Object Ŭ�������� �� �޼������ ���� / �׷��� �� Ŭ������ ����� �ǰ���
		remote.work();
		remote.off();
							// 8. �̷��� �ϸ� tv, �������� ��� ��� ���� (�̰� ������)
	}

}