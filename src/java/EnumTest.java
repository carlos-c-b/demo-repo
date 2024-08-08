public class EnumTest {

	public enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	Day day;

	public EnumTest(Day day) {
		this.day = day;
	}

	public void speak() {
		switch(day) {
			case SATURDAY: case SUNDAY:	
				System.out.println("Today is weekend");
				break;
			default:
				System.out.println("Today is a weekday");
				break;
		}
	}

	public static void main(String[] args) {
		try {
			new EnumTest(Day.valueOf(args[0].toUpperCase())).speak();
		} catch (Exception e) {
			System.err.println("Error: Introduce a day of the week as an argument");
		}
	}
}
