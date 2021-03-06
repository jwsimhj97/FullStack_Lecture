package com.rom802;

class Car {
	public static final int MORNING=1;
	public final int k3=2;
	public final int k5=3;
	public static int number;		// 이유를 가지고 static과 non-static을 나눠서 정의
	
	public String color;
	public final String name;
	public int speed;
	public int max;
	
	public Car(int mod){		// 이렇게도 할 수 있음
		number+=1111;
		if(mod==MORNING){				// 하지만 이 1,2,3도 지금이야 기억하지만...
			color="";
			name="모닝";
			max=120;
		}else if(mod==k3){
			color="";
			name="k3";
			max=150;
		}else if(mod==k5){
			color="";
			name="k5";
			max=180;
		}else{
			color="";
			name="붕붕이";
			max=100;
		}
	}
	
	public Car(String a, int b){
		color="";
		name=a;
		max=b;
	}
	
	public Car(String a, String b, int c){
		this.color = a;
		this.name = b;
		this.max = c;
	}
	
	public void speedUp(){
		if (speed+10>max){
			speed=max;
		}else{
			speed+=10;
		}
	}
	public void speedDown(){
		if(speed-10<0){
			speed=0;
		}else{
			speed-=10;
		}
	}
	public void speedShow(){
		System.out.println("차량번호"+number+" "+color+" "+name+"의 속도는"+speed+"km 입니다");
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Car mycar=new Car(Car.MORNING);	// 만약에 모닝이라는 변수가 static으로 선언되지 않으면 접근이 어려움
//		Car mycar=new Car("", "모닝", 120);
//		Car mycar=new Car("모닝", 120);	// 생성자 오버로딩을 통해 이 객체도 생성 가능
		mycar.color="빨강색";
		mycar.max=120;
		mycar.speedShow();
		for(int i=0; i<20; i++) {
			mycar.speedUp();
			mycar.speedShow();
		}
		mycar.color="노랑색";
		for(int i=0; i<20; i++) {
			mycar.speedDown();
			mycar.speedShow();
		}
		
		
		mycar=new Car("쥐색","k3",150);
		mycar.max=180;
		mycar.speedShow();
		for(int i=0; i<20; i++) {
			mycar.speedUp();
			mycar.speedShow();
		}
		for(int i=0; i<20; i++) {
			mycar.speedDown();
			mycar.speedShow();
		}
		
		

		mycar=new Car(3);
		mycar.speedShow();
		for(int i=0; i<20; i++) {
			mycar.speedUp();
			mycar.speedShow();
		}
		for(int i=0; i<20; i++) {
			mycar.speedDown();
			mycar.speedShow();
		}
	}

}
