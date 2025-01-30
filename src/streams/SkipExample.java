package streams;

import java.util.Arrays;
import java.util.List;

public class SkipExample {
public static void main(String[] args) {
	 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	 // skip method will skip the first n elements
	  numbers.stream().skip(3).forEach(System.out::println);
}
}
