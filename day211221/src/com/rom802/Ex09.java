package com.rom802;

public class Ex09 {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		for(int i=0; i<1000000; i++){	
			Ex09 me1=new Ex09();
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		// 실행할 때마다 값이 조금씩 증가. 진짜 시간임 1/1000 초 // 이것을 1000으로 나누면 1초 / 여기에 또 60으로 나누면 1분 // 이걸 또 60으로 나누면 1시간 // 이걸 또 24로 나누면 하루 // 이걸 또 365로 나누면 1년 //이 되는거지
		
		// 시간을 연산하기는 상당히 까다롭다 그래서 이러한 패턴을 다시 만들게 됨
		System.out.println(start);
		String newLine=System.lineSeparator();
		System.out.println(end);
	}

}
