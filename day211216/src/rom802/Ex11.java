package rom802;

public class Ex11 {

	public static void main(String[] args) {
		// ����ó��
		
		int[] arr={1,3,5};
		
		try{
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);		
		System.out.println(arr[3]);		// ������ �������� ���� ���� ����ǥ�ô� ����
		System.out.println(arr[2]);		
		}catch(java.lang.ArrayIndexOutOfBoundsException aa){
			// ������ ���� ���� ��Ȳ
		}
	}

}