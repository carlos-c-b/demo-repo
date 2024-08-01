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
			case MONDAY: case TUESDAY: case WEDNESDAY: case THURSDAY: case FRIDAY:
				System.out.println("Today is a weekday");
				break;
			case SATURDAY: case SUNDAY:	
				System.out.println("Today is weekend");
				break;
		}
	}

	public static void main(String[] args) {
		try {
			EnumTest app = new EnumTest(Day.valueOf(args[0].toUpperCase()));
			app.speak();
		} catch (Exception e) {
			System.err.println("Error: Introduce a day of the week as an argument");
		}
	}
}
