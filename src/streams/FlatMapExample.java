package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
public static void main(String[] args) {
	 List<List<String>> list=Arrays.asList(
			 Arrays.asList("A","B"),
			 Arrays.asList("C","D"),
			 Arrays.asList("E")
			 );
	 
	 //using map()
	 List<Stream<String>> usingMap = list.stream().map(List::stream).collect(Collectors.toList());
	 
	 System.out.println("using map() "+usingMap);
	 
	 //using flatMap()
	 List<String> usingFlatMap = list.stream().flatMap(List::stream).collect(Collectors.toList());
	 
	 System.out.println("using flatMap() "+usingFlatMap);
}
}
