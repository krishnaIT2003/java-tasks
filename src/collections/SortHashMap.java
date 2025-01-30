package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap {
	
public static void main(String[] args) {
	HashMap<String, Integer>map=new HashMap<String, Integer>();
	map.put("krishna", 1);
	map.put("tharun", 5);
	map.put("bharath", 3);
	map.put("prithvi", 6);
	System.out.println("before sorting "+ map);

	List<Map.Entry<String,Integer>>list=new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
	list.sort((o1,o2)->o1.getValue().compareTo(o2.getValue()));
	System.out.println(list);
	LinkedHashMap<String,Integer>sortedMap= new LinkedHashMap<>();
	 for (Map.Entry<String, Integer> entry : list) {
         sortedMap.put(entry.getKey(), entry.getValue());
     }
	 System.out.println("after sorting "+sortedMap);
	
}
}
