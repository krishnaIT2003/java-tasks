package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SynchronizeArrayList {
public static void main(String[] args) {
	ArrayList<Integer>arrayList=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	List<Integer>synchronizedArrayList=Collections.synchronizedList(arrayList);
	
	System.out.println("syncrhonized arraylist "+synchronizedArrayList);
	
}
}
