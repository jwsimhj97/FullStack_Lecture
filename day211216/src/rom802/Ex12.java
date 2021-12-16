package rom802;

public class Ex12 {

	public static void main(String[] args) {
		String[] msg={"java","web","DB","framework"};
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.print("idx >");
		String input=sc.nextLine();
		int idx=0;
		try{
			idx=Integer.parseInt(input);
			System.out.println(msg[idx]);
		}catch(java.lang.NumberFormatException e){
			System.out.println("숫자만");
		}catch(java.lang.ArrayIndexOutOfBoundsException e){	// 이렇게 했는데 숫자를 안집어 넣고 문자를 집어 넣으면? 다른 익셉션 에러
			System.out.println("인덱스는 0~3까지");
		}
		
		// 근데 다른 익셉션 에러를 잡으면? 넘는 숫자를 넣었을 때 처리가 안됨
	}

}
