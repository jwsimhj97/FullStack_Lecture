package rom802;

public class Ex05 {

	public String msg;
	
	public Ex05(){
		this("hello");
		return ;
	}
	
	public Ex05(String msg){
		this(msg,1);
		return ;
	}
	

	public Ex05(String msg, int cnt){
		for(int i=0; i<cnt; i++){
			System.out.println(msg);
		}
		return ;
	}
	
	public static void main(String[] args) {
//		Ex05 me=new Ex05();
		
//		Ex05 me=new Ex05("java");
		
//		Ex05 me=new Ex05("eazy",5);
	}

}
