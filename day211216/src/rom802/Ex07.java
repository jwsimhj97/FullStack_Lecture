package rom802;

public class Ex07 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++){
			if(i>4){		// 이 코드에서는 결과가 다 비슷하지만
//				return;		// 해당 메서드의 종료(호출한 측으로 돌아가기 / 스택에서 빼내기)
				continue;
//				break;		// 반복문이나 switch문에서 탈출. 반복문 내, switch문
			}
			System.out.println(i);
		}
		System.out.println("메인 종료");

	}

}
