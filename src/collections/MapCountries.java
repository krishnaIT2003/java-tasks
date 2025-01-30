package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapCountries {
public static void main(String[] args) {
Map<String,String> countryCapitalMap=new HashMap<String, String>();
	
	countryCapitalMap.put("India", "New Delhi");
    countryCapitalMap.put("Japan", "Tokyo");
    countryCapitalMap.put("France", "Paris");
    countryCapitalMap.put("Germany", "Berlin");
    
    System.out.println("using forEach loop");
   countryCapitalMap.forEach((k,v)->System.out.println(k+" : "+v));
    System.out.println("\nusing Keyset Iterator");
   
    Iterator<String>it=countryCapitalMap.keySet().iterator();
    while(it.hasNext()) {
    	System.out.print(it.next()+" ");
    }
    System.out.println("\n using foreach with entry set");
    for(Map.Entry<String, String > entry:countryCapitalMap.entrySet()) {
    	System.out.println(entry.getKey()+" : "+entry.getValue());
    }
    System.out.println("using entryset with iterator");
    Iterator<Map.Entry<String, String>>iterate=countryCapitalMap.entrySet().iterator();
    
    
}
}
