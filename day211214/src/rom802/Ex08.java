package rom802;

public class Ex08 {

	public static void main(String[] args) {
		// 주민벙호 확인
		char[] temp1={'영','일','이','삼','사','오','육','칠','팔','구'};
		char[] temp2={'0','1','2','3','4','5','6','7','8','9'};
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String input=null;
		System.out.print("주민번호>");
		input="구구일이삼일-일이삼사오육칠";	//"991231-2123456";	//"020501-3123456";	//		input=sc.nextLine();
		char[] arr=input.toCharArray();	//먼저 입력을 받아서 char배열을 만들고
		
		// 문자 바꿔치기를 통해 한글 입력
		for (int i=0; i<arr.length; i++){
			char ch=arr[i];
			for(int j=0; j<temp1.length; j++){
				if(ch==temp1[j]){
					arr[i]=temp2[j];
				}
			}
		}
		
		// 한글 입력
		// 입력이 들어오면 한글을 숫자로 바꿔주면 된다
//		for(문자배열의 긹이만큼 반복){
//			if(문자하나가 == '영'){
//				해당값='0';
//			}else if(문자=='일'){
//				해당값='1';
//			}...
//		}			// 이렇게 하면 코드가 너무 길어짐
		
		
		
		// 변환한 문자 배열 검사
		
		boolean check1=true;
		for(int i=0; i<arr.length; i++){
			if(arr[i]=='-'){
				check1=false;
			}
		}
		
		if(check1){		// if/else에 익숙해져서 이 코드가 이상하게 느껴질 수도 있다
			System.out.println("-를 반드시 입력하세요");
			return ;
		}
		
		if(arr[6]!='-'){
			System.out.print("입력오류");
			return ;		// 더 이상 진행시키면 안되니까
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		char[] arr2=new char[]{'2','0',arr[0],arr[1]};	// 주민 번호 앞의 두 자리를 받아서
		if(arr[7]<=(int)'2'){	// 혹은 처음의 String input에 "19"+input 으로 부족한 숫자를 추가해도 됨
			arr2[0]='1';
			arr2[1]='9';
		}	
		// 인식하기에는 편리한데 코드차원에서는 불편할 수도
		// 문자열 받고, 문자 배열로 변환, 수정
		
		String year=new String(arr2);
		int su=Integer.parseInt(year);
		System.out.print("당신은 ");
		System.out.print(2021-su+1);	// 조건에 따라 여기서 100을 더해주는 것으로 해도 됨
		System.out.print("세 ");
		if(arr[7]%2==0){	// 문자지만 '1'(49), '2' '3' '4'에는 홀 짝의 속성이 그대로 있다
			System.out.print("여");
		}else{
			System.out.print("남");			
		}
		
		System.out.println("성입니다");
	}

}
