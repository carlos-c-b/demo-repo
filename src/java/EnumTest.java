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
		EnumTest app = new EnumTest(Day.SUNDAY);
		app.speak();
	}
}
