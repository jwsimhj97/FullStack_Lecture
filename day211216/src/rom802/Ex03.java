package rom802;

public class Ex03 extends java.lang.Object {

	public static void main(String[] args) {
		Ex03 me = new Ex03();
		System.out.println(me); // 자동으로 toString 호출
		System.out.println(me.toString());
		System.out.println(me.hashCode());
		
		// Ex03에 아무 메서드도 없는데 메서드들이 사용 가능하다
		// java.lang.Object를 자동으로 상속받음
		// 자식 클래스가 있고 거기서 object클래스를 상속받지 않더라도
		// 부모가 object클래스를 상속받고있다
	}
	
	public String toString(){
		return "재정의";
	}
}
