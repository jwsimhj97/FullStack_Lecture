package rom802;

public class Ex01 {
	public static int su1=1111;
	public int su2=222;
	
	public Ex01(){
		
	}
	
	public static void func01(){
		rom802.Ex01 me=new rom802.Ex01();
		me.func03();
	}
	
	public void func02(){
		func03();	// ??ü?? ????? ????
	}
	
	public void func03(){
		
	}
	
	public static void main(String[] args) {
		rom802.Ex01.func01();
		rom802.Ex01 me=new rom802.Ex01();
	}

}
