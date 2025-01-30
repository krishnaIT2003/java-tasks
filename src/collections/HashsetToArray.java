package collections;

import java.util.Arrays;
import java.util.HashSet;

public class HashsetToArray {
public static void main(String[] args) {
	HashSet<Integer>set=new HashSet<Integer>(Arrays.asList(1,2,3,4,5,3,5));
	Integer array[]=set.toArray(new Integer[0]);
	
	for(int i:array) {
		System.out.print(i+" ");
	}
	
	
}
}
