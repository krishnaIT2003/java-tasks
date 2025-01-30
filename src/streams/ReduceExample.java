package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
public static void main(String[] args) {
	List<Integer>list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));

Optional<Integer> reduce = list.stream().filter(n->n%2==0).reduce((a,b)->a+b);
reduce.ifPresent(System.out::println);
}
}
