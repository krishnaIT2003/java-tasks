package collections;

import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicates {
	public static int[] removeAndReverse(int arr[]) {
		
                 TreeSet<Integer>set= new TreeSet<Integer>();
                 for(int i:arr) {
                	 set.add(i);
                 }
      int output[]=set.stream().sorted((o1,o2)->o2.compareTo(o1)).mapToInt(Integer::intValue).toArray();
		return output;
		}
	
public static void main(String[] args) {
	int arr[]= {1,6,4,2,6,3,4};
	int output[]=removeAndReverse(arr);
	System.out.println(Arrays.toString(output));
}
}
