package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class QaTask {
public static void main(String[] args) {
	List<Integer>list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	
	
	List<Integer>even1=new ArrayList<Integer>(); 
	List<Integer>odd1=new ArrayList<Integer>(); 
 list.stream().map((n)->n%2==0?even1.add(n):odd1.add(n)).toList();
 
 
 
 
	System.out.println(even1);
	System.out.println(odd1);
//	List<String >fruits=new ArrayList<String>(Arrays.asList("banana","orange","grapes","a"));
	Function<Integer, Integer> func=(a)->a+2;
	System.out.println(func.apply(3));
}
}
