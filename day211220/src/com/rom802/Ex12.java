package com.rom802;

// 여태 배운 모든 것을 활용한 코드

class Ball{
	private final int num;	// 공 번호 바뀌면 안되니까
							// final까지 해 놓으면 값을 바꿔주는 메서드가 있더라도 값을 바꿀 수 없다
	boolean marking;
	String color;
	
	Ball(int num){
		this.num=num;
		marking=true;
		
		// 객체로 만드는 것의 장점
		if(num<10){
			color="노랑색";
		}else if(num<20){
			color="파랑색";
		}else if(num<30){
			color="빨강색";
		}else if(num<40){
			color="초록색";
		}else{
			color="검정색";
		}
	}
	
	public int showNum(){
		return num;
	}
	
}

public class Ex12 {

	public static void main(String[] args) {
		String[] note=new String[6];
		
		Ball[] box=new Ball[45];
		for(int i=0; i<box.length; i++){
			box[i]=new Ball(i+1);
		}
		
		for(int i=0; i<note.length; i++){
			// 공을 꺼내고
			int ran=(int)(Math.random()*45);
			Ball ball=box[ran];
			// 확인
			if(ball.marking){
			//		(안뽑은공)note 작성
				note[i]=ball.color+" 공 "+ball.showNum(); // 객체 생성 시점에 숫자가 정해지기 때문에 한 번 1인 공은 2가 되지 못함
			//		뽑았다고 marking
				ball.marking=false;
			}else{
			//		(뽑았던공)note--;
				i--;
			}
		}
		
		for(int i=0; i<note.length; i++){
			System.out.print(note[i]+"  ");
		}

	}

}
