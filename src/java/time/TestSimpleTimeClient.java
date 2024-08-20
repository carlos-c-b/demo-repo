package time;

import java.time.*;
import java.util.*;
import java.lang.*;

public class TestSimpleTimeClient {
	public static void main(String[] args) {
		TimeClient myApp = new SimpleTimeClient();
		System.out.println(myApp.getZonedDateTime("EST").toString());
		System.out.println(myApp.getZonedDateTime("Europe/Paris").toString());
		System.out.println(myApp.getZonedDateTime("Pacific/Guadalcanal").toString());
	}
}
