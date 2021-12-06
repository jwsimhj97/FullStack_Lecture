

class EnumTest{
	public static void main (String[] args) {
		Week day1 = Week.MONDAY;
		Week day2 = Week.SUNDAY;
		
		int result1 = day1.compareTo(day2);
		
		System.out.println(result1);
	}


}