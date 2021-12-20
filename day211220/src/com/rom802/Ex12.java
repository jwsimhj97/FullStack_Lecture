package com.rom802;

// ���� ��� ��� ���� Ȱ���� �ڵ�

class Ball{
	private final int num;	// �� ��ȣ �ٲ�� �ȵǴϱ�
							// final���� �� ������ ���� �ٲ��ִ� �޼��尡 �ִ��� ���� �ٲ� �� ����
	boolean marking;
	String color;
	
	Ball(int num){
		this.num=num;
		marking=true;
		
		// ��ü�� ����� ���� ����
		if(num<10){
			color="�����";
		}else if(num<20){
			color="�Ķ���";
		}else if(num<30){
			color="������";
		}else if(num<40){
			color="�ʷϻ�";
		}else{
			color="������";
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
			// ���� ������
			int ran=(int)(Math.random()*45);
			Ball ball=box[ran];
			// Ȯ��
			if(ball.marking){
			//		(�Ȼ�����)note �ۼ�
				note[i]=ball.color+" �� "+ball.showNum(); // ��ü ���� ������ ���ڰ� �������� ������ �� �� 1�� ���� 2�� ���� ����
			//		�̾Ҵٰ� marking
				ball.marking=false;
			}else{
			//		(�̾Ҵ���)note--;
				i--;
			}
		}
		
		for(int i=0; i<note.length; i++){
			System.out.print(note[i]+"  ");
		}

	}

}
