package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ArrayListOperations {
public static void main(String[] args) {
	List<Integer>arrayList=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
	System.out.print("list iterator : ");
ListIterator<Integer>list=arrayList.listIterator();
while(list.hasNext()) {
	System.out.print(list.next()+" ");
}
 System.out.println();
 arrayList.add(3, 300);
 
 System.out.println("added 300 at 4th index" +arrayList);
 
arrayList.sort((o1,o2)->o2.compareTo(o1));
 System.out.println("after sorting "+arrayList);
 
 arrayList.listIterator().add(1000);
 System.out.println(arrayList);
 
List<String>arrayList2=new ArrayList<String>(Arrays.asList("krishna","tharun","yagna","prithvi","bharath","krishna","bharath"));
System.out.println("before sorting "+arrayList2);
arrayList2.sort((o1,o2)->o1.compareTo(o2));
System.out.println("after sorting alphabetically "+arrayList2);
 
arrayList2.set(2, "raj rao");
System.out.println("after replacing "+arrayList2);


System.out.println("finding value at given index : "+arrayList2.get(2));

arrayList2.remove(2);
System.out.println("after removing value at index 2 "+arrayList2);

// using streams removing duplicates 
arrayList2=arrayList2.stream().distinct().collect(Collectors.toList());
System.out.println("after removing duplicates "+arrayList2);
}
}
