package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {
public static void main(String[] args) {
	List<Integer>list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
	//distinct method will remove the duplicate elements
	List<Integer> distinctValues = list.stream().distinct().collect(Collectors.toList());
	System.out.println("distinct Values: "+distinctValues);
}
}
