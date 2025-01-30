package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {
public static void main(String[] args) {
	List<String> fruits=new ArrayList<String>(Arrays.asList("banana","orange","apple","grapes","orange"));
	
	Set<String> set=fruits.stream().collect(Collectors.toSet());
	System.out.println(set);
}
}
