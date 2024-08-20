package time;

import java.time.*;
import java.util.*;
import java.lang.*;

public class SimpleTimeClient implements TimeClient {

	private LocalDateTime dateAndTime;

	public SimpleTimeClient() {
		dateAndTime = LocalDateTime.now();
	}

	public void setTime(int hour, int minute, int second) {
		LocalDate currentDate = LocalDate.from(dateAndTime);
		LocalTime timeToSet = LocalTime.of(hour, minute, second);
		dateAndTime = LocalDateTime.of(currentDate, timeToSet);
	}

	public void setDate(int day, int month, int year) {
		LocalTime currentTime = LocalTime.from(dateAndTime);
		LocalDate dateToSet = LocalDate.of(day, month, year);
		dateAndTime = LocalDateTime.of(dateToSet, currentTime);
	}

	public void setDateAndTime(int day, int month, int year,
								int hour, int minute, int second) {
		LocalDate dateToSet = LocalDate.of(day, month, year);
		LocalTime timeToSet = LocalTime.of(hour, minute, second);
		dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
	}

	public LocalDateTime getLocalDateTime() {
		return dateAndTime;
	}

	public String toString() {
		return dateAndTime.toString();
	}

	public static void main(String[] args) {
		SimpleTimeClient myApp = new SimpleTimeClient();
		System.out.println(myApp.toString());
		myApp.setTime(1, 1, 1);
		System.out.println(myApp.toString());
		myApp.setDate(1, 1, 1);
		System.out.println(myApp.toString());
		myApp.setDateAndTime(2, 2, 2, 2, 2, 2);
		System.out.println(myApp.toString());
	}
}
