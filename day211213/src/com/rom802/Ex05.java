package com.rom802;

public class Ex05 {

	public static int isNum(char[] str, int len){
		for(int i=0;i<len;i++){
			if (!(str[i]>='0' && str[i]<='9')){
				return -1;
			}
		}
		return 0;
	}
	
	public static int isKorNum(char[] str, int len){
		char korNum[] = new char[]{'��','��','��','��','��','��','��','ĥ','��','��'};
		return 0;
	}
	
	
	public static void main(String[] args) {

		
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("�ֹι�ȣ �˻��");
		
		
		String input;
		char[] inputNum=null;
		char[] num1 = new char[6];
		char[] num2 = new char[7];
		char[] korNum = new char[]{'��','��','��','��','��','��','��','ĥ','��','��'};
		
		int age=0;
		int sexNum=0;
		String[] sex=new String[]{"����", "����"};

		System.out.print("�ֹι�ȣ�� �Է��ϼ���\n>>> ");
		
		boolean boo = true;
		
		// �Է� ��ȿ�� �˻�
		while(boo){
			boo=false;
			input = sc.nextLine();
			inputNum = input.toCharArray();
			
			if (input.length() != 14) {		// 14�ڸ�
				System.out.println("�Է��� �ٽ� Ȯ���ϼ���(000000-0000000)-1");
				boo=true;
				continue;
			}
			if (inputNum[6] != '-'){
				System.out.println("�Է��� �ٽ� Ȯ���ϼ���(000000-0000000)-2");
				boo=true;
				continue;
			}
			
			for(int i=0;i<6;i++) {
				if (!(inputNum[i] >= '0' && inputNum[i] <= '9')){
					System.out.println("�Է��� �ٽ� Ȯ���ϼ���(000000-0000000)-3");
					boo=true;
					break;
				}
			}
			for(int i=0;i<6;i++) {
				if (!(inputNum[i+7] >= '0' && inputNum[i+7] <= '9')){
					System.out.println("�Է��� �ٽ� Ȯ���ϼ���(000000-0000000)-4");
					boo=true;
					break;
				}
			}
				
		}
		
		
		// �ѱ� Ȯ���ؼ� ���� ����
//		for (int i=0;i<14;i++){
//			for(int j=0;j<10;j++){
//				if(inputNum[i]==korNum[j]){
//					inputNum[i]=(char)(j+'0');
//					break;
//				}
//			}
//		}
		
		// ���� ����
		for(int i=0;i<6;i++){
			num1[i]=inputNum[i];
		}
		for(int i=0;i<7;i++){
			num2[i]=inputNum[i+7];
		}
		
		// ���� ����
		if(num2[0] == '1' || num2[0] == '3'){
			sexNum=1;
		}else{
			sexNum=2;
		}
		
		// ���� ����
		if (num2[0] == '1' || num2[0] == '2') {
			age=2021-(1900+10*(num1[0]-'0')+(num1[1]-'0'))+1;
		}else{
			age=21-(10*(num1[0]-'0')+(num1[1]-'0'))+1;
		}
		
		
		System.out.println("����� ���� "+age+"�� "+sex[sexNum-1]+"�Դϴ�");
	}

}

// �ֹι�ȣ �˻�� (���ڿ��� Ż�� �� �迭 ����)

// �ֹι�ȣ�� �Է��ϼ���
// >>>>020501-4123456
// ����� ���� 20�� �����Դϴ�.
///////////////////////////

// �ֹι�ȣ�� �Է��ϼ���
// >>>>990501-1123456
// ����� ���� 23�� �����Դϴ�

// �ֹι�ȣ�� �Է��ϼ���
// >>>>990501-123456
// �Է��� �����մϴ�(000000-0000000)
///////////////////////////

// �ֹι�ȣ�� �Է��ϼ���
// >>>>���̿�������-�����̻�����
// ����� ���� 20�� �����Դϴ�.
///////////////////////////