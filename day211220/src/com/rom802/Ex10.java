package com.rom802;

public class Ex10 {

	public static void main(String[] args) {
		// �ζ�
		// 1. ���� (1~45)
		// 2. 6�� - �ߺ� x -> �ߺ����˻�	2���� 3���� ���� ��
		// 3. �������� ����
		
		int[] lotto={6,1,3,4,2,5};	// ������ �迭 ����
		int su;
		
		// 0,1 0,2 0,3 0,4 0,5 ... ���ذ��鼭 ���� ���� 0�ε�����
		//     1,2 1,3 1,4 1,5 ... ���ذ��鼭 ���� ���� 1�ε�����
		//         2,3 2,4 2,5 ... ���ذ��鼭 ���� ���� 2�ε�����
		// ��ġ �� ���ó��
		
// 1. ����
// 2. 6�� �ߺ� ���� �̱� (�̰͵� �Ȱ��� ����� ó�� ���� ����)
		for(int i=0; i<lotto.length; i++){
			su=(int)(Math.random()*45)+1;	// 0~44.9999999999999999999 + 1
			lotto[i]=su;
			for(int j=0; j<i; j++){
				if(lotto[i]==lotto[j]){
					i--;
				}
			}
		}
		
// 3. ����		
		//���Ŀ� ���� ������ ���� ������ �ִ�
		int temp;
		
		// �� ��� �������� ������ ��
		for(int i=0; i<lotto.length-1; i++){
			for(int j=i+1; j<lotto.length; j++){ // �׻� �ٷ� ���� �Ͱ� �˻��ϴϱ� j=i+1
				if(lotto[i]>lotto[j]){	// �ڸ��� �ٲ�� �ϴ� ���
					temp=lotto[i];
					lotto[i]=lotto[j];	//�ǹ̴� �̷����� ������ �����ϸ� �Ѵ� lotto[j]���� �Ǿ������
					lotto[j]=temp;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++){ 
			System.out.print(lotto[i]+" ");
		}
	}

}