package streams;

import java.util.Arrays;
import java.util.List;

public class LimitExample {
public static void main(String[] args) {
	 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	 //can  give limit like till how much it should iterate or perform on elements
	 numbers.stream().limit(3).forEach(System.out::println);
}
}
