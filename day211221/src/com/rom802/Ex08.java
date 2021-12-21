package com.rom802;

public class Ex08 implements Cloneable{
	int su=1;
	
	public Ex08(int num){
		su=num;
	}
	
	public static void main(String[] args){
		//Object
		
		Object obj1=new Object();
		Ex08 me=new Ex08(1);
		Ex08 you=new Ex08(3);
		System.out.println(me==you);
		System.out.println(me.equals(you));
		
		try {
			Object me2=me.clone();
			System.out.println(me);
			System.out.println(me2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean equals(Object obj){	// 타입이 Object에 없는 순간 호출이 불가한데...
		return this.su==((Ex08)obj).su;
	}
	
}
