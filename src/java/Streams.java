import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a", "b", "z", "d","w","c");

		List<String> result = myList.stream()
								.sorted()
								.collect(Collectors.toList());

		System.out.println(result);
	}
}
