package collections;

import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
public static void main(String[] args) {
	
	HashMap<String,Float>studentMarks=new HashMap<>();
	studentMarks.put("selva",75.6f );
	studentMarks.put("abi", 89.5f);
	studentMarks.put("ram", 40.0f);
	HashMap<String,String>output=new HashMap<String, String>();
	for(Map.Entry<String, Float>entry:studentMarks.entrySet()) {
		if(entry.getValue()>=60) {
			output.put(entry.getKey(), "pass");
		}
		else {
			output.put(entry.getKey(), "fail");
		}
	}
	System.out.println(output);
}
}
