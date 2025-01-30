package collections;

import java.util.HashMap;
import java.util.Map;

public class StudentMedals {
	public static HashMap<Integer,String> getEligibleStudents(HashMap<Integer,Integer> map){
		HashMap<Integer,String>output=new HashMap<Integer, String>();
		for(Map.Entry<Integer, Integer>entry:map.entrySet()) {
			if(entry.getValue()>=90) {
				output.put(entry.getKey(),"Gold");
			}
			else if(entry.getValue()>=80 && entry.getValue()<90) {
				output.put(entry.getKey(), "Silver");
			}
			else if(entry.getValue()>=70 && entry.getValue()<80) {
				output.put(entry.getKey(), "bronze");
			}
		}
		return output;
		
	}
public static void main(String[] args) {
	HashMap<Integer,Integer>map=new HashMap<>();
	map.put(100,95);
	map.put(101, 70);
	map.put(102, 55);
	map.put(103, 74);
	
	HashMap<Integer,String>output=getEligibleStudents(map);
	System.out.println(output);
}
}
