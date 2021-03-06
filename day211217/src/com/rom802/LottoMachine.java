package com.rom802;

// 클래스화

public class LottoMachine{
	private static LottoMachine machine=new LottoMachine();
	private int[] lotto;
	private int	 ran;
	
	private LottoMachine(){
		lotto=new int[46];
	}
	private void initLotto(){
		for(int i=0; i<46; i++){
			lotto[i]=0;
		}
	}
	private void makeLotto(){
		int i=0;
		while(i<6){
			ran=(int)(Math.random()*45)+1;
			if(lotto[ran]==0){
				lotto[ran]=ran;
			}else{
				continue;
			}
			i++;
		}
	}
	private void printLotto(){
		System.out.println("로또 번호 생성기 (ver 0.1.0)");
		for(int i=0; i<46; i++){
			if(machine.lotto[i]!=0){
				System.out.print(machine.lotto[i]+" ");
			}
		}		
	}
	public static void showNumbers(){
		machine.initLotto();
		machine.makeLotto();
		machine.printLotto();
	}
	
	public static void main(String[] args){
		LottoMachine.showNumbers();
	}
	
}
