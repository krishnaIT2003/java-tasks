package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReverseArrayList {
	public static List<Integer> reverseList(List<Integer>list){
		
		return list.reversed();
	}
public static void main(String[] args) {
	List<Integer> array=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
	System.out.println("before reversing "+array);
	array = reverseList(array);
	System.out.println("after reverse "+array);
	
	
	
}
}
