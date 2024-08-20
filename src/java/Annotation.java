import java.lang.annotation.*;

public class Annotation {
	public @interface Meals {
		Meal[] value();
	}
	
	@Repeatable(Meals.class)
	public @interface Meal {
		String name() default "N/A";
	}

	@Meal(name="A")
	@Meal(name="B")
	void foo() {}

	public static void main(String[] args) {
	}
}
