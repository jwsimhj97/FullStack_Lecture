class Ex14 {
	public static void main(String[] args) {
		// 형변환 (캐스팅)
		long	a;
		int	b;
		byte	c;

		a = 123333333333L;
		b = -129;
	//	b = (int)a;  // 이런 경우는 값이 변형되지 않음
		c = (byte)b;

		System.out.println(c);
	}
}