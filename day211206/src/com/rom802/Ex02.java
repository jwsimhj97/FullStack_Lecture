package com.rom802;

public class Ex02 {

	public static void main(String[] args) {
		// 구구단 7단 출력
//		System.out.println("7X1=7");
//		System.out.println("7X2=14");
//		System.out.println("7X3=21");
//		System.out.println("7X4=28");
//		System.out.println("7X5=35");
//		System.out.println("7X6=42");
//		System.out.println("7X7=49");
//		System.out.println("7X8=56");
//		System.out.println("7X9=63");
		
//		System.out.println("7X1="+7);
//		System.out.println("7X2="+7*2);
//		System.out.println("7X3="+7*3);
//		System.out.println("7X4="+7*4);
//		System.out.println("7X5="+7*5);
//		System.out.println("7X6="+7*6);
//		System.out.println("7X7="+7*7);
//		System.out.println("7X8="+7*8);
//		System.out.println("7X9="+7*9);
//		
//		// 엄밀히 따지면 동일 반복이 아니다
//		// 반복수행할 문장을 만들 수 있도록 동일 규칙을 뽑아내야 함 
//		
//		int i=1;
//		System.out.println("7x"+i+"="+7*i);
//		i++;
//		System.out.println("7x"+i+"="+7*i);
//		i++;
//		System.out.println("7x"+i+"="+7*i);
//		i++;
//		System.out.println("7x"+i+"="+7*i);
//		i++;
//		System.out.println("7x"+i+"="+7*i);
//		i++;
//		System.out.println("7x"+i+"="+7*i);
//		i++;
//		System.out.println("7x"+i+"="+7*i);
//		i++;
//		System.out.println("7x"+i+"="+7*i);
//		i++;
//		System.out.println("7x"+i+"="+7*i);
//		i++;

		// 이 정도로 만드니까 각 수행 문장들이 동일해졌다
//		int i=1;
//		for(int j=0; j<9; j++) {
//			System.out.println("7x"+i+"="+7*i);
//			i++;
//		}
		
		for(int i=1; i<=9; i++) {
			System.out.println("7x"+i+"="+7*i);
		}
		
	}

}