import java.lang.annotation.*;

public class AnnotationExample {
	@Deprecated
	public void foo() {}

	public static void main(String[] args) {
		AnnotationExample app = new AnnotationExample();
		app.foo();
	}
}
