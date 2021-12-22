package com.hi;

// Object로 만들었으니까 다른 자료형으로 만들어도 다 넣을 수 있음
// 내일 배울 Array List를 흉내낸 것임

public class HiList {
	Object[] data=new Object[0];	// 이걸 String으로 바꾸면 되겠지
							// 근데 뭐든지 다 들어가게 Object로
	
	public void add(Object value){
		Object[] temp=new Object[data.length+1];
		System.arraycopy(data, 0, temp, 0, data.length);
		temp[temp.length-1]=value;
		data=temp;
	}
	
	public void remove(int idx){
		Object[] temp=new Object[data.length-1];
		//arraycopy를 두 번 하면 되겠네
		System.arraycopy(data, 0, temp, 0, idx);	// 여기서는 idx가 자연히 length의 역할
		System.arraycopy(data, idx, temp, idx, data.length-idx);
		
		
		data=temp;
	}

	public Object get(int idx){	// idx에 해당하는 값
		return data[idx];
	}
	
	public int size(){
		return data.length;
	}

}
