package rom802;

public class Ex13 {

	public static void main(String[] args) {
		String[] msg={"0","1","둘","3"};
		
		for(int i=0; i<msg.length; i++){
			try{
				int su=Integer.parseInt(msg[i]);
				System.out.println(su+1);				
			}catch(java.lang.NumberFormatException aa){
				System.out.println(msg[i]+" 는 숫자가 아님");
			}
		}
	}

}
