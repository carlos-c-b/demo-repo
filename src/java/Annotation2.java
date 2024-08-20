public class Annotation2 {
	public @interface Request {
		String id();
		String synopsis();
		String engineer() default "unassigned";
		String date() default "unknown";
	}
	@Request(
		id="a",
		synopsis="b"
	)
	public static void main(String[] args) {}
}
