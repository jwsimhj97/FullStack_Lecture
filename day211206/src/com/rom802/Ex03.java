package com.rom802;

public class Ex03 {

	public static void main(String[] args) {
		//q1
		System.out.println("Q1. 1~10까지 짝수들을 출력하시오");
		
		for (int i=1; i<=10; i++) {
			if (i%2 == 0) System.out.println(i);
		}
		
//		System.out.println(2);
//		System.out.println(4);
//		System.out.println(6);
//		System.out.println(8);
//		System.out.println(10);
//		int su=2;					// i와 su를 합칠 수 있음
//		for(int i=0; i<5; i++) {
//			System.out.println(su);
//			su+=2;
//		}
		for (int su=2; su<=10; su+=2) {
			System.out.print(su+" ");
		}
		
		System.out.println("\n------------------------------------------");
		
		for (int su=1; su*2<=10; su++) {		// 결과를 기준으로 조건을 줌 (su*2)
			System.out.print(su*2);
		}
		
		
		
		//q2
		System.out.println("\nQ2. A~Z까지 출력하시오");
		
		for (int i='A'; i<='Z'; i++) {		// 'A', 'Z'가 int로 오토 캐스팅 됨
			System.out.println((char)i);
		}
		// 조건문의 int i를 char 로 선언하는 방법도 있음 (어차피 ++은 비트연산이기 때문에 상관 없음)
		
//		System.out.println((char)65);
//		System.out.println((char)66);
//		System.out.println((char)67);
//		System.out.println((char)68);
		// . . .
//		for (int i=(int)'A'; i<(int)'Z'; i++) {
//			System.out.println((char)i);
//		}
		
//		for (int i=0; i<26; i++) {					// 이런 방식으로 활용할 수 도 있다
//			System.out.println((char)(i+'A'));
//		}
		
		
		//q3 
		System.out.println("\nQ3. 1, 3, 5, 7, 9 를 출력하시오");
//		
//		for (int i=0; i<10; i++) {
//			if (i%2 != 0 && i<9) System.out.print(i+",");
//			else if (i%2 != 0) System.out.println(i);
//		}// 처음을 제어하는 것이 편하겠네
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
		System.out.println("\nQ4. 1+3+5+7+9=000를 출력하시오");
		// 끝 부분 하나를 위해 조건문 두기 vs for문 바깥에 예외 코드 짜기 vs 처음 부분을 제어하기 (처음 부분은 보통 제어하기가 편리하다)
		
		// 방법1		for문 바깥에 예외 코드 짜기
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
		
		
		// 방법2		끝 부분 하나를 위해 조건문 두기
		int sum=0;
		
		for(int i=0; i<5; i++) {
			System.out.print(2*i+1);
			if (i < 5-1) System.out.print("+");
			else System.out.print("=");
			sum += 2*i+1;
		}
		
		System.out.println(sum);
		
		
		System.out.println("---------------------");
//		System.out.println("+"); // 있다 치고
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
		
		// 앞에 있다 치고
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
		
		
		String msg="";					// io 작업은 컴퓨터 작업 중에 가장 나르기 때문에 이 방식이 나중에는 나을수도
		for (int i=1; i< 10; i++) {
			if(i%2!=0){
				msg+=i;
			}else{
				msg+='+';
			}
		}
		msg+="="+sum;	// '=' + sum 하면 숫자+숫자라서 엉뚱한 결과가 나오니까 조심
		
		System.out.println(msg);
		
			
		
		//q5
		System.out.println("\nQ5. 1~50 중 4의 배수를 출력하시오");
		
		for (int i=1; i<=50; i++) {
			if (i%4 == 0) System.out.println(i);
		}
		
		// 보통 수의 특성을 잘 알고 있기 때문에
		// for (int i = 1; i * 4 < 50; i++) {
		// 	System.out.print(i*4+" ");
		//	}
		
		for (int i=4; i<50; i+=4) {
			System.out.print(i+" ");
		}
		
		for(int i=1; i<=50; i++) {		// 문제를 그대로 코드화 한 코드 (시키는 대로 했음)
			if (i % 4 == 0) {
				System.out.print(i+" ");
				
			}
		}
	}
}