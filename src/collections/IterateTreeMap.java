package collections;

import java.util.Map;
import java.util.TreeMap;

public class IterateTreeMap {
public static void main(String[] args) {
	TreeMap< Integer, String>treeMap=new TreeMap<Integer, String>();
	treeMap.put(1, "krishna");
	treeMap.put(2, "prithvi");
	treeMap.put(3, "bharath");
	treeMap.put(4, "tharun");
	//iterating using foreach
	System.out.println("using for each");
	treeMap.forEach((k,v)->System.out.println(k+" : "+v));
	System.out.println("\n using for each with entry set");
	//using entry set
	for(Map.Entry<Integer, String>entry:treeMap.entrySet()) {
		System.out.println(entry.getKey()+" : "+entry.getValue());
	}
}
}
