package rom802;

public class Ex07 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++){
			if(i>4){		// �� �ڵ忡���� ����� �� ���������
//				return;		// �ش� �޼����� ����(ȣ���� ������ ���ư��� / ���ÿ��� ������)
				continue;
//				break;		// �ݺ����̳� switch������ Ż��. �ݺ��� ��, switch��
			}
			System.out.println(i);
		}
		System.out.println("���� ����");

	}

}