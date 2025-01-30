package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedHashMap {
public static void main(String[] args) {
	HashMap<Integer, String>map=new HashMap<Integer, String>();
	map.put(1, "krishna");
	map.put(2, "prithvi");
	map.put(3, "bahrath");
	map.put(4, "tharun");
	map.put(5, "sakshi");
	
	Map<Integer, String> synchronizedMap= Collections.synchronizedMap(map);
	
	System.out.println("synchronized map "+synchronizedMap);
}
}
