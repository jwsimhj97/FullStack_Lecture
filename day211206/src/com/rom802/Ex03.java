package com.rom802;

public class Ex03 {

	public static void main(String[] args) {
		//q1
		System.out.println("Q1. 1~10���� ¦������ ����Ͻÿ�");
		
		for (int i=1; i<=10; i++) {
			if (i%2 == 0) System.out.println(i);
		}
		
//		System.out.println(2);
//		System.out.println(4);
//		System.out.println(6);
//		System.out.println(8);
//		System.out.println(10);
//		int su=2;					// i�� su�� ��ĥ �� ����
//		for(int i=0; i<5; i++) {
//			System.out.println(su);
//			su+=2;
//		}
		for (int su=2; su<=10; su+=2) {
			System.out.print(su+" ");
		}
		
		System.out.println("\n------------------------------------------");
		
		for (int su=1; su*2<=10; su++) {		// ����� �������� ������ �� (su*2)
			System.out.print(su*2);
		}
		
		
		
		//q2
		System.out.println("\nQ2. A~Z���� ����Ͻÿ�");
		
		for (int i='A'; i<='Z'; i++) {		// 'A', 'Z'�� int�� ���� ĳ���� ��
			System.out.println((char)i);
		}
		// ���ǹ��� int i�� char �� �����ϴ� ����� ���� (������ ++�� ��Ʈ�����̱� ������ ��� ����)
		
//		System.out.println((char)65);
//		System.out.println((char)66);
//		System.out.println((char)67);
//		System.out.println((char)68);
		// . . .
//		for (int i=(int)'A'; i<(int)'Z'; i++) {
//			System.out.println((char)i);
//		}
		
//		for (int i=0; i<26; i++) {					// �̷� ������� Ȱ���� �� �� �ִ�
//			System.out.println((char)(i+'A'));
//		}
		
		
		//q3 
		System.out.println("\nQ3. 1, 3, 5, 7, 9 �� ����Ͻÿ�");
//		
//		for (int i=0; i<10; i++) {
//			if (i%2 != 0 && i<9) System.out.print(i+",");
//			else if (i%2 != 0) System.out.println(i);
//		}// ó���� �����ϴ� ���� ���ϰڳ�
//		
		boolean boo=false;
		for(int i=1; i<10; i++) {
			if(i%2 != 0) {
				if (boo) System.out.print(",");
				System.out.print(i);
				boo=true;
			}
		}
		System.out.println();
		
		for(int i=1; i<10; i++) {
			if (i%2 != 0 && i != 1) System.out.print(",");
			if (i%2 != 0) System.out.print(i);
		}
		
		
		//q4
		System.out.println("\nQ4. 1+3+5+7+9=000�� ����Ͻÿ�");
		// �� �κ� �ϳ��� ���� ���ǹ� �α� vs for�� �ٱ��� ���� �ڵ� ¥�� vs ó�� �κ��� �����ϱ� (ó�� �κ��� ���� �����ϱⰡ �����ϴ�)
		
		// ���1		for�� �ٱ��� ���� �ڵ� ¥��
		int j;
		int s=0;
		
		for(j=0; j<5-1; j++) {
			System.out.print(2*j+1);
			System.out.print("+");
			s+=2*j+1;
		}
		
		System.out.print(2*j+1);
		System.out.print("=");
		s+=2*j+1;
		
		System.out.println(s);
		
		
		// ���2		�� �κ� �ϳ��� ���� ���ǹ� �α�
		int sum=0;
		
		for(int i=0; i<5; i++) {
			System.out.print(2*i+1);
			if (i < 5-1) System.out.print("+");
			else System.out.print("=");
			sum += 2*i+1;
		}
		
		System.out.println(sum);
		
		
		System.out.println("---------------------");
//		System.out.println("+"); // �ִ� ġ��
//		System.out.println(1);
//		System.out.println("+");
//		System.out.println(3);
//		System.out.println("+");
//		System.out.println(5);
//		System.out.println("+");
//		System.out.println(7);
//		System.out.println("+");
//		System.out.println(9);
//		System.out.println("=");
//		System.out.println(1+3+5+7+9);
		
		// �տ� �ִ� ġ��
		int sumNum = 0;
		for(int i=1; i<10; i+=2) {
			if (i != 1) System.out.print('+');
			sumNum += i;
			System.out.print(i);
		}
		System.out.print('=');
		System.out.println(sumNum);
		
		
		
		sum = 0;
		for (int i=1; i<=10; i++) {
			if (i%2!=0) {
				System.out.print(i);
				sum+=i;
			} else if (i != 10) {
				System.out.print('+');
			} else {
				System.out.print('=');
			}
		}
		System.out.println(sum);
		
		
		String msg="";					// io �۾��� ��ǻ�� �۾� �߿� ���� ������ ������ �� ����� ���߿��� ��������
		for (int i=1; i< 10; i++) {
			if(i%2!=0){
				msg+=i;
			}else{
				msg+='+';
			}
		}
		msg+="="+sum;	// '=' + sum �ϸ� ����+���ڶ� ������ ����� �����ϱ� ����
		
		System.out.println(msg);
		
			
		
		//q5
		System.out.println("\nQ5. 1~50 �� 4�� ����� ����Ͻÿ�");
		
		for (int i=1; i<=50; i++) {
			if (i%4 == 0) System.out.println(i);
		}
		
		// ���� ���� Ư���� �� �˰� �ֱ� ������
		// for (int i = 1; i * 4 < 50; i++) {
		// 	System.out.print(i*4+" ");
		//	}
		
		for (int i=4; i<50; i+=4) {
			System.out.print(i+" ");
		}
		
		for(int i=1; i<=50; i++) {		// ������ �״�� �ڵ�ȭ �� �ڵ� (��Ű�� ��� ����)
			if (i % 4 == 0) {
				System.out.print(i+" ");
				
			}
		}
	}
}