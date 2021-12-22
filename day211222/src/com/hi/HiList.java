package com.hi;

// Object�� ��������ϱ� �ٸ� �ڷ������� ���� �� ���� �� ����
// ���� ��� Array List�� �䳻�� ����

public class HiList {
	Object[] data=new Object[0];	// �̰� String���� �ٲٸ� �ǰ���
							// �ٵ� ������ �� ���� Object��
	
	public void add(Object value){
		Object[] temp=new Object[data.length+1];
		System.arraycopy(data, 0, temp, 0, data.length);
		temp[temp.length-1]=value;
		data=temp;
	}
	
	public void remove(int idx){
		Object[] temp=new Object[data.length-1];
		//arraycopy�� �� �� �ϸ� �ǰڳ�
		System.arraycopy(data, 0, temp, 0, idx);	// ���⼭�� idx�� �ڿ��� length�� ����
		System.arraycopy(data, idx, temp, idx, data.length-idx);
		
		
		data=temp;
	}

	public Object get(int idx){	// idx�� �ش��ϴ� ��
		return data[idx];
	}
	
	public int size(){
		return data.length;
	}

}