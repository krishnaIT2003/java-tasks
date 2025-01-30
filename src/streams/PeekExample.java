package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
public static void main(String[] args) {
	 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> collect = numbers.stream().peek(n->System.out.println("before mapping: "+n)).map(n->n+2).collect(Collectors.toList());

System.out.println(collect);
}
}
