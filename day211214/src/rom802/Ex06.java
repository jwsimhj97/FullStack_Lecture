package rom802;

public class Ex06 {
//	public int su=1111;

	public Ex06(int su){
		int a=su;
	}
	
	public static void main(String[] args) {
		int[] arr1=new int[]{1,3,5,7};
		
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
		
//		String[] arr2=new String[]{"java","web","framework","app"};
		String[] arr2=new String[3];	// �̷��� �ϸ� null�� ��µ�
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]);
		}
		
		System.out.println("----------------------");
		
		
		Ex06 me1=new Ex06(1111);
		Ex06 me2=new Ex06(2222);
		Ex06 me3=new Ex06(3333);
		
		// ��ü �迭
		Ex06[] arr3=new Ex06[3];
		arr3[0]=me1;
		arr3[1]=me2;
		arr3[2]=me3;
		
		for(int i=0; i<arr3.length; i++){
			Ex06 me=arr3[i];
			System.out.println(me.su);
		}
		

		System.out.println("----------------------");
		
		// �迭�� ��� �迭
		int[][] arr4;
		arr4=new int[3][2];	//
//		arr4[0]=new int[2];
//		arr4[1]=new int[2];
//		arr4[2]=new int[]{5,7,8,9};	//�̷� �����ε� ������ ������? �ּҰ��� �����ϱ�
		
		// �ٵ� ���̰� �� 2��� ������ ���ݾ�
		
		
		for(int i=0; i<arr4.length; i++){
//			int[] arr5=arr4[i];		��� ��� ��
			for(int j=0; j<arr4[i].length; j++){
//				System.out.print(arr5[j]+" ");
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}