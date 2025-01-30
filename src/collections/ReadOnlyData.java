package collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReadOnlyData {
	
	public static List<String> readList(){
		List<String>list=List.of("krishna","sakshi","tharun","yagna");
		return list;
	}
	public static Set<String> readSet(){
		Set<String>set=Set.of("krishna","sakshi","tharun","bharath");
		return set;
	}
	public static Map<Integer,String> readMap(){
		Map<Integer,String>map=Map.of(1,"krishna",2,"tharun",3,"sakshi");
		return map;
	}
public static void main(String[] args) {
	List<String>list=readList();
	System.out.println("read only list "+list);
	Set<String>set=readSet();
	System.out.println("read only set "+set);
	Map<Integer,String>map=readMap();
System.out.println("read only map"+map);	
}
}
