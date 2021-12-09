package day211209;

public class Ex01 {
	
	public void func10() {
		Ex02.func01();
		Ex02 aa = new Ex02();
		aa.func02();
		aa.func03();
		
	}
	
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int me, com, win, draw, lose;
		
		me=1;
		com=1;
		win=0; draw=0; lose=0;
		
		String input;
		
		System.out.println("게임을 시작하겠습니다");
		
		boolean boo=true;
		String[] arr = {"가위", "바위", "보"};
		while (boo) {

			System.out.println("1.가위 2.바위 3.보 0.종료>");
			input = sc.nextLine();
			me = Integer.parseInt(input);
			
			if (me==0) {
				boo=false;
			} else if (me<1 || me>3) {		// 아직 안 배운 것은 문자열 처리
				System.out.println("메뉴를 다시 입력하세요");
			} else {
				com=(int)(Math.random()*3)+1;
				
				System.out.println("me:"+arr[me-1]+", com:"+arr[com-1]);	// 초기화 된다는 보장이 없기 때문에 오류 발생 (else가 아니고 else if니까)
				
				if ((me==1 && com==3) || (me==2 && com==1) || (me==3 && com==2)) {
					System.out.println("이겼음");
					win++;
				} else if (me==com) {
					System.out.println("비겼음");
					draw++;
				} else if ((me==3 && com==1)|| (me==1 && com==2) || (me==2 && com==3)) {	// else로 묶어도 되는데
					System.out.println("졌음");
					lose++;
				}
			}
		}

		System.out.println("\n"+win+"승"+draw+"무"+lose+"패");
		System.out.println("이용해주셔서 감사합니다");
	}

}
