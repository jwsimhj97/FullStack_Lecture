package rom802;

public class Ex11 {

	public static void main(String[] args) {
		// 예외처리
		
		int[] arr={1,3,5};
		
		try{
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);		
		System.out.println(arr[3]);		// 에러가 나겠지만 실행 전에 에러표시는 없음
		System.out.println(arr[2]);		
		}catch(java.lang.ArrayIndexOutOfBoundsException aa){
			// 오류가 났을 때의 상황
		}
	}

}
