package rom802;

public class Ex04 {
	public int su=1111;
	
	public Ex04(){
		System.out.println("su="+su);
	}
	public Ex04(int su){
		this.su=su;
		System.out.println("su="+this.su);
	}
	
	public static void main(String[] args) {
		// 생성자에서의 this
		Ex04 me=new Ex04();
		Ex04 me2=new Ex04(2222);
	}

}
