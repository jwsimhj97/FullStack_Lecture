class Ex07{
// \u  이렇게하면 유니코드를 먼저 해석하기 때문에 에러 발생
	public static void main(String[] args){
		System.out.println("ab	cd");
		System.out.println("ab\tcd");
		System.out.println('\uac00');
	}
}