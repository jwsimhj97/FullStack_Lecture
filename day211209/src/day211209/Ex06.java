package day211209;

public class Ex06 {
	public static int su1=0;	// 안 줘도 0이긴 함
	public int su2=0;

	public static void main(String[] args) {
		for (int i=0; i<3; i++) {
			Ex06 me = new Ex06();
			me.func02();
		}
		
		for (int i = 0; i<3; i++) {
			func01();
		}
		
		// 두 결과가 다르게 나타난다

	}
	
	public static void func01() {
		System.out.println(su1);
		su1++;
		System.out.println(su1);
		su1++;
		System.out.println(su1);
	}
	
	public void func02() {
		System.out.println(su2);
		su2++;
		System.out.println(su2);
		su2++;
		System.out.println(su2);
	}

}
