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
		char korNum[] = new char[]{'영','일','이','삼','사','오','육','칠','팔','구'};
		return 0;
	}
	
	
	public static void main(String[] args) {

		
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("주민번호 검사기");
		
		
		String input;
		char[] inputNum=null;
		char[] num1 = new char[6];
		char[] num2 = new char[7];
		char[] korNum = new char[]{'영','일','이','삼','사','오','육','칠','팔','구'};
		
		int age=0;
		int sexNum=0;
		String[] sex=new String[]{"남성", "여성"};

		System.out.print("주민번호를 입력하세요\n>>> ");
		
		boolean boo = true;
		
		// 입력 유효성 검사
		while(boo){
			boo=false;
			input = sc.nextLine();
			inputNum = input.toCharArray();
			
			if (input.length() != 14) {		// 14자리
				System.out.println("입력을 다시 확인하세요(000000-0000000)-1");
				boo=true;
				continue;
			}
			if (inputNum[6] != '-'){
				System.out.println("입력을 다시 확인하세요(000000-0000000)-2");
				boo=true;
				continue;
			}
			
			for(int i=0;i<6;i++) {
				if (!(inputNum[i] >= '0' && inputNum[i] <= '9')){
					System.out.println("입력을 다시 확인하세요(000000-0000000)-3");
					boo=true;
					break;
				}
			}
			for(int i=0;i<6;i++) {
				if (!(inputNum[i+7] >= '0' && inputNum[i+7] <= '9')){
					System.out.println("입력을 다시 확인하세요(000000-0000000)-4");
					boo=true;
					break;
				}
			}
				
		}
		
		
		// 한글 확인해서 숫자 대입
//		for (int i=0;i<14;i++){
//			for(int j=0;j<10;j++){
//				if(inputNum[i]==korNum[j]){
//					inputNum[i]=(char)(j+'0');
//					break;
//				}
//			}
//		}
		
		// 숫자 대입
		for(int i=0;i<6;i++){
			num1[i]=inputNum[i];
		}
		for(int i=0;i<7;i++){
			num2[i]=inputNum[i+7];
		}
		
		// 성별 결정
		if(num2[0] == '1' || num2[0] == '3'){
			sexNum=1;
		}else{
			sexNum=2;
		}
		
		// 나이 결정
		if (num2[0] == '1' || num2[0] == '2') {
			age=2021-(1900+10*(num1[0]-'0')+(num1[1]-'0'))+1;
		}else{
			age=21-(10*(num1[0]-'0')+(num1[1]-'0'))+1;
		}
		
		
		System.out.println("당신은 올해 "+age+"세 "+sex[sexNum-1]+"입니다");
	}

}

// 주민번호 검사기 (문자열의 탈을 쓴 배열 문제)

// 주민번호를 입력하세요
// >>>>020501-4123456
// 당신은 올해 20세 여성입니다.
///////////////////////////

// 주민번호를 입력하세요
// >>>>990501-1123456
// 당신은 올해 23세 남성입니다

// 주민번호를 입력하세요
// >>>>990501-123456
// 입력이 부족합니다(000000-0000000)
///////////////////////////

// 주민번호를 입력하세요
// >>>>영이영오영일-사일이삼사오육
// 당신은 올해 20세 여성입니다.
///////////////////////////