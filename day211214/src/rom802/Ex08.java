package rom802;

public class Ex08 {

	public static void main(String[] args) {
		// �ֹκ�ȣ Ȯ��
		char[] temp1={'��','��','��','��','��','��','��','ĥ','��','��'};
		char[] temp2={'0','1','2','3','4','5','6','7','8','9'};
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String input=null;
		System.out.print("�ֹι�ȣ>");
		input="�������̻���-���̻�����ĥ";	//"991231-2123456";	//"020501-3123456";	//		input=sc.nextLine();
		char[] arr=input.toCharArray();	//���� �Է��� �޾Ƽ� char�迭�� �����
		
		// ���� �ٲ�ġ�⸦ ���� �ѱ� �Է�
		for (int i=0; i<arr.length; i++){
			char ch=arr[i];
			for(int j=0; j<temp1.length; j++){
				if(ch==temp1[j]){
					arr[i]=temp2[j];
				}
			}
		}
		
		// �ѱ� �Է�
		// �Է��� ������ �ѱ��� ���ڷ� �ٲ��ָ� �ȴ�
//		for(���ڹ迭�� �x�̸�ŭ �ݺ�){
//			if(�����ϳ��� == '��'){
//				�ش簪='0';
//			}else if(����=='��'){
//				�ش簪='1';
//			}...
//		}			// �̷��� �ϸ� �ڵ尡 �ʹ� �����
		
		
		
		// ��ȯ�� ���� �迭 �˻�
		
		boolean check1=true;
		for(int i=0; i<arr.length; i++){
			if(arr[i]=='-'){
				check1=false;
			}
		}
		
		if(check1){		// if/else�� �ͼ������� �� �ڵ尡 �̻��ϰ� ������ ���� �ִ�
			System.out.println("-�� �ݵ�� �Է��ϼ���");
			return ;
		}
		
		if(arr[6]!='-'){
			System.out.print("�Է¿���");
			return ;		// �� �̻� �����Ű�� �ȵǴϱ�
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		char[] arr2=new char[]{'2','0',arr[0],arr[1]};	// �ֹ� ��ȣ ���� �� �ڸ��� �޾Ƽ�
		if(arr[7]<=(int)'2'){	// Ȥ�� ó���� String input�� "19"+input ���� ������ ���ڸ� �߰��ص� ��
			arr2[0]='1';
			arr2[1]='9';
		}	
		// �ν��ϱ⿡�� �����ѵ� �ڵ����������� ������ ����
		// ���ڿ� �ް�, ���� �迭�� ��ȯ, ����
		
		String year=new String(arr2);
		int su=Integer.parseInt(year);
		System.out.print("����� ");
		System.out.print(2021-su+1);	// ���ǿ� ���� ���⼭ 100�� �����ִ� ������ �ص� ��
		System.out.print("�� ");
		if(arr[7]%2==0){	// �������� '1'(49), '2' '3' '4'���� Ȧ ¦�� �Ӽ��� �״�� �ִ�
			System.out.print("��");
		}else{
			System.out.print("��");			
		}
		
		System.out.println("���Դϴ�");
	}

}