package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysConversion {
	
	
public static void main(String[] args) {
	// converting array to arraylist in three ways
	
Integer arr[]= {1,2,3,4};
List<Integer> arrayList1=Arrays.asList(arr);
System.out.println("using Arrays.asList "+arrayList1);

List<Integer> arrayList2=new ArrayList<Integer>();
for(Integer i:arr) {
	arrayList2.add(i);
}
System.out.println("using for each loop "+arrayList2);

List<Integer> arrayList3=new ArrayList<Integer>();
Collections.addAll(arrayList3, arr);
System.out.println("using collections.addAll method "+arrayList3);

//converting arrayList to arrays in three ways

ArrayList<String> list=new ArrayList<String>(Arrays.asList("krishna","tharun","sakshi","bharath"));

String array1[]=new String[list.size()];
for(int i=0;i<list.size();i++) {
	array1[i]=list.get(i);
}
System.out.print("using loops : ");
for(int i=0;i<array1.length;i++) {
	System.out.print(array1[i]+" ");
}
System.out.println();
String array2[]=list.toArray(new String[0]);
System.out.println("using toArray "+ Arrays.toString(array2));

String array3[]=list.stream().toArray(String[]::new);
System.out.println("using streams "+Arrays.toString(array3));
}
}
