package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ParseString {
	public static Map<String,String> mapStatesAndCapitals(String word){
		Map<String,String>map=new HashMap<String, String>();
		String[] split = word.split("-");
		for(String i:split) {
			String[] split2 = i.split("\\|\\|");
               map.put(split2[0], split2[1]);
		}
return map;		
	}
public static void main(String[] args) {
	
	Map<String,String>map=new HashMap<String, String>();
	String word="tamilnadu||chennai-karanataka||bengaluru";
	Map<String, String> result = mapStatesAndCapitals(word);
	System.out.println(result);
//	String word="karnataka|-|vijawada";
//	String[] split = word.split("\\|\\-\\|");
//	System.out.println(Arrays.toString(split));
}
}
