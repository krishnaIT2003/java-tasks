package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class LinkedListToArrayList {
public static void main(String[] args) {
	LinkedList<Integer>linkedList=new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
	ArrayList<Integer>arrayList=new ArrayList<Integer>(linkedList);
	
	System.out.println("arrayList: "+arrayList);
}
}
