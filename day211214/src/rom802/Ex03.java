package rom802;

public class Ex03 {

	public Ex03 func(Ex03 me){
		System.out.println("����");
//		return me;
		return this;
	}
	
	public int func2(int su){
		System.out.println("����2");
		if(su==0){
			return 0;
		}else{
			su--;
			return func2(su);
		}
	}
	
	public static void main(String[] args) {
		Ex03 me=new Ex03();
		me.func(me).func(me).func(me);
		me.func2(5);
	}
}
