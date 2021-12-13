package com.rom802;

class Car {
	public static final int MORNING=1;
	public final int k3=2;
	public final int k5=3;
	public static int number;		// ������ ������ static�� non-static�� ������ ����
	
	public String color;
	public final String name;
	public int speed;
	public int max;
	
	public Car(int mod){		// �̷��Ե� �� �� ����
		number+=1111;
		if(mod==MORNING){				// ������ �� 1,2,3�� �����̾� ���������...
			color="";
			name="���";
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
			name="�غ���";
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
		System.out.println("������ȣ"+number+" "+color+" "+name+"�� �ӵ���"+speed+"km �Դϴ�");
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Car mycar=new Car(Car.MORNING);	// ���࿡ ����̶�� ������ static���� ������� ������ ������ �����
//		Car mycar=new Car("", "���", 120);
//		Car mycar=new Car("���", 120);	// ������ �����ε��� ���� �� ��ü�� ���� ����
		mycar.color="������";
		mycar.max=120;
		mycar.speedShow();
		for(int i=0; i<20; i++) {
			mycar.speedUp();
			mycar.speedShow();
		}
		mycar.color="�����";
		for(int i=0; i<20; i++) {
			mycar.speedDown();
			mycar.speedShow();
		}
		
		
		mycar=new Car("���","k3",150);
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