package com.rom802;

public class Ex02 {

	
	public static void main(String[] args) {
		String msg="";
		
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=i; j++) {
				msg+='*'+" ";
			}
			msg+='\n';
		}
		System.out.println(msg);
		
		
		
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

		System.out.println();
		
		int su=1;
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(su+" ");
				su++;
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		for (int i=0; i<3; i++) {
			for (int j=3-i; j>0; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		

		System.out.println();
		
		for (int i=0; i<3; i++) {
			int su2=1;
			for (int j=3-i; j>0; j--) {
				System.out.print(su2 + " ");
				su2++;
			}
			System.out.println();
		}
		

		System.out.println();
		//
		//
		//
		
		int su3=1;
		for (int i=0; i<3; i++) {
			for (int j=3-i; j>0; j--) {
				System.out.print(su3 + " ");
				su3++;
			}
			System.out.println();
		}
		

		System.out.println();
		//   *
		//  **
		// ***
		
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=3; j++) {
				if (j>3-i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		

		System.out.println();
		//   3
		//  23
		// 123

		for (int i=1; i<=3; i++) {
			int su4=0;
			for (int j=1; j<=3; j++) {
				su4++;
				if (j>3-i) {
					System.out.print(su4+" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		

		// 기울기를 활용할 수도 있겠다
		
		System.out.println();
		System.out.println();
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (i/(3-j) >=1) {
					System.out.print(2+" ");
				} else {
					System.out.print(1+" ");
				}
			}
			System.out.println();
		}
		
		
		
		
	}
}